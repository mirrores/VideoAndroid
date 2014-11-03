package com.example.videoandroid;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends Activity {
	private VideoView video;
	private Button load,play,pause;
	private static final String TAG="VidoeExample";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		video=(VideoView)findViewById(R.id.videoView1);
		load=(Button)findViewById(R.id.load);
		play=(Button)findViewById(R.id.play);
		pause=(Button)findViewById(R.id.pause);
		
		
		
		load.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				video.setVideoPath(Environment.getExternalStorageDirectory().getPath()+"/1.3gp");
				
				
				
			}
			
		});
		play.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				video.start();
			}
			
		});
		pause.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				video.pause();
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
