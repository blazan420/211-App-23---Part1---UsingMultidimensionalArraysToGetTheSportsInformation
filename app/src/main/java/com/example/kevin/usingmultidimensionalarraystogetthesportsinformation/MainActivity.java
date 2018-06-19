package com.example.kevin.usingmultidimensionalarraystogetthesportsinformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtGameName = (TextView) findViewById(R.id.txtGameName);
        TextView txtGameScores = (TextView) findViewById(R.id.txtGameScores);
        TextView txtGameLowestScore = (TextView) findViewById(R.id.txtGameLowestScore);
        TextView txtGameHighestScore = (TextView) findViewById(R.id.txtGameHighestScore);
        TextView txtGameAverageValueOfScores = (TextView) findViewById(R.id.txtGameAverageValueOfScores);

        int[][] gameScoresArray = { {45, 67, 34},
                {23, 56, 49},
                {23, 69, 88},
                {23, 28, 84},
                {17, 28, 84},
                {38, 54, 75},
                {51, 34, 71},
                {15, 83, 46},
                {36, 47, 15},
                {83, 94, 34},
                {17, 37, 0} };

        Game myGame = new Game("God Of War", gameScoresArray);
        txtGameName.setText(myGame.getGameName());
        myGame.letsOutPutTheScoresToTheScreen(txtGameScores);
        txtGameHighestScore.setText(myGame.getMaximumScore() + "");
        txtGameLowestScore.setText(myGame.getMinimumScore() + "");


        String oldTxtGameAverageValueOfSCores;

        for (int gameIndex = 0; gameIndex < gameScoresArray.length; gameIndex++) {
            oldTxtGameAverageValueOfSCores = txtGameAverageValueOfScores.getText().toString() +
                    gameIndex + "- ";

            double averageValue = myGame.getTheAverageValueOfScore(gameScoresArray[gameIndex]);
            txtGameAverageValueOfScores.setText(oldTxtGameAverageValueOfSCores +
            averageValue + "\n");
        }






    }
}
