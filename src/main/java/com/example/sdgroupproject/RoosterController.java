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

public class RoosterController {

    @FXML
    private Button TerugVanRooster;

    @FXML
    public void handleButtonTerugVanRooster(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) TerugVanRooster.getScene().getWindow();
        stage.close();
    }
}