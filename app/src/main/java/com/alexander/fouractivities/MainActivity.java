package com.alexander.fouractivities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonNext;
    private Button buttonPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListeners();
    }

    private void initViews(){
        buttonNext = findViewById(R.id.next);
        buttonPrevious = findViewById(R.id.previous);
    }

    private void initListeners(){
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(DetailsActivity.newIntent(MainActivity.this));
            }
        });
        buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(SplashActivity.newIntent(MainActivity.this));
            }
        });
    }

    public static final Intent newIntent(Context context){

        Intent intent = new Intent(context, MainActivity.class);
        return intent;

    }
}
