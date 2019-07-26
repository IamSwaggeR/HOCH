package com.example.hoch.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.hoch.LoginAndRegister;
import com.example.hoch.MainActivity;
import com.example.hoch.R;
import com.example.hoch.SharedPreferences.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {

    private EditText userName,userGmail,userPhoneNumber,userPassword;
    private Spinner spinner;
    private Button btn;

    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        userName = view.findViewById(R.id.ipTxName);
        userGmail = view.findViewById(R.id.ipTxEmail);
        userPhoneNumber = view.findViewById(R.id.ipTxPhoneNumber);
        userPassword = view.findViewById(R.id.ipTxPassword);
        btn = view.findViewById(R.id.btnSignUpFragment);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performRegistration();
            }
        });
        return view;
    }
    public void performRegistration(){
        String user_name = userName.getText().toString();
        String user_email = userGmail.getText().toString();
        String user_phone_number = userPhoneNumber.getText().toString();
        String user_password = userPassword.getText().toString();

        Call<User> call = LoginAndRegister.apiInterface.performRegistration(user_name,user_email,user_phone_number,user_password);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(response.body().getResponse().equals("ok")){
//                    LoginAndRegister.prefConfig.writeLogInStatus(true);
                    LoginAndRegister.prefConfig.displayToast("Rigistration Success");
                }else if(response.body().getResponse().equals("exist")){
                    LoginAndRegister.prefConfig.displayToast("User already exist");
                }
                else if(response.body().getResponse().equals("error")){
                    LoginAndRegister.prefConfig.displayToast("Something went wrong");
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
        userName.setText("");
        userGmail.setText("");
        userPhoneNumber.setText("");
        userPassword.setText("");
    }

}
