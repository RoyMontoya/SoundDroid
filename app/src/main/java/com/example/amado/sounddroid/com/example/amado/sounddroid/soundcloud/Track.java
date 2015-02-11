package com.example.amado.sounddroid.com.example.amado.sounddroid.soundcloud;

import android.util.Log;

import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Amado on 21/01/2015.
 */
public class Track {
    @SerializedName("title")
    private String mTitle;

    @SerializedName("stream_url")
    private String mStreamURL;
    @SerializedName("id")
    private int mID;
    @SerializedName("artwork_url")
    private String artworkURL;
    private static final String TAG = "Track";


    public String getTitle() {
        return mTitle;
    }


    public String getStreamURL() {
        return mStreamURL;
    }

    public String getArtworkURL() {
        return artworkURL;
    }

    public int getID() {
        return mID;
    }


    public String getAvatarURL() {
        String avatarURL = artworkURL;
        if (avatarURL != null) {
            avatarURL = avatarURL.replace("large", "tiny");
        }
        return avatarURL;
    }
}