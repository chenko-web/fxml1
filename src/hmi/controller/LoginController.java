package hmi.controller;

import java.sql.SQLException;

import hmi.model.LoginDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginController {
  @FXML
  private TextField txt_username;
  @FXML
  private TextField txt_psw;
  @FXML
  private ButtonType btnLogin;
  
  @FXML
  private void loginClick() throws SQLException {
    String user_name = null;
    String psw = null;
    user_name = txt_username.getText();
    psw = txt_psw.getText();
    boolean status = LoginDAO.check_credential(user_name, psw);
    if (!status) {
      Alert alert = new Alert(AlertType.ERROR,"Wrong username or passwored",ButtonType.OK);
      alert.show();
    }
  }
}