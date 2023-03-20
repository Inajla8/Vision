/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * FXML Controller class
 *
 * @author najlaa
 */
public class CS_thankPageController implements Initializable {

    
    
    ObservableList<String> obuser = FXCollections.observableArrayList();
    @FXML
    private ListView<String> sho ;
    
    @FXML
    private Label usr;
    @FXML
    private Label txt;
    
     @FXML
     private Button exitButton;
     @FXML
     private AnchorPane anchorPane;

     public void exit(ActionEvent event){
        Stage stage=(Stage) anchorPane.getScene().getWindow();
        System.out.println("You successfully logged out!");
        stage.close();
     }
     
    
@FXML
 public void goToCSExtraInfoPage(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("CS_extraInfoPage.fxml"));
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
        List<user> user = null;
        Session Usession = HibernateUtil.getSessionFactory().openSession();
        Query Uquery = Usession.createQuery("from user");
        user = Uquery.list();

        for (user userlist : user) {
            obuser.add(userlist.getUserName());
           
        }
        Usession.close();
        sho.setItems(obuser);
        //sho = new ListView(obuser);
    }    
    
}
