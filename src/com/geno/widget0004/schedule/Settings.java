package com.geno.widget0004.schedule;

import android.app.*;
import android.content.*;
import android.os.*;
import android.preference.*;
import android.view.*;
import android.widget.*;

public class Settings extends Activity
{
	public static SharedPreferences sp;
	public static SharedPreferences.Editor edit;
	public static CheckBox nc;
	public static CheckBox rs;
	public static String[] color = {"黑色","白色","蓝色","红色","黄色","绿色","灰色","紫色","粉色","天蓝","深绿"};
	public static int[] colori = {0xff000000,0xffffffff,0xff0000ff,0xffff0000,0xffffff00,0xff00ff00,0xff808080,0xffff00ff,0xffff80ff,0xff66ccff,0xff008000};
	@Override
	public void onCreate(Bundle savedInstanceState) 			
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);
		this.setTitle(R.string.setting);
		sp = PreferenceManager.getDefaultSharedPreferences(this);
		edit = sp.edit();
		Button widgettheme = (Button) findViewById(R.id.widgettheme);
		Button settime = (Button) findViewById(R.id.settime);
		Button save = (Button) findViewById(R.id.set_save);
		nc = (CheckBox) findViewById(R.id.nightcheck);
		rs = (CheckBox) findViewById(R.id.ringswitch);
		widgettheme.setOnClickListener
		(new View.OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					AlertDialog.Builder ad = new AlertDialog.Builder(Settings.this)
						.setTitle("选择颜色？")
						.setItems
						(color, new DialogInterface.OnClickListener()
							{
								@Override
								public void onClick(DialogInterface p1, int p2)
								{
									edit.putInt("widgetTextColor",colori[p2]);
									edit.commit();
								}
							}
						);
					ad.show();
				}
			}
		);
		settime.setOnClickListener
		(new View.OnClickListener()
			{
				@Override
				public void onClick(View Button)
				{
					Intent set = new Intent(Settings.this, Settime.class);
					startActivity(set);
					return;
				}
			}
		);
		save.setOnClickListener
		(new View.OnClickListener()								
			{
				public void onClick(View Button)
				{
					save();
					return;
				}
			}
		);
		nc.setChecked(sp.getBoolean("nightmode",false));
		if (sp.getBoolean("timewrong", false) == true)
		{
			rs.setChecked(false);
			rs.setClickable(false);
		}
	}
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.settings, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId())
		{
			case R.id.set_menu_save:
				save();
				return true;
			case R.id.set_menu_return:
				Toast.makeText(getApplicationContext(), "操作无效。", Toast.LENGTH_SHORT).show();
				return true;
		}
		return (super.onOptionsItemSelected(item));
	}
	public void save()
	{
		if (rs.isChecked()==true)
		{	
			edit.putBoolean("silent", true);
			edit.commit();
		}
		else
		{	
			edit.putBoolean("silent", false);
			edit.commit();
		}
		if(nc.isChecked()==true)
		{
			edit.putBoolean("nightmode", true);
			edit.commit();
		}
		else
		{
			edit.putBoolean("nightmode", false);
			edit.commit();
		}
		Toast.makeText(getApplicationContext(), "保存成功！", Toast.LENGTH_SHORT).show();
	}
}

