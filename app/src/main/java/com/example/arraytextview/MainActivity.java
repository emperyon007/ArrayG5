package com.example.arraytextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String nazioni[] = {"Italia","Francia","Germania","Olanda"};
    ListView LsStati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LsStati = (ListView) findViewById(R.id.listaStati);
        ArrayAdapter<String> aaStati = new ArrayAdapter<String>(this, R.layout.activity_main, nazioni);
        LsStati.setAdapter(aaStati);
    }
}