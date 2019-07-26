package com.example.hoch.SharedPreferences;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("response")
    private String Response;
    @SerializedName("user_name")
    private String user_name;

    public String getResponse() {
        return Response;
    }

    public String getUser_name() {
        return user_name;
    }
}
