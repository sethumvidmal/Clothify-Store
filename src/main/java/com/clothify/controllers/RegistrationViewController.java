/**
 * Sample Skeleton for 'registration-view.fxml' Controller Class
 */

package com.clothify.controllers;

import com.clothify.Main;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationViewController {

    @FXML // fx:id="btnBack"
    private JFXButton btnBack; // Value injected by FXMLLoader

    @FXML // fx:id="btnCheck"
    private JFXButton btnCheck; // Value injected by FXMLLoader

    @FXML // fx:id="btnSend"
    private JFXButton btnSend; // Value injected by FXMLLoader

    @FXML // fx:id="cmboUserType"
    private JFXComboBox<?> cmboUserType; // Value injected by FXMLLoader

    @FXML // fx:id="newUserShowPassword"
    private JFXCheckBox newUserShowPassword; // Value injected by FXMLLoader

    @FXML // fx:id="showPassword"
    private JFXCheckBox showPassword; // Value injected by FXMLLoader

    @FXML // fx:id="txtConfirmPassword"
    private JFXTextField txtConfirmPassword; // Value injected by FXMLLoader

    @FXML // fx:id="txtEmail"
    private JFXTextField txtEmail; // Value injected by FXMLLoader

    @FXML // fx:id="txtNewUserName"
    private JFXTextField txtNewUserName; // Value injected by FXMLLoader

    @FXML // fx:id="txtNewUserPassword"
    private JFXTextField txtNewUserPassword; // Value injected by FXMLLoader

    @FXML // fx:id="txtOTP"
    private JFXTextField txtOTP; // Value injected by FXMLLoader

    @FXML // fx:id="txtPassword"
    private JFXTextField txtPassword; // Value injected by FXMLLoader

    @FXML // fx:id="txtUserName"
    private JFXTextField txtUserName; // Value injected by FXMLLoader

    @FXML
    void btnBackOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnCheckOnAction(ActionEvent event) {

    }

    @FXML
    void btnSendOnAction(ActionEvent event) {

    }

    @FXML
    void cmboUserTypeOnAction(ActionEvent event) {

    }

    @FXML
    void newUserShowPasswordOnAction(ActionEvent event) {

    }

    @FXML
    void showPasswordOnAction(ActionEvent event) {

    }

}
