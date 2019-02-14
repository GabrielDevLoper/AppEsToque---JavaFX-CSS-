package controller;

import appestoque.LoginApp;
import appestoque.MainApp;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import model.Usuario;

public class LoginAppController implements Initializable {

    
    @FXML
    private JFXTextField txtUsuario;

    @FXML
    private JFXPasswordField txtSenha;

    @FXML
    private JFXButton btnEntrar;

    @FXML
    private JFXButton btnSair;
    
    @FXML
    private Label lblUser;
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
         
         
        btnEntrar.setOnMouseClicked(((event) -> {
            OpenMainScreen();
           
            
           
        }));
        
        btnEntrar.setOnKeyPressed(((event) -> {
            if(event.getCode() == KeyCode.ENTER){
                OpenMainScreen();
            }
        }));
        
        btnSair.setOnMouseClicked(((event) -> {
            CloseLoginScreen();
        }));
        btnSair.setOnKeyPressed(((event) -> {
            if(event.getCode() == KeyCode.ENTER){
                CloseLoginScreen();
            }
        }));
        
        txtSenha.setOnKeyPressed(((event) -> {
            if(event.getCode() == KeyCode.ENTER){
                OpenMainScreen();
            }
        }));
        
        
        
        
    }
    
    
    public void OpenMainScreen(){
        Usuario user = new Usuario();
        user.setUsuario(txtUsuario.getText());
        MainApp main = new MainApp(user);
        CloseLoginScreen();
        try {
            main.start(new Stage());
        } catch (IOException ex) {
            Logger.getLogger(LoginAppController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void CloseLoginScreen(){
        LoginApp.getStage().close();
    }
    
   
    
}
