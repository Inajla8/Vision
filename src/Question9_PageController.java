/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author najlaa
 */
public class Question9_PageController implements Initializable {

    @FXML
 public void goToMapPage(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("mapQ9Page.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

 public void goToSEInformation(ActionEvent event) throws Exception {
        boolean view= false;
        Alert alert= new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Major");
        String AI_msg= "Your major is Software Engineering \n\n"+"Remember!\n" +"This test for help only";
        alert.setHeaderText(AI_msg);
        alert.setContentText("Would you like to know more about Software Engineering?");
        Optional <ButtonType> result= alert.showAndWait();
        if(result.isPresent()&& result.get()==ButtonType.OK){
            view= true;
        }
        if(view){
        Parent root = FXMLLoader.load(getClass().getResource("SE_page.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
        else{
        Parent root= FXMLLoader.load(getClass().getResource("thankPage.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
