package com.example.app1;




import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {
    @GET("/posts/{postId}")
    Call<ResponseDTO> getPost(@Path("postId") int id);
}
