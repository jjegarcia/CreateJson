package com.example.createjson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val jsonParser= JsonParser()
        val country =jsonParser.parseJson(this,R.raw.country_flags)
        setContentView(R.layout.activity_main)
        Log.i("hhh", country.toString())
//        val utils=Utils()
//        utils.test(this)
//        val jsonWriter=JsonCreator()
//        val jsonObject =jsonWriter.getJSonFile()
//        val jsonFileHandler= JSonFileHandler()
//        val outputFileName="country_flags_output.json"
//        jsonFileHandler.JSonPutFile(jsonObject,outputFileName)
//        println(jsonObject)
    }
}