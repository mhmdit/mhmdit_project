package com.example.mydetails.WepServics;

import com.example.mydetails.ProductModel;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductsResponse {

    @SerializedName("products")

    private List<ProductModel>productsList;

    public  List<ProductModel> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<ProductModel> productsList) {
        this.productsList = productsList;
    }
}
