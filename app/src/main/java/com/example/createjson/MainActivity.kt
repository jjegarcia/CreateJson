package com.example.createjson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.json.JSONArray
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jsonObject = JSONObject()
        val innerObject1 = JSONObject()
        val innerObject2 = JSONObject()
        val innerObject3 = JSONObject()



        innerObject1.put("flag1", false)
        innerObject1.put("flag2", false)
        innerObject1.put("flag3", true)

        innerObject2.put("flag2", true)
        innerObject2.put("flag3", false)

        innerObject3.put("flag3", true)


        jsonObject.put("UK", innerObject1)
        jsonObject.put("FRANCE", innerObject1)
        jsonObject.put("GERMANY", innerObject2)
        jsonObject.put("ITALY", innerObject3)

        println(jsonObject)
        val test = "s"
    }
}