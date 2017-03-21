package com.dropin.dropin;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class DropInApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
