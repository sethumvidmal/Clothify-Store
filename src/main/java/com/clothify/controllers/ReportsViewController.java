/**
 * Sample Skeleton for 'reports-view.fxml' Controller Class
 */

package com.clothify.controllers;

import com.clothify.Main;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ReportsViewController {

    @FXML // fx:id="btnEmployee"
    private JFXButton btnEmployee; // Value injected by FXMLLoader

    @FXML // fx:id="btnHome"
    private JFXButton btnHome; // Value injected by FXMLLoader

    @FXML // fx:id="btnInventory"
    private JFXButton btnInventory; // Value injected by FXMLLoader

    @FXML // fx:id="btnItem"
    private JFXButton btnItem; // Value injected by FXMLLoader

    @FXML // fx:id="btnOrder"
    private JFXButton btnOrder; // Value injected by FXMLLoader

    @FXML // fx:id="btnReports"
    private JFXButton btnReports; // Value injected by FXMLLoader

    @FXML // fx:id="btnSales"
    private JFXButton btnSales; // Value injected by FXMLLoader

    @FXML // fx:id="btnSupplier"
    private JFXButton btnSupplier; // Value injected by FXMLLoader

    @FXML
    void btnEmployeeOnAction(ActionEvent event) {

    }

    @FXML
    void btnHomeOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/dash-board-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnInventoryOnAction(ActionEvent event) {

    }

    @FXML
    void btnItemOnAction(ActionEvent event) {

    }

    @FXML
    void btnOrderOnAction(ActionEvent event) {

    }

    @FXML
    void btnReports(ActionEvent event) {

    }

    @FXML
    void btnSalesOnAction(ActionEvent event) {

    }

    @FXML
    void btnSupplierOnAction(ActionEvent event) {

    }

}
