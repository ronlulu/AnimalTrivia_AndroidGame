package com.example.triviagame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class Activity_score extends AppCompatActivity{

    public static final String KEY_SCORE = "KEY_SCORE";
    public static final String KEY_TIMER = "KEY_TIMER";
    private MaterialTextView score_LBL_timer;
    private MaterialTextView score_LBL_Score;
    private MaterialButton score_BTN_endGame;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        findViews();
        initViews();
        Intent previousIntent = getIntent();
        float playTime = previousIntent.getExtras().getFloat(KEY_TIMER);
        int score = previousIntent.getExtras().getInt(KEY_SCORE);
        score_LBL_Score.setText("SCORE: " + score);
        score_LBL_timer.setText("YOUR TIME: " + playTime);

    }

    private void initViews() {
        score_BTN_endGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void findViews()
    {
        score_LBL_timer = findViewById(R.id.score_LBL_timer);
        score_LBL_Score = findViewById(R.id.score_LBL_Score);
        score_BTN_endGame = findViewById(R.id.score_BTN_endGame);
    }


}
