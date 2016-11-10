package com.example.danielmartinez.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView)findViewById(R.id.listView);
        final String[] values = new String[] { "Runaway",
                "You got something i need",
                "Fix you",
                "Yellow"
        };
        final ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = String.valueOf(adapterView.getItemAtPosition(i));
                if(value == values[0]){
                    Intent x = new Intent(getApplicationContext(), Musicone.class);
                    startActivity(x);
                }
                if(value == values[1]){
                    Intent x = new Intent(getApplicationContext(), Musictwo.class);
                    startActivity(x);
                }
                if(value == values[2]){
                    Intent x = new Intent(getApplicationContext(), Musicthree.class);
                    startActivity(x);
                }
                if(value == values[3]){
                    Intent x = new Intent(getApplicationContext(), Musicfour.class);
                    startActivity(x);
                }

            }
        });
    }
}
