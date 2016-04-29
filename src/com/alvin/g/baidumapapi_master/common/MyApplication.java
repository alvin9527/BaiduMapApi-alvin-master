package com.alvin.g.baidumapapi_master.common;

import com.baidu.mapapi.SDKInitializer;

import android.app.Application;
/**
 * 作者： alvin.G
 * 时间： 16/4/29. 下午13:14
 * 邮箱：chinaguoxu@163.com
 */
public class MyApplication extends Application {

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		// 在使用 SDK 各组间之前初始化 context 信息，传入 ApplicationContext
		SDKInitializer.initialize(this);
	}

}
