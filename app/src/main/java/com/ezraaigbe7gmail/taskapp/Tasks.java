package com.ezraaigbe7gmail.taskapp;

import android.widget.ArrayAdapter;

public class Tasks{
    public Tasks(String description){
        setContentView(R.layout.main);
        adapter=new ArrayAdapter<Tasks>(this,
                android.R.layout.simple_list_item_1, listItems);
        setListAdapter(adapter);
    }




}