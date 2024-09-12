package com.example.demo.controller;


import javafx.scene.control.TextField;

import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class GameController extends Stage {
    private HBox hBox;
    private String[] secretWord;

    public void setSecretWord(String[] secretWord){
        this.secretWord = secretWord;
    }

    public void createTextFields(){

    }

    private void handleTextField(TextField txt, int position){
        txt.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                System.out.println("Posición del textfield en el arreglo es: " + position);
            }
        });
    }

}
