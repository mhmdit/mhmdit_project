package com.example.mydetails.Room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.mydetails.ProductModel;

@Database(entities = {ProductModel.class},version = 1,exportSchema = false)
public abstract class ProductDataBase extends RoomDatabase {

        public abstract ProductDAO getProductDao();

}
