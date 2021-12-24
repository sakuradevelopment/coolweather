package com.sakura.coolweather.db;

import org.litepal.crud.LitePalSupport;

import lombok.Data;

@Data
public class Province extends LitePalSupport {
    private int id;
    private String provinceName; //省的名字
    private  int provinceCode; //录省的代号

}
