package com.example.android_oracle;

import com.example.oracle08.one.ActivityOne;
import com.example.oracle09.two.ActivityTwo;
import com.example.oracle10.three.ActivityThree;
import com.example.oracle12.four.ActivityFour;
import com.example.oracle13.five.ActivityFive;
import com.example.oracle14.six.ActivitySix;
import com.example.oracle15.seven.ActivitySeven;
import com.example.oracle16.eight.ActivityEight;
import com.example.oracle17.nine.ActivityNine;
import com.example.oracle19.ten.ActivityTen;
import com.example.oracle20.eleven.ActivityEleven;
import com.example.oracle21.twelve.ActivityTwelve;
import com.example.oracle22.thirteen.ActivityThirteen;
import com.example.oracle23.fourteen.ActivityFourteen;
import com.example.oracle24.fifteen.ActivityFifteen;
import com.example.oracle26.sixteen.ActivitySixteen;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	Button one, two, three, four, five, six, seven, eight, nine, ten, eleven,
			twelve, thirteen, fourteen, fifteen, sixteen;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		one = (Button) findViewById(R.id.one);
		one.setOnClickListener(this);
		two = (Button) findViewById(R.id.two);
		two.setOnClickListener(this);
		three = (Button) findViewById(R.id.three);
		three.setOnClickListener(this);
		four = (Button) findViewById(R.id.four);
		four.setOnClickListener(this);
		five = (Button) findViewById(R.id.five);
		five.setOnClickListener(this);
		six = (Button) findViewById(R.id.six);
		six.setOnClickListener(this);
		seven = (Button) findViewById(R.id.seven);
		seven.setOnClickListener(this);
		eight = (Button) findViewById(R.id.eight);
		eight.setOnClickListener(this);
		nine = (Button) findViewById(R.id.nine);
		nine.setOnClickListener(this);
		ten = (Button) findViewById(R.id.ten);
		ten.setOnClickListener(this);
		eleven = (Button) findViewById(R.id.eleven);
		eleven.setOnClickListener(this);
		twelve = (Button) findViewById(R.id.twelve);
		twelve.setOnClickListener(this);
		thirteen = (Button) findViewById(R.id.thirteen);
		thirteen.setOnClickListener(this);
		fourteen = (Button) findViewById(R.id.fourteen);
		fourteen.setOnClickListener(this);
		fifteen = (Button) findViewById(R.id.fifteen);
		fifteen.setOnClickListener(this);
		sixteen = (Button) findViewById(R.id.sixteen);
		sixteen.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.one:
			startActivity(new Intent(MainActivity.this,ActivityOne.class));
			break;
		case R.id.two:
			startActivity(new Intent(MainActivity.this,ActivityTwo.class));
			break;
		case R.id.three:
			startActivity(new Intent(MainActivity.this,ActivityThree.class));
			break;
		case R.id.four:
			startActivity(new Intent(MainActivity.this,ActivityFour.class));
			break;
		case R.id.five:
			startActivity(new Intent(MainActivity.this,ActivityFive.class));
			break;
		case R.id.six:
			startActivity(new Intent(MainActivity.this,ActivitySix.class));
			break;
		case R.id.seven:
			startActivity(new Intent(MainActivity.this,ActivitySeven.class));
			break;
		case R.id.eight:
			startActivity(new Intent(MainActivity.this,ActivityEight.class));
			break;
		case R.id.nine:
			startActivity(new Intent(MainActivity.this,ActivityNine.class));
			break;
		case R.id.ten:
			startActivity(new Intent(MainActivity.this,ActivityTen.class));
			break;
		case R.id.eleven:
			startActivity(new Intent(MainActivity.this,ActivityEleven.class));
			break;
		case R.id.twelve:
			startActivity(new Intent(MainActivity.this,ActivityTwelve.class));
			break;
		case R.id.thirteen:
			startActivity(new Intent(MainActivity.this,ActivityThirteen.class));
			break;
		case R.id.fourteen:
			startActivity(new Intent(MainActivity.this,ActivityFourteen.class));
			break;
		case R.id.fifteen:
			startActivity(new Intent(MainActivity.this,ActivityFifteen.class));
			break;
		case R.id.sixteen:
			startActivity(new Intent(MainActivity.this,ActivitySixteen.class));
			break;
		default:
			break;
		}
	}

}
