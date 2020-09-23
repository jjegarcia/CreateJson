package com.example.createjson

import android.content.Context
import com.google.gson.Gson

class JsonParser {
    val gson = Gson()

    fun parseJson(context: Context, fileName :Int): countriesJson  {
         return gson.fromJson(
            JSonFileHandler.JSonFileRead.readFile(context, fileName),
             countriesJson::class.java
        )
    }
}