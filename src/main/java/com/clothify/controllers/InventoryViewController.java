/**
 * Sample Skeleton for 'inventory-view.fxml' Controller Class
 */

package com.clothify.controllers;

import com.clothify.Main;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TreeTableColumn;
import javafx.stage.Stage;

import java.io.IOException;

public class InventoryViewController {

    @FXML // fx:id="btnAddToStock"
    private JFXButton btnAddToStock; // Value injected by FXMLLoader

    @FXML // fx:id="btnClear"
    private JFXButton btnClear; // Value injected by FXMLLoader

    @FXML // fx:id="btnHome"
    private JFXButton btnHome; // Value injected by FXMLLoader

    @FXML // fx:id="btnItem"
    private JFXButton btnItem; // Value injected by FXMLLoader

    @FXML // fx:id="btnOrder"
    private JFXButton btnOrder; // Value injected by FXMLLoader

    @FXML // fx:id="btnPrint"
    private JFXButton btnPrint; // Value injected by FXMLLoader

    @FXML // fx:id="btnReports"
    private JFXButton btnReports; // Value injected by FXMLLoader

    @FXML // fx:id="btnSupplier"
    private JFXButton btnSupplier; // Value injected by FXMLLoader

    @FXML // fx:id="btnUpdate"
    private JFXButton btnUpdate; // Value injected by FXMLLoader

    @FXML // fx:id="cmboSupplierName"
    private JFXComboBox<?> cmboSupplierName; // Value injected by FXMLLoader

    @FXML // fx:id="columnDiscount"
    private TreeTableColumn<?, ?> columnDiscount; // Value injected by FXMLLoader

    @FXML // fx:id="columnItem"
    private TreeTableColumn<?, ?> columnItem; // Value injected by FXMLLoader

    @FXML // fx:id="columnQuantity"
    private TreeTableColumn<?, ?> columnQuantity; // Value injected by FXMLLoader

    @FXML // fx:id="columnSize"
    private TreeTableColumn<?, ?> columnSize; // Value injected by FXMLLoader

    @FXML // fx:id="columnTotal"
    private TreeTableColumn<?, ?> columnTotal; // Value injected by FXMLLoader

    @FXML // fx:id="columnType"
    private TreeTableColumn<?, ?> columnType; // Value injected by FXMLLoader

    @FXML // fx:id="columnUnitPrice"
    private TreeTableColumn<?, ?> columnUnitPrice; // Value injected by FXMLLoader

    @FXML // fx:id="txtAddQty"
    private JFXTextField txtAddQty; // Value injected by FXMLLoader

    @FXML // fx:id="txtBuyingPrice"
    private JFXTextField txtBuyingPrice; // Value injected by FXMLLoader

    @FXML // fx:id="txtDescription"
    private JFXTextField txtDescription; // Value injected by FXMLLoader

    @FXML // fx:id="txtItemId"
    private JFXTextField txtItemId; // Value injected by FXMLLoader

    @FXML // fx:id="txtProfit"
    private JFXTextField txtProfit; // Value injected by FXMLLoader

    @FXML // fx:id="txtQty"
    private JFXTextField txtQty; // Value injected by FXMLLoader

    @FXML // fx:id="txtSearch"
    private JFXTextField txtSearch; // Value injected by FXMLLoader

    @FXML // fx:id="txtSellingPrice"
    private JFXTextField txtSellingPrice; // Value injected by FXMLLoader

    @FXML // fx:id="txtSize"
    private JFXTextField txtSize; // Value injected by FXMLLoader

    @FXML // fx:id="txtSupplierId"
    private JFXComboBox<?> txtSupplierId; // Value injected by FXMLLoader

    @FXML // fx:id="txtType"
    private JFXTextField txtType; // Value injected by FXMLLoader

    @FXML
    void btnAddToStockOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

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
    void btnItemOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/inventory-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnOrderOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/order-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnPrintOnclick(ActionEvent event) {

    }

    @FXML
    void btnReportsOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/reports-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnSupplierOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnClick(ActionEvent event) {

    }

    @FXML
    void cmboSupplierNameOnAction(ActionEvent event) {

    }

    @FXML
    void txtSupplierIdOnAction(ActionEvent event) {

    }

}
