package com.hook.weather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * author ：lingfei.fang
 * time   ：2020/8/6
 * desc   ：
 * version：1.0
 *
 */
data class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: Realtime)

    data class Realtime(val skycon: String,val temperature: Float,
                        @SerializedName("air_quality") val airQuality: AriQuality)

    data class AriQuality(val aqi: AQI)

    data class AQI(val chn: Float)
}