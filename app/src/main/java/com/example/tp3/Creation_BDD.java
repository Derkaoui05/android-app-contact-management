package com.example.tp3;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Creation_BDD extends SQLiteOpenHelper {
    static final  String db_name = "Contsacts.db";
    static final int version = 1;

    public Creation_BDD(@Nullable Context context) {
        super(context, db_name,null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table if not exists Contact(userId int Primary key, username Text,userAddress Text, userPhone Text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("drop table if exists Contact");
    }
}
