package com.example.sdgroupproject;

import com.example.sdgroupproject.domeinModel.Cursus;
import com.example.sdgroupproject.domeinModel.Docent;
import com.example.sdgroupproject.domeinModel.Rooster;
import com.example.sdgroupproject.domeinModel.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Collection;

public class RoosterController {

    @FXML
    private Button TerugVanRooster;

//    @FXML
//    private Button naarAfwezigMelden;

    @FXML
    private ComboBox weekComboBox;

    @FXML
    private TableView<String> roosterLijst;

    Hyperlink les1 = new Hyperlink("Maandag    |   13:00 - 17:00   |   OOAD    |   HL15-6.001  ");
    Hyperlink les2 = new Hyperlink("Maandag    |   17:00 - 18:30   |   SD    |   HL15-6.001  ");
    Hyperlink les3 = new Hyperlink("Dinsdag    |   13:00 - 17:00   |   OOAD    |   HL15-6.001  ");
    Hyperlink les4 = new Hyperlink("Woensdag    |   13:00 - 17:00   |   OOAD    |   HL15-6.001  ");
    Hyperlink les5 = new Hyperlink("Donderdag    |   13:00 - 17:00   |   OOAD    |   HL15-6.001  ");

    public void handleHyperLink(ActionEvent actionEvent) {
//        RoosterLijst.getSelectionModel().se
    }

//    String[] les2 = {"","Maandag    |   13:00 - 17:00   |  SD PROJ  |   HL15-6.001  "};
//    String[] les3 = {"","Dinsdag    |   13:00 - 17:00   |    OOP    |   HL15-5.080  "};
//    String[] les4 = {"","Woensdag   |   13:00 - 17:00   |   OOAD    |   HL15-6.001  "};
//    String[] les5 = {"","Donderdag  |   13:00 - 17:00   |    OOP    |   HL15-5.080  "};

    @FXML
    private Button naarAfwezigMeldenViaTabel;

    public void initialize() {
        TableColumn<Rooster, Integer> les = new TableColumn<Rooster, Integer>("les");
        TableColumn<Cursus, String> cursus = new TableColumn<Cursus, String>("cursus");
        TableColumn<Rooster, String> blok = new TableColumn<Rooster, String>("blok");
        TableColumn<Docent, String> begin = new TableColumn<>("begin");
        TableColumn<Rooster, String> eind = new TableColumn<Rooster, String>("eind");
        TableColumn<Rooster, Integer> weekNummer = new TableColumn<Rooster, Integer>("weekNummer");
        TableColumn<Docent, String> naam = new TableColumn<Docent, String>("naam");

        roosterLijst.getColumns().addAll((Collection<? extends TableColumn<String, ?>>) les);
        roosterLijst.getColumns().addAll((Collection<? extends TableColumn<String, ?>>) cursus);
        roosterLijst.getColumns().addAll((Collection<? extends TableColumn<String, ?>>) blok);
        roosterLijst.getColumns().addAll((Collection<? extends TableColumn<String, ?>>) begin);
        roosterLijst.getColumns().addAll((Collection<? extends TableColumn<String, ?>>) eind);
        roosterLijst.getColumns().addAll((Collection<? extends TableColumn<String, ?>>) weekNummer);
        roosterLijst.getColumns().addAll((Collection<? extends TableColumn<String, ?>>) naam);

        final ObservableList<Student> data = FXCollections.observableArrayList(
                new Rooster(3, "OOAD", "wail.idrissi@student.hu.nl", 12),
                new Rooster(3, "OOAD", "wail.idrissi@student.hu.nl", 12),
                new Student("Waïl", "Idrissi"),
                new Student("Joseph", "Tawiah"),
                new Student("Thom", "Harland"),
                new Student("Jayro", "Pattimaipau"));

        les.setCellValueFactory(new PropertyValueFactory<Rooster, Integer>("les"));
        cursus.setCellValueFactory(new PropertyValueFactory<Cursus, String>("cursus"));
        blok.setCellValueFactory(new PropertyValueFactory<Rooster, String>("blok"));
        begin.setCellValueFactory(new PropertyValueFactory<>("begin"));
        begin.setCellValueFactory(new PropertyValueFactory<>("eind"));
        begin.setCellValueFactory(new PropertyValueFactory<>("weekNummer"));
        begin.setCellValueFactory(new PropertyValueFactory<>("naam"));

        roosterLijst.setItems(data);

//        RoosterLijst.getSelectionModel();
//        System.out.println(RoosterLijst.getSelectionModel().selectedItemProperty());
//        RoosterLijst.getItems().addAll(les2);
//        RoosterLijst.getSelectionModel();
//        System.out.println(RoosterLijst.getSelectionModel());
//        RoosterLijst.getItems().addAll(les3);
//        RoosterLijst.getSelectionModel();
//        System.out.println(RoosterLijst.getSelectionModel());
//        RoosterLijst.getItems().addAll(les4);
//        RoosterLijst.getSelectionModel();
//        RoosterLijst.getItems().addAll(les5);
//        RoosterLijst.getSelectionModel();
    }

    @FXML
    public void handleButtonTerugVanRooster(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) TerugVanRooster.getScene().getWindow();
        stage.close();
    }

//    @FXML
//    public void handleButtonNaarAfwezigMelden(ActionEvent actionEvent) throws IOException {
//        Stage stage = (Stage) NaarAfwezigMelden.getScene().getWindow();
//        stage.close();
//
//        try {
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("AfwezigMelden.fxml"));
//            Parent root = loader.load();
//
//            Stage newStage = new Stage();
//            newStage.setScene(new Scene(root));
//            newStage.initModality(Modality.APPLICATION_MODAL);
//            newStage.showAndWait();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }
}
