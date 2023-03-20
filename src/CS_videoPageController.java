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
public class CS_videoPageController implements Initializable {

    
    
@FXML
 public void goToCSExtraInfoPage(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("CS_extraInfoPage.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
  //Reference: https://www.youtube.com/watch?v=ceXHH9sYIkk

 private String pathCS;
    private MediaPlayer mediaPlayerCS;
    @FXML
    private MediaView mediaViewCS;
    public void playCSvideo(ActionEvent Event){
        File file= new File("/Users/najlaa/Desktop/AP_project/src/ap_project/CSvideo.mp4");
        pathCS = file.toURI().toString();
        
        if(pathCS != null){
            Media media= new Media (pathCS);
            mediaPlayerCS= new MediaPlayer(media);
            mediaViewCS.setMediaPlayer(mediaPlayerCS);
            
            DoubleProperty widthPro= mediaViewCS.fitWidthProperty();
            DoubleProperty heightPro= mediaViewCS.fitHeightProperty();
            
            widthPro.bind(Bindings.selectDouble(mediaViewCS.sceneProperty(), "width"));
            heightPro.bind(Bindings.selectDouble(mediaViewCS.sceneProperty(), "height"));
//            mediaViewCS.setFitWidth(600);
//            mediaViewCS.setFitHeight(300);
            
            mediaPlayerCS.setAutoPlay(true);
            mediaPlayerCS.play();
        }
        }
     public void stopCS(ActionEvent event){
         mediaPlayerCS.stop();
     }
  
@FXML
 public void goToCSPage(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("CS_page.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
