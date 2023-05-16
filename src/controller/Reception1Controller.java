package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class Reception1Controller {
    public AnchorPane reception1;
    public TextField receptionUserName;
    public PasswordField receptionPassword;

    public void receptionBackOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) reception1.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../fxmlFile/Main.fxml"))));
        stage.centerOnScreen();
    }

    public void receptionLoginOnAction(ActionEvent actionEvent) throws IOException {
        if (receptionUserName.getText().equals("Isuru") && receptionPassword.getText().equals("2530")) {
            Stage stage = (Stage) reception1.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../fxmlFile/Reception2.fxml"))));
        } else if (receptionUserName.getText().isEmpty() && receptionPassword.getText().isEmpty()) {
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
