package com.example.createjson

import android.content.Context
import com.google.gson.Gson

class JsonReader {
    val gson = Gson()

    fun readJson(context: Context, fileName :String): Country  {
         return gson.fromJson(
            JSonFileHandler.JSonFileUtil.readFile(context, fileName),
            Country::class.java
        )
    }
}