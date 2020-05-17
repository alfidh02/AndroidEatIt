package com.example.androideatit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androideatit.Common.Common;

public class ProfileActivity extends AppCompatActivity {
    TextView mUser,mNim;
    Button btnLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Toolbar toolbar = findViewById(R.id.toolbar1);
        toolbar.setTitle("Profil");
        setSupportActionBar(toolbar);

        mUser = findViewById(R.id.welcome);
        mNim  = findViewById(R.id.go_menu);
        btnLogout = findViewById(R.id.btn_logout);

        mUser.setText("Halo "+Common.currentUser.getNama());
        mNim.setText(Common.currentUser.getNIM());

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfileActivity.this,LoginActivity.class));
                Toast.makeText(ProfileActivity.this, "Berhasil keluar", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
