(ns figwheel-main-lein.core-test
    (:require
     [cljs.test :refer-macros [deftest is testing]]
     [figwheel-main-lein.core :refer [multiply]]))

(deftest multiply-test
  (is (= (* 1 2) (multiply 1 2))))

(deftest multiply-test-2
  (is (= (* 75 10) (multiply 10 75))))
