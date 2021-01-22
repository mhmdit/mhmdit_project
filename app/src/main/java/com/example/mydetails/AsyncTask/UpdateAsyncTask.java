package com.example.mydetails.AsyncTask;

import android.os.AsyncTask;

import com.example.mydetails.ProductModel;
import com.example.mydetails.Room.ProductDAO;

public class UpdateAsyncTask extends AsyncTask <ProductModel,Void,Void> {

    private ProductDAO productDAO ;

    public UpdateAsyncTask(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    protected Void doInBackground(ProductModel... productModels) {
        productDAO.updateProduct(productModels[0]);
        return null;
    }
}
