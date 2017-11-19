package com.core.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class FightController implements Initializable{

    @FXML private SplitPane splitPane;
    @FXML private BorderPane redBorderPane;
    @FXML private BorderPane blueBorderPane;

    public FightController(){

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        redBorderPane.getStylesheets().add(getClass().getClassLoader().getResource("style/fight.css").toString());
        blueBorderPane.getStylesheets().add(getClass().getClassLoader().getResource("style/fight.css").toString());
    }
}
