package com.alexander.fouractivities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity {

    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initViews();
        initListeners();
    }

    private void initViews(){
        buttonNext = findViewById(R.id.next);
    }

    private void initListeners(){
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(MainActivity.newIntent(SplashActivity.this));
            }
        });
    }

    public static final Intent newIntent(Context context){

        Intent intent = new Intent(context, SplashActivity.class);
        return intent;

    }
}
