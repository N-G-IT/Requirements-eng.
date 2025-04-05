package nl.saxion.re.sponsorrun.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import nl.saxion.re.sponsorrun.util.WindowHelper;


import java.io.IOException;
import java.util.Objects;

public class RequirementsController {

    private Stage stage;
    private Scene scene;
    private Parent root;




//-----------------------------------------------------------------------------
//    public void switchToMainMenu(ActionEvent event) throws IOException {
//        root = FXMLLoader.load(getClass().getResource("Main-menu.fxml"));
//        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//
//    }

//    public void switchToLoginScreen(ActionEvent event) throws IOException {
//        root = FXMLLoader.load(getClass().getResource("Login-screen.fxml"));
//        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//
//    }
//-------------------------------------------------------------------------------


    public void switchToMainMenu(ActionEvent event) throws IOException {

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            WindowHelper.openWindow("Main-menu.fxml", "StatScherm", 600, 500, stage);

    }


    public void LoginRequirements(ActionEvent event) throws IOException {
        if (!Objects.equals(Username.getText(), "Simon") & !Objects.equals(Password.getText(), "school")) {
            Username.setStyle("-fx-border-color: red;");
            Password.setStyle("-fx-border-color: red;");
            //Username.setPromptText("Voeg een email adres in");
            boolean valid = false;
        }else {
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            WindowHelper.openWindow("Main-menu.fxml", "StatScherm", 600, 500, stage);
        }
    }




    public void switchToScoreScreen(ActionEvent event) throws IOException {

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        WindowHelper.openWindow("Score-screen.fxml", "ScoreScreen", 600, 500, stage);

    }

    public void switchToTeamScreen(ActionEvent event) throws IOException {

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        WindowHelper.openWindow("Team-screen.fxml", "TeamScreen", 600, 500, stage);

    }

    public void switchToIndelingScreen(ActionEvent event) throws IOException {

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        WindowHelper.openWindow("Indeling-screen.fxml", "IndelingScreen", 600, 500, stage);

    }


    public void switchToResultatenScreen(ActionEvent event) throws IOException {

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        WindowHelper.openWindow("Resultaten-screen.fxml", "ResultatenScreen", 600, 500, stage);

    }


    public void switchToLoginScreen(ActionEvent event) throws IOException {

        WindowHelper.openWindow("Login-screen.fxml", "ToernooiApp", 600, 500, stage);

    }

    @FXML
    private TextField Username;

    @FXML
    private TextField Password;



    @FXML
    private Button logUitKnop;
    @FXML
    private AnchorPane scenePane;

    public void logUit(ActionEvent event){

        Alert alert = new Alert (Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("Do you want to save before exiting?: ");
        if(alert.showAndWait().get() == ButtonType.OK) {


            stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("you logged out");
            stage.close();
        }
    }

}
