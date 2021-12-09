package com.example.arraytextview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {

    String nazioni[] = {"Italia","Francia","Germania","Olanda"};
    ListView LsStati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        LsStati = (ListView) findViewById(R.id.listaStati);
        ArrayAdapter<String> aaStati = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nazioni);
        LsStati.setAdapter(aaStati);

    }
}