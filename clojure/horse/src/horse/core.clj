(ns horse.core)

(defn filter-sort-paginate-table [headers table-data filters sort-metadata pagination-metadata]

  ;; TODO: filter horse table using filters

  ;; TODO: sort horse table using sort-metadata

  ;; TODO: paginate horse table using paginate-metadata

  {:headers headers
   :table-data table-data
   :total-rows (count table-data)})
