package com.example.gian.gapakelama;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.gian.gapakelama.Helper.SharedPrefManager;
import com.example.gian.gapakelama.Sign.SigninActivity;

public class LocationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        if (!SharedPrefManager.getInstance(this).isLoggedIn()) {
            finish();
            startActivity(new Intent(this, SigninActivity.class));
            return;
        }

    }
}
