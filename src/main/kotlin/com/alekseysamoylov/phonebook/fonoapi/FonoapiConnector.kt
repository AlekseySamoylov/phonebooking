package com.alekseysamoylov.phonebook.fonoapi

import okhttp3.OkHttpClient
import org.springframework.stereotype.Service


@Service
class FonoapiConnector {
    fun getPhoneModel(brand: String, model: String) : List<DeviceEntity> {
        val fonoApi = FonoApiFactory().create(okHttpClient)
        val response = fonoApi.getDevice(token, model, brand).execute()
        return if (response.isSuccessful && response.body() != null) {
            response.body()!!
        } else {
            listOf()
        }
    }
}

const val URL_BASE = "https://fonoapi.freshpixl.com/"
const val URL_GET_DEVICE = "/v1/getdevice"
const val URL_GET_LATEST = "/v1/getlatest"

const val QUERY_TOKEN = "token"
const val QUERY_DEVICE = "device"
const val QUERY_BRAND = "brand"
const val QUERY_POSITION = "position"
const val QUERY_LIMIT = "limit"

const val token = "b749770c72143641ba54dd64f0b18c924b64ce253caf0af4"

val okHttpClient: OkHttpClient by lazy {
    OkHttpClient.Builder()
        .build()
}

fun main() {
    print(FonoapiConnector().getPhoneModel("Samsung", "Galaxy S9"))
}
