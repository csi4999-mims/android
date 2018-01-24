package com.example.mims.mimsmobileclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        final EditText femailField = (EditText) findViewById(R.id.fEmailField);
        final Button fresetPassButton = (Button) findViewById(R.id.fResetPassButton);

        fresetPassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resetIntent = new Intent(ForgotPasswordActivity.this, ChangePasswordActivity.class);
                ForgotPasswordActivity.this.startActivity(resetIntent);
            }
        });
    }
}
