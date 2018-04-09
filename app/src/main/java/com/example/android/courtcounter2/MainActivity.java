package com.example.android.courtcounter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.courtcounter2.R;

public class MainActivity extends AppCompatActivity{
    // Tracks the score for team A
    int scoreTeamA = 0;

    // tracks the score for team B
    int scoreTeamB = 0;

    // Tracks the fouls for team A
    int foulsTeamA = 0;

    // Tracks the fouls for team B
    int foulsTeamB = 0;

    //Tracks timeouts left for Team A
    int timeoutsLeftTeamA = 4;

    //Tracks timeouts left for Team B
    int timeoutsLeftTeamB = 4;

    // Tracks blocks for team A
    int blocksTeamA = 0;

    // Tracks blocks for team B
    int blocksTeamB = 0;

    // Tracks steals for team A
    int turnoversTeamA = 0;

    // Tracks steals for team B
    int turnoversTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        displayBlocksTeamA (0);
        displayBlocksTeamB (0);
        displayTurnoversTeamA (0);
        displayTurnoversTeamB (0);
        displayFoulsTeamA(0);
        displayFoulsTeamB(0);
        displayTimeoutsLeftTeamA(4);
        displayTimeoutsLeftTeamB(4);
    }

    // Resets all counters to zero
    public void resetGame (View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        blocksTeamA = 0;
        blocksTeamB = 0;
        turnoversTeamA = 0;
        turnoversTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        timeoutsLeftTeamA = 4;
        timeoutsLeftTeamB = 4;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayBlocksTeamA (blocksTeamA);
        displayBlocksTeamB (blocksTeamB);
        displayTurnoversTeamA (turnoversTeamA);
        displayTurnoversTeamB (turnoversTeamB);
        displayFoulsTeamA(foulsTeamA);
        displayFoulsTeamB(foulsTeamB);
        displayTimeoutsLeftTeamA(timeoutsLeftTeamA);
        displayTimeoutsLeftTeamB(timeoutsLeftTeamB);
    }

    // Resets all counters to zero
    public void resetFouls (View v){
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayFoulsTeamA(foulsTeamA);
        displayFoulsTeamB(foulsTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 points to the team A score.
     */
    public void addThreeForTeamA(View v) {
        displayForTeamA(3);
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 2 points to the team A score.
     */
    public void addTwoForTeamA(View v) {
        displayForTeamA(2);
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 1 point to the team A score.
     */
    public void addOneForTeamA(View v) {
        displayForTeamA(1);
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the fouls for Team A.
     */
    public void displayFoulsTeamA(int foulsTeamA) {
        TextView foulsView = (TextView) findViewById(R.id.team_a_fouls);
        foulsView.setText(String.valueOf(foulsTeamA));
    }

    /**
     * Adds 1 foul to team A total fouls.
     */
    public void addOneFoulTeamA(View v) {
        displayFoulsTeamA(1);
        foulsTeamA = foulsTeamA + 1;
        displayFoulsTeamA(foulsTeamA);
     }


    /**
     * Displays timeouts left for Team A.
     */
    public void displayTimeoutsLeftTeamA(int timeoutsLeftTeamA) {
        TextView timeoutsView = (TextView) findViewById(R.id.team_a_timeouts);
        timeoutsView.setText(String.valueOf(timeoutsLeftTeamA));
    }

    /**
     * Subtracts 1 timeout from team A total timeouts.
     */
    public void displayTimeoutsLeftTeamA(View v) {
        displayTimeoutsLeftTeamA(4);
        timeoutsLeftTeamA = timeoutsLeftTeamA - 1;
        displayTimeoutsLeftTeamA(timeoutsLeftTeamA);
        if(timeoutsLeftTeamA<0){
            timeoutsLeftTeamA=0;
        }
        displayTimeoutsLeftTeamA(timeoutsLeftTeamA);
    }


    /**
     * Displays the blocks for Team A.
     */
    public void displayBlocksTeamA(int blocksTeamA) {
        TextView blocksView = (TextView) findViewById(R.id.team_a_blocks);
        blocksView.setText(String.valueOf(blocksTeamA));
    }
        /**
         * Displays the turnovers for Team A.
         */
    public void displayTurnoversTeamA(int turnoversTeamA) {
        TextView turnoversView = (TextView) findViewById(R.id.team_a_turnovers);
        turnoversView.setText(String.valueOf(turnoversTeamA));
    }

    /**
     * Adds 1 block to team A total blocks.
     */
    public void addOneBlockTeamA(View v) {
        displayBlocksTeamA(1);
        blocksTeamA = blocksTeamA + 1;
        displayBlocksTeamA(blocksTeamA);
    }

    /**
     * Adds 1 turnover to team A total turnovers.
     */
    public void addOneTurnoverTeamA (View v) {
        displayTurnoversTeamA(1);
        turnoversTeamA = turnoversTeamA + 1;
        displayTurnoversTeamA(turnoversTeamA);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 points to the team B score.
     */
    public void addThreeForTeamB(View v) {
        displayForTeamB(3);
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 2 points to the team B score.
     */
    public void addTwoForTeamB(View v) {
        displayForTeamB(2);
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 1 point to the team B score.
     */
    public void addOneForTeamB(View v) {
        displayForTeamB(1);
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the fouls for Team B.
     */
    public void displayFoulsTeamB(int foulsTeamB) {
        TextView foulsView = (TextView) findViewById(R.id.team_b_fouls);
        foulsView.setText(String.valueOf(foulsTeamB));
       }

    /**
     * Adds 1 foul to team B total fouls.
     */
    public void addOneFoulTeamB(View v) {
        displayFoulsTeamB(1);
        foulsTeamB = foulsTeamB + 1;
        displayFoulsTeamB(foulsTeamB);
    }

    /**
     * Displays timeouts left for Team B.
     */
    public void displayTimeoutsLeftTeamB(int timeoutsLeftTeamB) {
        TextView timeoutsView = (TextView) findViewById(R.id.team_b_timeouts);
        timeoutsView.setText(String.valueOf(timeoutsLeftTeamB));
    }

    /**
     * Subtracts 1 timeout from team B total timeouts.
     */
    public void displayTimeoutsLeftTeamB(View v) {
        displayTimeoutsLeftTeamB(4);
        timeoutsLeftTeamB = timeoutsLeftTeamB - 1;
        displayTimeoutsLeftTeamB(timeoutsLeftTeamB);
        if(timeoutsLeftTeamB<0){
            timeoutsLeftTeamB=0;
        }
        displayTimeoutsLeftTeamB(timeoutsLeftTeamB);
    }


    /**
     * Displays the blocks for Team B.
     */
    public void displayBlocksTeamB(int blocksTeamB) {
        TextView blocksView = (TextView) findViewById(R.id.team_b_blocks);
        blocksView.setText(String.valueOf(blocksTeamB));
    }
        /**
         * Displays the turnovers for Team B.
         */
    public void displayTurnoversTeamB (int turnoversTeamB) {
        TextView turnoversView = (TextView) findViewById(R.id.team_b_turnovers);
        turnoversView.setText(String.valueOf(turnoversTeamB));
    }


    /**
     * Adds 1 block to team B total blocks.
     */
    public void addOneBlockTeamB(View v) {
        displayBlocksTeamB(1);
        blocksTeamB = blocksTeamB + 1;
        displayBlocksTeamB(blocksTeamB);
    }

    /**
     * Adds 1 turnover to team B total turnovers.
     */
    public void addTurnoverTeamB(View v) {
        displayTurnoversTeamB(1);
        turnoversTeamB = turnoversTeamB + 1;
        displayTurnoversTeamB(turnoversTeamB);
    }

}
