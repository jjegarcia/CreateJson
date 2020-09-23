package com.example.createjson

import android.content.Context
import android.util.Log
import org.json.JSONObject
import java.io.*

class JSonFileHandler {
    object JSonFileRead {
        fun readFile(context: Context, fileName: Int): String? {
            var result=""
            try {
                val inputStream: InputStream? =
                context.resources.openRawResource(fileName)
                val bufferedReader =
                    BufferedReader(InputStreamReader(inputStream))
                val builder = StringBuilder()
                var line: String?
                while (bufferedReader.readLine().also { line = it } != null) {
                    builder.append(line)
                }
                result=builder.toString()
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