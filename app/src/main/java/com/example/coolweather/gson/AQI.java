package com.example.coolweather.gson;

/**
 * Created by yl on 2018/12/8.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
