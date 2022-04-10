package com.example.sdgroupproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class PresentieOverzichtController {

    @FXML
    private Button TerugVanOverzichtPresentie;

    @FXML
    private PieChart PieChart;

    public void handleButtonTerugVanOverzichtPresentie(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) TerugVanOverzichtPresentie.getScene().getWindow();
        stage.close();
    }

    public void initialize() {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Absent",1),
                new PieChart.Data("Aanwezig",2));
        PieChart.setData(pieChartData);
        PieChart.setStartAngle(90);
        PieChart.setTitle("Roll Call Attendance");
    }
}
