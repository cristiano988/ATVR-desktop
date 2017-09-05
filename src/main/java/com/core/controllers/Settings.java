package com.core.controllers;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.Pane;

import java.io.IOException;
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
        populateData();
    }

    private void populateData(){

        TreeItem<String> root = new TreeItem();

        TreeItem<String> item1 = new TreeItem<>("Item1");
        TreeItem<String> subItem1 = new TreeItem<>("Subitem tree1");
        TreeItem<String> subItem2 = new TreeItem<>("Subitem tree2");
        TreeItem<String> subItem3 = new TreeItem<>("Subitem tree3");
        item1.getChildren().addAll(subItem1,subItem2,subItem3);

        TreeItem<String> item2 = new TreeItem<>("Subitem tree2");
        TreeItem<String> subtem3 = new TreeItem<>("Subitem tree3");
        TreeItem<String> subItem4 = new TreeItem<>("Subitem tree8");
        TreeItem<String> subItem5 = new TreeItem<>("Subitem tree150");
        item2.getChildren().setAll(subItem3,subItem4,subItem5);

        TreeItem<String> item3 = new TreeItem<>("Subitem tree3");
        TreeItem<String> subItem6 = new TreeItem<>("Subitem trsfsdfee1");
        TreeItem<String> subItem7 = new TreeItem<>("Subite1");
        TreeItem<String> subItem8 = new TreeItem<>("Subitsdsfsdfem tree1");
        item3.getChildren().setAll(subItem6,subItem7,subItem8);

        root.getChildren().setAll(item1,item2,item3);
        root.setExpanded(true);

        treeView.setRoot(root);

        treeView.getSelectionModel().selectedItemProperty().addListener(

                new ChangeListener<TreeItem<String>>() {
                    @Override
                    public void changed(ObservableValue<? extends TreeItem<String>> observableValue,
                                        TreeItem<String> stringTreeItem, TreeItem<String> t1)
                    {

                    }
                }
        );

        try {
            Parent rooter = FXMLLoader.load(getClass().getClassLoader().getResource("kyorugui_configuration.fxml"));
            paneContent.getChildren().add(rooter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
