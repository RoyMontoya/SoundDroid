package com.example.amado.sounddroid.com.example.amado.sounddroid.soundcloud;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Amado on 22/01/2015.
 */
public interface SoundCloudService {

     static final String CLIENT_ID = "3a4377c159fd3df8c682e3509b10f0c8";


    @GET("/tracks?client_id="+CLIENT_ID)
    public void searchSong (@Query("q") String query, Callback<List<Track>> cb);

    @GET("/tracks?client_id="+CLIENT_ID)
    public void getRecentSongs(@Query("created_at[from]") String date, Callback<List<Track>> cb);
}
