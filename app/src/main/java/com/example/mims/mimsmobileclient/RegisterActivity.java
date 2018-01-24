package com.example.mims.mimsmobileclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText rfirstNameField = (EditText) findViewById(R.id.rFirstNameField);
        final EditText rlastNameField = (EditText) findViewById(R.id.rLastNameField);
        final EditText remailField = (EditText) findViewById(R.id.rEmailField);
        final EditText rphoneField = (EditText) findViewById(R.id.rPhoneField);
        final EditText rpasswordEnter = (EditText) findViewById(R.id.rPasswordEnterField);
        final EditText rpasswordConfirm = (EditText) findViewById(R.id.rPasswordConfirmField);
        final Button rsignUpButton = (Button) findViewById(R.id.rSignUpButton);

        rsignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signUpIntent = new Intent(RegisterActivity.this,UserHomepageActivity.class);
                RegisterActivity.this.startActivity(signUpIntent);
            }
        });

    }
}
