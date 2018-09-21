(ns hello-world.core-tests
  (:require [cljs.test :refer-macros [deftest is run-tests]]))

;; (deftest should-not-pass
;;   (is (= 1 20)))

(deftest should-pass
  (is (= 1 1)))

(run-tests)
