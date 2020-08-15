package com.xploreict.lovesmsbangla;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import static com.google.firebase.messaging.Constants.TAG;

/**
 * Created by YoYo on 1/3/2017.
 */
public class FirebaseMassegingService extends FirebaseMessagingService {

    @Override
    public void onNewToken(String token) {
        Log.d(TAG, "Refreshed token: " + token);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intent intent=new Intent(this,MainActivity.class);
        if (remoteMessage.getData().size()>0){
            String message =remoteMessage.getData().get("love_messages");
            Bundle bundle=new Bundle();
            bundle.putString("love_messages",message);
            intent.putExtras(bundle);
        }
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent= PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_ONE_SHOT);
        NotificationCompat.Builder notificationCompact= new NotificationCompat.Builder(this);
        notificationCompact.setContentTitle("Love SMS Bangla");
        notificationCompact.setContentText(remoteMessage.getNotification().getBody());
        notificationCompact.setAutoCancel(true);
        Uri sound= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        notificationCompact.setSound(sound);
        notificationCompact.setContentIntent(pendingIntent);
        NotificationManager notificationManager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0,notificationCompact.build());
    }
}
