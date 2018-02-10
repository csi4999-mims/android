package com.example.mims.mimsmobileclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserHomepageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_homepage);

        final EditText afirstNameField = (EditText) findViewById(R.id.afirstNameField);
        final EditText alastNameField = (EditText) findViewById(R.id.alastNameField);
        final EditText aemailField = (EditText) findViewById(R.id.aemailField);
        final EditText aphoneField = (EditText) findViewById(R.id.aPhoneNumField);
        final Button aupdateButton = (Button) findViewById(R.id.aUpdateButton);
        final Button achangePassButton = (Button) findViewById(R.id.aChangePassButton);
        final Button asubmitNewReport = (Button) findViewById(R.id.aSubmitNewReport);
        final Button aviewReports = (Button) findViewById(R.id.aViewReports);


        aupdateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent updateIntent = new Intent(UserHomepageActivity.this, RegisterActivity.class);
                UserHomepageActivity.this.startActivity(updateIntent);
            }
        });

        achangePassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent changeIntent = new Intent(UserHomepageActivity.this, ChangePasswordActivity.class);
                UserHomepageActivity.this.startActivity(changeIntent);
            }
        });

        asubmitNewReport.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent submitIntent = new Intent(UserHomepageActivity.this, ReportSubmissionActivity.class);
                UserHomepageActivity.this.startActivity(submitIntent);
            }
        });

        aviewReports.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent viewIntent = new Intent(UserHomepageActivity.this, ReportViewActivity.class);
                UserHomepageActivity.this.startActivity(viewIntent);
            }
        });
    }
}
