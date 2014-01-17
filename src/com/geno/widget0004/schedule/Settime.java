package com.geno.widget0004.schedule;
import android.content.*;
import android.os.*;
import android.preference.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class Settime extends MainActivity
{
	public static SharedPreferences sp;
	public static TimePicker tp;
	public Integer i;
	public SharedPreferences.Editor edit;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settime);
		sp = PreferenceManager.getDefaultSharedPreferences(this);
		edit = sp.edit();
		tp = (TimePicker)findViewById(R.id.times);
		Button savetime = (Button)findViewById(R.id.timesave);
		Button class1u = (Button)findViewById(R.id.settime1u);
		Button class2u = (Button)findViewById(R.id.settime2u);
		Button class3u = (Button)findViewById(R.id.settime3u);
		Button class4u = (Button)findViewById(R.id.settime4u);
		Button class5u = (Button)findViewById(R.id.settime5u);
		Button class6u = (Button)findViewById(R.id.settime6u);
		Button class7u = (Button)findViewById(R.id.settime7u);
		Button class8u = (Button)findViewById(R.id.settime8u);
		Button class1d = (Button)findViewById(R.id.settime1d);
		Button class2d = (Button)findViewById(R.id.settime2d);
		Button class3d = (Button)findViewById(R.id.settime3d);
		Button class4d = (Button)findViewById(R.id.settime4d);
		Button class5d = (Button)findViewById(R.id.settime5d);
		Button class6d = (Button)findViewById(R.id.settime6d);
		Button class7d = (Button)findViewById(R.id.settime7d);
		Button class8d = (Button)findViewById(R.id.settime8d);
		class1u.setOnClickListener
		(new OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					tp.setCurrentHour(sp.getInt("time_1uh",7));
					tp.setCurrentMinute(sp.getInt("time_1um",45));
					i=1;
				};
			}
		);
		class2u.setOnClickListener
		(new OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					tp.setCurrentHour(sp.getInt("time_2uh",8));
					tp.setCurrentMinute(sp.getInt("time_2um",35));
					i=2;
				};
			}
		);
		class3u.setOnClickListener
		(new OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					tp.setCurrentHour(sp.getInt("time_3uh",9));
					tp.setCurrentMinute(sp.getInt("time_3um",25));
					i=3;
				};
			}
		);
		class4u.setOnClickListener
		(new OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					tp.setCurrentHour(sp.getInt("time_4uh",10));
					tp.setCurrentMinute(sp.getInt("time_4um",20));
					i=4;
				};
			}
		);
		class5u.setOnClickListener
		(new OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					tp.setCurrentHour(sp.getInt("time_5uh",11));
					tp.setCurrentMinute(sp.getInt("time_5um",10));
					i=5;
				};
			}
		);		
		class6u.setOnClickListener
		(new OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					tp.setCurrentHour(sp.getInt("time_6uh",14));
					tp.setCurrentMinute(sp.getInt("time_6um",20));
					i=6;
				};
			}
		);		
		class7u.setOnClickListener
		(new OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					tp.setCurrentHour(sp.getInt("time_7uh",15));
					tp.setCurrentMinute(sp.getInt("time_7um",10));
					i=7;
				};
			}
		);		
		class8u.setOnClickListener
		(new OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					tp.setCurrentHour(sp.getInt("time_8uh",16));
					tp.setCurrentMinute(sp.getInt("time_8um",0));
					i=8;
				};
			}
		);		
		class1d.setOnClickListener
		(new OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					tp.setCurrentHour(sp.getInt("time_1dh",8));
					tp.setCurrentMinute(sp.getInt("time_1dm",25));
					i=9;
				};
			}
		);		
		class2d.setOnClickListener
		(new OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					tp.setCurrentHour(sp.getInt("time_2dh",9));
					tp.setCurrentMinute(sp.getInt("time_2dm",15));
					i=10;
				};
			}
		);		
		class3d.setOnClickListener
		(new OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					tp.setCurrentHour(sp.getInt("time_3dh",10));
					tp.setCurrentMinute(sp.getInt("time_3dm",05));
					i=11;
				};
			}
		);		
		class4d.setOnClickListener
		(new OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					tp.setCurrentHour(sp.getInt("time_4dh",11));
					tp.setCurrentMinute(sp.getInt("time_4dm",0));
					i=12;
				};
			}
		);		
		class5d.setOnClickListener
		(new OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					tp.setCurrentHour(sp.getInt("time_5dh",11));
					tp.setCurrentMinute(sp.getInt("time_5dm",50));
					i=13;
				};
			}
		);		
		class6d.setOnClickListener
		(new OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					tp.setCurrentHour(sp.getInt("time_6dh",15));
					tp.setCurrentMinute(sp.getInt("time_6dm",0));
					i=14;
				};
			}
		);		
		class7d.setOnClickListener
		(new OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					tp.setCurrentHour(sp.getInt("time_7dh",15));
					tp.setCurrentMinute(sp.getInt("time_7dm",50));
					i=15;
				};
			}
		);
		class8d.setOnClickListener
		(new OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					tp.setCurrentHour(sp.getInt("time_8dh",16));
					tp.setCurrentMinute(sp.getInt("time_8dm",40));
					i=16;
				};
			}
		);
		savetime.setOnClickListener
		(new OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					Toast.makeText(getApplicationContext(),"保存成功！",Toast.LENGTH_SHORT).show();
					switch(i)
					{
						case 1:
							edit.putInt("time_1uh",tp.getCurrentHour());
							edit.putInt("time_1um",tp.getCurrentMinute());
							edit.commit();
							return;
						case 2:
							edit.putInt("time_2uh",tp.getCurrentHour());
							edit.putInt("time_2um",tp.getCurrentMinute());
							edit.commit();
							return;
						case 3:
							edit.putInt("time_3uh",tp.getCurrentHour());
							edit.putInt("time_3um",tp.getCurrentMinute());
							edit.commit();
							return;
						case 4:
							edit.putInt("time_4uh",tp.getCurrentHour());
							edit.putInt("time_4um",tp.getCurrentMinute());
							edit.commit();
							return;
						case 5:
							edit.putInt("time_5uh",tp.getCurrentHour());
							edit.putInt("time_5um",tp.getCurrentMinute());
							edit.commit();
							return;
						case 6:
							edit.putInt("time_6uh",tp.getCurrentHour());
							edit.putInt("time_6um",tp.getCurrentMinute());
							edit.commit();
							return;
						case 7:
							edit.putInt("time_7uh",tp.getCurrentHour());
							edit.putInt("time_7um",tp.getCurrentMinute());
							edit.commit();
							return;
						case 8:
							edit.putInt("time_8uh",tp.getCurrentHour());
							edit.putInt("time_8um",tp.getCurrentMinute());
							edit.commit();
							return;
						case 9:
							edit.putInt("time_1dh",tp.getCurrentHour());
							edit.putInt("time_1dm",tp.getCurrentMinute());
							edit.commit();
							return;
						case 10:
							edit.putInt("time_2dh",tp.getCurrentHour());
							edit.putInt("time_2dm",tp.getCurrentMinute());
							edit.commit();
							return;
						case 11:
							edit.putInt("time_3dh",tp.getCurrentHour());
							edit.putInt("time_3dm",tp.getCurrentMinute());
							edit.commit();
							return;
						case 12:
							edit.putInt("time_4dh",tp.getCurrentHour());
							edit.putInt("time_4dm",tp.getCurrentMinute());
							edit.commit();
							return;
						case 13:
							edit.putInt("time_5dh",tp.getCurrentHour());
							edit.putInt("time_5dm",tp.getCurrentMinute());
							edit.commit();
							return;
						case 14:
							edit.putInt("time_6dh",tp.getCurrentHour());
							edit.putInt("time_6dm",tp.getCurrentMinute());
							edit.commit();
							return;
						case 15:
							edit.putInt("time_7dh",tp.getCurrentHour());
							edit.putInt("time_7dm",tp.getCurrentMinute());
							edit.commit();
							return;
						case 16:
							edit.putInt("time_8dh",tp.getCurrentHour());
							edit.putInt("time_8dm",tp.getCurrentMinute());
							edit.commit();
							return;
					}
					return;
				};
			}
		);
	};
	public boolean onCreateOptionsMenu(Menu menu)
	{
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		return (super.onOptionsItemSelected(item));
	}
}
