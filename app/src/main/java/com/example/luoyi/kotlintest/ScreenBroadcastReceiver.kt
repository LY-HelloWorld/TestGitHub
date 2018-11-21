package com.example.luoyi.kotlintest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

/**
 * <pre>
 *     author : luoyi
 *     e-mail : 891682474@qq.com
 *     time   : 2018/11/12
 *     desc   :
 *     version: 1.0
常量
字段
构造函数
重写函数和回调
公有函数
私有函数
内部类或接口
 * </pre>
 */
class ScreenBroadcastReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        when (intent.action) {
            Intent.ACTION_SCREEN_ON -> {
                Log.e("ScreenBroadcastReceiver", "" + intent.action)
                context.startActivity(Intent(context, ScreenOnActivity::class.java))
            }
            Intent.ACTION_SCREEN_OFF -> {
                Log.e("ScreenBroadcastReceiver", "" + intent.action)
            }
            Intent.ACTION_USER_PRESENT -> {
                Log.e("ScreenBroadcastReceiver", "" + intent.action)
            }
        }


    }
}