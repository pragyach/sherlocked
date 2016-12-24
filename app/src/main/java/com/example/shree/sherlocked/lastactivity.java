package com.example.shree.sherlocked;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lastactivity extends AppCompatActivity {
     db dbHelper;
    ArrayAdapter<String>mAdapter;
    ListView firsttask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lastactivity);
    }
}
