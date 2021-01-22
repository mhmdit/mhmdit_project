package com.example.mydetails.AsyncTask;

import android.os.AsyncTask;

import com.example.mydetails.ProductModel;
import com.example.mydetails.Room.ProductDAO;

import java.util.List;

public class GetProductAsyncTask extends AsyncTask<Void,Void, List<ProductModel>> {

 private ProductDAO productDAO;

    public GetProductAsyncTask(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    protected List<ProductModel> doInBackground(Void... voids) {
        return productDAO.getAllProducts();
    }
}
