package com.core.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    @FXML private Button poBtnConf;
    @FXML private Button btnConfKy;
    @FXML private Button btnAddTeamK;
    @FXML private Button btnAddTeamP;
    @FXML private Button btnAddCategoryP;
    @FXML private Button btnAddCategoryK;
    @FXML private Button poBtnStart;
    @FXML private  Button kyBtnStart;

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

        btnConfKy.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                loadSettings();
            }
        });

        poBtnConf.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                loadSettings();
            }
        });

        configurationBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                loadSettings();
            }
        });

        btnAddTeamK.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                addTeam();
            }
        });

        btnAddTeamP.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                addTeam();
            }
        });

        btnAddCategoryP.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("kjbkjb kja");
            }
        });

        btnAddCategoryK.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("kjbkjb kja");
            }
        });

        poBtnStart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                addTeam();
            }
        });

        kyBtnStart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fight();
            }
        });

    }

    private void loadSettings(){
        Stage stage = new Stage();
        Parent settings = null;
        try {
            settings = FXMLLoader.load(getClass().getClassLoader().getResource("settings.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setScene(new Scene(settings,800,600));
        stage.setAlwaysOnTop(true);
        stage.show();
    }

    private void addTeam(){
        Stage stage = new Stage();
        Parent addTeam = null;
        try {
            addTeam = FXMLLoader.load(getClass().getClassLoader().getResource("add_team.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setScene(new Scene(addTeam,800,600));
        stage.setAlwaysOnTop(true);
        stage.show();
    }

    private void fight(){
        Stage stage = new Stage();
        Parent addTeam = null;
        try {
            addTeam = FXMLLoader.load(getClass().getClassLoader().getResource("fight.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setScene(new Scene(addTeam,800,600));
        stage.setAlwaysOnTop(true);
        stage.show();
    }

}
