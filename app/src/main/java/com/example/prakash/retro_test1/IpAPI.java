package com.example.prakash.retro_test1;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class IpAPI{
    private static final String key = "json";
    private static final String url = "https://ipapi.co/";

    public static PostService postService = null;

    public static PostService getService (){
        if(postService == null){
            Retrofit retrofit = new Retrofit.Builder()
                                    .baseUrl(url)
                                    .addConverterFactory(GsonConverterFactory.create())
                                    .build();
            postService = retrofit.create(PostService.class);
        }
        return postService;
    }

    public interface PostService
    {
        @GET(key)
        Call<IpInfo> getIpInfo();
    }

}
