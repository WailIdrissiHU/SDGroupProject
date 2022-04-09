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

public class WachtwoordWijzigenController {

    @FXML
    private Button TerugVanWachtwoordWijzigen;

    @FXML
    public void handleButtonTerugVanWachtwoordWijzigen(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) TerugVanWachtwoordWijzigen.getScene().getWindow();
        stage.close();
    }
}
