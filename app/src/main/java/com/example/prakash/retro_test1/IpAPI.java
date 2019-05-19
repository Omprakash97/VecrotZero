package com.example.prakash.retro_test1;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

// THIS IS THE INTERFACE THAT COMMUNICATES WITH THE API SITE TO GET THE JSON

public class IpAPI{

    private static final String key = "json";                   // CAN BE ANY VARIABLE THING - BUT FOR US ITS JUST A SUB SECTION OF THE ACTUAL URL
    private static final String url = "https://ipapi.co/";      // THE ACTUAL WEBSITE URL

    public static PostService postService = null;

    public static PostService getService (){                    // THE MODULE THAT INITIATES THE RETROFIT POSTSERVICES
        if(postService == null){
            Retrofit retrofit = new Retrofit.Builder()          // RETROFIT OBJECT IS CREATED WITH ALL NEEDED INFO
                                    .baseUrl(url)
                                    .addConverterFactory(GsonConverterFactory.create())
                                    .build();
            postService = retrofit.create(PostService.class);
        }
        return postService;
    }

    public interface PostService                                // ACTUAL INTERFACE THAT IS CALLED FROM MAIN FUNCTION 
    {
        @GET(key)
        Call<IpInfo> getIpInfo();
    }

}
