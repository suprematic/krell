(ns krell.main
  (:require [cljs.main]))

;; TODO: check that either -re is already -re krell.repl or not
;; supplied
(defn -main [& args]
  (try
    (apply cljs.main/-main (concat ["-re" "krell.repl"] args))
    (finally
      ;; TODO: shouldn't need this
      (System/exit 0))))
