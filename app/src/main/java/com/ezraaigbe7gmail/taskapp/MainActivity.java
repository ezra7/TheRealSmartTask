package com.ezraaigbe7gmail.taskapp;

import android.app.ListActivity;
import android.content.Context;
import android.content.SharedPreferences;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ArrayList<String> listItems=new ArrayList<String>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = (Button) findViewById(R.id.btnAddItem);
        ListView view = (ListView)findViewById(R.id.lvItems);

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listItems);
        view.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText box = (EditText)findViewById(R.id.etNewItem);
                listItems.add(/*0*/box.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });


    }
}

