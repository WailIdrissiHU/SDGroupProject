package com.example.sdgroupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class InlogScherm2Controller {

    @FXML
    private Button LogIn2;

    @FXML
    public void handleButtonLogIn2(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) LogIn2.getScene().getWindow();
        stage.close();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeScherm.fxml"));
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
