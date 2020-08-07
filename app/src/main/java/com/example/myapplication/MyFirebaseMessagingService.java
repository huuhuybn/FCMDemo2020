package com.example.myapplication;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends
        FirebaseMessagingService {


    // trả về mã đăng kí
    @Override
    public void onNewToken(@NonNull String s) {
        super.onNewToken(s);
        Log.e("TOKEN",s);
    }

    // đc gọi khi có tin nhắn từ server gửi tới
    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.e("TIN NHAN",
                remoteMessage.getNotification().getTitle());
        Log.e("TIN NHAN",
                remoteMessage.getNotification().getBody());

        // show notification

        
    }
}
