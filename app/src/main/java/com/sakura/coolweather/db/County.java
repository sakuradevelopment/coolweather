package com.sakura.coolweather.db;

import org.litepal.crud.LitePalSupport;

import lombok.Data;

@Data
public class County extends LitePalSupport {
    private int id;
    private String countyName; //县的名字
    private String weatherId; //对应的天气id
    private  int cityId; //cityId记录当前县所属市的id值
}
