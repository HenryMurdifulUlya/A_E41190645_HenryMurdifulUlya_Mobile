package com.example.usingpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.Preferences;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}