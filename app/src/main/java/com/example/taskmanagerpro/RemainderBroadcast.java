package com.example.mytasks;



import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class RemainderBroadcast extends BroadcastReceiver {



    public void onReceive(Context context, Intent intent){

        String Title = intent.getStringExtra("Title"); //if it's a string you stored.
        String Text = intent.getStringExtra("Message"); //if it's a string you stored.

        NotificationCompat.Builder notification = new NotificationCompat.Builder(context,"TaskReminder")
                .setSmallIcon(R.drawable.in_progress)
                .setContentTitle(Title)
                .setContentText(Text)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);


        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(context);
        notificationManagerCompat.notify(200,notification.build());
    }

}
