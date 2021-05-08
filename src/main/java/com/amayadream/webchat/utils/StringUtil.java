package com.amayadream.webchat.utils;

import java.util.UUID;

/**
 * @Author :  xxx
 * @date :  2017.01.11 19:03
 */
public class StringUtil {

    public static String getGuid(){
        return UUID.randomUUID().toString().trim().replaceAll("-", "").toLowerCase();
    }

}
