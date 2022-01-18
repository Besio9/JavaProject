package com.example.javafxgame0_2;

import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.io.*;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

// Menu Controller
public class HelloController implements Initializable {

    private Stage stage;

    @FXML
    private Button PlayButton;
    @FXML
    public void switchToGame(MouseEvent event) throws IOException {
        Stage stage = (Stage) PlayButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setScene(new Scene(root));

    }
    @FXML
    private Button SubmitButton;
    @FXML
    public void switchToSubmitScene(MouseEvent event) throws IOException {
        Stage stage = (Stage) SubmitButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Submit.fxml"));
        stage.setScene(new Scene(root));
    }
    @FXML
    private Button listButton;
    @FXML
    public void switchToList(MouseEvent event) throws IOException {
        Stage stage = (Stage) listButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Game1.fxml"));
        stage.setScene(new Scene(root));
    }

    //@FXML
    //private Button exitButton;
    @FXML
    private AnchorPane scenePane;

    public void exit(ActionEvent event){
        stage =(Stage) scenePane.getScene().getWindow();
        System.out.println("Exitted");
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}