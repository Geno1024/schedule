package com.geno.widget0004.schedule;

import android.os.*;
import android.view.*;
import android.widget.*;
import android.app.*;
import android.content.Intent;

public class Secondary extends Activity
{
	@Override
	public void onCreate(Bundle savedInstanceState) 			
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondary);
		this.setTitle(R.string.app2_name);
		Button Button = (Button) findViewById(R.id.secondary_return);
		Button.setOnClickListener
		(new View.OnClickListener()								
			{
				public void onClick(View Button)
				{
					Intent sch = new Intent(Secondary.this, MainActivity.class);
					startActivity(sch);
					return;
				}
			}
		);
	}
}
