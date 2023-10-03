package com.example.splash_screen2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    public static int SPLASH_TIMER = 3000;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.vView2);

        videoView.setVideoPath(("android.resource://"+getPackageName()+"/"+R.raw.armour_splash));

        MediaController mc2=new MediaController(this);
        mc2.setAnchorView(videoView);
        videoView .setMediaController(mc2);
        mc2.setAnchorView(videoView);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, homeactivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIMER);
    }
}