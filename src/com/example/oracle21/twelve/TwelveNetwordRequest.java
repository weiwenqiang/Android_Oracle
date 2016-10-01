package com.example.oracle21.twelve;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.example.android_oracle.R;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class TwelveNetwordRequest extends Activity implements OnClickListener {
	TextView request;
	ImageView image;
	Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			image.setImageBitmap((Bitmap) msg.obj);
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.twelve_networdrequest);
		image = (ImageView) findViewById(R.id.twelve_image);
		request = (TextView) findViewById(R.id.twelve_request);
		request.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				URL url = null;
				InputStream input = null;
				try {
					url = new URL(
							"http://10.0.2.2:8053/host-manager/images/tomcat.gif");

					HttpURLConnection conn = (HttpURLConnection) url
							.openConnection();

					conn.setReadTimeout(5 * 1000);
					conn.setRequestMethod("GET");
					conn.setDoInput(true);
					conn.setDoOutput(true);
					conn.connect();

					if (conn.getResponseCode() == 200) {
						input = conn.getInputStream();
					}
					Message msg = new Message();
					Bitmap bitmap = BitmapFactory.decodeStream(input);
					msg.obj = bitmap;
					handler.sendMessage(msg);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		}

		).start();
	}

}
