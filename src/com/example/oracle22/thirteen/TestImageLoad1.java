package com.example.oracle22.thirteen;

import com.example.android_oracle.R;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class TestImageLoad1 extends Activity implements OnClickListener {
	TextView text;
	ImageView image;
	String imageUrl = "http://10.0.2.2:8053/host-manager/images/tomcat.gif";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thirteen_imageload1);
		text = (TextView) findViewById(R.id.thirteen_request);
		image = (ImageView) findViewById(R.id.thirteen_image);
		text.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		imageLoad();
	}

	protected void imageLoad() {
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
						image.setImageBitmap(arg2);
					}

					@Override
					public void onLoadingCancelled(String arg0, View arg1) {
					}
				});
	}

}
