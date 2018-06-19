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

}
