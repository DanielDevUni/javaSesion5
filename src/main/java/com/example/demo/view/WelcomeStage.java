package com.example.demo.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeStage extends Stage {
    public WelcomeStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo/welcome-view.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        setScene(scene);
        setTitle("Sol eclipsado");
        getIcons().add(new Image(String.valueOf(getClass().getResource("/com/example/demo/favicon.png"))));
        setResizable(false);
        show();
    }

    // Singlenton Pattern
    private static class WelcomeStageHolder{
        private static WelcomeStage INSTANCE;
    }

    public static WelcomeStage getInstance() throws IOException{
        WelcomeStageHolder.INSTANCE = WelcomeStageHolder.INSTANCE != null ?
                WelcomeStageHolder.INSTANCE : new WelcomeStage();
        return WelcomeStageHolder.INSTANCE;
    }


}