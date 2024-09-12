package com.example.demo.view;

import com.example.demo.controller.GameController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class GameStage extends Stage {

    private GameController gameController;
    public GameStage() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo/game-view.fxml"));
        Parent root = loader.load();
        gameController = loader.getController();
        Scene scene = new Scene(root);
        setScene(scene);
        setTitle("Sol eclipsado");
        getIcons().add(new Image(String.valueOf(getClass().getResource("/com/example/demo/favicon.png"))));
        setResizable(false);
        show();
    }

    public GameController getGameController(){
        return gameController;
    }

    // Singlenton Pattern
    private static class GameStageHolder{
        private static GameStage INSTANCE;
    }

    public static GameStage getInstance() throws IOException{
        GameStageHolder.INSTANCE = GameStageHolder.INSTANCE != null ?
                GameStageHolder.INSTANCE : new GameStage();
        return GameStageHolder.INSTANCE;
    }


}
