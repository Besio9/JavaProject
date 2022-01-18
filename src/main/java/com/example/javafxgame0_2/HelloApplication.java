package com.example.javafxgame0_2;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        stage.setTitle("Awesome Game");
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}