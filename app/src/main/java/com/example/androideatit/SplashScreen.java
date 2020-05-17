package com.example.androideatit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    private int waktu_loading = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                setelah loading maka akan langsung berpindah ke main activity utama
                Intent home= new Intent(SplashScreen.this,Home.class);
                startActivity(home);
                finish();
            }
        },waktu_loading);
    }
}
