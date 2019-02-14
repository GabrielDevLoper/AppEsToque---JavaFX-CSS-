/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appestoque;

import controller.LoginAppController;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author gabri
 */
public class LoginApp extends Application {
    
    private static Stage stage;//uma janela

  
    
    
     @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/LoginApp.fxml"));//carrega a tela criada em fxml
        Scene scene = new Scene(root);//carregando fxml em uma cena
        stage.setTitle("Tela de Login");
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);//coloca a cena em uma janela
        stage.initStyle(StageStyle.TRANSPARENT);
       
        stage.show();//abre a janela
        setStage(stage);
    }
    
    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        LoginApp.stage = stage;
    }
    
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
    
}