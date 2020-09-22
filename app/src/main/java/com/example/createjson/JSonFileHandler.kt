package com.example.createjson

import android.content.Context
import android.util.Log
import org.json.JSONObject
import java.io.*

class JSonFileHandler {
    object JSonFileUtil {
        fun readFile(context: Context, fileName: String): String? {
            var result=""
            try {
                val inputStream: InputStream? =
                    javaClass.getResourceAsStream(fileName)
//                    getClass().(fileName)
                val bufferedReader =
                    BufferedReader(InputStreamReader(inputStream))
                val builder = StringBuilder()
                var line: String?
//                var penultimateLine: String?=""
//                var penultimate_1: String?=""
//                var penultimate_2: String?=""
                while (bufferedReader.readLine().also { line = it } != null) {
                    while (bufferedReader.readLine().also { line = it } != "}") {

                        if (line !="{")builder.append(line)
//                    penultimate_2=penultimate_1
//                    penultimate_1=penultimateLine
//                    penultimateLine=line
                    }
                }
                result=builder.toString()
//                return builder.toString()
            } catch (e: IOException) {
                e.printStackTrace()
            }
            return result
        }


        fun JSonPutFile(obj: JSONObject, fileName: String) {
            try {
                   val file: FileWriter = FileWriter(fileName)
                file.write(obj.toString())



                Log.i("Result:", "Successfully Copied JSON Object to File...");
                Log.i("Result:", "\nJSON Object: $obj");
            } catch (e: IOException) {
                e.printStackTrace();
            }
        }
    }
}