package com.example.createjson

import org.json.JSONObject

class JsonCreator {
    fun getJSonFile(): JSONObject {
        val flags = Flags.values()
        val countries: Array<Countries> = Countries.values()
        val countryJSonObject = getCountryJSonObject(countries,flags)
        return countryJSonObject
    }

    private fun getCountryJSonObject(countries: Array<Countries>, flags: Array<Flags>): JSONObject {
        val countryJSonObject = JSONObject()
        countries.iterator().forEach {
            countryJSonObject.put(it.name,getFlagsJSonObject(flags))
        }
        return countryJSonObject
    }

    private fun getFlagsJSonObject(flags: Array<Flags>): JSONObject {
        val flagsJSonObject = JSONObject()
        flags.iterator().forEach {
            flagsJSonObject.put(it.flagName,it.defaultValue)
        }
        return flagsJSonObject
    }

}