package com.zw.dialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class DialogActivity extends Activity {
	
//	CharSequence[] items = {"Google" , "Apple" , "Microsoft"};
//	boolean[] itemsChecked = new boolean[items.length];
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dialog);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dialog, menu);
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
	
	
	/*
	protected Dialog onCreateDialog(int id){
		switch(id){
		case 0:
			return new AlertDialog.Builder(this)
			.setIcon(R.drawable.ic_launcher)
			.setTitle("this is a dialog with same simple text...")
			.setPositiveButton("OK", 
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							Toast.makeText(getBaseContext(), "OK", Toast.LENGTH_SHORT).show();
						}
			})
			.setNegativeButton("Cancel", 
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							Toast.makeText(getBaseContext(), "Cancel", Toast.LENGTH_SHORT).show();
						}
			})
			
			.setMultiChoiceItems(items, itemsChecked, new DialogInterface.OnMultiChoiceClickListener() {
				public void onClick(DialogInterface dialog , int which, boolean isChecked) {
					String str = items[which] + (isChecked ? "checked" : "unchecked");
					Toast.makeText(getBaseContext(), str, Toast.LENGTH_SHORT);
				}
			});
		}
	}*/
}
