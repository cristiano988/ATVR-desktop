package com.core.controllers;

import com.handlers.SettingsMenu;
import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class Settings implements Initializable{

    @FXML
    private TreeView<String> treeView;
    @FXML
    private Pane paneContent;

    public Settings(){

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            buildMenuSettings();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private void buildMenuSettings() throws URISyntaxException {
        /** Root Element */
        Node config = new ImageView(getClass().getClassLoader().getResource("multimedia/images/tkd/tkd-config.png").toURI().toString());
        TreeItem<String> root = new TreeItem<>("Configurations",config);

        /** Tournament Configurations */
        Node tatami = new ImageView(getClass().getClassLoader().getResource("multimedia/images/tkd/tkd-tatami.png").toURI().toString());
        TreeItem<String> tournament = new TreeItem<>("Tournament", tatami);
        /** Kyorugui Configurations */
        Node ky = new ImageView(getClass().getClassLoader().getResource("multimedia/images/tkd/tkd-ky.png").toURI().toString());
        TreeItem<String> kyorugui = new TreeItem<>("Kyorugui",ky);
        /** Poomsae Configurations */
        Node poom = new ImageView(getClass().getClassLoader().getResource("multimedia/images/tkd/tkd-po.png").toURI().toString());
        TreeItem<String> poomsae = new TreeItem<>("Poomsae",poom);

        tournament.getChildren().addAll(kyorugui,poomsae);
        tournament.setExpanded(true);

        /** Devices Configurations */
        Node device = new ImageView(getClass().getClassLoader().getResource("multimedia/images/tkd/tkd-devices.png").toURI().toString());
        TreeItem<String> devices = new TreeItem<>("Devices",device);

        /** Synchronization  */
        Node sync = new ImageView(getClass().getClassLoader().getResource("multimedia/images/tkd/tkd-network.png").toURI().toString());
        TreeItem<String> synchronization = new TreeItem<>("Synchronization",sync);
        /** Device Configuration */
        Node deviceConf = new ImageView(getClass().getClassLoader().getResource("multimedia/images/tkd/tkd-conf-dev.png").toURI().toString());
        TreeItem<String> deviceConfiguration = new TreeItem<>("Configuration",deviceConf);

        devices.getChildren().addAll(synchronization,deviceConfiguration);
        devices.setExpanded(true);

        root.getChildren().addAll(tournament, devices);

        treeView.setRoot(root);
        root.setExpanded(true);

        treeView.getSelectionModel().selectedItemProperty().addListener(treeHandler);
    }

    private void populateData(String name){

        URL path = getClass().getClassLoader().getResource(name);
        if(path == null)return;
        try {
            Parent rooter = FXMLLoader.load(path);
            paneContent.getChildren().clear();
            paneContent.getChildren().add(rooter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ChangeListener<TreeItem<String>> treeHandler = (observableValue, stringTreeItem, t1) -> {
        if(t1.getValue() != null)
            handleButton(t1.getValue());
    };

    private void handleButton(String button)
    {
        SettingsMenu menuClicked = SettingsMenu.getForValue(button);
        if(menuClicked != null && menuClicked.getMenuName() != null)
            populateData(menuClicked.getMenuName());
    }
}
