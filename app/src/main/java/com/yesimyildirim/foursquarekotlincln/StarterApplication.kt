package com.yesimyildirim.foursquarekotlincln

import android.app.Application
import com.parse.Parse

class StarterApplication :Application(){

    override fun onCreate() {
        super.onCreate()

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG)

        Parse.initialize(Parse.Configuration.Builder(this)

            .applicationId("vyJd4B39yJn4r6TS3Ji15qb974wNm2FcHnzQqjK7")
            .clientKey("2SaMKHbkJdNQODiUoQxquvMkyohFrW4YCOyLe0Sy")
            .server("https://parseapi.back4app.com/")
            .build())
    }
}