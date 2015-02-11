package com.example.amado.sounddroid.com.example.amado.sounddroid.soundcloud;

import retrofit.RestAdapter;

/**
 * Created by Amado on 22/01/2015.
 */
public class Soundcloud {
    private static final String API_URL = "http://api.soundcloud.com";
    private static final RestAdapter REST_ADAPTER =
    new RestAdapter.Builder()
            .setEndpoint(API_URL)
            .build();

    private static final SoundCloudService SERVICE = REST_ADAPTER.create(SoundCloudService.class);

    public static SoundCloudService getService(){
        return SERVICE;
    }
}
