package com.example.bharatd.expenses

import android.app.Application
import io.realm.Realm

/**
 * Created by BharatD on 22-09-2018.
 */
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
      /*  var c = RealmConfiguration.Builder(applicationContext)
        c.name("student")
        c.deleteRealmIfMigrationNeeded()
        Realm.setDefaultConfiguration(c.build())*/
    }
}