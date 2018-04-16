package com.coolweather.android.gson;

/**
 * Created by 1204992207@qq.com on 2018/4/16.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
