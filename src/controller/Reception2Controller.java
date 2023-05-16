package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class Reception2Controller {
    public AnchorPane reception2Context;
    public AnchorPane context;

    public void availableRoomOnAction(ActionEvent actionEvent) throws IOException {
        Parent node = FXMLLoader.load(getClass().getResource("../fxmlFile/AvailableRoom.fxml"));
        context.getChildren().clear();
        context.getChildren().add(node);
    }

    public void addCustomerOnAction(ActionEvent actionEvent) throws IOException {
        Parent node = FXMLLoader.load(getClass().getResource("../fxmlFile/AddCustomer.fxml"));
        context.getChildren().clear();
        context.getChildren().add(node);
    }

    public void customerDetailOnAction(ActionEvent actionEvent) throws IOException {
        Parent node = FXMLLoader.load(getClass().getResource("../fxmlFile/CustomerDetail.fxml"));
        context.getChildren().clear();
        context.getChildren().add(node);
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) reception2Context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../fxmlFile/Reception1.fxml"))));
        stage.centerOnScreen();
    }

    public void logOut(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) reception2Context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../fxmlFile/Main.fxml"))));
        stage.centerOnScreen();
    }
}
