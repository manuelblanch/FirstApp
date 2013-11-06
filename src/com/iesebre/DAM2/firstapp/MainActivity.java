package com.iesebre.DAM2.firstapp;

import android.os.Bundle;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;

@SuppressLint("NewApi")
public class MainActivity extends Activity {
private LinearLayout root;
int count = 0;
private OnTouchListener mCorkyListener = new OnTouchListener() {
    

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		return false;
	}
};


@Override
	public void onCreate(Bundle state) {
		super.onCreate(state);
		LinearLayout.LayoutParams containerParams = new LinearLayout.LayoutParams(
				ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, 0.0F);
		LinearLayout.LayoutParams widgetParams = new LinearLayout.LayoutParams(
				ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT, 1.0F);
		root = new LinearLayout(this);
		root.setOrientation(LinearLayout.VERTICAL);
		root.setBackgroundColor(Color.LTGRAY);
		root.setLayoutParams(containerParams);
		System.out.println("Hola prueba");
		
			LinearLayout ll = new LinearLayout(this);
			ll.setOrientation(LinearLayout.HORIZONTAL);
			ll.setBackgroundColor(Color.GRAY);
			ll.setLayoutParams(containerParams);
			root.addView(ll);
			
			LinearLayout lll = new LinearLayout(this);
			lll.setOrientation(LinearLayout.HORIZONTAL);
			lll.setBackgroundColor(Color.BLACK);
			lll.setLayoutParams(containerParams);
			root.addView(lll);
			
			EditText tb = new EditText(this);
			tb.setTag(R.string.esquerra);
			tb.setFocusable(true);
			tb.setLayoutParams(widgetParams);
			ll.addView(tb);
			
			EditText tv = new EditText(this);
			tv.setTag(R.string.dreta);
			tv.setFocusable(true);
			tv.setLayoutParams(widgetParams);
			ll.addView(tv);
			
			Button boto1 = new Button(this);
			boto1.setTextColor(Color.GREEN);
			boto1.setLayoutParams(widgetParams);
			boto1.setText(R.string.green);
			lll.addView(boto1);
			boto1.setOnTouchListener(mCorkyListener);
			
			Button btn1 = new Button(this);
			btn1.setTextColor(Color.BLUE);
			btn1.setLayoutParams(widgetParams);
			btn1.setText(R.string.blue);
			lll.addView(btn1);	
			
		

	        btn1.setOnTouchListener(new OnTouchListener() {
	            @Override
	            public boolean onTouch(View v, MotionEvent event) {
	            //Incrementing the variable count by 1 on every Touch
	                count++;
	                v.setBackgroundColor(Color.MAGENTA);
	                Toast.makeText(MainActivity.this,
	                		"Has pulsat el boto " + count + " vegada",Toast.LENGTH_SHORT).show();
	                return false;
	            }
	        });
	
			Button boto2 = new Button(this);
			boto2.setTextColor(Color.RED);
			boto2.setLayoutParams(widgetParams);
			boto2.setText(R.string.red);
			lll.addView(boto2);
			
			setContentView(root);
			
			;
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}





}