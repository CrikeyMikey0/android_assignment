package com.example.madassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn);
        getSharedPreferences("LoginData", MODE_PRIVATE)
                .edit()
                .putString("email", "user@user.com")
                .putString("password", "user@12345")
                .apply();
        String EMAIL = getSharedPreferences("LoginData",MODE_PRIVATE).getString("email","");
        String PASS = getSharedPreferences("LoginData",MODE_PRIVATE).getString("password","");

        btn.setOnClickListener(v->{
            String email = ((EditText) findViewById(R.id.email)).getText().toString();
            String pass = ((EditText) findViewById(R.id.pass)).getText().toString();
//          if(email.equals(EMAIL) && pass.equals(PASS)){
          if(email.equals("user") && pass.equals("user")){

                Toast.makeText(this,"Login Successful", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Home.class));
            }else{
                Toast.makeText(this,"Invalid ID/Password", Toast.LENGTH_SHORT).show();

            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}