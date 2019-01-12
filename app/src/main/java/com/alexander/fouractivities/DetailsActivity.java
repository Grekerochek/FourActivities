package com.alexander.fouractivities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailsActivity extends AppCompatActivity {

    private Button buttonNext;
    private Button buttonPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
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

                startActivity(InfoActivity.newIntent(DetailsActivity.this));
            }
        });
        buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(MainActivity.newIntent(DetailsActivity.this));
            }
        });
    }

    public static final Intent newIntent(Context context){
        Intent intent = new Intent(context, DetailsActivity.class);
        return intent;

    }
}