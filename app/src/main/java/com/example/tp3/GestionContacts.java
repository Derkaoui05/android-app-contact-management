package com.example.tp3;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class GestionContacts {
    SQLiteDatabase db;
    Creation_BDD bd_create = null;

    public GestionContacts(Context context){
        bd_create = new Creation_BDD(context);
    }

    public void Ajouter(Contact contact){
        db = bd_create.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("userId" , contact.getUserId());
        contentValues.put("username",contact.getUsername());
        contentValues.put("userAddress",contact.getUserAddress());
        contentValues.put("userPhone",contact.getUserPhone());
        db.insert("Contact",null,contentValues);
        db.close();
    }
}
