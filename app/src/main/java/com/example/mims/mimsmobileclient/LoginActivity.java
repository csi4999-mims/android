package com.example.mims.mimsmobileclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText lemailField = (EditText) findViewById(R.id.lEmailField);
        final EditText lpasswordField = (EditText) findViewById(R.id.lPasswordField);
        final Button lsignIn = (Button) findViewById(R.id.lSignInButton);
        final Button lsignUp = (Button) findViewById(R.id.lSignUpButton);
        final Button lforgot = (Button) findViewById(R.id.lForgotButton);

        lsignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent =  new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });

        lsignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signInIntent = new Intent(LoginActivity.this, UserHomepageActivity.class);
                LoginActivity.this.startActivity(signInIntent);
            }
        });

        lforgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgotIntent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
                LoginActivity.this.startActivity(forgotIntent);
            }
        });

    }
}
