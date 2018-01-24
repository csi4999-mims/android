package com.example.mims.mimsmobileclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChangePasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        final EditText cpasswordEnter = (EditText) findViewById(R.id.cEnterPass);
        final EditText cpasswordConfirm = (EditText) findViewById(R.id.cConfirmPass);
        final Button csubmitButton = (Button) findViewById(R.id.cSubmitButton);

        csubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signInIntent = new Intent(ChangePasswordActivity.this, UserHomepageActivity.class);
                ChangePasswordActivity.this.startActivity(signInIntent);
            }
        });
    }
}
