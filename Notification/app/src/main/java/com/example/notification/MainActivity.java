package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.onesignal.OneSignal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // OneSignal Initialization
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
        String email = "example@domain.com";
        String emailAuthHash = "..."; // Email auth hash generated from your server
        OneSignal.setEmail(email, emailAuthHash, new OneSignal.EmailUpdateHandler() {
            @Override
            public void onSuccess() {
                // Email successfully synced with OneSignal
            }

            @Override
            public void onFailure(OneSignal.EmailUpdateError error) {
                // Error syncing email, check error.getType() and error.getMessage() for details
            }
        });
    }
}
