package com.example.oracle12.four;

import com.example.android_oracle.R;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class FourMyView extends View {

	Paint paint;
	Bitmap bitmap;
	float left, top;

	public FourMyView(Context context) {
		super(context);
		paint = new Paint();
		bitmap = BitmapFactory.decodeResource(getResources(),
				R.drawable.ic_launcher);
	}

	public FourMyView(Context context, AttributeSet attrs) {
		super(context, attrs);
		paint = new Paint();
		bitmap = BitmapFactory.decodeResource(getResources(),
				R.drawable.ic_launcher);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.drawBitmap(bitmap, left, top, paint);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {

		if (event.getAction() == MotionEvent.ACTION_MOVE) {
			left = event.getX();
			top = event.getY();
		}
		invalidate();
		return true;
	}

}
