package com.geno.widget0004.schedule;

import android.app.*;
import android.content.*;
import android.content.DialogInterface.*;
import android.content.pm.PackageManager.*;
import android.net.*;
import android.os.*;
import android.preference.*;
import android.text.format.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity
{
	public static String versionName;
	public static int versionCode;
	private static final String welcome_info = "欢迎使用功课表。\n顾名思义，它就是一个表，让你写一写。\n然后就把它作为一个插件放在桌面上。";
	private static final String welcome_info_2 = "这个应用现在还在不断更新中，\n如果您有好的建议和意见，请将它发送到我的邮箱或点击“关于”里面的“反馈”。万分感谢。\n在此感谢在我开发过程中参与内测并提供宝贵建议的各位同学。";
	public static SharedPreferences sp ;
	public static SharedPreferences.Editor editor;
	public static View bg;
	public Uri feedbacku;
	public Intent feedbacki;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_schedule);
		sp = PreferenceManager.getDefaultSharedPreferences(this);
		editor = sp.edit();				
		bg = findViewById(R.id.Bg);
		String mon_s1 = "班会";
		String mon_s2 = "";
		String mon_s3 = "";
		String mon_s4 = "";
		String mon_s5 = "";
		String mon_s6 = "";
		String mon_s7 = "";
		String mon_s8 = "";
		String tue_s1 = "";
		String tue_s2 = "";
		String tue_s3 = "";
		String tue_s4 = "";
		String tue_s5 = "";
		String tue_s6 = "";
		String tue_s7 = "";
		String tue_s8 = "";
		String wed_s1 = "";
		String wed_s2 = "";
		String wed_s3 = "";
		String wed_s4 = "";
		String wed_s5 = "";
		String wed_s6 = "";
		String wed_s7 = "";
		String wed_s8 = "";
		String thu_s1 = "";
		String thu_s2 = "";
		String thu_s3 = "";
		String thu_s4 = "";
		String thu_s5 = "";
		String thu_s6 = "";
		String thu_s7 = "";
		String thu_s8 = "";
		String fri_s1 = "";
		String fri_s2 = "";
		String fri_s3 = "";
		String fri_s4 = "";
		String fri_s5 = "";
		String fri_s6 = "";
		String fri_s7 = "";
		String fri_s8 = "";
		String sat_s1 = "";
		String sat_s2 = "";
		String sat_s3 = "";
		String sat_s4 = "";
		String sat_s5 = "";
		Integer time_s1uh = 7;
		Integer time_s1um = 45;
		Integer time_s1dh = 8;
		Integer time_s1dm = 25;
		Integer time_s2uh = 8;
		Integer time_s2um = 35;
		Integer time_s2dh = 9;
		Integer time_s2dm = 15;
		Integer time_s3uh = 9;
		Integer time_s3um = 25;
		Integer time_s3dh = 10;
		Integer time_s3dm = 5;
		Integer time_s4uh = 10;
		Integer time_s4um = 20;
		Integer time_s4dh = 11;
		Integer time_s4dm = 0;
		Integer time_s5uh = 11;
		Integer time_s5um = 10;
		Integer time_s5dh = 11;
		Integer time_s5dm = 50;
		Integer time_s6uh = 14;
		Integer time_s6um = 20;
		Integer time_s6dh = 15;
		Integer time_s6dm = 0;
		Integer time_s7uh = 15;
		Integer time_s7um = 10;
		Integer time_s7dh = 15;
		Integer time_s7dm = 50;
		Integer time_s8uh = 16;
		Integer time_s8um = 0;
		Integer time_s8dh = 16;
		Integer time_s8dm = 40;
		mon_s1 = sp.getString("mon_1", "班会");
		mon_s2 = sp.getString("mon_2", null);
		mon_s3 = sp.getString("mon_3", null);
		mon_s4 = sp.getString("mon_4", null);
		mon_s5 = sp.getString("mon_5", null);
		mon_s6 = sp.getString("mon_6", null);
		mon_s7 = sp.getString("mon_7", null);
		mon_s8 = sp.getString("mon_8", null);
		tue_s1 = sp.getString("tue_1", null);
		tue_s2 = sp.getString("tue_2", null);
		tue_s3 = sp.getString("tue_3", null);
		tue_s4 = sp.getString("tue_4", null);
		tue_s5 = sp.getString("tue_5", null);
		tue_s6 = sp.getString("tue_6", null);
		tue_s7 = sp.getString("tue_7", null);
		tue_s8 = sp.getString("tue_8", null);
		wed_s1 = sp.getString("wed_1", null);
		wed_s2 = sp.getString("wed_2", null);
		wed_s3 = sp.getString("wed_3", null);
		wed_s4 = sp.getString("wed_4", null);
		wed_s5 = sp.getString("wed_5", null);
		wed_s6 = sp.getString("wed_6", null);
		wed_s7 = sp.getString("wed_7", null);
		wed_s8 = sp.getString("wed_8", null);
		thu_s1 = sp.getString("thu_1", null);
		thu_s2 = sp.getString("thu_2", null);
		thu_s3 = sp.getString("thu_3", null);
		thu_s4 = sp.getString("thu_4", null);
		thu_s5 = sp.getString("thu_5", null);
		thu_s6 = sp.getString("thu_6", null);
		thu_s7 = sp.getString("thu_7", null);
		thu_s8 = sp.getString("thu_8", null);
		fri_s1 = sp.getString("fri_1", null);
		fri_s2 = sp.getString("fri_2", null);
		fri_s3 = sp.getString("fri_3", null);
		fri_s4 = sp.getString("fri_4", null);
		fri_s5 = sp.getString("fri_5", null);
		fri_s6 = sp.getString("fri_6", null);
		fri_s7 = sp.getString("fri_7", null);
		fri_s8 = sp.getString("fri_8", null);
		sat_s1 = sp.getString("sat_1", null);
		sat_s2 = sp.getString("sat_2", null);
		sat_s3 = sp.getString("sat_3", null);
		sat_s4 = sp.getString("sat_4", null);
		sat_s5 = sp.getString("sat_5", null);
		time_s1uh = sp.getInt("time_1uh", 7);
		time_s1um = sp.getInt("time_1um", 45);
		time_s1dh = sp.getInt("time_1dh", 8);
		time_s1dm = sp.getInt("time_1dm", 25);
		time_s2uh = sp.getInt("time_2uh", 8);
		time_s2um = sp.getInt("time_2um", 35);
		time_s2dh = sp.getInt("time_2dh", 9);
		time_s2dm = sp.getInt("time_2dm", 15);
		time_s3uh = sp.getInt("time_3uh", 9);
		time_s3um = sp.getInt("time_3um", 25);
		time_s3dh = sp.getInt("time_3dh", 10);
		time_s3dm = sp.getInt("time_3dm", 5);
		time_s4uh = sp.getInt("time_4uh", 10);
		time_s4um = sp.getInt("time_4um", 20);
		time_s4dh = sp.getInt("time_4dh", 11);
		time_s4dm = sp.getInt("time_4dm", 0);
		time_s5uh = sp.getInt("time_5uh", 11);
		time_s5um = sp.getInt("time_5um", 10);
		time_s5dh = sp.getInt("time_5dh", 11);
		time_s5dm = sp.getInt("time_5dm", 50);
		time_s6uh = sp.getInt("time_6uh", 14);
		time_s6um = sp.getInt("time_6um", 20);
		time_s6dh = sp.getInt("time_6dh", 15);
		time_s6dm = sp.getInt("time_6dm", 0);
		time_s7uh = sp.getInt("time_7uh", 15);
		time_s7um = sp.getInt("time_7um", 10);
		time_s7dh = sp.getInt("time_7dh", 15);
		time_s7dm = sp.getInt("time_7dm", 50);
		time_s8uh = sp.getInt("time_8uh", 16);
		time_s8um = sp.getInt("time_8um", 0);
		time_s8dh = sp.getInt("time_8dh", 16);
		time_s8dm = sp.getInt("time_8dm", 40);
		Integer time_s1u = time_s1uh * 60 + time_s1um;
		Integer time_s2u = time_s2uh * 60 + time_s2um;
		Integer time_s3u = time_s3uh * 60 + time_s3um;
		Integer time_s4u = time_s4uh * 60 + time_s4um;
		Integer time_s5u = time_s5uh * 60 + time_s5um;
		Integer time_s6u = time_s6uh * 60 + time_s6um;
		Integer time_s7u = time_s7uh * 60 + time_s7um;
		Integer time_s8u = time_s8uh * 60 + time_s8um;
		Integer time_s1d = time_s1dh * 60 + time_s1dm;
		Integer time_s2d = time_s2dh * 60 + time_s2dm;
		Integer time_s3d = time_s3dh * 60 + time_s3dm;
		Integer time_s4d = time_s4dh * 60 + time_s4dm;
		Integer time_s5d = time_s5dh * 60 + time_s5dm;
		Integer time_s6d = time_s6dh * 60 + time_s6dm;
		Integer time_s7d = time_s7dh * 60 + time_s7dm;
		Integer time_s8d = time_s8dh * 60 + time_s8dm;
		EditText mon_1 = (EditText) findViewById(R.id.mon_1);
		EditText mon_2 = (EditText) findViewById(R.id.mon_2);
		EditText mon_3 = (EditText) findViewById(R.id.mon_3);
		EditText mon_4 = (EditText) findViewById(R.id.mon_4);
		EditText mon_5 = (EditText) findViewById(R.id.mon_5);
		EditText mon_6 = (EditText) findViewById(R.id.mon_6);
		EditText mon_7 = (EditText) findViewById(R.id.mon_7);
		EditText mon_8 = (EditText) findViewById(R.id.mon_8);
		EditText tue_1 = (EditText) findViewById(R.id.tue_1);
		EditText tue_2 = (EditText) findViewById(R.id.tue_2);
		EditText tue_3 = (EditText) findViewById(R.id.tue_3);
		EditText tue_4 = (EditText) findViewById(R.id.tue_4);
		EditText tue_5 = (EditText) findViewById(R.id.tue_5);
		EditText tue_6 = (EditText) findViewById(R.id.tue_6);
		EditText tue_7 = (EditText) findViewById(R.id.tue_7);
		EditText tue_8 = (EditText) findViewById(R.id.tue_8);
		EditText wed_1 = (EditText) findViewById(R.id.wed_1);
		EditText wed_2 = (EditText) findViewById(R.id.wed_2);
		EditText wed_3 = (EditText) findViewById(R.id.wed_3);
		EditText wed_4 = (EditText) findViewById(R.id.wed_4);
		EditText wed_5 = (EditText) findViewById(R.id.wed_5);
		EditText wed_6 = (EditText) findViewById(R.id.wed_6);
		EditText wed_7 = (EditText) findViewById(R.id.wed_7);
		EditText wed_8 = (EditText) findViewById(R.id.wed_8);
		EditText thu_1 = (EditText) findViewById(R.id.thu_1);
		EditText thu_2 = (EditText) findViewById(R.id.thu_2);
		EditText thu_3 = (EditText) findViewById(R.id.thu_3);
		EditText thu_4 = (EditText) findViewById(R.id.thu_4);
		EditText thu_5 = (EditText) findViewById(R.id.thu_5);
		EditText thu_6 = (EditText) findViewById(R.id.thu_6);
		EditText thu_7 = (EditText) findViewById(R.id.thu_7);
		EditText thu_8 = (EditText) findViewById(R.id.thu_8);
		EditText fri_1 = (EditText) findViewById(R.id.fri_1);
		EditText fri_2 = (EditText) findViewById(R.id.fri_2);
		EditText fri_3 = (EditText) findViewById(R.id.fri_3);
		EditText fri_4 = (EditText) findViewById(R.id.fri_4);
		EditText fri_5 = (EditText) findViewById(R.id.fri_5);
		EditText fri_6 = (EditText) findViewById(R.id.fri_6);
		EditText fri_7 = (EditText) findViewById(R.id.fri_7);
		EditText fri_8 = (EditText) findViewById(R.id.fri_8);
		EditText sat_1 = (EditText) findViewById(R.id.sat_1);
		EditText sat_2 = (EditText) findViewById(R.id.sat_2);
		EditText sat_3 = (EditText) findViewById(R.id.sat_3);
		EditText sat_4 = (EditText) findViewById(R.id.sat_4);
		EditText sat_5 = (EditText) findViewById(R.id.sat_5);
		TextView time_1 = (TextView) findViewById(R.id.time1);
		TextView time_2 = (TextView) findViewById(R.id.time2);
		TextView time_3 = (TextView) findViewById(R.id.time3);
		TextView time_4 = (TextView) findViewById(R.id.time4);
		TextView time_5 = (TextView) findViewById(R.id.time5);
		TextView time_6 = (TextView) findViewById(R.id.time6);
		TextView time_7 = (TextView) findViewById(R.id.time7);
		TextView time_8 = (TextView) findViewById(R.id.time8);
		mon_1.setText(mon_s1);
		mon_2.setText(mon_s2);
		mon_3.setText(mon_s3);
		mon_4.setText(mon_s4);
		mon_5.setText(mon_s5);
		mon_6.setText(mon_s6);
		mon_7.setText(mon_s7);
		mon_8.setText(mon_s8);
		tue_1.setText(tue_s1);
		tue_2.setText(tue_s2);
		tue_3.setText(tue_s3);
		tue_4.setText(tue_s4);
		tue_5.setText(tue_s5);
		tue_6.setText(tue_s6);
		tue_7.setText(tue_s7);
		tue_8.setText(tue_s8);
		wed_1.setText(wed_s1);
		wed_2.setText(wed_s2);
		wed_3.setText(wed_s3);
		wed_4.setText(wed_s4);
		wed_5.setText(wed_s5);
		wed_6.setText(wed_s6);
		wed_7.setText(wed_s7);
		wed_8.setText(wed_s8);
		thu_1.setText(thu_s1);
		thu_2.setText(thu_s2);
		thu_3.setText(thu_s3);
		thu_4.setText(thu_s4);
		thu_5.setText(thu_s5);
		thu_6.setText(thu_s6);
		thu_7.setText(thu_s7);
		thu_8.setText(thu_s8);
		fri_1.setText(fri_s1);
		fri_2.setText(fri_s2);
		fri_3.setText(fri_s3);
		fri_4.setText(fri_s4);
		fri_5.setText(fri_s5);
		fri_6.setText(fri_s6);
		fri_7.setText(fri_s7);
		fri_8.setText(fri_s8);
		sat_1.setText(sat_s1);
		sat_2.setText(sat_s2);
		sat_3.setText(sat_s3);
		sat_4.setText(sat_s4);
		sat_5.setText(sat_s5);
		time_1.setText(time_s1uh + ":" + time_s1um + "-" + time_s1dh + ":" + time_s1dm);
		time_2.setText(time_s2uh + ":" + time_s2um + "-" + time_s2dh + ":" + time_s2dm);
		time_3.setText(time_s3uh + ":" + time_s3um + "-" + time_s3dh + ":" + time_s3dm);
		time_4.setText(time_s4uh + ":" + time_s4um + "-" + time_s4dh + ":" + time_s4dm);
		time_5.setText(time_s5uh + ":" + time_s5um + "-" + time_s5dh + ":" + time_s5dm);
		time_6.setText(time_s6uh + ":" + time_s6um + "-" + time_s6dh + ":" + time_s6dm);
		time_7.setText(time_s7uh + ":" + time_s7um + "-" + time_s7dh + ":" + time_s7dm);
		time_8.setText(time_s8uh + ":" + time_s8um + "-" + time_s8dh + ":" + time_s8dm);
		if ((time_s1u > time_s1d) ||
			(time_s1d > time_s2u) ||
			(time_s2u > time_s2d) ||
			(time_s2d > time_s3u) ||
			(time_s3u > time_s3d) ||
			(time_s3d > time_s4u) ||
			(time_s4u > time_s4d) ||
			(time_s4d > time_s5u) ||
			(time_s5u > time_s5d) ||
			(time_s5d > time_s6u) ||
			(time_s6u > time_s6d) ||
			(time_s6d > time_s7u) ||
			(time_s7u > time_s7d) ||
			(time_s7d > time_s8u) ||
			(time_s8u > time_s8d))
		{	
			Toast.makeText(getApplicationContext(), "时间错误。\n请在设置中修正时间。", Toast.LENGTH_LONG).show();
			editor.putBoolean("timewrong", true);
			editor.putBoolean("silent", false);
			editor.commit();
		}
		else
		{
			Toast.makeText(getApplicationContext(), "载入完毕。", Toast.LENGTH_SHORT).show();
			editor.putBoolean("timewrong", false);
			editor.commit();
		}
		if (sp.getBoolean("firsttime", true))
		{
			editor.putString("mon_1", "班会");
			editor.commit();
			new AlertDialog.Builder(this)
				.setTitle("欢迎使用")
				.setMessage(welcome_info)
				.setPositiveButton
			("下一页", new OnClickListener()
				{
					@Override
					public void onClick(DialogInterface arg0, int arg1) 
					{
						new AlertDialog.Builder(MainActivity.this).setTitle("欢迎使用").setMessage(welcome_info_2).setNegativeButton("关闭", null).show();
					}
				}
			)
				.setNegativeButton("跳过指引", null).show();
			editor.putBoolean("firsttime", false);
		}
		editor.commit();
		try
		{
			versionName = getPackageManager().getPackageInfo("com.geno.widget0004.schedule", 0).versionName;
			versionCode = getPackageManager().getPackageInfo("com.geno.widget0004.schedule", 0).versionCode;
		}
		catch (NameNotFoundException e)
		{
			e.printStackTrace();
		}
		Button quit = (Button) findViewById(R.id.button_quit);
		Button save = (Button) findViewById(R.id.button_save);
		quit.setOnClickListener
		(new View.OnClickListener()
			{
				public void onClick(View quit)
				{
					finish();
					android.os.Process.killProcess(android.os.Process.myPid());
				}
			}
		);
		save.setOnClickListener
		(new View.OnClickListener()
			{
				public void onClick(View save)
				{
					save();
					Toast.makeText(getApplicationContext(), "保存成功！", Toast.LENGTH_SHORT).show();
				}
			}
		);
		if (sp.getBoolean("nightmode", false) == true)
		{
			bg.setBackgroundColor(0xff000000);
			quit.setBackgroundColor(0xff000000);
			quit.setTextColor(0xffc0c0c0);
			save.setBackgroundColor(0x00000000);
			save.setTextColor(0xffc0c0c0);
			mon_1.setTextColor(0xff808080);
			mon_2.setTextColor(0xff808080);
			mon_3.setTextColor(0xff808080);
			mon_4.setTextColor(0xff808080);
			mon_5.setTextColor(0xff808080);
			mon_6.setTextColor(0xff808080);
			mon_7.setTextColor(0xff808080);
			mon_8.setTextColor(0xff808080);
			tue_1.setTextColor(0xff808080);
			tue_2.setTextColor(0xff808080);
			tue_3.setTextColor(0xff808080);
			tue_4.setTextColor(0xff808080);
			tue_5.setTextColor(0xff808080);
			tue_6.setTextColor(0xff808080);
			tue_7.setTextColor(0xff808080);
			tue_8.setTextColor(0xff808080);
			wed_1.setTextColor(0xff808080);
			wed_2.setTextColor(0xff808080);
			wed_3.setTextColor(0xff808080);
			wed_4.setTextColor(0xff808080);
			wed_5.setTextColor(0xff808080);
			wed_6.setTextColor(0xff808080);
			wed_7.setTextColor(0xff808080);
			wed_8.setTextColor(0xff808080);
			thu_1.setTextColor(0xff808080);
			thu_2.setTextColor(0xff808080);
			thu_3.setTextColor(0xff808080);
			thu_4.setTextColor(0xff808080);
			thu_5.setTextColor(0xff808080);
			thu_6.setTextColor(0xff808080);
			thu_7.setTextColor(0xff808080);
			thu_8.setTextColor(0xff808080);
			fri_1.setTextColor(0xff808080);
			fri_2.setTextColor(0xff808080);
			fri_3.setTextColor(0xff808080);
			fri_4.setTextColor(0xff808080);
			fri_5.setTextColor(0xff808080);
			fri_6.setTextColor(0xff808080);
			fri_7.setTextColor(0xff808080);
			fri_8.setTextColor(0xff808080);
			sat_1.setTextColor(0xff808080);
			sat_2.setTextColor(0xff808080);
			sat_3.setTextColor(0xff808080);
			sat_4.setTextColor(0xff808080);
			sat_5.setTextColor(0xff808080);
			mon_1.setBackgroundColor(0xff000000);
			mon_2.setBackgroundColor(0xff000000);
			mon_3.setBackgroundColor(0xff000000);
			mon_4.setBackgroundColor(0xff000000);
			mon_5.setBackgroundColor(0xff000000);
			mon_6.setBackgroundColor(0xff000000);
			mon_7.setBackgroundColor(0xff000000);
			mon_8.setBackgroundColor(0xff000000);
			tue_1.setBackgroundColor(0xff000000);
			tue_2.setBackgroundColor(0xff000000);
			tue_3.setBackgroundColor(0xff000000);
			tue_4.setBackgroundColor(0xff000000);
			tue_5.setBackgroundColor(0xff000000);
			tue_6.setBackgroundColor(0xff000000);
			tue_7.setBackgroundColor(0xff000000);
			tue_8.setBackgroundColor(0xff000000);
			wed_1.setBackgroundColor(0xff000000);
			wed_2.setBackgroundColor(0xff000000);
			wed_3.setBackgroundColor(0xff000000);
			wed_4.setBackgroundColor(0xff000000);
			wed_5.setBackgroundColor(0xff000000);
			wed_6.setBackgroundColor(0xff000000);
			wed_7.setBackgroundColor(0xff000000);
			wed_8.setBackgroundColor(0xff000000);
			thu_1.setBackgroundColor(0xff000000);
			thu_2.setBackgroundColor(0xff000000);
			thu_3.setBackgroundColor(0xff000000);
			thu_4.setBackgroundColor(0xff000000);
			thu_5.setBackgroundColor(0xff000000);
			thu_6.setBackgroundColor(0xff000000);
			thu_7.setBackgroundColor(0xff000000);
			thu_8.setBackgroundColor(0xff000000);
			fri_1.setBackgroundColor(0xff000000);
			fri_2.setBackgroundColor(0xff000000);
			fri_3.setBackgroundColor(0xff000000);
			fri_4.setBackgroundColor(0xff000000);
			fri_5.setBackgroundColor(0xff000000);
			fri_6.setBackgroundColor(0xff000000);
			fri_7.setBackgroundColor(0xff000000);
			fri_8.setBackgroundColor(0xff000000);
			sat_1.setBackgroundColor(0xff000000);
			sat_2.setBackgroundColor(0xff000000);
			sat_3.setBackgroundColor(0xff000000);
			sat_4.setBackgroundColor(0xff000000);
			sat_5.setBackgroundColor(0xff000000);
		}
		else
		{
			bg.setBackgroundColor(0xffffffff);
			quit.setBackgroundColor(0xffc0c0c0);
			quit.setTextColor(0xffffffff);
			save.setBackgroundColor(0xffc0c0c0);
			save.setTextColor(0xffffffff);
			mon_1.setTextColor(0xff000000);
			mon_2.setTextColor(0xff000000);
			mon_3.setTextColor(0xff000000);
			mon_4.setTextColor(0xff000000);
			mon_5.setTextColor(0xff000000);
			mon_6.setTextColor(0xff000000);
			mon_7.setTextColor(0xff000000);
			mon_8.setTextColor(0xff000000);
			tue_1.setTextColor(0xff000000);
			tue_2.setTextColor(0xff000000);
			tue_3.setTextColor(0xff000000);
			tue_4.setTextColor(0xff000000);
			tue_5.setTextColor(0xff000000);
			tue_6.setTextColor(0xff000000);
			tue_7.setTextColor(0xff000000);
			tue_8.setTextColor(0xff000000);
			wed_1.setTextColor(0xff000000);
			wed_2.setTextColor(0xff000000);
			wed_3.setTextColor(0xff000000);
			wed_4.setTextColor(0xff000000);
			wed_5.setTextColor(0xff000000);
			wed_6.setTextColor(0xff000000);
			wed_7.setTextColor(0xff000000);
			wed_8.setTextColor(0xff000000);
			thu_1.setTextColor(0xff000000);
			thu_2.setTextColor(0xff000000);
			thu_3.setTextColor(0xff000000);
			thu_4.setTextColor(0xff000000);
			thu_5.setTextColor(0xff000000);
			thu_6.setTextColor(0xff000000);
			thu_7.setTextColor(0xff000000);
			thu_8.setTextColor(0xff000000);
			fri_1.setTextColor(0xff000000);
			fri_2.setTextColor(0xff000000);
			fri_3.setTextColor(0xff000000);
			fri_4.setTextColor(0xff000000);
			fri_5.setTextColor(0xff000000);
			fri_6.setTextColor(0xff000000);
			fri_7.setTextColor(0xff000000);
			fri_8.setTextColor(0xff000000);
			sat_1.setTextColor(0xff000000);
			sat_2.setTextColor(0xff000000);
			sat_3.setTextColor(0xff000000);
			sat_4.setTextColor(0xff000000);
			sat_5.setTextColor(0xff000000);
			mon_1.setBackgroundColor(0xffffffff);
			mon_2.setBackgroundColor(0xffffffff);
			mon_3.setBackgroundColor(0xffffffff);
			mon_4.setBackgroundColor(0xffffffff);
			mon_5.setBackgroundColor(0xffffffff);
			mon_6.setBackgroundColor(0xffffffff);
			mon_7.setBackgroundColor(0xffffffff);
			mon_8.setBackgroundColor(0xffffffff);
			tue_1.setBackgroundColor(0xffffffff);
			tue_2.setBackgroundColor(0xffffffff);
			tue_3.setBackgroundColor(0xffffffff);
			tue_4.setBackgroundColor(0xffffffff);
			tue_5.setBackgroundColor(0xffffffff);
			tue_6.setBackgroundColor(0xffffffff);
			tue_7.setBackgroundColor(0xffffffff);
			tue_8.setBackgroundColor(0xffffffff);
			wed_1.setBackgroundColor(0xffffffff);
			wed_2.setBackgroundColor(0xffffffff);
			wed_3.setBackgroundColor(0xffffffff);
			wed_4.setBackgroundColor(0xffffffff);
			wed_5.setBackgroundColor(0xffffffff);
			wed_6.setBackgroundColor(0xffffffff);
			wed_7.setBackgroundColor(0xffffffff);
			wed_8.setBackgroundColor(0xffffffff);
			thu_1.setBackgroundColor(0xffffffff);
			thu_2.setBackgroundColor(0xffffffff);
			thu_3.setBackgroundColor(0xffffffff);
			thu_4.setBackgroundColor(0xffffffff);
			thu_5.setBackgroundColor(0xffffffff);
			thu_6.setBackgroundColor(0xffffffff);
			thu_7.setBackgroundColor(0xffffffff);
			thu_8.setBackgroundColor(0xffffffff);
			fri_1.setBackgroundColor(0xffffffff);
			fri_2.setBackgroundColor(0xffffffff);
			fri_3.setBackgroundColor(0xffffffff);
			fri_4.setBackgroundColor(0xffffffff);
			fri_5.setBackgroundColor(0xffffffff);
			fri_6.setBackgroundColor(0xffffffff);
			fri_7.setBackgroundColor(0xffffffff);
			fri_8.setBackgroundColor(0xffffffff);
			sat_1.setBackgroundColor(0xffffffff);
			sat_2.setBackgroundColor(0xffffffff);
			sat_3.setBackgroundColor(0xffffffff);
			sat_4.setBackgroundColor(0xffffffff);
			sat_5.setBackgroundColor(0xffffffff);
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.schedule, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId())
		{
			case R.id.menu_about:
				AlertDialog.Builder builder = new AlertDialog.Builder(this);
				builder.setTitle("关于");
				builder.setMessage("作者:93届4班陈毅钊。\nQQ:754097987。\n邮箱：polygon1024@gmail.com。\n版本号：" + versionName + "\n小米清进程后桌面插件会死亡，请点击菜单中的\"恢复死亡的插件\"或者锁进程。");
				builder.setPositiveButton
				("一个不想让你按的按钮", new DialogInterface.OnClickListener()
					{
						@Override
						public void onClick(DialogInterface dialog, int which)
						{
							Toast.makeText(getApplicationContext(),"地球人已经无法阻止你了？",Toast.LENGTH_LONG).show();
						}
					}
				);
				builder.setNeutralButton
				("反馈", new DialogInterface.OnClickListener()
					{
						@Override
						public void onClick(DialogInterface dialog, int which)
						{
							String[] uri = {"微博","邮箱"};
							AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this)
								.setTitle("何种方式？")
								.setItems(uri, new DialogInterface.OnClickListener()
								{
									@Override
									public void onClick(DialogInterface p1,int p2)
									{
										if(p2 == 0)
										{
											feedbacku = Uri.parse("http://weibo.com/2083660171");
											feedbacki = new Intent(Intent.ACTION_VIEW,feedbacku);
											startActivity(feedbacki);
										}
										else if (p2 == 1)
										{
											feedbacku = Uri.parse("mailto:polygon1024@gmail.com");
											feedbacki = new Intent(Intent.ACTION_SENDTO,feedbacku);
											feedbacki.putExtra(Intent.EXTRA_SUBJECT,"功课表使用反馈");
											startActivity(feedbacki);
										}
									}
								});
							ad.show();
							return ;
						}
					}
				);
				builder.setNegativeButton
				("返回", new DialogInterface.OnClickListener() 
					{
						@Override  
						public void onClick(DialogInterface dialog, int which) 
						{
							return ;
						}
					}
				);
				builder.show();
				break;
			case R.id.menu_save:
				save();
				Toast.makeText(getApplicationContext(), "保存成功！", Toast.LENGTH_SHORT).show();
				return true;
			case R.id.menu_quit:
				finish();
				android.os.Process.killProcess(android.os.Process.myPid());
				return true;
			case R.id.menu_setting: 
				Intent setting = new Intent(MainActivity.this, Settings.class);
				startActivity(setting);
				return true;
			case R.id.menu_recover:
				Time time = new Time();
				time.setToNow();
				Context context = getApplicationContext();
				Intent intent = new Intent(context, UpdateService.class);
				PendingIntent pendingIntent = PendingIntent.getService(context, 0, intent, 0);
				AlarmManager alarm = (AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
				alarm.setRepeating(AlarmManager.RTC, time.toMillis(true), 1000, pendingIntent);
				Toast.makeText(getApplicationContext(), "恢复成功！", Toast.LENGTH_SHORT).show();
				return true;
		}
		return (super.onOptionsItemSelected(item));
	}
	public void save()
	{
		EditText mon_1 = (EditText) findViewById(R.id.mon_1);
		EditText mon_2 = (EditText) findViewById(R.id.mon_2);
		EditText mon_3 = (EditText) findViewById(R.id.mon_3);
		EditText mon_4 = (EditText) findViewById(R.id.mon_4);
		EditText mon_5 = (EditText) findViewById(R.id.mon_5);
		EditText mon_6 = (EditText) findViewById(R.id.mon_6);
		EditText mon_7 = (EditText) findViewById(R.id.mon_7);
		EditText mon_8 = (EditText) findViewById(R.id.mon_8);
		EditText tue_1 = (EditText) findViewById(R.id.tue_1);
		EditText tue_2 = (EditText) findViewById(R.id.tue_2);
		EditText tue_3 = (EditText) findViewById(R.id.tue_3);
		EditText tue_4 = (EditText) findViewById(R.id.tue_4);
		EditText tue_5 = (EditText) findViewById(R.id.tue_5);
		EditText tue_6 = (EditText) findViewById(R.id.tue_6);
		EditText tue_7 = (EditText) findViewById(R.id.tue_7);
		EditText tue_8 = (EditText) findViewById(R.id.tue_8);
		EditText wed_1 = (EditText) findViewById(R.id.wed_1);
		EditText wed_2 = (EditText) findViewById(R.id.wed_2);
		EditText wed_3 = (EditText) findViewById(R.id.wed_3);
		EditText wed_4 = (EditText) findViewById(R.id.wed_4);
		EditText wed_5 = (EditText) findViewById(R.id.wed_5);
		EditText wed_6 = (EditText) findViewById(R.id.wed_6);
		EditText wed_7 = (EditText) findViewById(R.id.wed_7);
		EditText wed_8 = (EditText) findViewById(R.id.wed_8);
		EditText thu_1 = (EditText) findViewById(R.id.thu_1);
		EditText thu_2 = (EditText) findViewById(R.id.thu_2);
		EditText thu_3 = (EditText) findViewById(R.id.thu_3);
		EditText thu_4 = (EditText) findViewById(R.id.thu_4);
		EditText thu_5 = (EditText) findViewById(R.id.thu_5);
		EditText thu_6 = (EditText) findViewById(R.id.thu_6);
		EditText thu_7 = (EditText) findViewById(R.id.thu_7);
		EditText thu_8 = (EditText) findViewById(R.id.thu_8);
		EditText fri_1 = (EditText) findViewById(R.id.fri_1);
		EditText fri_2 = (EditText) findViewById(R.id.fri_2);
		EditText fri_3 = (EditText) findViewById(R.id.fri_3);
		EditText fri_4 = (EditText) findViewById(R.id.fri_4);
		EditText fri_5 = (EditText) findViewById(R.id.fri_5);
		EditText fri_6 = (EditText) findViewById(R.id.fri_6);
		EditText fri_7 = (EditText) findViewById(R.id.fri_7);
		EditText fri_8 = (EditText) findViewById(R.id.fri_8);
		EditText sat_1 = (EditText) findViewById(R.id.sat_1);
		EditText sat_2 = (EditText) findViewById(R.id.sat_2);
		EditText sat_3 = (EditText) findViewById(R.id.sat_3);
		EditText sat_4 = (EditText) findViewById(R.id.sat_4);
		EditText sat_5 = (EditText) findViewById(R.id.sat_5);
		String mon_s1 = mon_1.getText().toString();
		String mon_s2 = mon_2.getText().toString();
		String mon_s3 = mon_3.getText().toString();
		String mon_s4 = mon_4.getText().toString();
		String mon_s5 = mon_5.getText().toString();
		String mon_s6 = mon_6.getText().toString();
		String mon_s7 = mon_7.getText().toString();
		String mon_s8 = mon_8.getText().toString();
		String tue_s1 = tue_1.getText().toString();
		String tue_s2 = tue_2.getText().toString();
		String tue_s3 = tue_3.getText().toString();
		String tue_s4 = tue_4.getText().toString();
		String tue_s5 = tue_5.getText().toString();
		String tue_s6 = tue_6.getText().toString();
		String tue_s7 = tue_7.getText().toString();
		String tue_s8 = tue_8.getText().toString();
		String wed_s1 = wed_1.getText().toString();
		String wed_s2 = wed_2.getText().toString();
		String wed_s3 = wed_3.getText().toString();
		String wed_s4 = wed_4.getText().toString();
		String wed_s5 = wed_5.getText().toString();
		String wed_s6 = wed_6.getText().toString();
		String wed_s7 = wed_7.getText().toString();
		String wed_s8 = wed_8.getText().toString();
		String thu_s1 = thu_1.getText().toString();
		String thu_s2 = thu_2.getText().toString();
		String thu_s3 = thu_3.getText().toString();
		String thu_s4 = thu_4.getText().toString();
		String thu_s5 = thu_5.getText().toString();
		String thu_s6 = thu_6.getText().toString();
		String thu_s7 = thu_7.getText().toString();
		String thu_s8 = thu_8.getText().toString();
		String fri_s1 = fri_1.getText().toString();
		String fri_s2 = fri_2.getText().toString();
		String fri_s3 = fri_3.getText().toString();
		String fri_s4 = fri_4.getText().toString();
		String fri_s5 = fri_5.getText().toString();
		String fri_s6 = fri_6.getText().toString();
		String fri_s7 = fri_7.getText().toString();
		String fri_s8 = fri_8.getText().toString();
		String sat_s1 = sat_1.getText().toString();
		String sat_s2 = sat_2.getText().toString();
		String sat_s3 = sat_3.getText().toString();
		String sat_s4 = sat_4.getText().toString();
		String sat_s5 = sat_5.getText().toString();
		editor.putString("mon_1", mon_s1);
		editor.putString("mon_2", mon_s2);
		editor.putString("mon_3", mon_s3);
		editor.putString("mon_4", mon_s4);
		editor.putString("mon_5", mon_s5);
		editor.putString("mon_6", mon_s6);
		editor.putString("mon_7", mon_s7);
		editor.putString("mon_8", mon_s8);
		editor.putString("tue_1", tue_s1);
		editor.putString("tue_2", tue_s2);
		editor.putString("tue_3", tue_s3);
		editor.putString("tue_4", tue_s4);
		editor.putString("tue_5", tue_s5);
		editor.putString("tue_6", tue_s6);
		editor.putString("tue_7", tue_s7);
		editor.putString("tue_8", tue_s8);
		editor.putString("wed_1", wed_s1);
		editor.putString("wed_2", wed_s2);
		editor.putString("wed_3", wed_s3);
		editor.putString("wed_4", wed_s4);
		editor.putString("wed_5", wed_s5);
		editor.putString("wed_6", wed_s6);
		editor.putString("wed_7", wed_s7);
		editor.putString("wed_8", wed_s8);
		editor.putString("thu_1", thu_s1);
		editor.putString("thu_2", thu_s2);
		editor.putString("thu_3", thu_s3);
		editor.putString("thu_4", thu_s4);
		editor.putString("thu_5", thu_s5);
		editor.putString("thu_6", thu_s6);
		editor.putString("thu_7", thu_s7);
		editor.putString("thu_8", thu_s8);
		editor.putString("fri_1", fri_s1);
		editor.putString("fri_2", fri_s2);
		editor.putString("fri_3", fri_s3);
		editor.putString("fri_4", fri_s4);
		editor.putString("fri_5", fri_s5);
		editor.putString("fri_6", fri_s6);
		editor.putString("fri_7", fri_s7);
		editor.putString("fri_8", fri_s8);
		editor.putString("sat_1", sat_s1);
		editor.putString("sat_2", sat_s2);
		editor.putString("sat_3", sat_s3);
		editor.putString("sat_4", sat_s4);
		editor.putString("sat_5", sat_s5);
		editor.commit();
	}
}
