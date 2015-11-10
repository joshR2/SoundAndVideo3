package com.example.jrob2049.soundandvideo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.*;

public class SoundActivity extends Activity implements Runnable
{
    private Button startButton;
    private Button stopButton;
    private Button pauseButton;
    private Button videButton;
    private MediaPlayer soundPlayer;
    private SeekBar soundBar;
    private Thread soundthread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound);
    }
}
