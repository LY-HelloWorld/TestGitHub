package com.example.luoyi.kotlintest

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.os.MemoryFile
import com.example.mylibrary.MyToast
import android.support.v7.app.AppCompatActivity
import android.util.Log
import org.jetbrains.annotations.TestOnly
import org.json.JSONArray
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.log


class MainActivity : AppCompatActivity() {

    lateinit var screenBroadcastReceiver: ScreenBroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setRegister()
        Log.e("MainActivity", getCurrentTime())
        val memoryFile = MemoryFile("firstMemoryFile", 1024)

    }

    private fun getCurrentTime(): String {
        val simpleDateFormat = SimpleDateFormat("YY/MM/dd-HH:mm")
        return simpleDateFormat.format(Calendar.getInstance().time)
    }
    /*override fun onDestroy() {
        super.onDestroy()
        //unregisterReceiver(screenBroadcastReceiver)
    }


    private fun setRegister() {
        screenBroadcastReceiver = ScreenBroadcastReceiver()
        var intentFilter = IntentFilter()
        intentFilter.addAction(Intent.ACTION_SCREEN_OFF)
        intentFilter.addAction(Intent.ACTION_SCREEN_ON)
        intentFilter.addAction(Intent.ACTION_USER_PRESENT)
        registerReceiver(screenBroadcastReceiver, intentFilter)
        MyToast(MainActivity@this).show()
    }*/


}
