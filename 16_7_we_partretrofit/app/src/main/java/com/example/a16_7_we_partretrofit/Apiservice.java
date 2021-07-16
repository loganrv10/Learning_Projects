package com.example.a16_7_we_partretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Apiservice {

    @GET("/comments")
    Call<List<ResponseModel>> getPosts(@Query("postId")int postId);
}
