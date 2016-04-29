package com.alvin.g.baidumapapi_master;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
/**
 * 作者： alvin.G
 * 时间： 16/4/29. 下午13:14
 * 邮箱：chinaguoxu@163.com
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.id_line_btn).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(MainActivity.this, RoutePlanDemo.class);
				startActivity(i);
			}
		});

	}
}
