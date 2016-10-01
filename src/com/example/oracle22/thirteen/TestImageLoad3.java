package com.example.oracle22.thirteen;

import com.example.android_oracle.R;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TestImageLoad3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thirteen_imageload2);
		final ImageView mImageView = (ImageView) findViewById(R.id.thirteen_image2);
		String imageUrl = "http://10.0.2.2:8053/host-manager/images/tomcat.gif";

		ImageLoader.getInstance().loadImage(imageUrl,
				new SimpleImageLoadingListener() {

					@Override
					public void onLoadingComplete(String imageUri, View view,
							Bitmap loadedImage) {
						super.onLoadingComplete(imageUri, view, loadedImage);
						mImageView.setImageBitmap(loadedImage);
					}
				});
	}

}
