package com.geno.widget0004.schedule;

import android.app.*;
import android.appwidget.*;
import android.content.*;
import android.preference.*;
import android.text.format.*;
import android.widget.*;
import java.util.*;

public class Widget3 extends AppWidgetProvider
{
	public static SharedPreferences sp ;
	public int color;
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appwidgetids)
	{
		super.onUpdate(context, appWidgetManager, appwidgetids);
		Time time = new Time();
		time.setToNow();
		Intent intent = new Intent(context, UpdateService.class);
		PendingIntent pendingIntent = PendingIntent.getService(context, 0, intent, 0);
		AlarmManager alarm = (AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
		alarm.setRepeating(AlarmManager.RTC, time.toMillis(true), 1000, pendingIntent);
	}
}
