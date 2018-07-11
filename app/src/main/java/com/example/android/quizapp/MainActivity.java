package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int quizScore = 0;




    public void calculateScore(View view){

        RadioButton answerOne = (RadioButton) findViewById(R.id.answerOneA);
        boolean checkedOne = answerOne.isChecked();

        RadioButton answerTwo = (RadioButton) findViewById(R.id.answerTwoB);
        boolean checkedTwo = answerTwo.isChecked();

        RadioButton answerThree = (RadioButton) findViewById(R.id.answerThreeA);
        boolean checkedThree = answerThree.isChecked();

        RadioButton answerFour = (RadioButton) findViewById(R.id.answerFourC);
        boolean checkedFour = answerFour.isChecked();

        RadioButton answerFive = (RadioButton) findViewById(R.id.answerFiveA);
        boolean checkedFive = answerFive.isChecked();

        if(checkedOne == true){
            quizScore = quizScore +10;
        }
        if(checkedTwo == true){
            quizScore = quizScore +10;
        }
        if(checkedThree == true){
            quizScore = quizScore +10;
        }
        if(checkedFour == true){
            quizScore = quizScore +10;
        }
        if(checkedFive == true){
            quizScore = quizScore +10;
        }

        Log.v("activityMain","score is :" + quizScore);

        TextView finalScore = (TextView) findViewById(R.id.scoreText);
        finalScore.setText("FINAL SCORE : " + quizScore);

        quizScore = 0;
    }


}
