package nl.saxion.re.sponsorrun.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RequirementsController {

    private Stage stage;
    private Scene scene;
    private Parent root;


    public void switchToMainMenuSelfmade(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Main-menu-selfmade.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchToLoginScreen(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Login-screen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }


}
