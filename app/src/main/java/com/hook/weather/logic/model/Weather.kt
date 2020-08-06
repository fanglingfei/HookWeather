package com.hook.weather.logic.model

/**
 * author ：lingfei.fang
 * time   ：2020/8/6
 * desc   ：
 * version：1.0
 *
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)