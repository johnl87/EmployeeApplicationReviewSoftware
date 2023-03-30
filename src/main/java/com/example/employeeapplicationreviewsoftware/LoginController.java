package com.example.employeeapplicationreviewsoftware;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    TextField emailBox;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event) throws IOException {
        //gets the user email from login page and stores into string email variable
        String email = emailBox.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("AfterLogin.fxml"));
        root = loader.load();

        //creating AfterLogin object where we can access the method to send the text inside email box to display username.
        AfterLoginController afterLogin = loader.getController();
        afterLogin.displayUsername(email);


        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

    }

}
