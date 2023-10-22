(ns tunnl71.githubwebpage
  (:require [hiccup.page :refer [html5 include-css include-js]]
            [hiccup.core :as h]

            ;; [html-to-md.html-to-md]
            ;; [html-to-md.transformer]
            [html-to-md.core]

            [tunnl71.tools.core :as t]

            ))



(let [hiccup-data [:body
                   [:div
                    [:h1 "speclike"]


                    [:div
                     [:h1 "indexes"]
                     [:ul
                      [:p (interpose " ~ " ["suture" "index" "spec" "keyword" "set" "menge" "multiple"])]
                      [:p (interpose " " "name collision") "https://github.com/hsestupin/html-to-md/tree/master" "https://github.com/simon-brooke/html-to-md/blob/master/src/html_to_md/blogger_to_md.clj"]

                      [:p (t/edn->hiccup ["edn currency" "token markets" "tokens as indexes"])]

                      (t/edn->hiccup "rename markets")
                      
                      ]]
                    
                    [:div
                     [:h1 "indexes"]

                     [:div
                      [:h2 "a market"]
                      [:ul "market"
                       [:li "hello"]
                       [:img {:src "https://assets-prd.ignimgs.com/2022/03/22/witchercomparison-1647953448163.jpg"}]]]    
                     
                     [:img {:src "https://scontent-ber1-1.xx.fbcdn.net/v/t39.30808-6/393487513_191144684020411_1345394949302923686_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=5f2048&_nc_ohc=Y3ASXlAoIIMAX9PdLcS&_nc_ht=scontent-ber1-1.xx&oh=00_AfDjD0RyQ-WO8ac9OW0NHihHJz_keygX5lpcU2iDuq3o4w&oe=65394B87"}]
                     
                     [:img {:src 
                            "https://scontent-ber1-1.xx.fbcdn.net/v/t39.30808-6/394036975_193008083834071_5319461004562019138_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=5f2048&_nc_ohc=OQKMrDzPvtoAX9hH3Kj&_nc_ht=scontent-ber1-1.xx&oh=00_AfAYOFCVdCpTXLQ6fxnGMPPLXw-DcXNnYgDwyEsgTIYBRw&oe=6537FF66"}]]

                    ]]
      html-data (hiccup.page/html5 hiccup-data)
      ;; md-data (html-to-md.core/html-to-md html-data)
      ]

  ;; (html-to-md.html-to-md/markdown-html html-data (html-to-md.html-to-md/markdown-dispatcher))

  #_(html-to-md.core/html-to-md-string html-data)


  (println html-data)

  )
