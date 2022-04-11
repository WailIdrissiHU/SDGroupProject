package com.example.sdgroupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AfwezigMeldenController {

    @FXML
    private Button TerugVanAfwezigMelden;

    @FXML
    public ComboBox<String> Redenen;
    //    private String user ="root";
    private String url = "localhost";
//    private String password ="root";

    @FXML
    public void initialize() {
        Redenen.getItems().add("Ziek");
        Redenen.getItems().add("Tandartsafspraak");
        Redenen.getItems().add("Doktersafspraak");
        Redenen.setValue("Anders");
    }

    @FXML
    public void handleButtonTerugVanAfwezigMelden(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) TerugVanAfwezigMelden.getScene().getWindow();
        stage.close();

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

}
