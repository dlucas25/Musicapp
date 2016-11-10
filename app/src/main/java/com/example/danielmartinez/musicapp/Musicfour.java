package com.example.danielmartinez.musicapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Musicfour extends AppCompatActivity {
    ImageButton start, pause, stop;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicfour);
        start = (ImageButton)findViewById(R.id.start);
        pause = (ImageButton)findViewById(R.id.pause);
        stop = (ImageButton)findViewById(R.id.stop);
        mp = MediaPlayer.create(getApplicationContext(),R.raw.aud4);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                start.setEnabled(false);
                pause.setEnabled(true);
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
                pause.setEnabled(false);
                start.setEnabled(true);
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
                stop.setEnabled(false);
                start.setEnabled(true);
            }
        });

    }
}
