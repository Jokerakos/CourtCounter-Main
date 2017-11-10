package com.example.admin.courtcounter;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int team_a_score = 20;
    int team_b_score = 20;
    int team_a_token = 0;
    int team_a_mana = 0;
    int team_b_token = 0;
    int team_b_mana = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(20);
        displayForTeamB(20);
        displayForTeamAMana(0);
        displayForTeamBMana(0);
        displayForTeamAToken(0);
        displayForTeamBToken(0);

    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamAMana(int mana) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_mana);
        scoreView.setText(String.valueOf(mana));
    }
    public void displayForTeamBMana(int mana) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_mana);
        scoreView.setText(String.valueOf(mana));
    }
    public void displayForTeamAToken(int token) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_token);
        scoreView.setText(String.valueOf(token));
    }
    public void displayForTeamBToken(int token) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_token);
        scoreView.setText(String.valueOf(token));
    }

    public void loseLifeA(View view) {
        team_a_score = team_a_score - 1;
        displayForTeamA(team_a_score);
        TextView aliveA = (TextView) findViewById(R.id.aliveA);
        TextView aliveB = (TextView) findViewById(R.id.aliveB);
        if(team_a_score == 0) {
            aliveA.setTextColor(Color.RED);
            aliveB.setTextColor(Color.GREEN);
            aliveA.setText("Loser");
            aliveB.setText("Winner");
        }
    }

    public void gainLifeA(View view) {
        team_a_score = team_a_score + 1;
        displayForTeamA(team_a_score);
    }
    public void minusManaA(View view) {
        team_a_mana = team_a_mana - 1;
        displayForTeamAMana(team_a_mana);
    }
    public void plusManaA(View view) {
        team_a_mana = team_a_mana + 1;
        displayForTeamAMana(team_a_mana);
    }
    public void minusTokenA(View view) {
        team_a_token = team_a_token - 1;
        displayForTeamAToken(team_a_token);
    }
    public void plusTokenA(View view) {
        team_a_token = team_a_token + 1;
        displayForTeamAToken(team_a_token);
    }

    public void loseLifeB(View view) {
        team_b_score = team_b_score - 1;
        displayForTeamB(team_b_score);
        TextView aliveA = (TextView) findViewById(R.id.aliveA);
        TextView aliveB = (TextView) findViewById(R.id.aliveB);
        if(team_b_score == 0) {
            aliveB.setTextColor(Color.RED);
            aliveA.setTextColor(Color.GREEN);
            aliveB.setText("Loser");
            aliveA.setText("Winner");
        }
    }

    public void gainLifeB(View view) {
        team_b_score = team_b_score + 1;
        displayForTeamB(team_b_score);
    }
    public void minusManaB(View view) {
        team_b_mana = team_b_mana - 1;
        displayForTeamBMana(team_b_mana);
    }
    public void plusManaB(View view) {
        team_b_mana = team_b_mana + 1;
        displayForTeamBMana(team_b_mana);
    }
    public void minusTokenB(View view) {
        team_b_token = team_b_token - 1;
        displayForTeamBToken(team_b_token);
    }
    public void plusTokenB(View view) {
        team_b_token = team_b_token + 1;
        displayForTeamBToken(team_b_token);
    }


    public void reset(View view) {
        TextView aliveA = (TextView) findViewById(R.id.aliveA);
        TextView aliveB = (TextView) findViewById(R.id.aliveB);
        aliveB.setTextColor(Color.WHITE);
        aliveA.setTextColor(Color.WHITE);
        aliveB.setText("Alive");
        aliveA.setText("Alive");
        team_b_score = 20;
        team_a_score = 20;
        team_a_token = 0;
        team_a_mana = 0;
        team_b_mana = 0;
        team_b_token = 0;
        displayForTeamB(team_b_score);
        displayForTeamA(team_a_score);
        displayForTeamBMana(team_b_mana);
        displayForTeamAMana(team_a_mana);
        displayForTeamBToken(team_b_token);
        displayForTeamAToken(team_a_token);
    }

}
