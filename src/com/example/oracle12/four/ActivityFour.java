package com.example.oracle12.four;

import com.example.android_oracle.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityFour extends Activity {
	Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        b1=(Button) findViewById(R.id.four_b1);
        b1.setOnClickListener(new OnClick());
        b2=(Button) findViewById(R.id.four_b2);
        b2.setOnClickListener(new OnClick());
        b3=(Button) findViewById(R.id.four_b3);
        b3.setOnClickListener(new OnClick());
        b4=(Button) findViewById(R.id.four_b4);
        b4.setOnClickListener(new OnClick());
        b5=(Button) findViewById(R.id.four_b5);
        b5.setOnClickListener(new OnClick());
        
        
    }

    class OnClick implements OnClickListener{

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.four_b1:
				startActivity(new Intent(ActivityFour.this,FourToast.class));
				break;
			case R.id.four_b2:
				startActivity(new Intent(ActivityFour.this,FourView.class));
				break;
			case R.id.four_b3:
				startActivity(new Intent(ActivityFour.this,FourProgressBar.class));
				break;
			case R.id.four_b4:
				startActivity(new Intent(ActivityFour.this,FourSlidingMenu.class));
				break;
			case R.id.four_b5:
				startActivity(new Intent(ActivityFour.this,FourListScroll.class));
				break;
			default:
				break;
			}
		}
    	
    }
}
