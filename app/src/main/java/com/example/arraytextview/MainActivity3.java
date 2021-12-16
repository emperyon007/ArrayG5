package com.example.arraytextview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    Bundle extras = getIntent().getExtras();
    ImageView imgSelect;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        if(extras != null)
        {
            String value = extras.getString("key");
        }

        //imgSelect = (ImageView)findViewById(R.drawable.Flag_of_Germany);
        imgSelect.setImageResource(R.drawable.flag_of_italy);

    }
}