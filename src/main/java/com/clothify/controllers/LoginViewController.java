/**
 * Sample Skeleton for 'login-view.fxml' Controller Class
 */

package com.clothify.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class LoginViewController {

    @FXML // fx:id="btnLogin"
    private JFXButton btnLogin; // Value injected by FXMLLoader

    @FXML // fx:id="btnSignUp"
    private JFXButton btnSignUp; // Value injected by FXMLLoader

    @FXML // fx:id="txtPassword"
    private JFXTextField txtPassword; // Value injected by FXMLLoader

    @FXML // fx:id="txtUserName"
    private JFXTextField txtUserName; // Value injected by FXMLLoader

    @FXML
    void btnLoginOnAction(ActionEvent event) {

    }

    @FXML
    void btnSignUpOnAction(ActionEvent event) {

    }

    @FXML
    void lblForgotOnAction(MouseEvent event) {
        System.out.println("Forgot password clicked");
    }

}
