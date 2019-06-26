package com.alekseysamoylov.phonebook.fonoapi

import com.google.gson.annotations.SerializedName


data class DeviceEntity(
    @SerializedName("DeviceName") val deviceName: String = "",
    @SerializedName("Brand") val brand: String = "",
    @SerializedName("technology") val technology: String = "",
    @SerializedName("gprs") val gprs: String = "",
    @SerializedName("edge") val edge: String = "",
    @SerializedName("announced") val announced: String = "",
    @SerializedName("status") val status: String = "",
    @SerializedName("dimensions") val dimensions: String = "",
    @SerializedName("weight") val weight: String = "",
    @SerializedName("sim") val sim: String = "",
    @SerializedName("type") val type: String = "",
    @SerializedName("size") val size: String = "",
    @SerializedName("resolution") val resolution: String = "",
    @SerializedName("card_slot") val card_slot: String = "",
    @SerializedName("phonebook") val phonebook: String = "",
    @SerializedName("call_records") val call_records: String = "",
    @SerializedName("camera_c") val camera_c: String = "",
    @SerializedName("alert_types") val alert_types: String = "",
    @SerializedName("loudspeaker_") val loudspeaker_: String = "",
    @SerializedName("_3_5mm_jack_") val _3_5mm_jack_: String = "",
    @SerializedName("sound_c") val sound_c: String = "",
    @SerializedName("wlan") val wlan: String = "",
    @SerializedName("bluetooth") val bluetooth: String = "",
    @SerializedName("gps") val gps: String = "",
    @SerializedName("infrared_port") val infrared_port: String = "",
    @SerializedName("radio") val radio: String = "",
    @SerializedName("usb") val usb: String = "",
    @SerializedName("messaging") val messaging: String = "",
    @SerializedName("browser") val browser: String = "",
    @SerializedName("clock") val clock: String = "",
    @SerializedName("alarm") val alarm: String = "",
    @SerializedName("games") val games: String = "",
    @SerializedName("languages") val languages: String = "",
    @SerializedName("java") val java: String = "",
    @SerializedName("features_c") val features_c: String = "",
    @SerializedName("battery_c") val battery_c: String = "",
    @SerializedName("stand_by") val stand_by: String = "",
    @SerializedName("talk_time") val talk_time: String = "",
    @SerializedName("colors") val colors: String = "",
    @SerializedName("sensors") val sensors: String = "",
    @SerializedName("cpu") val cpu: String = "",
    @SerializedName("internal") val internal: String = "",
    @SerializedName("os") val os: String = "",
    @SerializedName("body_c") val body_c: String = "",
    @SerializedName("keyboard") val keyboard: String = "",
    @SerializedName("primary_") val primary_: String = "",
    @SerializedName("video") val video: String = "",
    @SerializedName("secondary") val secondary: String = "",
    @SerializedName("speed") val speed: String = "",
    @SerializedName("network_c") val network_c: String = "",
    @SerializedName("chipset") val chipset: String = "",
    @SerializedName("features") val features: String = "",
    @SerializedName("music_play") val music_play: String = "",
    @SerializedName("protection") val protection: String = "",
    @SerializedName("gpu") val gpu: String = "",
    @SerializedName("multitouch") val multitouch: String = "",
    @SerializedName("loudspeaker") val loudspeaker: String = "",
    @SerializedName("audio_quality") val audio_quality: String = "",
    @SerializedName("nfc") val nfc: String = "",
    @SerializedName("camera") val camera: String = "",
    @SerializedName("display") val display: String = "",
    @SerializedName("battery_life") val battery_life: String = "",
    @SerializedName("_2g_bands") val _2g_bands: String = "",
    @SerializedName("_3g_bands") val _3g_bands: String = "",
    @SerializedName("_4g_bands") val _4g_bands: String = ""
)