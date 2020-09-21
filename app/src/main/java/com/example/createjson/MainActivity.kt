package com.example.createjson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val jsonReader=JsonReader()
        val country =jsonReader.readJson(this,"country_flags.json")

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