package com.example.sdgroupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeSchermController {

    @FXML
    private Button presentieOverzichtButton;

    @FXML
    private Button roosterButton;

    @FXML
    private Button wachtwoordWijzigenButton;

    @FXML
    private Button logUitButton;


    @FXML
    public void handleButtonPresentieoverzicht(ActionEvent actionEvent) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PresentieOverzicht.fxml"));
            Parent root = loader.load();

            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @FXML
    public void handleButtonRooster(ActionEvent actionEvent) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Rooster.fxml"));
            Parent root = loader.load();

            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @FXML
    public void handleButtonWachtwoordwijzigen(ActionEvent actionEvent) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("WachtwoordWijzigen.fxml"));
            Parent root = loader.load();

            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @FXML
    public void handleButtonLoguit(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) logUitButton.getScene().getWindow();
        stage.close();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("InlogScherm.fxml"));
            Parent root = loader.load();

            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.showAndWait();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
