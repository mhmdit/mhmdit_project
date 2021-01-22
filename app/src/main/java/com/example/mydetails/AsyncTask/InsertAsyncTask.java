package com.example.mydetails.AsyncTask;

import android.os.AsyncTask;

import com.example.mydetails.ProductModel;
import com.example.mydetails.Room.ProductDAO;

public class InsertAsyncTask extends AsyncTask<ProductModel,Void,Void> {

    private ProductDAO productDAO;

    public InsertAsyncTask(ProductDAO productDAO){
        this.productDAO = productDAO;

    }

    @Override
    protected Void doInBackground(ProductModel... productModels) {
        productDAO.insertProduct(productModels[0]);
        return null;
    }
}
