package com.example.demo;
/*
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control. PasswordField;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Controller {
    @FXML
    private Button cancelButton;
    @FXML
    private Label LoginMessageLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordPasswordField;

    public void loginButtonOnAction(ActionEvent e) {
        if (!usernameTextField.getText().isBlank() && !passwordPasswordField.getText().isBlank()) {
            //LoginMessageLabel.setText("You try to login!");
        } else {
            LoginMessageLabel.setText("Please enter username and password.");
        }
    }

    public void cancelButtonOnAction(ActionEvent e) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void validateLogin() throws SQLException {
        DataBaseconection connectNow = new DataBaseconection();
        Connection connectDB = connectNow.getConnection();
        String verifyLogin = "SELECT count (1) FROM UserAccounts WHERE username = '" + usernameTextField.getText() + "'AND password='" + passwordPasswordField.getText() + "'";
        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);
            while (queryResult.next()) {
                if (queryResult.getInt(1) ==1)
                    LoginMessageLabel.setText("Welcome!");
                else
                    LoginMessageLabel.setText("Invalid Login. Please try again.");
            }
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}
*/ import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Controller
{

    @FXML
    private Button cancelButton;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordPasswordField;
    public void cancelButtonOnAction(ActionEvent e) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private Button LoginButton;

    @FXML

    private Label LoginMessageLabel;

    public void LoginButtonOnAction(ActionEvent e ){

        if(!usernameTextField.getText().isBlank() && !passwordPasswordField.getText().isBlank()){
            //loginMessageField.setText("Tentando fazer Login");
            validadeLogin();
        } else {
            LoginMessageLabel.setText("Your user name and Password");}

    }

    public void validadeLogin(){

        DataBaseconection connectNow = new DataBaseconection();
        Connection  connectDB = connectNow.getConnection();

        String verifyLogin = "SELECT count(1) FROM UserAccounts WHERE username = '" + usernameTextField.getText() + "' AND password = '" + passwordPasswordField.getText() + "'";

        try {

            Statement statement = connectDB.createStatement();
            ResultSet  queryResult = statement.executeQuery(verifyLogin);

            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    LoginMessageLabel.setText("Bem Vindo");


                } else {
                    LoginMessageLabel.setText("Inválido! Tente Novamente");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();

        }

    }

}