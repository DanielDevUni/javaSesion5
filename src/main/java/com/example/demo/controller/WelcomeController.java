package com.example.demo.controller;

import com.example.demo.model.Game;
import com.example.demo.view.GameStage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class WelcomeController {

    @FXML
    private TextField secretWordTextfield;
    @FXML
    private HBox hBox;

    @FXML
    void handlePlay(ActionEvent event) throws IOException {
        Game game = new Game(secretWordTextfield.getText());
        secretWordTextfield.setText("");
        GameStage.getInstance().getGameController().setSecretWord(game.getSecretWord());

        /*for (int i = 0; i < game.getSecretWord().length; i++){
            TextField txt = new TextField();
            hBox.getChildren().add(txt);
            handleTextField(txt,i);
        }*/
    }

    /*private void handleTextField(TextField txt, int position){
        txt.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                System.out.println("Posición del textfield en el arreglo es: " + position);
            }
        });
    }*/
}
