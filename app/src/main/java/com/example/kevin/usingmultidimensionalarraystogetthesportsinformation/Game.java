package com.example.kevin.usingmultidimensionalarraystogetthesportsinformation;

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

}
