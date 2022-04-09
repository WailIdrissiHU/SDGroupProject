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
import java.nio.Buffer;

public class AfwezigMeldenController {

    @FXML
    private Button TerugVanAfwezigMelden;

    @FXML
    public void handleButtonTerugVanAfwezigMelden(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) TerugVanAfwezigMelden.getScene().getWindow();
        stage.close();
    }
}
