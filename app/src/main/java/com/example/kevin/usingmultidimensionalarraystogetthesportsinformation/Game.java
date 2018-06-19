package com.example.kevin.usingmultidimensionalarraystogetthesportsinformation;

import android.widget.TextView;

public class Game {

    private String gameName;
    private int[][] scores;

    public Game(String gameName, int[][] scores) {

        this.gameName = gameName;
        this.scores = scores;


    }

    public  void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameName() {
        return gameName;
    }

    public int getMinimumScore() {

        int lowestScore = scores[0][0]; // Assume this value is the Smallest Score Value
        for (int[] gameScores : scores) {
            for (int score : gameScores) {
                if (score < lowestScore) {
                    lowestScore = score;
                }
            }
        }
        return lowestScore;
    }

    public int getMaximumScore() {

        int highestScore = scores[0][0]; // Assume this value us the Highest Score Value

        for (int[] gameScores : scores) {
            for (int score : gameScores) {
                if (score > highestScore) {
                    highestScore = score;
                }
            }

        }
        return  highestScore;
    }

    public double getTheAverageValueOfScore(int[] scores) {

        int total = 0;

        //Sum Scores for the game
        for (int score : scores) {
            total += score;
            total = total + score;
        }
        return (double) total / scores.length;
    }

    public void letsOutPutTheScoresToTheScreen(TextView textView) {

        String oldTextViewValue;

        for (int gameIndex = 0; gameIndex < scores.length; gameIndex++) {

            for (int gameScore : scores[gameIndex]) {

                oldTextViewValue = textView.getText().toString();

                textView.setText(String.format(oldTextViewValue + "Game Number %2d: %3d\n\n\n", (gameIndex + 1), gameScore));

            }
        }
    }

}
