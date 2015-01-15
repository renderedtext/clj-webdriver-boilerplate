(ns clj-webdriver-boilerplate.core
  (:require [clj-webdriver.taxi :refer :all]))

(def ^:private browser-count (atom 0))

(defn browser-up
  "Start up a browser if it's not already started."
  []
  (when (= 1 (swap! browser-count inc))
    (set-driver! {:browser :firefox})
    (implicit-wait 60000)))

(defn browser-down
  "If this is the last request, shut the browser down."
  [& {:keys [force] :or {force false}}]
  (swap! browser-count dec)
  (when (or force (zero? @browser-count))
    (quit)))

(defn with-browser [t]
  (browser-up)
  (t)
  (browser-down))
