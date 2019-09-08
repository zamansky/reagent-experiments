(ns main
  (:require [reagent.core :as r]
            [cljs.core.async :refer (chan put! <! go go-loop timeout)]
            [for-editor :as e]
            ))

(defn zeditor []
  [e/Editor]
  )
(defn main-component []
  [:div 
   [:hr]
   [zeditor ]
   [:hr]

   ])


(defn mount [c]
  (r/render-component [c] (.getElementById js/document "app"))
  )

(defn reload! []
(mount main-component)
(print "Hello reload!"))

(defn main! []
(mount main-component)
(print "Hello Main"))
