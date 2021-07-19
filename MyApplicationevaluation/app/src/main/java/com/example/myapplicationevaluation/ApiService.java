package com.example.myapplicationevaluation;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("/posts/{postId}")
    Call<ResponseDTO>getUser(@Path("userId") int userid);


}
