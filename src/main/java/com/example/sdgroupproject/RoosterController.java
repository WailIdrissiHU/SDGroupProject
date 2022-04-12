package com.example.sdgroupproject;

import com.example.sdgroupproject.domeinModel.Cursus;
import com.example.sdgroupproject.domeinModel.Docent;
import com.example.sdgroupproject.domeinModel.Rooster;
import com.example.sdgroupproject.domeinModel.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.controlsfx.validation.ValidateEvent;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;

public class RoosterController {

    @FXML
    private Button TerugVanRooster;


    @FXML
    private Button naarAfwezigMeldenMaandag;
    @FXML
    private Button naarAfwezigMeldenSDProj;
    @FXML
    private Button naarAfwezigMeldenDinsdagOOP;
    @FXML
    private Button naarAfwezigMeldenWoensdagOOAD;
    @FXML
    private Button naarAfwezigMeldenDonderdagOOP;

    @FXML
    private ComboBox weekComboBox;

    @FXML
    private Button naarAfwezigMeldenViaTabel;

    public void initialize() {
        weekComboBox.setValue("Week 6");
        weekComboBox.getItems().addAll("Week 6","Week 7", "Week 8", "Week 9", "Week 10", "Week 11", "Week 12");
    }

    @FXML
    public void handleButtonTerugVanRooster(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) TerugVanRooster.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void handleButtonNaarAfwezigMelden(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) naarAfwezigMeldenMaandag.getScene().getWindow();
        stage.close();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DocentAfwezigMeldenMaandagOOAD.fxml"));
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
    public void handleButtonNaarAfwezigMeldenSDProj(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) naarAfwezigMeldenSDProj.getScene().getWindow();
        stage.close();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DocentAfwezigMeldenSDProj.fxml"));
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
    public void handleButtonNaarAfwezigMeldenDinsdagOOP(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) naarAfwezigMeldenDinsdagOOP.getScene().getWindow();
        stage.close();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DocentAfwezigMeldenDinsdagOOP.fxml"));
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
    public void handleButtonNaarAfwezigMeldenWoensdagOOAD(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) naarAfwezigMeldenWoensdagOOAD.getScene().getWindow();
        stage.close();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DocentAfwezigMeldenWoensdagOOAD.fxml"));
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
    public void handleButtonNaarAfwezigMeldenDonderdagOOP(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) naarAfwezigMeldenDonderdagOOP.getScene().getWindow();
        stage.close();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DocentAfwezigMeldenDonderdagOOP.fxml"));
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
