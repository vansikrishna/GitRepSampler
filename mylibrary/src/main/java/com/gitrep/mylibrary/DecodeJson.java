package com.gitrep.mylibrary;

import android.support.annotation.Keep;
import android.util.Log;

import com.google.gson.Gson;

/**
 * Created by c029312 on 10/11/17.
 */
@Keep
public class DecodeJson {

    public static Object decode(String json, Class clazzName) throws Exception{
        Log.e("TAG", "decode: glad");
        Log.e("TAG", "decode: bad");
        return new Gson().fromJson(json, clazzName);
    }
}
