(ns bux.currencies
  (:use [bux.currency]))

(def all-currencies
  [{:symbol "р.", :subunit "Kopek", :name "Russian Ruble", :iso_code "RUB", :iso_numeric "643", :subunit_to_unit 100, :html_entity "&#x0440;&#x0443;&#x0431;", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Sen", :name "Brunei Dollar", :iso_code "BND", :iso_numeric "096", :subunit_to_unit 100, :html_entity "$", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "New Zealand Dollar", :iso_code "NZD", :iso_numeric "554", :subunit_to_unit 100, :html_entity "$", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "Congolese Franc", :iso_code "CDF", :iso_numeric "976", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "zł", :subunit "Grosz", :name "Polish Złoty", :iso_code "PLN", :iso_numeric "985", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "T", :subunit "Sene", :name "Samoan Tala", :iso_code "WST", :iso_numeric "882", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "Burundian Franc", :iso_code "BIF", :iso_numeric "108", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "৳", :subunit "Paisa", :name "Bangladeshi Taka", :iso_code "BDT", :iso_numeric "050", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "ZK", :subunit "Ngwee", :name "Zambian Kwacha", :iso_code "ZMK", :iso_numeric "894", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "₫", :subunit "Hào", :name "Vietnamese Đồng", :iso_code "VND", :iso_numeric "704", :subunit_to_unit 10, :html_entity "&#x20AB;", :symbol_first true, :decimal_points 1 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "Rwandan Franc", :iso_code "RWF", :iso_numeric "646", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "R", :subunit "Cent", :name "South African Rand", :iso_code "ZAR", :iso_numeric "710", :subunit_to_unit 100, :html_entity "&#x0052;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "New Taiwan Dollar", :iso_code "TWD", :iso_numeric "901", :subunit_to_unit 100, :html_entity "$", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Hong Kong Dollar", :iso_code "HKD", :iso_numeric "344", :subunit_to_unit 100, :html_entity "$", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "₭", :subunit "Att", :name "Lao Kip", :iso_code "LAK", :iso_numeric "418", :subunit_to_unit 100, :html_entity "&#x20AD;", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "Bs F", :subunit "Céntimo", :name "Venezuelan Bolívar", :iso_code "VEF", :iso_numeric "937", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "Sh", :subunit "Cent", :name "Tanzanian Shilling", :iso_code "TZS", :iso_numeric "834", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "د.إ", :subunit "Fils", :name "United Arab Emirates Dirham", :iso_code "AED", :iso_numeric "784", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "Sh", :subunit "Cent", :name "Somali Shilling", :iso_code "SOS", :iso_numeric "706", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "Vt", :subunit nil, :name "Vanuatu Vatu", :iso_code "VUV", :iso_numeric "548", :subunit_to_unit 1, :html_entity "", :symbol_first true, :decimal_points 0 :priority 100} 
  {:symbol nil, :subunit "Tyiyn", :name "Kyrgyzstani Som", :iso_code "KGS", :iso_numeric "417", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "د.ت", :subunit "Millime", :name "Tunisian Dinar", :iso_code "TND", :iso_numeric "788", :subunit_to_unit 1000, :html_entity "", :symbol_first false, :decimal_points 3 :priority 100} 
  {:symbol "C$", :subunit "Centavo", :name "Nicaraguan Córdoba", :iso_code "NIO", :iso_numeric "558", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "din. or дин.", :subunit "Para", :name "Serbian Dinar", :iso_code "RSD", :iso_numeric "941", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "m", :subunit "Tennesi", :name "Turkmenistani Manat", :iso_code "TMM", :iso_numeric "795", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "€", :subunit "Cent", :name "Euro", :iso_code "EUR", :iso_numeric "978", :subunit_to_unit 100, :html_entity "&#x20AC;", :symbol_first false, :decimal_points 2 :priority 2} 
  {:symbol "B/.", :subunit "Centésimo", :name "Panamanian Balboa", :iso_code "PAB", :iso_numeric "590", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "Br", :subunit "Kapyeyka", :name "Belarusian Ruble", :iso_code "BYR", :iso_numeric "974", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "₴", :subunit "Kopiyka", :name "Ukrainian Hryvnia", :iso_code "UAH", :iso_numeric "980", :subunit_to_unit 100, :html_entity "&#x20B4", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Canadian Dollar", :iso_code "CAD", :iso_numeric "124", :subunit_to_unit 100, :html_entity "$", :symbol_first true, :decimal_points 2 :priority 5} 
  {:symbol "RM", :subunit "Sen", :name "Malaysian Ringgit", :iso_code "MYR", :iso_numeric "458", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Namibian Dollar", :iso_code "NAD", :iso_numeric "516", :subunit_to_unit 100, :html_entity "$", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol nil, :subunit "Chertrum", :name "Bhutanese Ngultrum", :iso_code "BTN", :iso_numeric "064", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Singapore Dollar", :iso_code "SGD", :iso_numeric "702", :subunit_to_unit 100, :html_entity "$", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Zimbabwean Dollar", :iso_code "ZWD", :iso_numeric "716", :subunit_to_unit 100, :html_entity "$", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "kr", :subunit "Øre", :name "Danish Krone", :iso_code "DKK", :iso_numeric "208", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "Sk", :subunit "Halier", :name "Slovak Koruna", :iso_code "SKK", :iso_numeric "703", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "ب.د", :subunit "Fils", :name "Bahraini Dinar", :iso_code "BHD", :iso_numeric "048", :subunit_to_unit 1000, :html_entity "", :symbol_first true, :decimal_points 3 :priority 100} 
  {:symbol nil, :subunit "Santim", :name "Ethiopian Birr", :iso_code "ETB", :iso_numeric "230", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "Ft", :subunit "Fillér", :name "Hungarian Forint", :iso_code "HUF", :iso_numeric "348", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "Comorian Franc", :iso_code "KMF", :iso_numeric "174", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Bermudian Dollar", :iso_code "BMD", :iso_numeric "060", :subunit_to_unit 100, :html_entity "$", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "د.ك", :subunit "Fils", :name "Kuwaiti Dinar", :iso_code "KWD", :iso_numeric "414", :subunit_to_unit 1000, :html_entity "", :symbol_first true, :decimal_points 3 :priority 100} 
  {:symbol "L", :subunit "Sente", :name "Lesotho Loti", :iso_code "LSL", :iso_numeric "426", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Centavo", :name "Dominican Peso", :iso_code "DOP", :iso_numeric "214", :subunit_to_unit 100, :html_entity "&#x20B1;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "₱", :subunit "Centavo", :name "Philippine Peso", :iso_code "PHP", :iso_numeric "608", :subunit_to_unit 100, :html_entity "&#x20B1;", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "Guinean Franc", :iso_code "GNF", :iso_numeric "324", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "£", :subunit "Piastre", :name "Sudanese Pound", :iso_code "SDG", :iso_numeric "938", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Belize Dollar", :iso_code "BZD", :iso_numeric "084", :subunit_to_unit 100, :html_entity "$", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Cayman Islands Dollar", :iso_code "KYD", :iso_numeric "136", :subunit_to_unit 100, :html_entity "$", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "MTn", :subunit "Centavo", :name "Mozambican Metical", :iso_code "MZN", :iso_numeric "943", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "Nfk", :subunit "Cent", :name "Eritrean Nakfa", :iso_code "ERN", :iso_numeric "232", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "₡", :subunit "Centavo", :name "Salvadoran Colón", :iso_code "SVC", :iso_numeric "222", :subunit_to_unit 100, :html_entity "&#x20A1;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "Rp", :subunit "Sen", :name "Indonesian Rupiah", :iso_code "IDR", :iso_numeric "360", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "£ or ج.م", :subunit "Piastre", :name "Egyptian Pound", :iso_code "EGP", :iso_numeric "818", :subunit_to_unit 100, :html_entity "&#x00A3;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "KM or КМ", :subunit "Fening", :name "Bosnia and Herzegovina Convertible Mark", :iso_code "BAM", :iso_numeric "977", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "د.ج", :subunit "Centime", :name "Algerian Dinar", :iso_code "DZD", :iso_numeric "012", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "P", :subunit "Avo", :name "Macanese Pataca", :iso_code "MOP", :iso_numeric "446", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Centavo", :name "Argentine Peso", :iso_code "ARS", :iso_numeric "032", :subunit_to_unit 100, :html_entity "&#x20B1;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "ر.ق", :subunit "Dirham", :name "Qatari Riyal", :iso_code "QAR", :iso_numeric "634", :subunit_to_unit 100, :html_entity "&#xFDFC;", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "Bs.", :subunit "Centavo", :name "Bolivian Boliviano", :iso_code "BOB", :iso_numeric "068", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "៛", :subunit "Sen", :name "Cambodian Riel", :iso_code "KHR", :iso_numeric "116", :subunit_to_unit 100, :html_entity "&#x17DB;", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "L", :subunit "Ban", :name "Moldovan Leu", :iso_code "MDL", :iso_numeric "498", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "ع.د", :subunit "Fils", :name "Iraqi Dinar", :iso_code "IQD", :iso_numeric "368", :subunit_to_unit 1000, :html_entity "", :symbol_first false, :decimal_points 3 :priority 100} 
  {:symbol "$", :subunit "Centavo", :name "Cuban Convertible Peso", :iso_code "CUC", :iso_numeric "931", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "﷼", :subunit "Fils", :name "Yemeni Rial", :iso_code "YER", :iso_numeric "886", :subunit_to_unit 100, :html_entity "&#xFDFC;", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "G", :subunit "Centime", :name "Haitian Gourde", :iso_code "HTG", :iso_numeric "332", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Australian Dollar", :iso_code "AUD", :iso_numeric "036", :subunit_to_unit 100, :html_entity "$", :symbol_first true, :decimal_points 2 :priority 4} 
  {:symbol "ƒ", :subunit "Cent", :name "Netherlands Antillean Gulden", :iso_code "ANG", :iso_numeric "532", :subunit_to_unit 100, :html_entity "&#x0192;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "₪", :subunit "Agora", :name "Israeli New Sheqel", :iso_code "ILS", :iso_numeric "376", :subunit_to_unit 100, :html_entity "&#x20AA;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "ЅМ", :subunit "Diram", :name "Tajikistani Somoni", :iso_code "TJS", :iso_numeric "972", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "ر.س", :subunit "Hallallah", :name "Saudi Riyal", :iso_code "SAR", :iso_numeric "682", :subunit_to_unit 100, :html_entity "&#xFDFC;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Trinidad and Tobago Dollar", :iso_code "TTD", :iso_numeric "780", :subunit_to_unit 100, :html_entity "$", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "kr", :subunit "Öre", :name "Swedish Krona", :iso_code "SEK", :iso_numeric "752", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Centavo", :name "Cuban Peso", :iso_code "CUP", :iso_numeric "192", :subunit_to_unit 100, :html_entity "&#x20B1;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Bahamian Dollar", :iso_code "BSD", :iso_numeric "044", :subunit_to_unit 100, :html_entity "$", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "Lt", :subunit "Centas", :name "Lithuanian Litas", :iso_code "LTL", :iso_numeric "440", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "Le", :subunit "Cent", :name "Sierra Leonean Leone", :iso_code "SLL", :iso_numeric "694", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "East Caribbean Dollar", :iso_code "XCD", :iso_numeric "951", :subunit_to_unit 100, :html_entity "$", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "D", :subunit "Butut", :name "Gambian Dalasi", :iso_code "GMD", :iso_numeric "270", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "Sh", :subunit "Cent", :name "Kenyan Shilling", :iso_code "KES", :iso_numeric "404", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Guyanese Dollar", :iso_code "GYD", :iso_numeric "328", :subunit_to_unit 100, :html_entity "$", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Surinamese Dollar", :iso_code "SRD", :iso_numeric "968", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "〒", :subunit "Tiyn", :name "Kazakhstani Tenge", :iso_code "KZT", :iso_numeric "398", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "د.ا", :subunit "Piastre", :name "Jordanian Dinar", :iso_code "JOD", :iso_numeric "400", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "L", :subunit "Cent", :name "Swazi Lilangeni", :iso_code "SZL", :iso_numeric "748", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "₵", :subunit "Pesewa", :name "Ghanaian Cedi", :iso_code "GHS", :iso_numeric "936", :subunit_to_unit 100, :html_entity "&#x20B5;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "₩", :subunit "Chŏn", :name "North Korean Won", :iso_code "KPW", :iso_numeric "408", :subunit_to_unit 100, :html_entity "&#x20A9;", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Jamaican Dollar", :iso_code "JMD", :iso_numeric "388", :subunit_to_unit 100, :html_entity "$", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "MK", :subunit "Tambala", :name "Malawian Kwacha", :iso_code "MWK", :iso_numeric "454", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "kr", :subunit "Eyrir", :name "Icelandic Króna", :iso_code "ISK", :iso_numeric "352", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "₨", :subunit "Paisa", :name "Indian Rupee", :iso_code "INR", :iso_numeric "356", :subunit_to_unit 100, :html_entity "&#x20A8;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "UM", :subunit "Khoums", :name "Mauritanian Ouguiya", :iso_code "MRO", :iso_numeric "478", :subunit_to_unit 5, :html_entity "", :symbol_first false, :decimal_points 1 :priority 100} 
  {:symbol "₨", :subunit "Paisa", :name "Pakistani Rupee", :iso_code "PKR", :iso_numeric "586", :subunit_to_unit 100, :html_entity "&#x20A8;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "K", :subunit "Toea", :name "Papua New Guinean Kina", :iso_code "PGK", :iso_numeric "598", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "﷼", :subunit "Dinar", :name "Iranian Rial", :iso_code "IRR", :iso_numeric "364", :subunit_to_unit 100, :html_entity "&#xFDFC;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "؋", :subunit "Pul", :name "Afghan Afghani", :iso_code "AFN", :iso_numeric "971", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "₡", :subunit "Céntimo", :name "Costa Rican Colón", :iso_code "CRC", :iso_numeric "188", :subunit_to_unit 100, :html_entity "&#x20A1;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "ر.ع.", :subunit "Baisa", :name "Omani Rial", :iso_code "OMR", :iso_numeric "512", :subunit_to_unit 1000, :html_entity "&#xFDFC;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol nil, :subunit "Tiyin", :name "Uzbekistani Som", :iso_code "UZS", :iso_numeric "860", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "¥", :subunit "Fen", :name "Chinese Renminbi Yuan", :iso_code "CNY", :iso_numeric "156", :subunit_to_unit 100, :html_entity "&#x5713;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "฿", :subunit "Satang", :name "Thai Baht", :iso_code "THB", :iso_numeric "764", :subunit_to_unit 100, :html_entity "&#x0E3F;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "Cfp Franc", :iso_code "XPF", :iso_numeric "953", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "Kč", :subunit "Haléř", :name "Czech Koruna", :iso_code "CZK", :iso_numeric "203", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "ރ.", :subunit "Laari", :name "Maldivian Rufiyaa", :iso_code "MVR", :iso_numeric "462", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol nil, :subunit "Qəpik", :name "Azerbaijani Manat", :iso_code "AZN", :iso_numeric "944", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "₦", :subunit "Kobo", :name "Nigerian Naira", :iso_code "NGN", :iso_numeric "566", :subunit_to_unit 100, :html_entity "&#x20A6;", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "T$", :subunit "Seniti", :name "Tongan Paʻanga", :iso_code "TOP", :iso_numeric "776", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "R$ ", :subunit "Centavo", :name "Brazilian Real", :iso_code "BRL", :iso_numeric "986", :subunit_to_unit 100, :html_entity "R$", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "ден", :subunit "Deni", :name "Macedonian Denar", :iso_code "MKD", :iso_numeric "807", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "P", :subunit "Thebe", :name "Botswana Pula", :iso_code "BWP", :iso_numeric "072", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "£", :subunit "Penny", :name "Saint Helenian Pound", :iso_code "SHP", :iso_numeric "654", :subunit_to_unit 100, :html_entity "&#x00A3;", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "United States Dollar", :iso_code "USD", :iso_numeric "840", :subunit_to_unit 100, :html_entity "$", :symbol_first true, :decimal_points 2 :priority 1} 
  {:symbol "TL", :subunit "kuruş", :name "Turkish Lira", :iso_code "TRY", :iso_numeric "949", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "L", :subunit "Ban", :name "Romanian Leu", :iso_code "RON", :iso_numeric "946", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Centésimo", :name "Uruguayan Peso", :iso_code "UYU", :iso_numeric "858", :subunit_to_unit 100, :html_entity "&#x20B1;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "د.م.", :subunit "Centime", :name "Moroccan Dirham", :iso_code "MAD", :iso_numeric "504", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol nil, :subunit "Iraimbilanja", :name "Malagasy Ariary", :iso_code "MGA", :iso_numeric "969", :subunit_to_unit 5, :html_entity "", :symbol_first false, :decimal_points 1 :priority 100} 
  {:symbol "ل.ل", :subunit "Piastre", :name "Lebanese Pound", :iso_code "LBP", :iso_numeric "422", :subunit_to_unit 100, :html_entity "&#x00A3;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "Central African Cfa Franc", :iso_code "XAF", :iso_numeric "950", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Centavo", :name "Colombian Peso", :iso_code "COP", :iso_numeric "170", :subunit_to_unit 100, :html_entity "&#x20B1;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Liberian Dollar", :iso_code "LRD", :iso_numeric "430", :subunit_to_unit 100, :html_entity "$", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "₨", :subunit "Cent", :name "Sri Lankan Rupee", :iso_code "LKR", :iso_numeric "144", :subunit_to_unit 100, :html_entity "&#x0BF9;", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "դր.", :subunit "Luma", :name "Armenian Dram", :iso_code "AMD", :iso_numeric "051", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "$ or Esc", :subunit "Centavo", :name "Cape Verdean Escudo", :iso_code "CVE", :iso_numeric "132", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "Fr", :subunit "Rappen", :name "Swiss Franc", :iso_code "CHF", :iso_numeric "756", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "kn", :subunit "Lipa", :name "Croatian Kuna", :iso_code "HRK", :iso_numeric "191", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "£", :subunit "Penny", :name "Falkland Pound", :iso_code "FKP", :iso_numeric "238", :subunit_to_unit 100, :html_entity "&#x00A3;", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "K", :subunit "Pya", :name "Myanmar Kyat", :iso_code "MMK", :iso_numeric "104", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "L", :subunit "Qintar", :name "Albanian Lek", :iso_code "ALL", :iso_numeric "008", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "kr", :subunit "Øre", :name "Norwegian Krone", :iso_code "NOK", :iso_numeric "578", :subunit_to_unit 100, :html_entity "kr", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "ل.د", :subunit "Dirham", :name "Libyan Dinar", :iso_code "LYD", :iso_numeric "434", :subunit_to_unit 1000, :html_entity "", :symbol_first false, :decimal_points 3 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Fijian Dollar", :iso_code "FJD", :iso_numeric "242", :subunit_to_unit 100, :html_entity "$", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "£ or ل.س", :subunit "Piastre", :name "Syrian Pound", :iso_code "SYP", :iso_numeric "760", :subunit_to_unit 100, :html_entity "&#x00A3;", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "₨", :subunit "Cent", :name "Mauritian Rupee", :iso_code "MUR", :iso_numeric "480", :subunit_to_unit 100, :html_entity "&#x20A8;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "Djiboutian Franc", :iso_code "DJF", :iso_numeric "262", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "£", :subunit "Penny", :name "Gibraltar Pound", :iso_code "GIP", :iso_numeric "292", :subunit_to_unit 100, :html_entity "&#x00A3;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "лв", :subunit "Stotinka", :name "Bulgarian Lev", :iso_code "BGN", :iso_numeric "975", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "Db", :subunit "Cêntimo", :name "São Tomé and Príncipe Dobra", :iso_code "STD", :iso_numeric "678", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Centavo", :name "Mexican Peso", :iso_code "MXN", :iso_numeric "484", :subunit_to_unit 100, :html_entity "$", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "ლ", :subunit "Tetri", :name "Georgian Lari", :iso_code "GEL", :iso_numeric "981", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "Ls", :subunit "Santīms", :name "Latvian Lats", :iso_code "LVL", :iso_numeric "428", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "£", :subunit "Penny", :name "British Pound", :iso_code "GBP", :iso_numeric "826", :subunit_to_unit 100, :html_entity "&#x00A3;", :symbol_first true, :decimal_points 2 :priority 3} 
  {:symbol "₨", :subunit "Cent", :name "Seychellois Rupee", :iso_code "SCR", :iso_numeric "690", :subunit_to_unit 100, :html_entity "&#x20A8;", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "Fr", :subunit "Centime", :name "West African Cfa Franc", :iso_code "XOF", :iso_numeric "952", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Solomon Islands Dollar", :iso_code "SBD", :iso_numeric "090", :subunit_to_unit 100, :html_entity "$", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "Sh", :subunit "Cent", :name "Ugandan Shilling", :iso_code "UGX", :iso_numeric "800", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "L", :subunit "Centavo", :name "Honduran Lempira", :iso_code "HNL", :iso_numeric "340", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "ƒ", :subunit "Cent", :name "Aruban Florin", :iso_code "AWG", :iso_numeric "533", :subunit_to_unit 100, :html_entity "&#x0192;", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "₨", :subunit "Paisa", :name "Nepalese Rupee", :iso_code "NPR", :iso_numeric "524", :subunit_to_unit 100, :html_entity "&#x20A8;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Peso", :name "Chilean Peso", :iso_code "CLP", :iso_numeric "152", :subunit_to_unit 1, :html_entity "&#x20B1;", :symbol_first true, :decimal_points 0 :priority 100} 
  {:symbol "₩", :subunit "Jeon", :name "South Korean Won", :iso_code "KRW", :iso_numeric "410", :subunit_to_unit 100, :html_entity "&#x20A9;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "¥", :subunit nil, :name "Japanese Yen", :iso_code "JPY", :iso_numeric "392", :subunit_to_unit 1, :html_entity "&#x00A5;", :symbol_first true, :decimal_points 0 :priority 6} 
  {:symbol "₮", :subunit "Möngö", :name "Mongolian Tögrög", :iso_code "MNT", :iso_numeric "496", :subunit_to_unit 100, :html_entity "&#x20AE;", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "Kz", :subunit "Cêntimo", :name "Angolan Kwanza", :iso_code "AOA", :iso_numeric "973", :subunit_to_unit 100, :html_entity "", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "S/.", :subunit "Céntimo", :name "Peruvian Nuevo Sol", :iso_code "PEN", :iso_numeric "604", :subunit_to_unit 100, :html_entity "S/.", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "₲", :subunit "Céntimo", :name "Paraguayan Guaraní", :iso_code "PYG", :iso_numeric "600", :subunit_to_unit 100, :html_entity "&#x20B2;", :symbol_first true, :decimal_points 2 :priority 100} 
  {:symbol "$", :subunit "Cent", :name "Barbadian Dollar", :iso_code "BBD", :iso_numeric "052", :subunit_to_unit 100, :html_entity "$", :symbol_first false, :decimal_points 2 :priority 100} 
  {:symbol "Q", :subunit "Centavo", :name "Guatemalan Quetzal", :iso_code "GTQ", :iso_numeric "320", :subunit_to_unit 100, :html_entity "", :symbol_first true, :decimal_points 2 :priority 100}
  {:symbol "฿", :subunit "Satoshi", :name "Bitcoin", :iso_code "BTC", :subunit_to_unit 100000000, :symbol_first true, :decimal_points 4 :priority 1}])

(doseq [c all-currencies]
  (defcurrency c))