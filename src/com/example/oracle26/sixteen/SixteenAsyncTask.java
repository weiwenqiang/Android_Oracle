package com.example.oracle26.sixteen;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.example.android_oracle.R;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class SixteenAsyncTask extends Activity implements OnClickListener {
	TextView text;
	ImageView image;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sixteen_asynctask);
		text = (TextView) findViewById(R.id.sixteen_asynctext);
		text.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

	}

	class MyTask extends AsyncTask<String, Void, Bitmap> {
		private ImageView image;

		public MyTask(ImageView image) {
			super();
			this.image = image;
		}

		@Override
		protected Bitmap doInBackground(String... params) {
			Bitmap bitmap = null;
			try {
				URL url = new URL(params[0]);
				HttpURLConnection conn = (HttpURLConnection) url
						.openConnection();
				conn.connect();
				if (conn.getResponseCode() == 200) {
					InputStream input = conn.getInputStream();
					bitmap = BitmapFactory.decodeStream(input);
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return bitmap;

		}

		protected void onPostExecute(Bitmap bitmap) {
			image.setImageBitmap(bitmap);
		}
	}
}
