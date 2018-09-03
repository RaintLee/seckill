package com.learn.redis;

/**
 * Created by Administrator on 2018/9/3.
 */
public interface KeyPrefix {
    /**  过期时间 **/
    public int expireSeconds();
    /**  获取前缀 **/
    public String getPrefix();
}
