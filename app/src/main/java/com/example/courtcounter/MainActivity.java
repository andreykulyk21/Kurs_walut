package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void displayForTeamA(float score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void displayForTeamB(float score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }





    float quantity = 0;
    float quantityB = 0;

    public void plusTry(View view) {
        quantity = quantity + 1;
        displayForTeamA(quantity);
    }


    public void plusDwa(View view) {
        quantity = quantity + 10;
        displayForTeamA(quantity);
    }

    public void plusOdyn(View view) {
        quantity = quantity + 100;
        displayForTeamA(quantity);
    }

    public void reset(View view) {
        quantity = 0;
        quantityB = quantity;
        displayForTeamA(quantity);
        displayForTeamB(quantityB);
    }




    public void plusTryB(View view) {
        quantityB = quantity / 4;
        displayForTeamB(quantityB);
    }

    public void plusDwaB(View view) {
        quantityB = quantity / 5;
        displayForTeamB(quantityB);
    }

    public void plusOdynB(View view) {
        quantityB = quantity * 7;
        displayForTeamB(quantityB);
    }



}
