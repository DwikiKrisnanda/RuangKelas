package com.example.ruangkelas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends Activity {
    EditText UsernameRegis;
    EditText EmailRegis;
    EditText PassRegis;
    EditText ConfPassRegis;
    Button register;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout);
        UsernameRegis = findViewById(R.id.RegistUser);
        EmailRegis = findViewById(R.id.RegistEmail);
        PassRegis = findViewById(R.id.RegistPass);
        ConfPassRegis = findViewById(R.id.RegistConfPass);
        register = findViewById(R.id.RegistButton);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkDataEntered();
            }
        });
    }

    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    void checkDataEntered() {
        if (isEmpty(UsernameRegis)) {
            Toast t = Toast.makeText(this, "You must enter Username to register!", Toast.LENGTH_SHORT);
            t.show();
        }

        if (isEmail(EmailRegis) == false) {
            EmailRegis.setError("Enter valid email!");
        }

        if (isEmpty(PassRegis)) {
            Toast t = Toast.makeText(this, "You must enter Password to register!", Toast.LENGTH_SHORT);
            t.show();
        }

        if (isEmpty(ConfPassRegis)) {
            ConfPassRegis.setError("Confirm Password is required!");
        }
        else {
            Intent intent = new Intent(SignUpActivity.this, HomeActivity.class);
            startActivity(intent);
        }
    }
}