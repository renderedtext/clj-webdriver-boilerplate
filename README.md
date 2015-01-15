# Boilerplate for the [clj-webdriver](https://github.com/semperos/clj-webdriver)

[![Build
Status](https://semaphoreapp.com/api/v1/projects/ac6a72a8-4176-4571-948b-b5fb860b5cd1/326380/badge.png)](https://semaphoreapp.com/renderedtext/clj-webdriver-boilerplate)

Taken from Sean Corfield's [blog
post](http://corfield.org/blog/post.cfm/automated-browser-based-testing-with-clojure)
"Automated Browser-based Testing with Clojure".

## Requirements

- [Leiningen](https://github.com/technomancy/leiningen) 2.0.0 or higher
- [Selenium Chrome Driver](http://code.google.com/p/selenium/wiki/ChromeDriver) on your path if you wish to test with Chrome

## Install

```bash
git clone git@github.com:greywolve/clj-webdriver-boilerplate.git
cd clj-webdriver-boilerplate
lein deps
```

## Usage

To run all tests in a single browser session (much faster):

```
lein with-browser test
```

Otherwise just use ```lein test```

To use in the REPL:

```
(use 'clj-webdriver-boilerplate.core)
(use 'clojure.test)
(use 'clj-webdriver.taxi)

(browser-up)

(to "http://www.github.com")

(browser-down)
```

There are two example tests in ```test/clj-webdriver-boilerplate/```

## Choose a different browser

Look in `src/clj-webdriver-boilerplate.clj` 

## More info

- [clj-webdriver wiki](https://github.com/semperos/clj-webdriver/wiki)
- Sean Corfield's [blog post](http://corfield.org/blog/post.cfm/automated-browser-based-testing-with-clojure)

## Credit

- [Sean Corfield](http://corfield.org/) for showing his browser-testing setup 
- [Daniel Gregoire](https://github.com/semperos) for the awesome [clj-webdriver](https://github.com/semperos/clj-webdriver)
- [Robert Stuttaford](https://github.com/robert-stuttaford) for suggesting this :)

