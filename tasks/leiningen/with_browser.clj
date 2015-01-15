(ns leiningen.with-browser
  (:require [leiningen.core.main :as main]
            [clj-webdriver-boilerplate.core :refer [browser-up browser-down]]))

(defn ^:higher-order with-browser
  "Run a (test) task with a browser already open."
  [project task-name & args]
  (browser-up)
  (-> (Runtime/getRuntime)
      (.addShutdownHook
        (proxy [Thread] []
          (run [] (browser-down :force true)))))
  (main/apply-task (main/lookup-alias task-name project)
                   project
                   args))
