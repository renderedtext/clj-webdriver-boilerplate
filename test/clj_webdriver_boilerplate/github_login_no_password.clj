(ns clj-webdriver-boilerplate.github-login-no-password 
  (:require [clojure.test :refer :all]
            [clj-webdriver.taxi :refer :all]
            [clj-webdriver-boilerplate.core :refer :all]))

(use-fixtures :each with-browser)

(deftest login-to-github 
  (to "http://www.github.com")
  (click "a[href*='login']")
  (input-text "#login_field" "someusername")
  (submit "#password")
  (is (= "Incorrect username or password." (text ".flash"))) )
