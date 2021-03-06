package com.zw.activity101;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
public class Activity101 extends Activity {

	public String tag = "LiveActive";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity101);
		l("onCreate");
	}

	protected void onStart(){
		super.onStart();
		l("onStart");
	}
	
	protected void onRestart(){
		super.onRestart();
		l("onRestart");
	}
	
	protected void onResume() {
		super.onResume();
		l("onResume");
	}
	
	protected void onPause(){
		super.onPause();
		l("onPause");
	}
	
	protected void onStop(){
		super.onStop();
		l("onStop");
	}
	
	protected void onDestroy(){
		super.onDestroy();
		l("onDestroy");
	}
	
	private  void l(String $str){
		Log.d(tag, $str);
//		System.out.println($str);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity101, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
