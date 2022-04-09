package com.example.sdgroupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class PresentieOverzichtController {

    public void handleButtonTerugVanOverzichtPresentie(ActionEvent actionEvent) throws IOException{
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeScherm.fxml"));
            Parent root = loader.load();

            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.showAndWait();
//            ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
