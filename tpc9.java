package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.StageStyle;

import java.util.Objects;


public class tpc9 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
    primaryStage.initStyle(StageStyle.UNDECORATED);
    primaryStage.setScene(new Scene(root, 520, 400));
    primaryStage.show();
    }
}
