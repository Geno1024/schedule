package com.geno.widget0004.schedule;

import android.appwidget.*;
import android.content.*;
import android.preference.*;
import android.text.format.*;
import android.widget.*;
import java.util.*;

public class Widget2 extends AppWidgetProvider 
{
	public static SharedPreferences sp ;
	public int color;
/*	public void onReceive(Context context, Intent intent) 
	{
		super.onReceive(context, intent);
		sp = PreferenceManager.getDefaultSharedPreferences(context);
		RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget2);
		color = sp.getInt("widgetTextColor", 0xff000000);
		Time time = new Time();
		time.setToNow();
		int week = time.WEEK_DAY;
		String action = intent.getAction();
		if (Intent.ACTION_TIMEZONE_CHANGED.equals(action)||Intent.ACTION_TIME_TICK.equals(action)||Intent.ACTION_TIME_CHANGED.equals(action)) 
		{
			AppWidgetManager
				.getInstance(context)
				.updateAppWidget(intent.getIntArrayExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS),views);
		}
		if (week == 1  || week == 7)
		{	
			views.setTextViewText(R.id.weekday , "星期一");
			views.setTextViewText(R.id.class91, sp.getString("mon_1", "班会"));
			views.setTextViewText(R.id.class92, sp.getString("mon_2", "？？"));
			views.setTextViewText(R.id.class93, sp.getString("mon_3", "？？"));
			views.setTextViewText(R.id.class94, sp.getString("mon_4", "？？"));
			views.setTextViewText(R.id.class95, sp.getString("mon_5", "？？"));
			views.setTextViewText(R.id.class96, sp.getString("mon_6", "？？"));
			views.setTextViewText(R.id.class97, sp.getString("mon_7", "？？"));
			views.setTextViewText(R.id.class98, sp.getString("mon_8", "？？"));
		}
		else if	(week == 2)
		{
			views.setTextViewText(R.id.weekday, "星期二");
			views.setTextViewText(R.id.class91, sp.getString("tue_1", "？？"));
			views.setTextViewText(R.id.class92, sp.getString("tue_2", "？？"));
			views.setTextViewText(R.id.class93, sp.getString("tue_3", "？？"));
			views.setTextViewText(R.id.class94, sp.getString("tue_4", "？？"));
			views.setTextViewText(R.id.class95, sp.getString("tue_5", "？？"));
			views.setTextViewText(R.id.class96, sp.getString("tue_6", "？？"));
			views.setTextViewText(R.id.class97, sp.getString("tue_7", "？？"));
			views.setTextViewText(R.id.class98, sp.getString("tue_8", "？？"));
		}
		else if (week == 3)
		{
			views.setTextViewText(R.id.weekday, "星期三");
			views.setTextViewText(R.id.class91, sp.getString("wed_1", "？？"));
			views.setTextViewText(R.id.class92, sp.getString("wed_2", "？？"));
			views.setTextViewText(R.id.class93, sp.getString("wed_3", "？？"));
			views.setTextViewText(R.id.class94, sp.getString("wed_4", "？？"));
			views.setTextViewText(R.id.class95, sp.getString("wed_5", "？？"));
			views.setTextViewText(R.id.class96, sp.getString("wed_6", "？？"));
			views.setTextViewText(R.id.class97, sp.getString("wed_7", "？？"));
			views.setTextViewText(R.id.class98, sp.getString("wed_8", "？？"));
		}
		else if (week == 4)
		{
			views.setTextViewText(R.id.weekday, "星期四");
			views.setTextViewText(R.id.class91, sp.getString("thu_1", "？？"));
			views.setTextViewText(R.id.class92, sp.getString("thu_2", "？？"));
			views.setTextViewText(R.id.class93, sp.getString("thu_3", "？？"));
			views.setTextViewText(R.id.class94, sp.getString("thu_4", "？？"));
			views.setTextViewText(R.id.class95, sp.getString("thu_5", "？？"));
			views.setTextViewText(R.id.class96, sp.getString("thu_6", "？？"));
			views.setTextViewText(R.id.class97, sp.getString("thu_7", "？？"));
			views.setTextViewText(R.id.class98, sp.getString("thu_8", "？？"));
		}
		else if	(week == 5)
		{		views.setTextViewText(R.id.weekday, "星期五");
			views.setTextViewText(R.id.class91, sp.getString("fri_1", "？？"));
			views.setTextViewText(R.id.class92, sp.getString("fri_2", "？？"));
			views.setTextViewText(R.id.class93, sp.getString("fri_3", "？？"));
			views.setTextViewText(R.id.class94, sp.getString("fri_4", "？？"));
			views.setTextViewText(R.id.class95, sp.getString("fri_5", "？？"));
			views.setTextViewText(R.id.class96, sp.getString("fri_6", "？？"));
			views.setTextViewText(R.id.class97, sp.getString("fri_7", "？？"));
			views.setTextViewText(R.id.class98, sp.getString("fri_8", "？？"));
		}
		else if (week == 6)
		{		views.setTextViewText(R.id.weekday, "星期六");
			views.setTextViewText(R.id.class91, sp.getString("sat_1", "？？"));
			views.setTextViewText(R.id.class92, sp.getString("sat_2", "？？"));
			views.setTextViewText(R.id.class93, sp.getString("sat_3", "？？"));
			views.setTextViewText(R.id.class94, sp.getString("sat_4", "？？"));
			views.setTextViewText(R.id.class95, sp.getString("sat_5", "？？"));
			views.setTextViewText(R.id.class96, sp.getString("sat_6", ""));
			views.setTextViewText(R.id.class97, sp.getString("sat_7", ""));
			views.setTextViewText(R.id.class98, sp.getString("sat_8", ""));			
		}
		views.setTextColor(R.id.class91, color);
		views.setTextColor(R.id.class92, color);
		views.setTextColor(R.id.class93, color);
		views.setTextColor(R.id.class94, color);
		views.setTextColor(R.id.class95, color);
		views.setTextColor(R.id.class96, color);
		views.setTextColor(R.id.class97, color);
		views.setTextColor(R.id.class98, color);	
		ComponentName thisWidget = new ComponentName(context, Widget2.class);
		AppWidgetManager
			.getInstance(context)
			.updateAppWidget(thisWidget, views);
	}*/
/*	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appwidgetids)
	{
		super.onUpdate(context, appWidgetManager, appwidgetids);
		sp = PreferenceManager.getDefaultSharedPreferences(context);
		RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget2);
		color = sp.getInt("widgetTextColor", 0xff000000);
		Calendar calendar = new GregorianCalendar();
		int week = calendar.getTime().getDay();
		if (week == 1 || week == 0 || week == 7)
		{	
			views.setTextViewText(R.id.weekday , "星期一");
			views.setTextViewText(R.id.class91, sp.getString("mon_1", "班会"));
			views.setTextViewText(R.id.class92, sp.getString("mon_2", "？？"));
			views.setTextViewText(R.id.class93, sp.getString("mon_3", "？？"));
			views.setTextViewText(R.id.class94, sp.getString("mon_4", "？？"));
			views.setTextViewText(R.id.class95, sp.getString("mon_5", "？？"));
			views.setTextViewText(R.id.class96, sp.getString("mon_6", "？？"));
			views.setTextViewText(R.id.class97, sp.getString("mon_7", "？？"));
			views.setTextViewText(R.id.class98, sp.getString("mon_8", "？？"));
		}
		else if	(week == 2)
		{
			views.setTextViewText(R.id.weekday, "星期二");
			views.setTextViewText(R.id.class91, sp.getString("tue_1", "？？"));
			views.setTextViewText(R.id.class92, sp.getString("tue_2", "？？"));
			views.setTextViewText(R.id.class93, sp.getString("tue_3", "？？"));
			views.setTextViewText(R.id.class94, sp.getString("tue_4", "？？"));
			views.setTextViewText(R.id.class95, sp.getString("tue_5", "？？"));
			views.setTextViewText(R.id.class96, sp.getString("tue_6", "？？"));
			views.setTextViewText(R.id.class97, sp.getString("tue_7", "？？"));
			views.setTextViewText(R.id.class98, sp.getString("tue_8", "？？"));
		}
		else if (week == 3)
		{
			views.setTextViewText(R.id.weekday, "星期三");
			views.setTextViewText(R.id.class91, sp.getString("wed_1", "？？"));
			views.setTextViewText(R.id.class92, sp.getString("wed_2", "？？"));
			views.setTextViewText(R.id.class93, sp.getString("wed_3", "？？"));
			views.setTextViewText(R.id.class94, sp.getString("wed_4", "？？"));
			views.setTextViewText(R.id.class95, sp.getString("wed_5", "？？"));
			views.setTextViewText(R.id.class96, sp.getString("wed_6", "？？"));
			views.setTextViewText(R.id.class97, sp.getString("wed_7", "？？"));
			views.setTextViewText(R.id.class98, sp.getString("wed_8", "？？"));
		}
		else if (week == 4)
		{
			views.setTextViewText(R.id.weekday, "星期四");
			views.setTextViewText(R.id.class91, sp.getString("thu_1", "？？"));
			views.setTextViewText(R.id.class92, sp.getString("thu_2", "？？"));
			views.setTextViewText(R.id.class93, sp.getString("thu_3", "？？"));
			views.setTextViewText(R.id.class94, sp.getString("thu_4", "？？"));
			views.setTextViewText(R.id.class95, sp.getString("thu_5", "？？"));
			views.setTextViewText(R.id.class96, sp.getString("thu_6", "？？"));
			views.setTextViewText(R.id.class97, sp.getString("thu_7", "？？"));
			views.setTextViewText(R.id.class98, sp.getString("thu_8", "？？"));
		}
		else if	(week == 5)
		{		views.setTextViewText(R.id.weekday, "星期五");
			views.setTextViewText(R.id.class91, sp.getString("fri_1", "？？"));
			views.setTextViewText(R.id.class92, sp.getString("fri_2", "？？"));
			views.setTextViewText(R.id.class93, sp.getString("fri_3", "？？"));
			views.setTextViewText(R.id.class94, sp.getString("fri_4", "？？"));
			views.setTextViewText(R.id.class95, sp.getString("fri_5", "？？"));
			views.setTextViewText(R.id.class96, sp.getString("fri_6", "？？"));
			views.setTextViewText(R.id.class97, sp.getString("fri_7", "？？"));
			views.setTextViewText(R.id.class98, sp.getString("fri_8", "？？"));
		}
		else if (week == 6)
		{		views.setTextViewText(R.id.weekday, "星期六");
			views.setTextViewText(R.id.class91, sp.getString("sat_1", "？？"));
			views.setTextViewText(R.id.class92, sp.getString("sat_2", "？？"));
			views.setTextViewText(R.id.class93, sp.getString("sat_3", "？？"));
			views.setTextViewText(R.id.class94, sp.getString("sat_4", "？？"));
			views.setTextViewText(R.id.class95, sp.getString("sat_5", "？？"));
			views.setTextViewText(R.id.class96, sp.getString("sat_6", ""));
			views.setTextViewText(R.id.class97, sp.getString("sat_7", ""));
			views.setTextViewText(R.id.class98, sp.getString("sat_8", ""));			
		}
		views.setTextColor(R.id.class91, color);
		views.setTextColor(R.id.class92, color);
		views.setTextColor(R.id.class93, color);
		views.setTextColor(R.id.class94, color);
		views.setTextColor(R.id.class95, color);
		views.setTextColor(R.id.class96, color);
		views.setTextColor(R.id.class97, color);
		views.setTextColor(R.id.class98, color);	
		ComponentName thisWidget = new ComponentName(context, Widget2.class);
		AppWidgetManager
			.getInstance(context)
			.updateAppWidget(thisWidget, views);
	}*/
}
