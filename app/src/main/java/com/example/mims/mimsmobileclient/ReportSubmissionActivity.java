package com.example.mims.mimsmobileclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ReportSubmissionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_submission);

        final Button ssubmitReportButton = (Button) findViewById(R.id.sSubmitReport);

        ssubmitReportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent submitIntent = new Intent(ReportSubmissionActivity.this, UserHomepageActivity.class);
                ReportSubmissionActivity.this.startActivity(submitIntent);
            }
        });
    }
}
