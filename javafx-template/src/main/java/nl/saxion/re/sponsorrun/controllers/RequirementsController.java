package nl.saxion.re.sponsorrun.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import nl.saxion.re.sponsorrun.util.WindowHelper;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class RequirementsController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;


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

    public void switchToTeamMakenScreen(ActionEvent event) throws IOException {

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        WindowHelper.openWindow("Team-maken-screen.fxml", "TeamMakenScreen", 600, 500, stage);

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


    @FXML
    private TableColumn<TeamMaken, String> Sport1;

    @FXML
    private TableColumn<TeamMaken, String> Team;

    @FXML
    private TableColumn<TeamMaken, String> Jaar;

    @FXML
    private TableView<TeamMaken> table;

    ObservableList<TeamMaken> initialData(){
        TeamMaken Team1 = new TeamMaken("Voetball","de Strijders","2");
        TeamMaken Team2 = new TeamMaken("Voetball","de Dames","1");

        return FXCollections.observableArrayList(Team1,Team2);
    }

    @FXML
    private TextField Sport2;

    @FXML
    private TextField Team2;

    @FXML
    private TextField Jaar2;

    @FXML
    private void btnInsert(ActionEvent event)throws IOException{

        if (Sport1.getText().isBlank() ||  Team.getText().isBlank() ||Jaar.getText().isBlank())  {
            Sport1.setStyle("-fx-border-color: red;");
            Team.setStyle("-fx-border-color: red;");
            Jaar.setStyle("-fx-border-color: red;");
            boolean valid = false;
        }else {

            TeamMaken newData = new TeamMaken(Sport2.getText(), Team2.getText(), Jaar2.getText());
            table.getItems().add(newData);
            Sport2.clear();
            Team2.clear();
            Jaar2.clear();
        }

    }


    public void logUit(ActionEvent event){

        Alert alert = new Alert (Alert.AlertType.CONFIRMATION);
        alert.setTitle("Log-uit");
        alert.setHeaderText("je logt bijna uit!");
        alert.setContentText("Wil je opslaan voordat de uit-logt?: ");
        if(alert.showAndWait().get() == ButtonType.OK) {


            stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("you logged out");
            stage.close();
        }
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        System.out.println("Sport1 = " + Sport1); // ← Hier check je of hij nog null is
//        if (Sport1 == null) {
//            System.out.println("❌ Sport1 is NIET gekoppeld via FXML!");
//        }

        // Alleen als het niet null is, instellen
        if (Sport1 != null) {
            Sport1.setCellValueFactory(new PropertyValueFactory<>("sport"));
            Team.setCellValueFactory(new PropertyValueFactory<>("team"));
            Jaar.setCellValueFactory(new PropertyValueFactory<>("jaar"));

            table.setItems(initialData());
        }
    }

}
