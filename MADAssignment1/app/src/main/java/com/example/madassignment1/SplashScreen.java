package com.example.madassignment1;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.view.animation.Animation;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
public class SplashScreen extends AppCompatActivity {
    @Override
    public void onCreate(Bundle state){
        super.onCreate(state);
        setContentView(R.layout.activity_splash);
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        TextView splash = findViewById(R.id.splash);
        splash.startAnimation(anim);

        new Handler().postDelayed(()->{
            startActivity(new Intent(SplashScreen.this,MainActivity.class));
            finish();
        },1500);

    }
}
