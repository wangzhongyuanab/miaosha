package com.miaoshaproject.service;

//封装本地缓存操作类
public interface CacheService {
    //存
    void setCommonCache(String key,Object value);
    //取
    Object getFromCommonCache(String key);

     int  MY_VALUE=10;
}
