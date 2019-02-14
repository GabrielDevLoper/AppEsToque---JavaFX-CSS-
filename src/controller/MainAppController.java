package controller;

import appestoque.LoginApp;
import appestoque.MainApp;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import model.Usuario;


public class MainAppController implements Initializable {

   

    @FXML private AnchorPane TopBar;
    @FXML private JFXButton btnSair;
    @FXML private Label lblUsuario;
    @FXML private AnchorPane Produtos;
    @FXML private AnchorPane Cadastros;
    @FXML private AnchorPane Estoque;
    
    @FXML private JFXButton btnProdutos;
    @FXML private JFXButton btnCadastros;
    @FXML private JFXButton btnEstoque;
    @FXML private JFXButton btnFecharProd;
    @FXML private JFXButton btnFecharEstoq;
    @FXML private JFXButton btnFecharCad;
    
    @FXML  private Pane pnDadosProduto;
    @FXML private Label lblID;
    @FXML private Label lblCATEGORIA;
    @FXML private Label lblDESC;
    @FXML private Label lblUNIDADE;
    @FXML private Label lblQUANTIDADE;
    @FXML private Label lblVALOR;
    @FXML private Label lblVALORTOTAL;
    
    
    private static Usuario user2;

    public static Usuario getUser2() {
        return user2;
    }

    public static void setUser2(Usuario user2) {
        MainAppController.user2 = user2;
    }
    
    
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initUser();
        
      Produtos.setVisible(false);
      Cadastros.setVisible(false);
      Estoque.setVisible(false);
        
        btnSair.setOnMouseClicked(((event) -> {
            CloseMainScreen();
      })); 
      btnFecharProd.setOnMouseClicked(((event) -> {
          Produtos.setVisible(false);
      }));
      btnFecharCad.setOnMouseClicked(((event) -> {
          Cadastros.setVisible(false);
      }));
      btnFecharEstoq.setOnMouseClicked(((event) -> {
          Estoque.setVisible(false);
      }));
      
      //Ações botões da toobar
        btnProdutos.setOnMouseClicked(((event) -> {
            Produtos.setVisible(true);
            Cadastros.setVisible(false);
            Estoque.setVisible(false);
        }));
        btnCadastros.setOnMouseClicked(((event) -> {
            Cadastros.setVisible(true);
            Produtos.setVisible(false);
            Estoque.setVisible(false);
        }));
        btnEstoque.setOnMouseClicked(((event) -> {
            Estoque.setVisible(true);
            Produtos.setVisible(false);
            Cadastros.setVisible(false);
        }));
        
    }  
    
    public void CloseMainScreen(){
        MainApp.getStage().close();
    }
    
    public void initUser(){
        lblUsuario.setText(user2.getUsuario());
    }
    
}
