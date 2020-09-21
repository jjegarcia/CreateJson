//package com.example.createjson
//
//import android.content.Context
//import android.util.Log
//import com.google.gson.Gson
//import com.google.gson.reflect.TypeToken
//import java.io.IOException
//
//class Utils {
//    fun getJsonDataFromAsset(context: Context, fileName: String): String? {
//        val jsonString: String
//        try {
//            jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
//        } catch (ioException: IOException) {
//            ioException.printStackTrace()
//            return null
//        }
//        return jsonString
//    }
//    fun test(applicationContext: Context) {
////        val gson: Gson = Gson()
////        val response = gson.fromJson(
////            JSonFileUtil.readFile("country_flags.json"),
////            Country::class.java
////        )
//        val jsonFileString = getJsonDataFromAsset(applicationContext, "country_flags.json")
//        Log.i("data", jsonFileString)
//
//        val gson = Gson()
////        val listPersonType = object : TypeToken<List<Country>>() {}.type
//
//        var persons: List<Country> = gson.fromJson(jsonFileString, listPersonType)
//        persons.forEachIndexed { idx, country -> Log.i("data", "> Item $idx:\n$country") }
//    }
//
//}