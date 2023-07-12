package com.example.pruebaiipuebliando409;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        audio = MediaPlayer.create(this, R.raw.app_src_main_res_raw_audio_pavido);
        audio.start();

        TimerTask arranque = new TimerTask() {
            @Override
            public void run() {
                //Para lanzar una actividad desde otra://
                Intent intent = new Intent(MainActivity.this,Home.class);
                startActivity(intent);
            }
        };
        Timer lapso = new Timer();
        lapso.schedule(arranque,8000);
    }
}