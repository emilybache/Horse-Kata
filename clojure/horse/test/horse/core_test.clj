(ns horse.core-test
  (:require [midje.sweet :refer :all]
            [horse.core :refer :all]))

(def sample-headers ["Breed" "Colour" "Height" "Age" "Shoes"])

(def sample-table-data [["Thouroughbred" "Bay" 1.60 3 true]
                        ["Thouroughbred" "Grey" 1.55 3 true]
                        ["Arabian horse" "Bay" 1.51 5 true]
                        ["Shetland Pony" "Black" 1.01 2 false]
                        ["Shire horse" "Black" 1.71 4 true]])

(facts "When no filters, no sorting, and no pagination"
       (fact "it should return all data"
             (let [empty-filters []
                   empty-sort-metadata []
                   first-ten-pagination {:first-record-in-page 1
                                         :page-size 10}]
               (filter-sort-paginate-table 
                 sample-headers  
                 sample-table-data
                 empty-filters 
                 empty-sort-metadata
                 first-ten-pagination)) => {:headers sample-headers 
                                            :table-data sample-table-data
                                            :total-rows 4})) ;; FIXME: Should be 5 

