package com.example.android.gamescore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int scoreAllies = 0;
    int scoreAxis = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreForAllies(0);
        displayScoreForAxis(0);
    }

    /** Display score for Team Allies */
    public void displayScoreForAllies(int score) {
        TextView scoreview = (TextView) findViewById(R.id.allies_score);
        scoreview.setText(String.valueOf(score));
    }

    /** Add 3 to Team Allies */
    public void addThreeToTeamAllies (View view){
        scoreAllies = scoreAllies + 3;
        displayScoreForAllies(scoreAllies);
    }
    //Add 1 to Team Allies
    public void addOneToTeamAllies (View view){
        scoreAllies = scoreAllies + 1;
        displayScoreForAllies(scoreAllies);
    }

    /** Display score for Team Axis */
    public void displayScoreForAxis(int score) {
        TextView scoreview = (TextView) findViewById(R.id.axis_scores);
        scoreview.setText(String.valueOf(score));
    }

    /** Add 3 to Team Axis */
    public void addThreeToTeamAxis (View view){
        scoreAxis = scoreAxis + 3;
        displayScoreForAxis(scoreAxis);
    }
    //Add 1 to Team Axis
    public void addOneToTeamAxis (View view){
        scoreAxis = scoreAxis + 1;
        displayScoreForAxis(scoreAxis);
    }

    //Reset score for new game
    public void resetNewGame (View view){
        scoreAxis = scoreAllies = 0;
        displayScoreForAxis(scoreAxis);
        displayScoreForAllies(scoreAllies);
    }
}
