package com.example.oracle22.thirteen;

import com.example.android_oracle.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.listener.ImageLoadingProgressListener;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class TestImageLoad7 extends Activity implements OnClickListener {
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

		DisplayImageOptions options = new DisplayImageOptions.Builder()
				.showImageOnLoading(R.drawable.yang300)
				.showImageOnFail(R.drawable.b200).cacheInMemory(true)
				.cacheOnDisk(true).bitmapConfig(Bitmap.Config.RGB_565).build();

		ImageLoader.getInstance().displayImage(imageUrl, image, options,
				new SimpleImageLoadingListener(),
				new ImageLoadingProgressListener() {

					@Override
					public void onProgressUpdate(String imageUrl, View view,
							int current, int total) {

					}
				});
	}
}
