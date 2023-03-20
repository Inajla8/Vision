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
public class SE_videoPageController implements Initializable {

    
    
@FXML
 public void goToSEextraInfoPage(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("SE_extraInfoPage.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
 //Reference: https://www.youtube.com/watch?v=ceXHH9sYIkk

    private String pathSE;
    private MediaPlayer mediaPlayerSE;
    @FXML
    private MediaView mediaViewSE;
    public void playSEvideo(ActionEvent Event){
        File file= new File("/Users/najlaa/Desktop/AP_project/src/ap_project/SEvideo.mp4");
        pathSE = file.toURI().toString();
        
        if(pathSE != null){
            Media media= new Media (pathSE);
            mediaPlayerSE= new MediaPlayer(media);
            mediaViewSE.setMediaPlayer(mediaPlayerSE);
            DoubleProperty widthPro= mediaViewSE.fitWidthProperty();
            DoubleProperty heightPro= mediaViewSE.fitHeightProperty();
            
            widthPro.bind(Bindings.selectDouble(mediaViewSE.sceneProperty(), "width"));
            heightPro.bind(Bindings.selectDouble(mediaViewSE.sceneProperty(), "height"));
//            mediaViewSE.setFitWidth(600);
//            mediaViewSE.setFitHeight(300);
            mediaPlayerSE.setAutoPlay(true);
            mediaPlayerSE.play();
        }
     }
     public void stopSE(ActionEvent event){
         mediaPlayerSE.stop();
     }
 
 
 
@FXML
 public void goToSEPage(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("SE_page.fxml"));
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
