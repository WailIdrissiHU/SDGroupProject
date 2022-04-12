package com.example.sdgroupproject;

import com.example.sdgroupproject.domeinModel.Encryptor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class InlogScherm2Controller {

    @FXML
    private Button LogIn2;
    @FXML
    private TextField gebruikersNaam;
    @FXML
    private PasswordField wachtwoord;
    private Encryptor encryptor = new Encryptor();
    File file = new File("src/main/resources/files/inlogGegevens.txt");
    //Map containing <Username, Password>
//    HashMap<String, String> loginInfo = new HashMap<>();
    List<String> gegevens = new ArrayList<>();
    private Alert alert;
    private String deel1;
    private String deel2;
    private int error = 0;

    public void initialize() throws FileNotFoundException, NoSuchAlgorithmException{
        Scanner scanner = new Scanner(file);
//        loginInfo.clear();
//        loginInfo = new HashMap<>();
        while (scanner.hasNext()){
            System.out.println(encryptor.encryptString("Blabla"));
            String[] usernameAndPassword = scanner.nextLine().split(",");
//            deel1 = usernameAndPassword[0];
//            deel2= usernameAndPassword[1];
//            loginInfo.put(usernameAndPassword[0],usernameAndPassword[1]);
            gegevens.add(usernameAndPassword[0] + ","+ usernameAndPassword[1]);
        }
        for (String gev : gegevens){
            System.out.println(gev);
        }
    }

    @FXML
    public void handleButtonLogIn2(ActionEvent actionEvent) throws IOException, NoSuchAlgorithmException {
        alert= new Alert(Alert.AlertType.CONFIRMATION);
        String username = gebruikersNaam.getText();
        String password = wachtwoord.getText();

        for (String gevs : gegevens) {
            String[] userAndPass = gevs.split(",");
            deel1 = userAndPass[0];
            deel2 = userAndPass[1];
            if (deel1.equals(username) && encryptor.encryptString(password).equals(deel2)) {
                Stage stage = (Stage) LogIn2.getScene().getWindow();
                stage.close();

                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeScherm.fxml"));
                    Parent root = loader.load();

                    Stage newStage = new Stage();
                    newStage.setScene(new Scene(root));
                    newStage.initModality(Modality.APPLICATION_MODAL);
                    newStage.showAndWait();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            } else if (username == null || password == null) {
                error++;
            } else {
                error++;

            }
        }
        if (error > 0 ){
            alert.setContentText("Inloggen mislukt");
            alert.showAndWait();
        }

    }



}
