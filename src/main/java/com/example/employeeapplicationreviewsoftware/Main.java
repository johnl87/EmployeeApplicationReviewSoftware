package com.example.employeeapplicationreviewsoftware;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        //the file is found under resources to edit in scene builder
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login.fxml"));
        //v is width, v1 is height
        Scene scene = new Scene(fxmlLoader.load(), 620, 240);
        stage.setTitle("Employee Application Review System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}