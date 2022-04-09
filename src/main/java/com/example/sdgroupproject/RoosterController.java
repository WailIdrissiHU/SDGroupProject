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
    private Button NaarAfwezigMelden;

    @FXML
    public void handleButtonTerugVanRooster(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) TerugVanRooster.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void handleButtonNaarAfwezigMelden(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) NaarAfwezigMelden.getScene().getWindow();
        stage.close();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AfwezigMelden.fxml"));
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
