/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appestoque;

import controller.MainAppController;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Usuario;


/**
 *
 * @author gabri
 */
public class MainApp extends Application {
    
    private static Stage stage;//uma janela

   private double xOffset = 0;
   private double yOffset = 0;

    public MainApp(Usuario user1) {
        MainAppController.setUser2(user1);
    }
        
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/MainApp.fxml"));//carrega a tela criada em fxml
        
        stage.initStyle(StageStyle.TRANSPARENT);
            root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
            root.setOnMouseDragged(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            }
        });
        Scene scene = new Scene(root);//carregando fxml em uma cena
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);//coloca a cena em uma janela
        stage.show();//abre a janela
        setStage(stage);
    }
    
     public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        MainApp.stage = stage;
    }
    
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
    
    
    
    
    
}