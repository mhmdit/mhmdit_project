package com.example.mydetails.WepServics;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WebServices {

    @GET ("products")
    Call<ProductsResponse> getProducts();




}
