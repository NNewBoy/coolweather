package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 1204992207@qq.com on 2018/4/16.
 */

public class Basic {
    @SerializedName("city")
    public String cityname;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
