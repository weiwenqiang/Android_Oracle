package com.example.oracle22.thirteen;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import android.app.Application;

public class ThirteenMyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
//		ImageLoaderConfiguration configuration = ImageLoaderConfiguration.createDefault(this);
		ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(this)
		.writeDebugLogs().build();
		ImageLoader.getInstance().init(configuration);
	}
}
