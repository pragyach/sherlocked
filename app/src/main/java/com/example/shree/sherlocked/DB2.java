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

        db.addContact(new contact( "A Study in Pink", "90min","9.1/10",""));
        db.addContact(new contact("The Blind Banker","90min","8.1/10","" ));
        db.addContact(new contact("The Great Game","90min","9.1/10",""));
        db.addContact(new contact("A Scandal in Belgravia","90min","9.5/10",""));
        db.addContact(new contact("The Hounds of Baskerville","90min" , "9.2/10",""));
        db.addContact(new contact("The Reichenbach Fall","90min","9.7",""));
        db.addContact(new contact("The Empty Hearse","90min","9.2/10",""));
        db.addContact(new contact("The Sign of Three","90min","9/10",""));
        db.addContact(new contact("His Last Vow","90min","9.2/10",""));

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

