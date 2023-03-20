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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author najlaa
 */
public class MapPageController implements Initializable {
@FXML
    private Text text;
    
    @FXML
    private Text text1;
        @FXML
    private Text text2;
            @FXML
    private Text text3;
                @FXML
    private Text text4;
     @FXML
    private Text text5;
        @FXML
    private Text text6;
        @FXML
    private Text text7;
        @FXML
    private Text text8;
        @FXML
    private Text text9;
        @FXML
    private Text text10;
        @FXML
    private Text text11;
        @FXML
    private Text text12;
        @FXML
    private Text text13;
        @FXML
    private Text text14;
    @FXML
    private Text text15;
        @FXML
    private Text text16;
        @FXML
    private Text text17;
    @FXML
    private Text text18;
    @FXML
    private Text text19;
    
     @FXML
 private Circle myCircle;
 private double x;
 private double y;
 
 
//Reference: https://youtu.be/N3LZM4WFHBY 
 @FXML
    void showRoad(KeyEvent event) {
        if (event.getCode() == KeyCode.DELETE) {
            text.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text1.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text1.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text2.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text2.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text3.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text3.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text4.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text4.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text5.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text5.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text6.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text6.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text7.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text7.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text8.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text8.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text9.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text9.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text10.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text10.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text11.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text11.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text12.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text12.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text13.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text13.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text14.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text14.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text15.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text15.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text16.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text16.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text17.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text17.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text18.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text18.setVisible(true);
        }

        if (event.getCode() == KeyCode.DELETE) {
            text19.setVisible(false);
        }

        if (event.getCode() == KeyCode.ENTER) {
            text19.setVisible(true);
        }
    }

    public void up(ActionEvent e) {
        myCircle.setCenterY(y -= 10);
    }

    public void down(ActionEvent e) {
        myCircle.setCenterY(y += 10);
    }

    public void left(ActionEvent e) {
        myCircle.setCenterX(x -= 10);
    }

    public void right(ActionEvent e) {

        myCircle.setCenterX(x += 10);
    }

    @FXML
    public void goToQuestion1Page(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("question1_Page.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
 public void goToQuestion2Page(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("question2_Page.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
 
    @FXML
 public void goToQuestion3Page(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("question3_Page.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
 
 
 
    @FXML
 public void goToQuestion4Page(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("question4_Page.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
     
    @FXML
 public void goToQuestion5Page(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("question5_Page.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
 
    @FXML
 public void goToQuestion6Page(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("question6_Page.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
 
 
 @FXML
 public void goToQuestion7Page(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("question7_Page.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
     
    @FXML
 public void goToQuestion8Page(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("question8_Page.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
 
    @FXML
 public void goToQuestion9Page(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("question9_Page.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
 
     
    @FXML
 public void goToQuestion10Page(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("question10_Page.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
 
    @FXML
 public void goToQuestion11Page(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("question11_Page.fxml"));
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
 
 
@FXML
 public void goToSEPage(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("SE_page.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
 
@FXML
 public void goToCSPage(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("CS_page.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
 
@FXML
 public void goToIoTPage(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("IoT_page.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
// 
//@FXML
// public void goToShowDataPage(ActionEvent event) throws Exception{
//        Parent root= FXMLLoader.load(getClass().getResource("showDataPage.fxml"));
//        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
//        Scene scene= new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
// 
 
 //Reference: https://www.youtube.com/watch?v=UdGiuDDi7Rg
    @FXML
    private ImageView img1;
    
    @FXML
    private ImageView img2;
    
     @FXML
    private ImageView img3;
    
    
    @FXML
    private ImageView img4;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
        TranslateTransition tran1= new TranslateTransition();
        tran1.setDuration(Duration.seconds(4));
        tran1.setByX(60);
        tran1.setAutoReverse(true);
        tran1.setCycleCount(Animation.INDEFINITE);
        tran1.setNode(img1);
        tran1.play();
        
        
        TranslateTransition tran2= new TranslateTransition();
        tran2.setDuration(Duration.seconds(3));
        tran2.setByX(60);
        tran2.setAutoReverse(true);
        tran2.setCycleCount(Animation.INDEFINITE);
        tran2.setNode(img2);
        tran2.play();
        
        
        
        TranslateTransition tran3= new TranslateTransition();
        tran3.setDuration(Duration.seconds(4));
        tran3.setByX(25);
        tran3.setAutoReverse(true);
        tran3.setCycleCount(Animation.INDEFINITE);
        tran3.setNode(img3);
        tran3.play();
        
        
        TranslateTransition tran4= new TranslateTransition();
        tran4.setDuration(Duration.seconds(3));
        tran4.setByX(60);
        tran4.setAutoReverse(true);
        tran4.setCycleCount(Animation.INDEFINITE);
        tran4.setNode(img4);
        tran4.play();
    }    
    
}
