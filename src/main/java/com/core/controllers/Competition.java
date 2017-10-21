package com.core.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class Competition implements Initializable {

    @FXML private ImageView imageViewKy;
    @FXML private ImageView imageViewPo;
    @FXML private StackPane kyStackPane;
    @FXML private StackPane PoStackPane;
    @FXML private MenuItem configurationBtn;

    private Stage stage = null;

    public Competition(){

    }

    public Competition(Stage stage){
        this.stage = stage;
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("competition.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage.setScene(new Scene(root));
        stage.setMaximized(true);
        stage.show();
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

        configurationBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("ok");
            }
        });

    }

}
