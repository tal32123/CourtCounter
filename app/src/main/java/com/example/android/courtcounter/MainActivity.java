package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int teamAScore = 0;
    int teamBScore = 0;
   final int FREE_THROW=1;
   final int TWO_POINTS = 2;
   final int THREE_POINTS = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //This adds three to Team A's score
    public void plusThreeA(View view){
        teamAScore = teamAScore + THREE_POINTS;
        displayForTeamA(teamAScore);
    }
    //This adds two to Team A's score
    public void plusTwoA(View view){
        teamAScore = teamAScore + TWO_POINTS;
        displayForTeamA(teamAScore);
    }
    //This adds one point for Team A
    public void freeThrowA(View view){
        teamAScore = teamAScore + FREE_THROW;
        displayForTeamA(teamAScore);
    }
    /**
     * Displays the given score for Team A
     */
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    //Adds three points to Team B's score
    public void plusThreeB(View View){
        teamBScore = teamBScore + THREE_POINTS;
        displayForTeamB(teamBScore);
    }
    //Adds two points to team B's score
    public void plusTwoB(View view){
        teamBScore = teamBScore + TWO_POINTS;
        displayForTeamB(teamBScore);
    }
    //Adds one point to Team B's score
    public void freeThrowB(View view){
        teamBScore =teamBScore +FREE_THROW;
        displayForTeamB(teamBScore);
    }
    //Resets both Teams' score to 0
    public void reset(View view){
        teamAScore = 0;
        displayForTeamA(teamAScore);
        teamBScore = 0;
        displayForTeamB(teamBScore);
    }
    //Displays the given score for Team B
    public void displayForTeamB(int score){
        TextView scoreview = (TextView) findViewById(R.id.team_b_score);
        scoreview.setText(String.valueOf(score));
    }
}
