package com.gitrep.mylibrary;

import com.google.gson.Gson;

/**
 * Created by c029312 on 10/11/17.
 */

public class DecodeJson {

    public static Object decode(String json, Class clazzName) throws Exception{
        return new Gson().fromJson(json, clazzName);
    }
}
