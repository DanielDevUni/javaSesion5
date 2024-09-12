package com.example.demo.model;

public class Game {
    private String[] secretWord;

    public Game(String secretWord){
        this.secretWord = secretWord.trim().split("");
    }

    public String[] getSecretWord(){
        return secretWord;
    }

    public void setSecretWord(String[] secretWord){
        this.secretWord = secretWord;
    }

}
