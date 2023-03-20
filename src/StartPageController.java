/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author najlaa
 */
public class StartPageController implements Initializable {
 
    @FXML
    public void goToMapPage(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("mapPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void goToWelcomePage(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("welcomePage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    /**
     * Initializes the controller class.
     */
     //Reference: https://www.youtube.com/watch?v=UdGiuDDi7Rg

    @FXML
    private ImageView img1;
    
    
    @FXML
    private ImageView img2;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        TranslateTransition tran= new TranslateTransition();
        tran.setDuration(Duration.seconds(4));
        tran.setByX(50);
        tran.setByY(-30);
        tran.setAutoReverse(true);
        tran.setCycleCount(Animation.INDEFINITE);
        tran.setNode(img1);
        tran.play();
        
        
        TranslateTransition trans= new TranslateTransition();
        trans.setDuration(Duration.seconds(3));
        trans.setByX(0);
        trans.setByY(100);
        trans.setAutoReverse(true);
        trans.setCycleCount(Animation.INDEFINITE);
        trans.setNode(img2);
        trans.play();
    }    
    
}
