package com.example.javafxgame0_2;

import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.PopupWindow;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

// Game Controller
public class HelloControllerGame2 implements Initializable{

    @FXML
    private Button MenuButton;

    public HelloControllerGame2() throws FileNotFoundException {
    }

    @FXML
    public void switchToSceneMenu(MouseEvent event) throws IOException {
        Stage stage = (Stage) MenuButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        stage.setScene(new Scene(root));

    }
    @FXML
    private Label myTextArea;
    @FXML
    private ListView myListView;

    File file = new File("D://Studia//JavaProcjets//JavaFXGame0_2//src//main//java//com//example//javafxgame0_2//Data.txt");
    Scanner scan = new Scanner(file);
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        while(scan.hasNextLine()){
            myListView.getItems().addAll(scan.nextLine());
        }
    }
}
