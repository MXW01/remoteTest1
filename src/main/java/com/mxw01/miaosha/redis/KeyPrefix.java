package com.mxw01.miaosha.redis;

/**
 * @author mxw01
 * @create 2021-09-23 15:59
 */
public interface KeyPrefix {

    public int expireSeconds();

    public String getPrefix();

}
