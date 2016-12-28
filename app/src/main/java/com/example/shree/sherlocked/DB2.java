package com.example.shree.sherlocked;

/**
 * Created by shree on 12/26/2016.
 */import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import java.util.List;

import static com.example.shree.sherlocked.R.id.activity_episodes1;
import static com.example.shree.sherlocked.R.id.e;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataBaseHelper db = new DataBaseHelper(this);

        /**
         * CRUD Operations
         * */
        // Inserting Contacts
        Log.d("Insert: ", "Inserting ..");

        db.addContact(new contact( "abc","65785689","summ","6"));
        db.addContact(new contact("Srinivas", "9199999999","summ1","68"));
        db.addContact(new contact("Tommy", "9522222222","summ2","69"));
        db.addContact(new contact("Karthik", "9533333333","summ","66"));

        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<contact> contacts = db.getAllContacts();


        for (contact cn : contacts) {
            public boolean onOptionsItemSelected(MenuItem activity_episodes1) {
                switch (activity_episodes1.getItemId()) {
                    case R.id.e:
                        String log = "Id: " + cn.getID() + " ,Name: " + cn.getName() + " ,Duration " + cn.getDuration() + " ,Rating" + cn.getRating();
                    case R.id.e1 :
                        String log = "Id: " + cn.getID() + " ,Name: " + cn.getName() + " ,Duration " + cn.getDuration() + " ,Rating" + cn.getRating();
                    case R.id.e2:
                        String log = "Id: " + cn.getID() + " ,Name: " + cn.getName() + " ,Duration " + cn.getDuration() + " ,Rating" + cn.getRating();

        }
        // Adding new contact

    }
}

