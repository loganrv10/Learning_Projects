package com.example.unie3;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {

    @Headers("Authorization: Client-ID 7e2182a8d309cf8")
    @Multipart
    @POST("3/image")
    Call<ResponseModel> uploadImage(
            @Part MultipartBody.Part image);



}
