package com.core.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class Competition implements Initializable {

    @FXML private ImageView imageViewKy;
    @FXML private ImageView imageViewPo;
    @FXML private StackPane kyStackPane;
    @FXML private StackPane PoStackPane;


    public Competition(){

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            imageViewKy.setImage(new Image(getClass().getClassLoader().getResource("multimedia/images/tkd/tkd-k.png").toURI().toString()));
            imageViewPo.setImage(new Image(getClass().getClassLoader().getResource("multimedia/images/tkd/tkd-p.png").toURI().toString()));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        kyStackPane.getStylesheets().add(getClass().getClassLoader().getResource("style/base.css").toString());
        PoStackPane.getStylesheets().add(getClass().getClassLoader().getResource("style/base.css").toString());
    }
}
