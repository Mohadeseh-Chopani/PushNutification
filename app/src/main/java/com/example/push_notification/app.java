package com.example.push_notification;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class app extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        NotificationManager manager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        NotificationChannel channel= null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            channel = new NotificationChannel("myapp","test push notification", NotificationManager.IMPORTANCE_HIGH);
            manager.createNotificationChannel(channel);
        }
    }
}
