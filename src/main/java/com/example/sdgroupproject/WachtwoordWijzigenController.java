package com.example.sdgroupproject;

import com.example.sdgroupproject.domeinModel.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WachtwoordWijzigenController {
    Student student = new Student("testVoor","testAchter");
    Path p1 = Path.of("src/main/resources/files/inlogGegevens.txt");
    BufferedWriter bufferedWriter;

    @FXML
    private Button TerugVanWachtwoordWijzigen;
    @FXML
    private PasswordField nieuwWachtwoord;
    @FXML
    private PasswordField herhaalNieuwWachtwoord;


    @FXML
    public void handleButtonTerugVanWachtwoordWijzigen(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) TerugVanWachtwoordWijzigen.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void handleButtonBevestigen(ActionEvent actionEvent) throws IOException {
        bufferedWriter= Files.newBufferedWriter(p1);
        String[] arrayList;
//        bufferedReader=Files.newBufferedReader(p1);

//        bufferedWriter.write("sdf");


//        List<String> alleRegelsOud = Files.readAllLines(p1);
//        for (String regel : alleRegelsOud){
//            arrayList = regel.split(",");
//
//            bufferedWriter.close();
//            bufferedReader.close();
//        }
//        updateLoginUsernamesAndPasswords();
        if (nieuwWachtwoord.getText().equals(herhaalNieuwWachtwoord.getText())){
            bufferedWriter.write(nieuwWachtwoord.getText());
            student.setWachtWoord(nieuwWachtwoord.getText());
        }
        bufferedWriter.close();

    }

}
