package com.example.android.countcounter3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamAFouls = 0;
    int teamAYellowCards = 0;
    int teamARedCards = 0;
    int teamBScore = 0;
    int teamBFouls = 0;
    int teamBYellowCards = 0;
    int teamBRedCards = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamBScorePlus(View view) {
        teamBScore++;
        TextView text = findViewById(R.id.team_b_score);
        display(text, teamBScore);
    }

    public void teamBFoulsPlus(View view) {
        teamBFouls++;
        TextView text = findViewById(R.id.team_b_fouls);
        display(text, teamBFouls);
    }

    public void teamBYellowCardsPlus(View view) {
        teamBYellowCards++;
        TextView text = findViewById(R.id.team_b_yellow_cards);
        display(text, teamBYellowCards);
    }

    public void teamBRedCardsPlus(View view) {
        teamBRedCards++;
        TextView text = findViewById(R.id.team_b_red_cards);
        display(text, teamBRedCards);
    }

    public void teamAScorePlus(View view) {
        teamAScore++;
        TextView text = findViewById(R.id.team_a_score);
        display(text, teamAScore);
    }

    public void teamAFoulsPlus(View view) {
        teamAFouls++;
        TextView text = findViewById(R.id.team_a_fouls);
        display(text, teamAFouls);
    }

    public void teamARedCardsPlus(View view) {
        teamARedCards++;
        TextView text = findViewById(R.id.team_a_red_cards);
        display(text, teamARedCards);
    }

    public void teamAYellowCardsPlus(View view) {
        teamAYellowCards++;
        TextView text = findViewById(R.id.team_a_yellow_cards);
        display(text, teamAYellowCards);
    }

    public void Reset(View view) {
        teamAScore = 0;
        teamAFouls = 0;
        teamAYellowCards = 0;
        teamARedCards = 0;
        teamBScore = 0;
        teamBFouls = 0;
        teamBYellowCards = 0;
        teamBRedCards = 0;
        TextView text = findViewById(R.id.team_a_yellow_cards);
        TextView text1 = findViewById(R.id.team_b_yellow_cards);
        TextView text2 = findViewById(R.id.team_a_fouls);
        TextView text3 = findViewById(R.id.team_b_fouls);
        TextView text4 = findViewById(R.id.team_b_score);
        TextView text5 = findViewById(R.id.team_a_score);
        TextView text6 = findViewById(R.id.team_a_red_cards);
        TextView text7 = findViewById(R.id.team_b_red_cards);
        display(text, 0);
        display(text1, 0);
        display(text2, 0);
        display(text3, 0);
        display(text4, 0);
        display(text5, 0);
        display(text6, 0);
        display(text7, 0);


    }

    public void display(TextView text, int number) {
        text.setText(Integer.toString(number));
    }
}