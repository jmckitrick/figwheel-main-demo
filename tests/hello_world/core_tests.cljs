(ns hello-world.core-tests
  (:require [cljs.test :refer-macros [deftest is run-tests]]))

;; http://localhost:9500/figwheel-extra-main/auto-testing

;; (deftest should-not-pass
;;   (is (= 1 20)))

(deftest should-pass
  (is (= 1 1)))

(deftest should-also-pass
  (is (= 2 2)))

(run-tests)
