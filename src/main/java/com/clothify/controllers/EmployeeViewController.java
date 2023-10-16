/**
 * Sample Skeleton for 'employee-view.fxml' Controller Class
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TreeTableColumn;
import javafx.stage.Stage;

import java.io.IOException;

public class EmployeeViewController {

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

    @FXML // fx:id="btnSave"
    private JFXButton btnSave; // Value injected by FXMLLoader

    @FXML // fx:id="btnSupplier"
    private JFXButton btnSupplier; // Value injected by FXMLLoader

    @FXML // fx:id="cmboTitle"
    private JFXComboBox<?> cmboTitle; // Value injected by FXMLLoader

    @FXML // fx:id="columnAccNo"
    private TreeTableColumn<?, ?> columnAccNo; // Value injected by FXMLLoader

    @FXML // fx:id="columnAddress"
    private TreeTableColumn<?, ?> columnAddress; // Value injected by FXMLLoader

    @FXML // fx:id="columnBranch"
    private TreeTableColumn<?, ?> columnBranch; // Value injected by FXMLLoader

    @FXML // fx:id="columnContact"
    private TreeTableColumn<?, ?> columnContact; // Value injected by FXMLLoader

    @FXML // fx:id="columnId"
    private TreeTableColumn<?, ?> columnId; // Value injected by FXMLLoader

    @FXML // fx:id="columnNic"
    private TreeTableColumn<?, ?> columnNic; // Value injected by FXMLLoader

    @FXML // fx:id="txtBankAccount"
    private JFXTextField txtBankAccount; // Value injected by FXMLLoader

    @FXML // fx:id="txtBankBranch"
    private JFXTextField txtBankBranch; // Value injected by FXMLLoader

    @FXML // fx:id="txtContact"
    private JFXTextField txtContact; // Value injected by FXMLLoader

    @FXML // fx:id="txtDob"
    private DatePicker txtDob; // Value injected by FXMLLoader

    @FXML // fx:id="txtName"
    private JFXTextField txtName; // Value injected by FXMLLoader

    @FXML // fx:id="txtNic"
    private JFXTextField txtNic; // Value injected by FXMLLoader

    @FXML // fx:id="txtSearch"
    private JFXTextField txtSearch; // Value injected by FXMLLoader

    @FXML // fx:id="txtSupId"
    private JFXTextField txtSupId; // Value injected by FXMLLoader

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
    void btnItemOnAction(ActionEvent event) {

    }

    @FXML
    void btnOrderOnAction(ActionEvent event) {

    }

    @FXML
    void btnPrintOnAction(ActionEvent event) {

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
    void btnSaveOnAction(ActionEvent event) {

    }

    @FXML
    void btnSupplierOnAction(ActionEvent event) {

    }

    @FXML
    void cmboTitleOnAction(ActionEvent event) {

    }

}
