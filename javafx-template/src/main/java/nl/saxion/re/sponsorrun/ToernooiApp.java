package nl.saxion.re.sponsorrun;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ToernooiApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // read all data from disk
        //Data.updateFromDisk();

        // start the main menu window
        //WindowHelper.openWindow("Login-screen.fxml", "Sponsor Run App", 320, 240, stage);

        //Login-screen.fxml

        Parent root = FXMLLoader.load(getClass().getResource("Login-screen.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}