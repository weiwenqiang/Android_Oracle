package com.example.oracle22.thirteen;

import com.example.android_oracle.R;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TestImageLoad2 extends Activity {
	ImageView mImageView;
	String imageUrl = "http://10.0.2.2:8053/host-manager/images/tomcat.gif";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thirteen_imageload2);
		mImageView = (ImageView) findViewById(R.id.thirteen_image2);
		ImageLoader.getInstance().loadImage(imageUrl,
				new ImageLoadingListener() {

					@Override
					public void onLoadingStarted(String arg0, View arg1) {
					}

					@Override
					public void onLoadingFailed(String arg0, View arg1,
							FailReason arg2) {
					}

					@Override
					public void onLoadingComplete(String arg0, View arg1,
							Bitmap arg2) {
						mImageView.setImageBitmap(arg2);
					}

					@Override
					public void onLoadingCancelled(String arg0, View arg1) {

					}
				});
	}
}
