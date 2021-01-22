package com.example.mydetails.Room;

import android.content.Context;

import androidx.room.Room;

public class RoomFactory {

    private static ProductDataBase database;

    public static ProductDataBase getRoomDataBase(Context context){
       if (database == null){
            database = Room.databaseBuilder(context,ProductDataBase.class,"products_database")
                    .build();

       }
        return database;
    }


}
