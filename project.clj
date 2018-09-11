(defproject co.chatterbox/lein-teamcity "0.2.3"
  :description "Leiningen TeamCity integration"
  :url "https://github.com/chatterbox-analytics/lein-teamcity"

  :dependencies [[robert/hooke "1.3.0"]]

  :deploy-repositories [["snapshots" {:url           "https://chatterbox.jfrog.io/chatterbox/libs-snapshot-local/"
                                      :username      "machine" :password "machine"
                                      :sign-releases false}]
                        ["releases" {:url           "https://chatterbox.jfrog.io/chatterbox/libs-release-local/"
                                     :username      "machine" :password "machine"
                                     :sign-releases false}]]

  :eval-in-leiningen true)
