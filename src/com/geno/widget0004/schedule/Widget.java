package com.geno.widget0004.schedule;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.widget.RemoteViews;
import android.app.PendingIntent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.widget.*;
import android.view.*;
import android.content.*;
import android.content.SharedPreferences.Editor;
import android.os.*;
import android.preference.*;


public class Widget extends AppWidgetProvider
{
	public static SharedPreferences sp ;
	public int color;
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appwidgetids)
	{
		super.onUpdate(context, appWidgetManager, appwidgetids);
		sp = PreferenceManager.getDefaultSharedPreferences(context);
		RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget);
		color = sp.getInt("widgetTextColor", 0xff000000);
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
		ComponentName thisWidget = new ComponentName(context, Widget.class);
		AppWidgetManager.getInstance(context).updateAppWidget(thisWidget, views);
	}
	@Override
	public void onReceive(Context context, Intent intent)
	{
		super.onReceive(context, intent);
		RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget);
		sp = PreferenceManager.getDefaultSharedPreferences(context);
		color = sp.getInt("widgetTextColor", 0xff000000);
		String action = intent.getAction();
		if (AppWidgetManager.ACTION_APPWIDGET_UPDATE.equals(action)) 
		{
			AppWidgetManager
				.getInstance(context)
				.updateAppWidget(
				intent.getIntArrayExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS),
				views);
		}
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
		ComponentName thisWidget = new ComponentName(context, Widget.class);
		AppWidgetManager
			.getInstance(context)
			.updateAppWidget(thisWidget, views);
	}	
}
