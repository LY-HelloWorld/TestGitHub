package com.example.luoyi.kotlintest

import android.app.Activity
import android.os.Bundle

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
class ScreenOnActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_on)

    }
}