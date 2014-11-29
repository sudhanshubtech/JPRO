package com.example.helloworld;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		  setContentView(R.layout.activity_main);
	        VideoView v1 = (VideoView)findViewById(R.id.v1);
//	        v1.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" +R.raw.v));
	        VideoView v2 = (VideoView)findViewById(R.id.v2);
//	        v2.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" +R.raw.vv));
	        v1.start();
	        v2.start();
	        v2.setBackgroundColor(Color.parseColor("#00000000"));
	        v2.setCameraDistance(45.0f);
	        v2.setDrawingCacheEnabled(true);
	        v2.setZOrderOnTop(true);
	        /**Branch 1 demo*/
	}
}
