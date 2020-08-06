package com.hook.weather.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.hook.weather.HookWeatherApplication
import com.hook.weather.logic.model.Place

/**
 * author ：lingfei.fang
 * time   ：2020/8/6
 * desc   ：
 * version：1.0
 *
 */
object PlaceDao {

    fun savePlace(place: Place){

        sharedPreferences().edit {
            putString("place",Gson().toJson(place))
        }
    }

    fun getSavedPlace() : Place {
        val placeJson = sharedPreferences().getString("place","")
        return Gson().fromJson(placeJson,Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() = HookWeatherApplication.context
        .getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)
}