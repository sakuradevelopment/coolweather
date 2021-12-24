package com.sakura.coolweather.db;

import org.litepal.crud.LitePalSupport;

import lombok.Data;

@Data
public class City extends LitePalSupport {
    private int id;
    private String cityName;
    private int cityCode; //市的代号
    private int provinceId; //所属省的id值
}
