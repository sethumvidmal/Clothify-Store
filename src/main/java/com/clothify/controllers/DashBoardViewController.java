/**
 * Sample Skeleton for 'dash-board-view.fxml' Controller Class
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

public class DashBoardViewController {

    @FXML // fx:id="btnEmployees"
    private JFXButton btnEmployees; // Value injected by FXMLLoader

    @FXML // fx:id="btnItem"
    private JFXButton btnItem; // Value injected by FXMLLoader

    @FXML // fx:id="btnLogout"
    private JFXButton btnLogout; // Value injected by FXMLLoader

    @FXML // fx:id="btnOrderDetails"
    private JFXButton btnOrderDetails; // Value injected by FXMLLoader

    @FXML // fx:id="btnSalesReport"
    private JFXButton btnSalesReport; // Value injected by FXMLLoader

    @FXML // fx:id="btnSalesReturn"
    private JFXButton btnSalesReturn; // Value injected by FXMLLoader

    @FXML // fx:id="btnSupplies"
    private JFXButton btnSupplies; // Value injected by FXMLLoader

    @FXML
    void btnEmployeesOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/employee-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnItemOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/inventory-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnOrderDetailsOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/order-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnSalesReportsOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/reports-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnSalesReturnOnAction(ActionEvent event) {

    }

    @FXML
    void btnSuppliesOnAction(ActionEvent event) {

    }

}
