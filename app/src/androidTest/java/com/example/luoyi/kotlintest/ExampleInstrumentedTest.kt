package com.example.luoyi.kotlintest

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import android.util.Log
import org.json.JSONArray

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import java.util.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.example.luoyi.kotlintest", appContext.packageName)
    }


    @Test
    fun method() {
        val time = Calendar.getInstance()
        //val hour = time.get(Calendar.HOUR_OF_DAY)
        val hour = 19
        val times = JSONArray("[20,23]")
        if (times.length() != 2){
        }
        val startTime = times[0] as Int
        val endTime = times[1] as Int
        Log.e("", Calendar.getInstance().toString())
        //当前时间段处于同一天的情况
        if (startTime < endTime){
            assertEquals((hour in startTime..endTime), true)
        }
        //跨天的时间段情况
        if (startTime > endTime){
           // assertEquals((hour in (startTime+1)..endTime), true)
            assertEquals((hour in startTime..24) || (hour in 0..endTime), true)
        }
    }
}
