package com.hook.weather.logic.network

import com.hook.weather.HookWeatherApplication
import com.hook.weather.logic.model.DailyResponse
import com.hook.weather.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * author ：lingfei.fang
 * time   ：2020/8/6
 * desc   ：
 * version：1.0
 *
 */
interface WeatherService {

    @GET("v2.5/${HookWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng: String,@Path("lat") lat: String):Call<RealtimeResponse>

    @GET("v2.5/${HookWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String,@Path("lat") lat: String):Call<DailyResponse>

}