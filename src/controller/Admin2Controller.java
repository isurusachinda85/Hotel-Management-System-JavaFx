package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class Admin2Controller {

    public AnchorPane context;
    public AnchorPane admin2Context;


    public void roomAddingOnAction(ActionEvent actionEvent) throws IOException {
        Parent node = FXMLLoader.load(getClass().getResource("../fxmlFile/Room.fxml"));
        context.getChildren().clear();
        context.getChildren().add(node);
    }

    public void mealPackageOnAction(ActionEvent actionEvent) throws IOException {
        Parent node = FXMLLoader.load(getClass().getResource("../fxmlFile/MealPackage.fxml"));
        context.getChildren().clear();
        context.getChildren().add(node);
    }

    public void incomeReportOnAction(ActionEvent actionEvent) throws IOException {
        Parent node = FXMLLoader.load(getClass().getResource("../fxmlFile/IncomeReport.fxml"));
        context.getChildren().clear();
        context.getChildren().add(node);
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) admin2Context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../fxmlFile/Admin1.fxml"))));
        stage.centerOnScreen();
    }

    public void logOutAdmin(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) admin2Context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../fxmlFile/Main.fxml"))));
        stage.centerOnScreen();
    }
}
