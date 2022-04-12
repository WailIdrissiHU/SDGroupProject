package com.example.sdgroupproject;

import com.example.sdgroupproject.domeinModel.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class DocentAfwezigMeldenController {

    @FXML
    private Button terugNaarRooster;

    @FXML
    private Button registreerPresentie;

    @FXML
    private TableView<Student> presentieTabel;

    public void initialize() {
        TableColumn<Student, String> naam = new TableColumn<Student, String>("Naam");
        TableColumn<Student, String> achterNaam = new TableColumn<Student, String>("Achternaam");
        TableColumn presentie = new TableColumn("Presentie");
        presentieTabel.getColumns().addAll(naam, achterNaam, presentie);

        final ObservableList<Student> data = FXCollections.observableArrayList(
                new Student("Waïl", "Idrissi"),
                new Student("Joseph", "Tawiah"),
                new Student("Thom", "Harland"),
                new Student("Jayro", "Pattimaipau"));

        naam.setCellValueFactory(new PropertyValueFactory<Student, String>("naam"));
        achterNaam.setCellValueFactory(new PropertyValueFactory<Student, String>("achterNaam"));
        presentie.setCellValueFactory(new PropertyValueFactory<Student, String>("Presentie"));

        presentieTabel.setItems(data);
    }

    @FXML
    public void handleButtonTerugNaarRooster(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) terugNaarRooster.getScene().getWindow();
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

    @FXML
    public void handleButtonRegistreerPresentie(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) registreerPresentie.getScene().getWindow();
        stage.close();
    }
}
