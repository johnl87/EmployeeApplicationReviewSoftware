package com.example.employeeapplicationreviewsoftware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


import java.io.IOException;

public class BackEndController {
    @FXML
    private Label welcomeText;
    private Stage stage;
    private Parent root_reset;
    private Scene scene;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX19 Application!");
    }

    @FXML
    public void switchToResetScene(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ResetPassword.fxml"));
        root_reset = fxmlLoader.load(getClass().getResource("ResetPassword.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Reset Password");
        stage.setScene(new Scene(root_reset, 500, 500));
        stage.show();

    }
}