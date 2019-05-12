package com.example.ruangkelas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;


public class LoginActivity extends Activity {

    List<User> listUser;
    private Button login;
    private EditText username, password;
    private int counter = 5;
    private TextView Info;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        login=(Button)findViewById(R.id.btnlogin);
        username=(EditText)findViewById(R.id.loginusername);
        password=(EditText)findViewById(R.id.loginpass);
        Info = (TextView)findViewById(R.id.tvInfo);

        Info.setText("No of attempts remaining: 5");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(username.getText().toString(), password.getText().toString());
            }
        });
    }

    public void Daftar(View view) {
        Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(intent);
    }

    private void validate(String userName, String userPassword){
        if((userName.equals("Admin")) && (userPassword.equals("1234"))){
            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(intent);
        }else{
            counter--;

            Info.setText("No of attempts remaining: " + String.valueOf(counter));

            if(counter == 0){
                login.setEnabled(false);
            }
        }
    }
}