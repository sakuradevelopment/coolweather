package com.sakura.coolweather.gson;

import com.google.gson.annotations.SerializedName;

//GSON的用法很简单，
//解析数据只需要一行代码就能完成了，
//但前提是要先将数据对应的实体类创建好
public class Basic {

    /**
     * JSON中的一些字段可能不太适合直接作为Java字段来命名
     * @SerializedName注解
     * 的方式来让JSON字段和Java字段之间建立映射关系
     */
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
