package com.hook.weather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * author ：lingfei.fang
 * time   ：2020/8/6
 * desc   ：
 * version：1.0
 *
 */
class HookWeatherApplication : Application() {

    companion object {
        const val TOKEN = "TCFlz13GqH4TjMjW"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}