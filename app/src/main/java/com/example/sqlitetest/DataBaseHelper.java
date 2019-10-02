package com.example.sqlitetest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper
{

    public static final String DATABASE_NAME = "player.db";
    public static final String TABLE_NAME = "player_table.db";
    public static final String COL_1 = "NUMBER";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "3 POINTERS";
    public static final String COL_4 = "2 POINTERS";
    public static final String COL_5 = "FREE THROWS";
    public static final String COL_6 = "ASSISTS";
    public static final String COL_7 = "FOULS";
    public static final String COL_8 = "REBOUNDS";



    public DataBaseHelper(@Nullable Context context)
    {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME + " (NUMBER )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {

    }
}

