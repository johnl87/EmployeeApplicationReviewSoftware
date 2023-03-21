package com.example.employeeapplicationreviewsoftware;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BackEndController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX19 Application!");
    }
}