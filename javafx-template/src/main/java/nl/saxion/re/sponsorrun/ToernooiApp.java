package nl.saxion.re.sponsorrun;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import nl.saxion.re.sponsorrun.data.Data;
import nl.saxion.re.sponsorrun.util.WindowHelper;
import nl.saxion.app.SaxionApp;
import java.io.IOException;
import java.util.Objects;

public class ToernooiApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Gebruikersnaam = Simon  || hoofdletter gevoelig
        //Wachtwoord     = school || hoofdletter gevoelig

        // start the main menu window
        WindowHelper.openWindow("Login-screen.fxml", "ToernooiApp", 600, 500, stage);


        stage.setOnCloseRequest(event -> {

            event.consume();

            logUit(stage);
        });
    }




    public void logUit(Stage stage){

        Alert alert = new Alert (Alert.AlertType.CONFIRMATION);
        alert.setTitle("Log uit");
        alert.setHeaderText("Je logt zo uit!");
        alert.setContentText("Do you want to save before exiting?: ");
        if(alert.showAndWait().get() == ButtonType.OK) {

            System.out.println("Je bent uitgelogt");
            stage.close();
        }
    }


    public static void main(String[] args) {
        launch();
    }
}





