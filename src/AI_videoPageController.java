/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author najlaa
 */
public class AI_videoPageController implements Initializable {

    
@FXML
 public void goToAIExtraInfoPage(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("AI_extraInfoPage.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
 
  
@FXML
 public void goToAIPage(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("AI_page.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
  //Reference: https://www.youtube.com/watch?v=ceXHH9sYIkk

    private String pathAI;
    private MediaPlayer mediaPlayerAI;
    @FXML
    private MediaView mediaViewAI;
    public void playAIvideo(ActionEvent Event){
        File file= new File("/Users/najlaa/Desktop/AP_project/src/ap_project/AIvideo.mp4");
        pathAI = file.toURI().toString();
        
        if(pathAI != null){
            Media media= new Media (pathAI);
            mediaPlayerAI= new MediaPlayer(media);
            mediaViewAI.setMediaPlayer(mediaPlayerAI);
            
           DoubleProperty widthPro= mediaViewAI.fitWidthProperty();
           DoubleProperty heightPro= mediaViewAI.fitHeightProperty();
            
            widthPro.bind(Bindings.selectDouble(mediaViewAI.sceneProperty(), "width"));
            heightPro.bind(Bindings.selectDouble(mediaViewAI.sceneProperty(), "height"));
//            mediaViewAI.setFitWidth(600);
//            mediaViewAI.setFitHeight(300);

            mediaPlayerAI.setAutoPlay(true);
            mediaPlayerAI.play();
        }
     }
     public void stopAI(ActionEvent event){
         mediaPlayerAI.stop();
     }
     
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
