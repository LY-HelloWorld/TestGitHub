package com.example.mylibrary;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.widget.Toast;

/**
 * <pre>
 *     author : luoyi
 *     e-mail : 891682474@qq.com
 *     time   : 2018/11/13
 *     desc   :
 *     version: 1.0
 * 常量
 * 字段
 * 构造函数
 * 重写函数和回调
 * 公有函数
 * 私有函数
 * 内部类或接口
 * </pre>
 */
public class MyToast extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public MyToast(Context context) {
        super(context);
    }
}
