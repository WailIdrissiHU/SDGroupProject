package com.example.sdgroupproject;

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

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DocentAfwezigMeldenController {

    Path p1 = Path.of("src/main/resources/files/presentie.txt");
    BufferedWriter bufferedWriter;


    @FXML
    private Button terugNaarRooster;
    @FXML
    private Button registreerPresentie;


    @FXML
    private TableView<Student> presentieTabel;


    @FXML
    private Label maandagOOADLabel;
    @FXML
    private Label maandagSDGPLabel;
    @FXML
    private Label dinsdagOOPLabel;
    @FXML
    private Label woensdagOOADLabel;
    @FXML
    private Label donderdagOOPLabel;


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
        presentie.setCellValueFactory(new PropertyValueFactory<Student, String>("presentie"));

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
    public void handleButtonRegistreerPresentie(ActionEvent actionEvent, String message) throws IOException {}
////        bufferedWriter = Files.newBufferedWriter(p1);
////        bufferedWriter.write(maandagOOADLabel.getText());
////
////        Alert presentieGemeld = new Alert(Alert.AlertType.CONFIRMATION);
////        presentieGemeld.setContentText("Presentie is succesvol geregistreerd!");
//
//        String registratie = "<naam student> is ";
//
//        if (presentieTabel.getColumns(.isSelected())
//            message += "aanwezig";
//
//        if (!presentie.isSelected())
//            message += "afwezig";
//
//    }
}
