package com.example.madassignment1;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TabHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tab_home);
        Button prod = findViewById(R.id.prod);
        prod.setOnClickListener( v ->{
            getSupportFragmentManager().beginTransaction().replace(R.id.fragcont, new prod()).commit();
        });
        Button gallery = findViewById(R.id.gallery);
        prod.setOnClickListener( v ->{
            getSupportFragmentManager().beginTransaction().replace(R.id.fragcont, new gallery()).commit();
        });
        Button profile= findViewById(R.id.profile);
        prod.setOnClickListener( v ->{
            getSupportFragmentManager().beginTransaction().replace(R.id.fragcont, new profile() ).commit();
        });
    }
}