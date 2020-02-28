package com.e.androidretailapp;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import createchannel.CreateChannel;

public class MainActivity extends AppCompatActivity {

    private NotificationManagerCompat notificationManagerCompat;

    private Button btnDisplayNotification;
    private Button btnDisplayNotification2;

    Button btnCheckAll, btnAccelerometer, btnGyroscope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notificationManagerCompat = NotificationManagerCompat.from(this);
        CreateChannel channel = new CreateChannel(this);
        channel.createChannel();

        btnDisplayNotification = findViewById(R.id.btnNotification);
        btnDisplayNotification2 = findViewById(R.id.btnNotification2);

        btnDisplayNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification();
            }
        });

        btnDisplayNotification2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification2();
            }
        });

        btnCheckAll = findViewById(R.id.btnCheckAll);
        btnAccelerometer = findViewById(R.id.btnAccelerometer);
        btnGyroscope = findViewById(R.id.btnGyroscope);

        btnCheckAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CheckAllActivity.class);
                startActivity(intent);
            }
        });

        btnAccelerometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CheckAllActivity.class);
                startActivity(intent);
            }
        });


        btnGyroscope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CheckAllActivity.class);
                startActivity(intent);
            }
        });


    }


    private void DisplayNotification() {

        Notification notification = new NotificationCompat.Builder(this, CreateChannel.CHANNEL_1)

                .setSmallIcon(R.drawable.ic_sms_notification)
                .setContentTitle("First Message")
                .setContentText("First message body")
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();

        notificationManagerCompat.notify(1, notification);
    }

    private void DisplayNotification2() {

        Notification notification = new NotificationCompat.Builder(this,  CreateChannel.CHANNEL_2)
                .setSmallIcon(R.drawable.ic_sms_notification)
                .setContentTitle("Second Message")
                .setContentText("Second message body")
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();
        notificationManagerCompat.notify(2, notification);
    }
}
