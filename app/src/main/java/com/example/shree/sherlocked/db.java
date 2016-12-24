package com.example.shree.sherlocked;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by shree on 12/22/2016.
 */

public class db extends SQLiteOpenHelper {
    public static final String DB_NAME = "EDITDEV";
    private static final int DB_VER = 1;
    public static final String DB_TABLE = "TASK";
    public static final String DB_EPNAME = "EPISODE_NAME";
    public static final String DB_EPRATING = "EPISODE_RATING";
    public static final String DB_EPDURATION = "EPISODE_DURATION";
    public static final String DB_EPSUMMARY = "EPISODE_SUMMARY";

    public db(Context context) {
        super(context, DB_NAME, null, DB_VER);
    }

    public void OnCreate(SQLiteDatabase db1) {
        String querry = String.format("CREATE TABLE %s (ID Integer,Primary Key Autoincrement ,%s Text not Null", DB_TABLE, DB_EPDURATION, DB_EPNAME, DB_EPRATING, DB_EPSUMMARY);
        db1.execSQL(querry);

    }

    public void OnUpgrade(SQLiteDatabase db1, int oldversion, int newversion) {
        String query = String.format("Delete Table if exists %s", DB_TABLE);
        db1.execSQL(query);
        onCreate(db1);
    }

    public void insert(String name) {

        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put(DB_EPNAME, name);
        db.insertWithOnConflict(DB_TABLE, null, values, SQLiteDatabase.CONFLICT_REPLACE);

    }
}
public ArrayList<String > getepn(){
    ArrayList<String> EPNAME[9] = new ArrayList<>();
    SQLiteDatabase db1 = this.getWritableDatabase();
    Cursor cursor = db1.query(DB_TABLE , new String[]{ DB_EPNAME},null,null,null,null,null);

        int index = cursor.getColumnIndex(DB_EPNAME);
        EPNAME[0].add("A STUDY IN PINK");
        EPNAME[1].add("The Blind Banker");
        EPNAME[2].add("The Great Game");
        EPNAME[3].add("A Scandal in Belgravia");
        EPNAME[4].add("The Hounds of Baskerville");
        EPNAME[5].add("The Reichenbach Fall");
        EPNAME[6].add("The Empty Hearse");
        EPNAME[7].add("The Sign of Three");
        EPNAME[8].add("His Last Vow");

    }

}



