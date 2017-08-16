package com.core.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private ImageView imageViewFromInternet;
    @FXML
    private ImageView imageViewNewTournament;
    @FXML
    private ImageView imageviewConnectToTournament;

    public Controller(){

    }

    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            imageViewFromInternet.setImage(new Image(getClass().getClassLoader().getResource("multimedia/images/server-ico.png").toURI().toString()));
            imageViewNewTournament.setImage(new Image(getClass().getClassLoader().getResource("multimedia/images/files-ico.png").toURI().toString()));
            imageviewConnectToTournament.setImage(new Image(getClass().getClassLoader().getResource("multimedia/images/computer-ico.png").toURI().toString()));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        imageViewFromInternet.setOnMouseClicked(event -> {

        });
    }
}
