/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * FXML Controller class
 *
 * @author najlaa
 */
public class SignUpPageController implements Initializable {

    @FXML
    private TextField firstname;
    @FXML
    private TextField lastname;
    @FXML
    private TextField username;
    @FXML
    private PasswordField userPassword;
    
    @FXML
    private TextField email;
    
    
    @FXML
    private Label validTex;
    user userInfo= new user();

    
    
    @FXML
    public void validFirstName(ActionEvent event) throws Exception {
        if(firstname.getText().isEmpty() || firstname.getText().equals("") || !(firstname.getText().matches("^[A-Za-z]+$"))){
            validTex.setText("Please enter valid first name..!");
        }
        else {
            validTex.setText("The first name is valid");
        }
    }
    
    @FXML
    public void validLastName(ActionEvent event) throws Exception {
        if(lastname.getText().isEmpty() || lastname.getText().equals("") || !(lastname.getText().matches("^[A-Za-z]+$"))){
            validTex.setText("Please enter valid last name..!");
        }
        else {
            validTex.setText("The last name is valid");
        }
    }
    
    
    @FXML
    public void validUserName(ActionEvent event) throws Exception {
        if(username.getText().isEmpty() || username.getText().equals("") || !(username.getText().matches("^[A-Za-z]+$"))){
            validTex.setText("Please enter valid username..!");
        }
        else {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            boolean contains= false;
        List<user> uList = null;
        String sql = "from user";
        Query result = session.createQuery(sql);
        uList = result.list();
        System.out.println("item list size: " + uList.size());
        
        for (user i : uList) {
            String username_ = i.getUserName();
            if(username.getText().equals(username_)){
                contains= true;
                validTex.setText("This username is taken");
                break;
            }else{
                contains= false;
                validTex.setText("The username is valid");

            }
        }
        
         session.getTransaction().commit();
        session.close();
    }
        
    }
    
    
    
    @FXML
    public void validPassword(ActionEvent event) throws Exception {
        
        if(userPassword.getText().isEmpty() || userPassword.getText().equals("") || !(userPassword.getText().matches("^[0-9]+$"))){
            validTex.setText("Please enter valid password..!");
        }
        else {
            validTex.setText("The password is valid");
        }
    }
    
    
    
    //^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$
    
      
    @FXML
    public void validEmail(ActionEvent event) throws Exception {
        
        if(email.getText().isEmpty() || email.getText().equals("") || !(email.getText().matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"))){
            validTex.setText("Please enter valid email..!");
        }
        else {
            validTex.setText("The email is valid");
        }
    }
    
    
    @FXML
    public void signUp(ActionEvent event) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        if(firstname.getText().isEmpty()||firstname.getText().equals("")||lastname.getText().isEmpty() || lastname.getText().equals("")||username.getText().isEmpty() || username.getText().equals("")||email.getText().isEmpty() || email.getText().equals("")||userPassword.getText().isEmpty() || userPassword.getText().equals("")){
            validTex.setText("Please enter all your information to sign up");
        }
        else{
        userInfo.setFirstName(firstname.getText());
        userInfo.setLastName(lastname.getText());
        userInfo.setUserName(username.getText());
        userInfo.setPassword(userPassword.getText());
        userInfo.setEmail(email.getText());
        
        validTex.setText("You successfully sign up!");

        }
        session.save(userInfo);
        session.getTransaction().commit();
        session.close();
        
        
        Parent root= FXMLLoader.load(getClass().getResource("logInPage.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();


    }


    
    @FXML
 public void goToWelcomePage(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("welcomePage.fxml"));
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
 
    
    @FXML
    public void goToLogInPage(ActionEvent event) throws Exception{
        Parent root= FXMLLoader.load(getClass().getResource("logInPage.fxml"));
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
