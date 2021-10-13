package com.mxw01.miaosha.redis;

/**
 * @author mxw01
 * @create 2021-09-23 16:06
 */
public class UserKey extends BasePrefix{

    private UserKey(String prefix) {
        super(prefix);
    }
    public static UserKey getById = new UserKey("id");
    public static UserKey getByName = new UserKey("name");
}
