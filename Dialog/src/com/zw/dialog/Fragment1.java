package com.zw.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class Fragment1 extends DialogFragment{
	
	CharSequence[] items = {"Google" , "Apple" , "Microsoft"};
	boolean[] itemsChecked = new boolean[items.length];
	
	static Fragment1 newInstance(String $title){
		Fragment1 f = new Fragment1();
		Bundle b = new Bundle();
		b.putString("this is a dialog with same simple text...", $title);
		f.setArguments(b);
		return f;
	}
	
	public Dialog onCreateDialog(Bundle $b){
		String s = $b.getString("title");
		return new AlertDialog.Builder(getActivity())
				.setIcon(R.drawable.ic_launcher)
				.setTitle(s)
				.setPositiveButton("OK", 
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								Toast.makeText(getActivity(), "OK" , Toast.LENGTH_SHORT).show();
							}
				})
				.setNegativeButton("Cancel", 
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
								Toast.makeText(getActivity(), "Cancel", Toast.LENGTH_SHORT).show();
							}
				})
				
				.setMultiChoiceItems(items, itemsChecked, new DialogInterface.OnMultiChoiceClickListener() {
					public void onClick(DialogInterface dialog , int which, boolean isChecked) {
						String str = items[which] + (isChecked ? "checked" : "unchecked");
						Toast.makeText(getActivity(), str, Toast.LENGTH_SHORT).show();
					}
				}).create();
	}
	
}
