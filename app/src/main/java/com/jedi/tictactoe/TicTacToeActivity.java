package com.jedi.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TicTacToeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
    }

    private int getMaxScore(){
        return 0;
    }
}
