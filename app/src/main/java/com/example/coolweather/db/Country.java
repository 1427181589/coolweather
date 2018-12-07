package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/12/7.
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private String weatherID;
    private int cityID;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getCountryName(){
        return countryName;
    }
    public void setCountryName(String countryName){
        this.countryName = countryName;
    }

    public String getWeatherID(){
        return weatherID;
    }
    public void setWeatherID(String weatherID){
        this.weatherID = weatherID;
    }

    public int getCityID(){
        return cityID;
    }
    public void setCityID(int cityID){
        this.cityID = cityID;
    }
}
