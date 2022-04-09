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

//    public void PieChart(Stage stage) {
//        Scene scene = new Scene(new Group());
//        stage.setTitle("Imported Fruits");
//
//        ObservableList<PieChart.Data> pieChartData =
//                FXCollections.observableArrayList(
//                        new PieChart.Data("Grapefruit", 13),
//                        new PieChart.Data("Oranges", 25),
//                        new PieChart.Data("Plums", 10),
//                        new PieChart.Data("Pears", 22),
//                        new PieChart.Data("Apples", 30));
//        final PieChart PieChart = new PieChart(pieChartData);
//        PieChart.setTitle("Imported Fruits");
//
//        ((Group) scene.getRoot()).getChildren().add(PieChart);
//        stage.setScene(scene);
//        stage.show();
//    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First JavaFX App");

        PieChart pieChart = new PieChart();

        PieChart.Data slice1 = new PieChart.Data("Desktop", 213);
        PieChart.Data slice2 = new PieChart.Data("Phone"  , 67);
        PieChart.Data slice3 = new PieChart.Data("Tablet" , 36);

        PieChart.getData().add(slice1);
        PieChart.getData().add(slice2);
        PieChart.getData().add(slice3);

        Stage newStage = new Stage();
        newStage.setScene(new Scene(pieChart));
        newStage.initModality(Modality.APPLICATION_MODAL);
        newStage.showAndWait();
    }
}
