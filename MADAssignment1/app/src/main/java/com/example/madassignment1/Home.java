package com.example.madassignment1;

import static android.widget.Toast.LENGTH_SHORT;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button logout = findViewById(R.id.btnLogOut);
        logout.setOnClickListener( v->{
            startActivity(new Intent(Home.this, MainActivity.class));
            Toast.makeText(this, "Logged out successfully",LENGTH_SHORT).show();
            finish();
        });
        Button tabs = findViewById(R.id.btnTab);
        tabs.setOnClickListener( v ->{
            startActivity(new Intent(Home.this, TabHome.class));
        });


    }
}