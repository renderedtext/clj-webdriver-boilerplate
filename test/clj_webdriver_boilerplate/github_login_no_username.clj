(ns clj-webdriver-boilerplate.github-login-no-username  
  (:require [clojure.test :refer :all]
            [clj-webdriver.taxi :refer :all]
            [clj-webdriver-boilerplate.core :refer :all]))

(use-fixtures :each with-browser)

(deftest login-to-github-no-username 
  (to "http://www.github.com")
  (click "a[href*='login']")
  (input-text "#password" "your-password")
  (submit "#password")
  (is (= "Incorrect username or password." (text ".flash"))))
