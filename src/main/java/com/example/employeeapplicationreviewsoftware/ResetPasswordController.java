package com.example.employeeapplicationreviewsoftware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ResetPasswordController {

    @FXML
    Button resetBtn;
    @FXML
    TextArea resetText;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void goBack(ActionEvent event) throws IOException{
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Login.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 282, 482);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onResetButtonClick(ActionEvent event) throws IOException{
        resetText.setText("Password has been reset." + "\n"
                +  "Check your email for more details." + "\n"
                + "Click back to return to login");

    }


}
