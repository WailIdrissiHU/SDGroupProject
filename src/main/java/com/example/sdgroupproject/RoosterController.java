package com.example.sdgroupproject;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;

public class RoosterController {

    @FXML
    private Button TerugVanRooster;

    @FXML
    private Button NaarAfwezigMelden;

    @FXML
    private ComboBox weekComboBox;

//    @FXML
//    private ListView<String> RoosterLijst;
//
//    private String[] lessen = {"Maandag    |   13:00 - 17:00   |   OOAD    |   HL15-6.001  "};
//
//
//    Hyperlink les1 = new Hyperlink("Maandag    |   13:00 - 17:00   |   OOAD    |   HL15-6.001  ");
//    Hyperlink les2 = new Hyperlink("Maandag    |   17:00 - 18:30   |   SD    |   HL15-6.001  ");
//    Hyperlink les3 = new Hyperlink("Dinsdag    |   13:00 - 17:00   |   OOAD    |   HL15-6.001  ");
//    Hyperlink les4 = new Hyperlink("Woensdag    |   13:00 - 17:00   |   OOAD    |   HL15-6.001  ");
//    Hyperlink les5 = new Hyperlink("Donderdag    |   13:00 - 17:00   |   OOAD    |   HL15-6.001  ");
//
//    public void handleHyperLink(ActionEvent actionEvent) {
////        RoosterLijst.getSelectionModel().se
//    }
//
////    String[] les2 = {"","Maandag    |   13:00 - 17:00   |  SD PROJ  |   HL15-6.001  "};
////    String[] les3 = {"","Dinsdag    |   13:00 - 17:00   |    OOP    |   HL15-5.080  "};
////    String[] les4 = {"","Woensdag   |   13:00 - 17:00   |   OOAD    |   HL15-6.001  "};
////    String[] les5 = {"","Donderdag  |   13:00 - 17:00   |    OOP    |   HL15-5.080  "};
//
//    public void initialize() {
//        RoosterLijst.getItems().add(String.valueOf(les1));
//
//        RoosterLijst.getItems().addAll(lessen);
//
//        RoosterLijst.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
//
//            @Override
//            public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
//
//                try {
//                    FXMLLoader loader = new FXMLLoader(getClass().getResource("AfwezigMelden.fxml"));
//                    Parent root = loader.load();
//
//                    Stage newStage = new Stage();
//                    newStage.setScene(new Scene(root));
//                    newStage.initModality(Modality.APPLICATION_MODAL);
//                    newStage.showAndWait();
//                } catch (IOException e) {
//                    System.out.println(e.getMessage());
//                }
//    }


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
