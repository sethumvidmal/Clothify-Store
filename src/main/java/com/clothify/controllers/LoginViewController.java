/**
 * Sample Skeleton for 'login-view.fxml' Controller Class
 */

package com.clothify.controllers;

import com.clothify.Main;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginViewController {
/*    private Stage loginStage;

    public void setStage (Stage stage){
        loginStage=stage;
    }*/

    @FXML // fx:id="btnLogin"
    private JFXButton btnLogin; // Value injected by FXMLLoader

    @FXML // fx:id="btnSignUp"
    private JFXButton btnSignUp; // Value injected by FXMLLoader

    @FXML // fx:id="txtPassword"
    private JFXTextField txtPassword; // Value injected by FXMLLoader

    @FXML // fx:id="txtUserName"
    private JFXTextField txtUserName; // Value injected by FXMLLoader

    @FXML
    void btnLoginOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/dash-board-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void btnSignUpOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/registration-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void lblForgotOnAction(MouseEvent event) {
        System.out.println("Forgot password clicked");
    }

}
