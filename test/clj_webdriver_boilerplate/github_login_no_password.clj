(ns clj-webdriver-boilerplate.github-login-no-password 
  (:require [clojure.test :refer :all]
            [clj-webdriver.taxi :refer :all]
            [clj-webdriver-boilerplate.core :refer [browser-up browser-down]]))

(deftest login-to-github 
  (browser-up)
  (to "http://www.github.com")
  (click "a[href*='login']")
  (input-text "#login_field" "someusername")
  (submit "#password")
  (is (= "Incorrect username or password." (text ".flash"))) 
  (browser-down)) 
