package com.example.loadgithubprofilesinarecyclerview;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("/users/{user}/repos")
    Call<List<ResponseDTO>> getData(@Path("user") String user);
}
