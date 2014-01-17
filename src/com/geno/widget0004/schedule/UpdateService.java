package com.geno.widget0004.schedule;

import android.app.*;
import android.appwidget.*;
import android.content.*;
import android.os.*;
import android.preference.*;
import android.text.format.*;
import android.widget.*;
import java.util.*;
import java.security.*;

public class UpdateService extends Service
{
	public static SharedPreferences sp ;
	public int color;
	public String classthis;
	public String classnext;
	@Override
	public void onStart(Intent intent, int startId) 
	{
		super.onStart(intent, startId);
		UpdateWidget(this);
	}
	private void UpdateWidget(Context context) 
	{
		Time time = new Time();
		time.setToNow();
		int week = time.weekDay;
		int hour = time.hour;
		int minute = time.minute;
		int second = time.second;
		int color = 0xff000000;
		sp = PreferenceManager.getDefaultSharedPreferences(context);
		color = sp.getInt("widgetTextColor", 0xff000000);
		RemoteViews views = new RemoteViews(context.getPackageName(),R.layout.widget);
		RemoteViews updateView2 = new RemoteViews(context.getPackageName(),R.layout.widget2);
		RemoteViews updateView3 = new RemoteViews(context.getPackageName(),R.layout.widget3);
		views.setTextViewText(R.id.class11, sp.getString("mon_1", "班会"));
		views.setTextViewText(R.id.class12, sp.getString("mon_2", "？？"));
		views.setTextViewText(R.id.class13, sp.getString("mon_3", "？？"));
		views.setTextViewText(R.id.class14, sp.getString("mon_4", "？？"));
		views.setTextViewText(R.id.class15, sp.getString("mon_5", "？？"));
		views.setTextViewText(R.id.class16, sp.getString("mon_6", "？？"));
		views.setTextViewText(R.id.class17, sp.getString("mon_7", "？？"));
		views.setTextViewText(R.id.class18, sp.getString("mon_8", "？？"));
		views.setTextViewText(R.id.class21, sp.getString("tue_1", "？？"));
		views.setTextViewText(R.id.class22, sp.getString("tue_2", "？？"));
		views.setTextViewText(R.id.class23, sp.getString("tue_3", "？？"));
		views.setTextViewText(R.id.class24, sp.getString("tue_4", "？？"));
		views.setTextViewText(R.id.class25, sp.getString("tue_5", "？？"));
		views.setTextViewText(R.id.class26, sp.getString("tue_6", "？？"));
		views.setTextViewText(R.id.class27, sp.getString("tue_7", "？？"));
		views.setTextViewText(R.id.class28, sp.getString("tue_8", "？？"));
		views.setTextViewText(R.id.class31, sp.getString("wed_1", "？？"));
		views.setTextViewText(R.id.class32, sp.getString("wed_2", "？？"));
		views.setTextViewText(R.id.class33, sp.getString("wed_3", "？？"));
		views.setTextViewText(R.id.class34, sp.getString("wed_4", "？？"));
		views.setTextViewText(R.id.class35, sp.getString("wed_5", "？？"));
		views.setTextViewText(R.id.class36, sp.getString("wed_6", "？？"));
		views.setTextViewText(R.id.class37, sp.getString("wed_7", "？？"));
		views.setTextViewText(R.id.class38, sp.getString("wed_8", "？？"));
		views.setTextViewText(R.id.class41, sp.getString("thu_1", "？？"));
		views.setTextViewText(R.id.class42, sp.getString("thu_2", "？？"));
		views.setTextViewText(R.id.class43, sp.getString("thu_3", "？？"));
		views.setTextViewText(R.id.class44, sp.getString("thu_4", "？？"));
		views.setTextViewText(R.id.class45, sp.getString("thu_5", "？？"));
		views.setTextViewText(R.id.class46, sp.getString("thu_6", "？？"));
		views.setTextViewText(R.id.class47, sp.getString("thu_7", "？？"));
		views.setTextViewText(R.id.class48, sp.getString("thu_8", "？？"));
		views.setTextViewText(R.id.class51, sp.getString("fri_1", "？？"));
		views.setTextViewText(R.id.class52, sp.getString("fri_2", "？？"));
		views.setTextViewText(R.id.class53, sp.getString("fri_3", "？？"));
		views.setTextViewText(R.id.class54, sp.getString("fri_4", "？？"));
		views.setTextViewText(R.id.class55, sp.getString("fri_5", "？？"));
		views.setTextViewText(R.id.class56, sp.getString("fri_6", "？？"));
		views.setTextViewText(R.id.class57, sp.getString("fri_7", "？？"));
		views.setTextViewText(R.id.class58, sp.getString("fri_8", "？？"));
		views.setTextViewText(R.id.class61, sp.getString("sat_1", "？？"));
		views.setTextViewText(R.id.class62, sp.getString("sat_2", "？？"));
		views.setTextViewText(R.id.class63, sp.getString("sat_3", "？？"));
		views.setTextViewText(R.id.class64, sp.getString("sat_4", "？？"));
		views.setTextViewText(R.id.class65, sp.getString("sat_5", "？？"));
		views.setTextColor(R.id.class11, color);
		views.setTextColor(R.id.class12, color);
		views.setTextColor(R.id.class13, color);
		views.setTextColor(R.id.class14, color);
		views.setTextColor(R.id.class15, color);
		views.setTextColor(R.id.class16, color);
		views.setTextColor(R.id.class17, color);
		views.setTextColor(R.id.class18, color);
		views.setTextColor(R.id.class21, color);
		views.setTextColor(R.id.class22, color);
		views.setTextColor(R.id.class23, color);
		views.setTextColor(R.id.class24, color);
		views.setTextColor(R.id.class25, color);
		views.setTextColor(R.id.class26, color);
		views.setTextColor(R.id.class27, color);
		views.setTextColor(R.id.class28, color);
		views.setTextColor(R.id.class31, color);
		views.setTextColor(R.id.class32, color);
		views.setTextColor(R.id.class33, color);
		views.setTextColor(R.id.class34, color);
		views.setTextColor(R.id.class35, color);
		views.setTextColor(R.id.class36, color);
		views.setTextColor(R.id.class37, color);
		views.setTextColor(R.id.class38, color);
		views.setTextColor(R.id.class41, color);
		views.setTextColor(R.id.class42, color);
		views.setTextColor(R.id.class43, color);
		views.setTextColor(R.id.class44, color);
		views.setTextColor(R.id.class45, color);
		views.setTextColor(R.id.class46, color);
		views.setTextColor(R.id.class47, color);
		views.setTextColor(R.id.class48, color);
		views.setTextColor(R.id.class51, color);
		views.setTextColor(R.id.class52, color);
		views.setTextColor(R.id.class53, color);
		views.setTextColor(R.id.class54, color);
		views.setTextColor(R.id.class55, color);
		views.setTextColor(R.id.class56, color);
		views.setTextColor(R.id.class57, color);
		views.setTextColor(R.id.class58, color);
		views.setTextColor(R.id.class61, color);
		views.setTextColor(R.id.class62, color);
		views.setTextColor(R.id.class63, color);
		views.setTextColor(R.id.class64, color);
		views.setTextColor(R.id.class65, color);
		if (week == 1  || week == 7)
		{	
			updateView2.setTextViewText(R.id.weekday , "周一");
			updateView2.setTextViewText(R.id.class91, sp.getString("mon_1", "班会"));
			updateView2.setTextViewText(R.id.class92, sp.getString("mon_2", "？？"));
			updateView2.setTextViewText(R.id.class93, sp.getString("mon_3", "？？"));
			updateView2.setTextViewText(R.id.class94, sp.getString("mon_4", "？？"));
			updateView2.setTextViewText(R.id.class95, sp.getString("mon_5", "？？"));
			updateView2.setTextViewText(R.id.class96, sp.getString("mon_6", "？？"));
			updateView2.setTextViewText(R.id.class97, sp.getString("mon_7", "？？"));
			updateView2.setTextViewText(R.id.class98, sp.getString("mon_8", "？？"));
		}
		else if	(week == 2)
		{
			updateView2.setTextViewText(R.id.weekday, "周二");
			updateView2.setTextViewText(R.id.class91, sp.getString("tue_1", "？？"));
			updateView2.setTextViewText(R.id.class92, sp.getString("tue_2", "？？"));
			updateView2.setTextViewText(R.id.class93, sp.getString("tue_3", "？？"));
			updateView2.setTextViewText(R.id.class94, sp.getString("tue_4", "？？"));
			updateView2.setTextViewText(R.id.class95, sp.getString("tue_5", "？？"));
			updateView2.setTextViewText(R.id.class96, sp.getString("tue_6", "？？"));
			updateView2.setTextViewText(R.id.class97, sp.getString("tue_7", "？？"));
			updateView2.setTextViewText(R.id.class98, sp.getString("tue_8", "？？"));
		}
		else if (week == 3)
		{
			updateView2.setTextViewText(R.id.weekday, "周三");
			updateView2.setTextViewText(R.id.class91, sp.getString("wed_1", "？？"));
			updateView2.setTextViewText(R.id.class92, sp.getString("wed_2", "？？"));
			updateView2.setTextViewText(R.id.class93, sp.getString("wed_3", "？？"));
			updateView2.setTextViewText(R.id.class94, sp.getString("wed_4", "？？"));
			updateView2.setTextViewText(R.id.class95, sp.getString("wed_5", "？？"));
			updateView2.setTextViewText(R.id.class96, sp.getString("wed_6", "？？"));
			updateView2.setTextViewText(R.id.class97, sp.getString("wed_7", "？？"));
			updateView2.setTextViewText(R.id.class98, sp.getString("wed_8", "？？"));
		}
		else if (week == 4)
		{
			updateView2.setTextViewText(R.id.weekday, "周四");
			updateView2.setTextViewText(R.id.class91, sp.getString("thu_1", "？？"));
			updateView2.setTextViewText(R.id.class92, sp.getString("thu_2", "？？"));
			updateView2.setTextViewText(R.id.class93, sp.getString("thu_3", "？？"));
			updateView2.setTextViewText(R.id.class94, sp.getString("thu_4", "？？"));
			updateView2.setTextViewText(R.id.class95, sp.getString("thu_5", "？？"));
			updateView2.setTextViewText(R.id.class96, sp.getString("thu_6", "？？"));
			updateView2.setTextViewText(R.id.class97, sp.getString("thu_7", "？？"));
			updateView2.setTextViewText(R.id.class98, sp.getString("thu_8", "？？"));
		}
		else if	(week == 5)
		{
			updateView2.setTextViewText(R.id.weekday, "周五");
			updateView2.setTextViewText(R.id.class91, sp.getString("fri_1", "？？"));
			updateView2.setTextViewText(R.id.class92, sp.getString("fri_2", "？？"));
			updateView2.setTextViewText(R.id.class93, sp.getString("fri_3", "？？"));
			updateView2.setTextViewText(R.id.class94, sp.getString("fri_4", "？？"));
			updateView2.setTextViewText(R.id.class95, sp.getString("fri_5", "？？"));
			updateView2.setTextViewText(R.id.class96, sp.getString("fri_6", "？？"));
			updateView2.setTextViewText(R.id.class97, sp.getString("fri_7", "？？"));
			updateView2.setTextViewText(R.id.class98, sp.getString("fri_8", "？？"));
		}
		else if (week == 6)
		{
			updateView2.setTextViewText(R.id.weekday, "周六");
			updateView2.setTextViewText(R.id.class91, sp.getString("sat_1", "？？"));
			updateView2.setTextViewText(R.id.class92, sp.getString("sat_2", "？？"));
			updateView2.setTextViewText(R.id.class93, sp.getString("sat_3", "？？"));
			updateView2.setTextViewText(R.id.class94, sp.getString("sat_4", "？？"));
			updateView2.setTextViewText(R.id.class95, sp.getString("sat_5", "？？"));
			updateView2.setTextViewText(R.id.class96, sp.getString("sat_6", ""));
			updateView2.setTextViewText(R.id.class97, sp.getString("sat_7", ""));
			updateView2.setTextViewText(R.id.class98, sp.getString("sat_8", ""));			
		}
		updateView2.setTextColor(R.id.class91, color);
		updateView2.setTextColor(R.id.class92, color);
		updateView2.setTextColor(R.id.class93, color);
		updateView2.setTextColor(R.id.class94, color);
		updateView2.setTextColor(R.id.class95, color);
		updateView2.setTextColor(R.id.class96, color);
		updateView2.setTextColor(R.id.class97, color);
		updateView2.setTextColor(R.id.class98, color);	
		int time_s1uh = sp.getInt("time_1uh", 7);
		int time_s1um = sp.getInt("time_1um", 45);
		int time_s2uh = sp.getInt("time_2uh", 8);
		int time_s2um = sp.getInt("time_2um", 35);
		int time_s3uh = sp.getInt("time_3uh", 9);
		int time_s3um = sp.getInt("time_3um", 25);
		int time_s4uh = sp.getInt("time_4uh", 10);
		int time_s4um = sp.getInt("time_4um", 20);
		int time_s5uh = sp.getInt("time_5uh", 11);
		int time_s5um = sp.getInt("time_5um", 10);
		int time_s5dh = sp.getInt("time_5dh", 11);
		int time_s5dm = sp.getInt("time_5dm", 50);
		int time_s6uh = sp.getInt("time_6uh", 14);
		int time_s6um = sp.getInt("time_6um", 20);
		int time_s7uh = sp.getInt("time_7uh", 15);
		int time_s7um = sp.getInt("time_7um", 10);
		int time_s8uh = sp.getInt("time_8uh", 16);
		int time_s8um = sp.getInt("time_8um", 0);
		int time_s8dh = sp.getInt("time_8dh", 16);
		int time_s8dm = sp.getInt("time_8dm", 40);
		Integer time_s1u = time_s1uh * 60 + time_s1um;
		Integer time_s2u = time_s2uh * 60 + time_s2um;
		Integer time_s3u = time_s3uh * 60 + time_s3um;
		Integer time_s4u = time_s4uh * 60 + time_s4um;
		Integer time_s5u = time_s5uh * 60 + time_s5um;
		Integer time_s6u = time_s6uh * 60 + time_s6um;
		Integer time_s7u = time_s7uh * 60 + time_s7um;
		Integer time_s8u = time_s8uh * 60 + time_s8um;
		Integer time_s5d = time_s5dh * 60 + time_s5dm;
		Integer time_s8d = time_s8dh * 60 + time_s8dm;
		Integer time_now = hour * 60 + minute;
		if (week == 1)
		{
			if (time_now < time_s1u)
			{
				classthis = "早安";
				classnext = sp.getString("mon_1", "");
			}
			else if (time_s1u <= time_now && time_now < time_s2u)
			{
				classthis = sp.getString("mon_1", "");
				classnext = sp.getString("mon_2", "");
			}
			else if (time_s2u <= time_now && time_now < time_s3u)
			{
				classthis = sp.getString("mon_2", "");
				classnext = sp.getString("mon_3", "");
			}
			else if (time_s3u <= time_now && time_now < time_s4u)
			{
				classthis = sp.getString("mon_3", "");
				classnext = sp.getString("mon_4", "");
			}
			else if (time_s4u <= time_now && time_now < time_s5u)
			{
				classthis = sp.getString("mon_4", "");
				classnext = sp.getString("mon_5", "");
			}
			else if (time_s5u <= time_now && time_now < time_s5d)
			{
				classthis = sp.getString("mon_5", "");
				classnext = sp.getString("mon_6", "");
			}
			else if (time_s5d <= time_now && time_now < time_s6u)
			{
				classthis = "午休";
				classnext = sp.getString("mon_6", "");
			}
			else if (time_s6u <= time_now && time_now < time_s7u)
			{
				classthis = sp.getString("mon_6", "");
				classnext = sp.getString("mon_7", "");
			}
			else if (time_s7u <= time_now && time_now < time_s8u)
			{
				classthis = sp.getString("mon_7", "");
				classnext = sp.getString("mon_8", "");
			}
			else if (time_s8u <= time_now && time_now < time_s8d)
			{
				classthis = sp.getString("mon_8", "");
				classnext = "晚自修";
			}
			else if (time_s8d <= time_now && time_now < 1170)
			{
				classthis = "";
				classnext = "晚自修" + sp.getString("tue_1", "") + "\n(明天)";
			}
			else if (1170 <= time_now && time_now < 1350)
			{
				classthis = "晚自修";
				classnext = sp.getString("tue_1", "") + "\n(明天)";
			}
			else if (1350 <= time_now)
			{
				classthis = "晚安";
				classnext = sp.getString("tue_1", "") + "\n(明天)";
			}
		}
		else if (week == 2)
		{
			if (time_now < time_s1u)
			{
				classthis = "早安";
				classnext = sp.getString("tue_1", "");
			}
			else if (time_s1u <= time_now && time_now < time_s2u)
			{
				classthis = sp.getString("tue_1", "");
				classnext = sp.getString("tue_2", "");
			}
			else if (time_s2u <= time_now && time_now < time_s3u)
			{
				classthis = sp.getString("tue_2", "");
				classnext = sp.getString("tue_3", "");
			}
			else if (time_s3u <= time_now && time_now < time_s4u)
			{
				classthis = sp.getString("tue_3", "");
				classnext = sp.getString("tue_4", "");
			}
			else if (time_s4u <= time_now && time_now < time_s5u)
			{
				classthis = sp.getString("tue_4", "");
				classnext = sp.getString("tue_5", "");
			}
			else if (time_s5u <= time_now && time_now < time_s5d)
			{
				classthis = sp.getString("tue_5", "");
				classnext = sp.getString("tue_6", "");
			}
			else if (time_s5d <= time_now && time_now < time_s6u)
			{
				classthis = "午休";
				classnext = sp.getString("tue_6", "");
			}
			else if (time_s6u <= time_now && time_now < time_s7u)
			{
				classthis = sp.getString("tue_6", "");
				classnext = sp.getString("tue_7", "");
			}
			else if (time_s7u <= time_now && time_now < time_s8u)
			{
				classthis = sp.getString("tue_7", "");
				classnext = sp.getString("tue_8", "");
			}
			else if (time_s8u <= time_now && time_now < time_s8d)
			{
				classthis = sp.getString("tue_8", "");
				classnext = "晚自修";
			}
			else if (time_s8d <= time_now && time_now < 1170)
			{
				classthis = "";
				classnext = "晚自修" + sp.getString("wed_1", "") + "\n(明天)";
			}
			else if (1170 <= time_now && time_now < 1350)
			{
				classthis = "晚自修";
				classnext = sp.getString("wed_1", "") + "\n(明天)";
			}
			else if (1350 <= time_now)
			{
				classthis = "晚安";
				classnext = sp.getString("wed_1", "") + "\n(明天)";
			}
		}
		else if (week == 3)
		{
			if (time_now < time_s1u)
			{
				classthis = "早安";
				classnext = sp.getString("wed_1", "");
			}
			else if (time_s1u <= time_now && time_now < time_s2u)
			{
				classthis = sp.getString("wed_1", "");
				classnext = sp.getString("wed_2", "");
			}
			else if (time_s2u <= time_now && time_now < time_s3u)
			{
				classthis = sp.getString("wed_2", "");
				classnext = sp.getString("wed_3", "");
			}
			else if (time_s3u <= time_now && time_now < time_s4u)
			{
				classthis = sp.getString("wed_3", "");
				classnext = sp.getString("wed_4", "");
			}
			else if (time_s4u <= time_now && time_now < time_s5u)
			{
				classthis = sp.getString("wed_4", "");
				classnext = sp.getString("wed_5", "");
			}
			else if (time_s5u <= time_now && time_now < time_s5d)
			{
				classthis = sp.getString("wed_5", "");
				classnext = sp.getString("wed_6", "");
			}
			else if (time_s5d <= time_now && time_now < time_s6u)
			{
				classthis = "午休";
				classnext = sp.getString("wed_6", "");
			}
			else if (time_s6u <= time_now && time_now < time_s7u)
			{
				classthis = sp.getString("wed_6", "");
				classnext = sp.getString("wed_7", "");
			}
			else if (time_s7u <= time_now && time_now < time_s8u)
			{
				classthis = sp.getString("wed_7", "");
				classnext = sp.getString("wed_8", "");
			}
			else if (time_s8u <= time_now && time_now < time_s8d)
			{
				classthis = sp.getString("wed_8", "");
				classnext = "晚自修";
			}
			else if (time_s8d <= time_now && time_now < 1170)
			{
				classthis = "";
				classnext = "晚自修" + sp.getString("thu_1", "") + "\n(明天)";
			}
			else if (1170 <= time_now && time_now < 1350)
			{
				classthis = "晚自修";
				classnext = sp.getString("thu_1", "") + "\n(明天)";
			}
			else if (1350 <= time_now)
			{
				classthis = "晚安";
				classnext = sp.getString("thu_1", "") + "\n(明天)";
			}
		}
		else if (week == 4)
		{
			if (time_now < time_s1u)
			{
				classthis = "早安";
				classnext = sp.getString("thu_1", "");
			}
			else if (time_s1u <= time_now && time_now < time_s2u)
			{
				classthis = sp.getString("thu_1", "");
				classnext = sp.getString("thu_2", "");
			}
			else if (time_s2u <= time_now && time_now < time_s3u)
			{
				classthis = sp.getString("thu_2", "");
				classnext = sp.getString("thu_3", "");
			}
			else if (time_s3u <= time_now && time_now < time_s4u)
			{
				classthis = sp.getString("thu_3", "");
				classnext = sp.getString("thu_4", "");
			}
			else if (time_s4u <= time_now && time_now < time_s5u)
			{
				classthis = sp.getString("thu_4", "");
				classnext = sp.getString("thu_5", "");
			}
			else if (time_s5u <= time_now && time_now < time_s5d)
			{
				classthis = sp.getString("thu_5", "");
				classnext = sp.getString("thu_6", "");
			}
			else if (time_s5d <= time_now && time_now < time_s6u)
			{
				classthis = "午休";
				classnext = sp.getString("thu_6", "");
			}
			else if (time_s6u <= time_now && time_now < time_s7u)
			{
				classthis = sp.getString("thu_6", "");
				classnext = sp.getString("thu_7", "");
			}
			else if (time_s7u <= time_now && time_now < time_s8u)
			{
				classthis = sp.getString("thu_7", "");
				classnext = sp.getString("thu_8", "");
			}
			else if (time_s8u <= time_now && time_now < time_s8d)
			{
				classthis = sp.getString("thu_8", "");
				classnext = "晚自修";
			}
			else if (time_s8d <= time_now && time_now < 1170)
			{
				classthis = "";
				classnext = "晚自修" + sp.getString("fri_1", "") + "\n(明天)";
			}
			else if (1170 <= time_now && time_now < 1350)
			{
				classthis = "晚自修";
				classnext = sp.getString("fri_1", "") + "\n(明天)";
			}
			else if (1350 <= time_now)
			{
				classthis = "晚安";
				classnext = sp.getString("fri_1", "") + "\n(明天)";
			}
		}
		else if (week == 5)
		{
			if (time_now < time_s1u)
			{
				classthis = "早安";
				classnext = sp.getString("fri_1", "");
			}
			else if (time_s1u <= time_now && time_now < time_s2u)
			{
				classthis = sp.getString("fri_1", "");
				classnext = sp.getString("fri_2", "");
			}
			else if (time_s2u <= time_now && time_now < time_s3u)
			{
				classthis = sp.getString("fri_2", "");
				classnext = sp.getString("fri_3", "");
			}
			else if (time_s3u <= time_now && time_now < time_s4u)
			{
				classthis = sp.getString("fri_3", "");
				classnext = sp.getString("fri_4", "");
			}
			else if (time_s4u <= time_now && time_now < time_s5u)
			{
				classthis = sp.getString("fri_4", "");
				classnext = sp.getString("fri_5", "");
			}
			else if (time_s5u <= time_now && time_now < time_s5d)
			{
				classthis = sp.getString("fri_5", "");
				classnext = sp.getString("fri_6", "");
			}
			else if (time_s5d <= time_now && time_now < time_s6u)
			{
				classthis = "午休";
				classnext = sp.getString("fri_6", "");
			}
			else if (time_s6u <= time_now && time_now < time_s7u)
			{
				classthis = sp.getString("fri_6", "");
				classnext = sp.getString("fri_7", "");
			}
			else if (time_s7u <= time_now && time_now < time_s8u)
			{
				classthis = sp.getString("fri_7", "");
				classnext = sp.getString("fri_8", "");
			}
			else if (time_s8u <= time_now && time_now < time_s8d)
			{
				classthis = sp.getString("fri_8", "");
				classnext = "晚自修";
			}
			else if (time_s8d <= time_now && time_now < 1170)
			{
				classthis = "";
				classnext = "晚自修" + sp.getString("sat_1", "") + "\n(明天)";
			}
			else if (1170 <= time_now && time_now < 1350)
			{
				classthis = "晚自修";
				classnext = sp.getString("sat_1", "") + "\n(明天)";
			}
			else if (1350 <= time_now)
			{
				classthis = "晚安";
				classnext = sp.getString("sat_1", "") + "\n(明天)";
			}
		}
		else if (week == 6)
		{
			if (time_now < time_s1u)
			{
				classthis = "早安";
				classnext = sp.getString("sat_1", "");
			}
			else if (time_s1u <= time_now && time_now < time_s2u)
			{
				classthis = sp.getString("sat_1", "");
				classnext = sp.getString("sat_2", "");
			}
			else if (time_s2u <= time_now && time_now < time_s3u)
			{
				classthis = sp.getString("sat_2", "");
				classnext = sp.getString("sat_3", "");
			}
			else if (time_s3u <= time_now && time_now < time_s4u)
			{
				classthis = sp.getString("sat_3", "");
				classnext = sp.getString("sat_4", "");
			}
			else if (time_s4u <= time_now && time_now < time_s5u)
			{
				classthis = sp.getString("sat_4", "");
				classnext = sp.getString("sat_5", "");
			}
			else if (time_s5u <= time_now && time_now < time_s5d)
			{
				classthis = sp.getString("sat_5", "");
				classnext = sp.getString("sat_6", "");
			}
			else if (time_s5d <= time_now && time_now < time_s6u)
			{
				classthis = "";
				classnext = sp.getString("sat_6", "");
			}
			else if (time_s6u <= time_now && time_now < time_s7u)
			{
				classthis = sp.getString("sat_6", "");
				classnext = sp.getString("sat_7", "");
			}
			else if (time_s7u <= time_now && time_now < time_s8u)
			{
				classthis = sp.getString("sat_7", "");
				classnext = sp.getString("sat_8", "");
			}
			else if (time_s8u <= time_now && time_now < time_s8d)
			{
				classthis = sp.getString("sat_8", "");
				classnext = "";
			}
			else if (time_s8d <= time_now && time_now < 1170)
			{
				classthis = "";
				classnext = sp.getString("mon_1", "") + "(后天)";
			}
			else if (1170 <= time_now && time_now < 1350)
			{
				classthis = "";
				classnext = sp.getString("mon_1", "") + "(后天)";
			}
			else if (1350 <= time_now)
			{
				classthis = "";
				classnext = sp.getString("mon_1", "") + "(后天)";
			}
		}
		else if(week == 7)
		{
			classthis = "";
			classnext = sp.getString("mon_1","")+"(明天)";
		}
		updateView3.setTextViewText(R.id.class00, classthis);
		updateView3.setTextViewText(R.id.class01, classnext);
		updateView3.setTextViewText(R.id.clockwid, hour + ":" + minute + ":" + second+"\n星期"+week);
		updateView3.setTextColor(R.id.class00, color);
		updateView3.setTextColor(R.id.class01, color);
		Intent launchIntent = new Intent();
		launchIntent.setComponent(new ComponentName("com.geno.widget0004.schedule","com.geno.widget0004.schedule.MainActivity"));
		launchIntent.setAction(Intent.ACTION_MAIN);
		launchIntent.addCategory(Intent.CATEGORY_LAUNCHER);
		launchIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED | Intent.FLAG_RECEIVER_FOREGROUND);
		PendingIntent intentAction = PendingIntent.getActivity(context, 0,launchIntent, 0);
		views.setOnClickPendingIntent(R.id.Widget,intentAction);
		updateView2.setOnClickPendingIntent(R.id.weekday, intentAction);
		updateView3.setOnClickPendingIntent(R.id.Widget3, intentAction);
		AppWidgetManager awg = AppWidgetManager.getInstance(context);
		awg.updateAppWidget(new ComponentName(context, Widget3.class),updateView3);
		awg.updateAppWidget(new ComponentName(context, Widget.class),views);
		awg.updateAppWidget(new ComponentName(context, Widget2.class),updateView2);
	}
	@Override
	public IBinder onBind(Intent arg0)
	{
		return null;
	}
	
}
