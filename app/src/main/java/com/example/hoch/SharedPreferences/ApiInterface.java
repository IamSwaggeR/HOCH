package com.example.hoch.SharedPreferences;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("register.php")
    Call<User> performRegistration(@Query("user_name") String user_name,@Query("user_email") String user_email,
                                   @Query("user_phone_number") String user_phone_number,
                                   @Query("user_password") String user_password);
    @GET("login.php")
    Call<User> performUserLogin(@Query("user_name") String user_name,@Query("user_password") String user_password);
}
