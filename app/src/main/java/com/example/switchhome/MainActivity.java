package com.example.switchhome;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    Switch sw;
    LinearLayout ly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (ToggleButton) findViewById(R.id.toggleButton);
        sw = (Switch) findViewById(R.id.sw1);
        ly = (LinearLayout) findViewById(R.id.ly);
    }

    public void go(View view) {
        if (sw.isChecked() && tb.isChecked()){
            ly.setBackgroundColor(Color.RED);
        }
        else if (sw.isChecked()){
            ly.setBackgroundColor(Color.GREEN);
        }
        else if (tb.isChecked()){
            ly.setBackgroundColor(Color.YELLOW);
        }
        else{
            ly.setBackgroundColor(Color.BLUE);
        }
    }

    public void got(View view) {
        if (sw.isChecked() && tb.isChecked()){
            ly.setBackgroundColor(Color.RED);
        }
        else if (sw.isChecked()){
            ly.setBackgroundColor(Color.GREEN);
        }
        else if (tb.isChecked()){
            ly.setBackgroundColor(Color.YELLOW);
        }
        else{
            ly.setBackgroundColor(Color.BLUE);
        }
    }
}