(ns ^:figwheel-hooks fighweel-main-om.core
  (:require
   [goog.dom :as gdom]
   [react :as react]
   [react-dom :as react-dom]
   [create-react-class :as create-react-class]
   [sablono.core :as sab :include-macros true]
   [om.core :as om :include-macros true]))

(println "This text is printed from src/fighweel_main_om/core.cljs. Go ahead and edit it and see reloading in action.")

(defn multiply [a b] (* a b))
;; this is to support om with the latest version of React
(set! (.-createClass react) create-react-class)

;; define your app data so that it doesn't get over-written on reload
(defonce app-state (atom {:text "Hello world!"}))

(defn get-app-element []
  (gdom/getElement "app"))

(defn mount [el]
  (om/root
   (fn [data owner]
     (reify om/IRender
       (render [_]
         (sab/html
          [:div
           [:h1 (:text data)]
           [:h3 "Edit this in src/fighweel_main_om/core.cljs and watch it change!"]]))))
   app-state
   {:target el}))

(defn mount-app-element []
  (when-let [el (get-app-element)]
    (mount el)))

;; conditionally start your application based on the presence of an "app" element
;; this is particularly helpful for testing this ns without launching the app
(mount-app-element)

;; specify reload hook with ^;after-load metadata
(defn ^:after-load on-reload []
  (mount-app-element)
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
