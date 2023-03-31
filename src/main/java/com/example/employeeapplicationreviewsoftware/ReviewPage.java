package com.example.employeeapplicationreviewsoftware;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ReviewPage{
    private Stage stage;
    private Scene scene;
    private Parent root;

    private String applicant;
    public String getApplicant() {
        return applicant;
    }
    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }
    @FXML
    private Button backButton;

    @FXML
    void backAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AfterLogin.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 282, 482);
        stage.setScene(scene);
        stage.show();
    }

}
