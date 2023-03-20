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
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author najlaa
 */
public class welcomePageController implements Initializable {
    
//    private Parent root;
//    private Stage stage;
//    private Scene scene;
@FXML
    private AnchorPane pan1;

    @FXML
    private Text text20;
  

 
 public void goToLogInPage(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("logInPage.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
     
    @FXML
 public void goToSignUpPage(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("signUpPage.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
 @FXML
 Rectangle rec;
    
 @FXML
 Rectangle rec1;
 @FXML
 Rectangle rec2;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        pan1.setOnMouseClicked(event -> {
            text20.setText("You must follow the path according to your answer to the questions. If the answer is yes, follow its path, and if No, follow its path");

        });
        
        TranslateTransition tra= new TranslateTransition();
        tra.setDuration(Duration.seconds(2));
        tra.setToX(-80);
        tra.setToY(0);
        tra.setAutoReverse(true);
        tra.setCycleCount(Animation.INDEFINITE);
        tra.setNode(rec);
        tra.play();
        
        
          
        TranslateTransition tra1= new TranslateTransition();
        tra1.setDuration(Duration.seconds(2));
        tra1.setToX(-80);
        tra1.setToY(0);
        tra1.setAutoReverse(true);
        tra1.setCycleCount(Animation.INDEFINITE);
        tra1.setNode(rec1);
        tra1.play();
        
        
//        
//        TranslateTransition tra2= new TranslateTransition();
//        tra2.setDuration(Duration.seconds(2));
//        tra2.setToX(-80);
//        tra2.setToY(0);
//        tra2.setAutoReverse(true);
//        tra2.setCycleCount(Animation.INDEFINITE);
//        tra2.setNode(rec2);
//        tra2.play();
        
    }    
    
}
