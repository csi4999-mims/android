package com.example.mims.mimsmobileclient;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);


        final Button startButton = (Button)findViewById(R.id.StartButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //If the URL of the MIMS site changes sometime in the future,
                //a patch will have to be made to correspond to this part of the code.
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://csi4999mims.online/"));
                startActivity(viewIntent);
            }
        });


    }
}
