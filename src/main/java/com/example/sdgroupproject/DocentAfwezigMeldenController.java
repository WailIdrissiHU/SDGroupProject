package com.example.sdgroupproject;

import com.example.sdgroupproject.domeinModel.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class DocentAfwezigMeldenController {

    @FXML
    private TableView<Student> presentieTabel;

    public void initialize() {
        TableColumn<Student, String> naam = new TableColumn<Student, String>("Naam");
        TableColumn<Student, String> achterNaam = new TableColumn<Student, String>("Achternaam");
        TableColumn presentie = new TableColumn("Presentie");
        presentieTabel.getColumns().addAll(naam, achterNaam, presentie);

        final ObservableList<Student> data = FXCollections.observableArrayList(
            new Student("Waïl", "Idrissi"),
            new Student("Joseph", "Tawiah"));
        
        naam.setCellValueFactory(new PropertyValueFactory<Student, String>("naam"));
        achterNaam.setCellValueFactory(new PropertyValueFactory<Student, String>("achterNaam"));

        presentieTabel.setItems(data);
    }
}
