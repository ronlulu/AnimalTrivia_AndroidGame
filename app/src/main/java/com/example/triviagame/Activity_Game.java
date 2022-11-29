package com.example.triviagame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

public class Activity_Game extends AppCompatActivity
{
    private MaterialTextView main_LBl_Score;
    private ShapeableImageView main_IMG_animal;
    //private MaterialButton main_BTN_bottomLeft, main_BTN_bottomRight, main_BTN_topLeft, main_BTN_topRight;
    private MaterialButton[] ansBTN;
    private String answer;
    private long start,end;
    private float playTime;
    private boolean firstClick;
    GameManager gameManager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        initViews();
        gameManager = new GameManager();
        firstClick = true;
        refreshUI();
    }


    private void findViews()
    {
        main_LBl_Score = findViewById(R.id.main_LBl_Score);
        ansBTN = new MaterialButton[]{
                findViewById(R.id.main_BTN_topRight),
                findViewById(R.id.main_BTN_topLeft),
                findViewById(R.id.main_BTN_bottomRight),
                findViewById(R.id.main_BTN_bottomLeft)};
        main_IMG_animal = findViewById(R.id.main_IMG_animal);
    }
    private void initViews()
    {

        ansBTN[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked(String.valueOf(ansBTN[0].getText()));
            }
        });
        ansBTN[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked(String.valueOf(ansBTN[1].getText()));
            }
        });
        ansBTN[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked(String.valueOf(ansBTN[2].getText()));
            }
        });
        ansBTN[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked(String.valueOf(ansBTN[3].getText()));
            }
        });

    }
    private void clicked(String answer)
    {
        if(firstClick) {
            firstClick = false;
            start = System.currentTimeMillis();
        }
        gameManager.checkScore(answer);
        refreshUI();
    }

    private void refreshUI()
    {
        if(gameManager.isEndGame())
        {
            end = System.currentTimeMillis();
            playTime = (end-start)/1000F;
            openScorePage(gameManager.getScore(), playTime);
        }else{
            setLevel();
            main_LBl_Score.setText("" + gameManager.getScore());
        }
    }

    private void setLevel()
    {
        main_IMG_animal.setImageResource(gameManager.getCurrentAnimal());
        for (int i=0;i<4; i++)
            ansBTN[i].setText("" + gameManager.getCurrentAnswers()[i]);
    }


    private void openScorePage(int score, float playTime)
    {
        Intent intent = new Intent(this, Activity_score.class);
        intent.putExtra(Activity_score.KEY_SCORE, score);
        intent.putExtra(Activity_score.KEY_TIMER, playTime);
        startActivity(intent);
        finish();
    }


}