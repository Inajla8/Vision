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
public class IoT_videoPageController implements Initializable {

    
     
@FXML
 public void goToIoTExtraInfoPage(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("IoT_extraInfoPage.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
 
  //Reference: https://www.youtube.com/watch?v=ceXHH9sYIkk

 
    private String pathIoT;
    private MediaPlayer mediaPlayerIoT;
    
    @FXML
    private MediaView mediaViewIoT;
 
    public void playIoTvideo(ActionEvent Event){
        File file= new File("/Users/najlaa/Desktop/AP_project/src/ap_project/IoTvideo.mp4");
        pathIoT = file.toURI().toString();
        
        if(pathIoT != null){
            Media media= new Media (pathIoT);
            mediaPlayerIoT= new MediaPlayer(media);
            mediaViewIoT.setMediaPlayer(mediaPlayerIoT);
            
            DoubleProperty widthPro= mediaViewIoT.fitWidthProperty();
            DoubleProperty heightPro= mediaViewIoT.fitHeightProperty();
            
            widthPro.bind(Bindings.selectDouble(mediaViewIoT.sceneProperty(), "width"));
            heightPro.bind(Bindings.selectDouble(mediaViewIoT.sceneProperty(), "height"));
//            mediaViewIoT.setFitWidth(600);
//            mediaViewIoT.setFitHeight(300);
            
            mediaPlayerIoT.setAutoPlay(true);
            mediaPlayerIoT.play();
        }
   
     }
    
     public void stopIot(ActionEvent event){
         mediaPlayerIoT.stop();
     }
  
@FXML
 public void goToIoTPage(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("IoT_page.fxml"));
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
