package com.example.hoch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.hoch.Fragment.LoginFragment;
import com.example.hoch.Fragment.RegisterFragment;
import com.example.hoch.SharedPreferences.ApiClient;
import com.example.hoch.SharedPreferences.ApiInterface;
import com.example.hoch.SharedPreferences.PrefConfig;

public class LoginAndRegister extends AppCompatActivity implements LoginFragment.OnLoginFromActivityListener {

    public static PrefConfig prefConfig;
    public static ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_and_register);

        prefConfig = new PrefConfig(this);
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);


        if(findViewById(R.id.framelayoutLoginAndRegister)!=null){
            if(savedInstanceState!=null){
                return;
            }
            if(prefConfig.readLoginStatus()){
                Intent intent = new Intent(LoginAndRegister.this,MainActivity.class);
                startActivity(intent);
            }else{
                getSupportFragmentManager().beginTransaction().add(R.id.framelayoutLoginAndRegister,new LoginFragment()).commit();
            }
        }


    }


    @Override
    public void performRegister() {
        getSupportFragmentManager().beginTransaction().replace(R.id.framelayoutLoginAndRegister,new RegisterFragment()).addToBackStack(null).commit();
    }

    @Override
    public void performLogin(String name) {

    }
}
