package com.example.demo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
//import javafx.scene.input.mouseEvent;

public class plungrController {

    @FXML
    private TextField cleTemp;

    @FXML
    private Label cleTempL;

    @FXML
    private TextField cleCoeff;

    @FXML
    private Label cleLengthL;

    @FXML
    private Label cleTitle;

    @FXML
    private TextField cleLength;

    @FXML
    private TextField cleResult;

    @FXML
    private Button cleCalculate;



    @FXML
    void calcCLE(ActionEvent event){
            boolean tempfilled = validateField(cleTemp);
            boolean coeffFilled = validateField(cleCoeff);
            boolean lengthFilled = validateField(cleLength);
            if (tempfilled && coeffFilled && lengthFilled){
                cleResult.setDisable(false);
                cleResult.setText(Double.toString(Double.parseDouble(cleCoeff.getText()) * Double.parseDouble(cleTemp.getText()) * Double.parseDouble(cleLength.getText())));
            } else {
                cleResult.setText("");
                cleResult.setDisable(true);
            }

    }

    public static boolean validateField(TextField fd){
        BackgroundFill red_ = new BackgroundFill(Color.ROSYBROWN, CornerRadii.EMPTY , Insets.EMPTY);
        Background bgRed = new Background(red_);
        BackgroundFill wh_ = new BackgroundFill(Color.WHITE, CornerRadii.EMPTY , Insets.EMPTY);
        Background bgWh = new Background(wh_);
        try{
            double asD = Double.parseDouble(fd.getText());
            fd.setBackground(bgWh);
            return true;
        } catch(Exception e){
            fd.setBackground(bgRed);
            return false;
        }
    }
}