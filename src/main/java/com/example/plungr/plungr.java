package com.example.plungr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class plungr extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(plungr.class.getResource("plungr_main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 400);
        scene.getStylesheets().add("plungrSS.css");
        stage.getIcons().add(new Image(plungr.class.getResourceAsStream("icon.png")));
        stage.setTitle("Plungr - Plumbing Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}