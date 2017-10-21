package com.core.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable{

    @FXML
    private ImageView imageViewFromInternet;
    @FXML
    private ImageView imageViewNewTournament;
    @FXML
    private ImageView imageviewConnectToTournament;

    public MainController(){

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

            /*Stage stage = null;
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getClassLoader().getResource("competition.fxml"));
                stage = (Stage) imageViewFromInternet.getScene().getWindow();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();*/

            Competition competition = new Competition((Stage)imageViewFromInternet.getScene().getWindow());

        });
    }
}
