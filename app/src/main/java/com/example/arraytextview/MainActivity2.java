package com.example.arraytextview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

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

        LsStati.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
                String stato = (String)LsStati.getItemAtPosition(pos);
                Log.d("errori: ", "poszione:" + pos);

                Intent i = new Intent(getApplicationContext(), MainActivity3.class);
                i.putExtra("key", stato);
                startActivity(i);

                int duration = Toast.LENGTH_SHORT;
                Toast popStat = Toast.makeText(getApplicationContext(), stato, duration);
                popStat.show();
            }
        });

    }
}