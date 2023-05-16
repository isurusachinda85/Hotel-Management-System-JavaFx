package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;


import java.io.IOException;
import java.net.URL;

public class Admin1Controller {
    public AnchorPane admin1;
    public TextField userNameAdmin;
    public PasswordField passwordAdmin;

    public void adminBackOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) admin1.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../fxmlFile/Main.fxml"))));
        stage.centerOnScreen();
    }

    public void adminLoginOnAction(ActionEvent actionEvent) throws IOException {
        if (userNameAdmin.getText().equals("Admin") && passwordAdmin.getText().equals("1234")) {
            Stage stage = (Stage) admin1.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../fxmlFile/Admin2.fxml"))));

        } else if (userNameAdmin.getText().isEmpty() && passwordAdmin.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error alert Dialog");
            alert.setContentText("Enter username and password");
            alert.showAndWait();

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error alert Dialog");
            alert.setContentText("Incorrect username or password");
            alert.showAndWait();
        }
    }
}
