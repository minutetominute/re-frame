(ns re-frame.test.runner
  (:require [jx.reporter.karma :as karma :include-macros true]
            [re-frame.test.middleware]
            [re-frame.test.undo]
            [re-frame.test.subs]
            [devtools.core :as devtools]))

(devtools/install!)       ;; we love https://github.com/binaryage/cljs-devtools

(defn ^:export run [karma]
  (karma/run-tests
    karma
    're-frame.test.middleware
    're-frame.test.undo
    're-frame.test.subs))
