
package javafxapplication3;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button Boneco;
    @FXML
    private AnchorPane Cenario;
   private Boneco kenny;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        try {
            kenny = new Boneco("logPositions.txt");
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void evtClick(KeyEvent event) 
    {
        
       if(event.getCode() == KeyCode.A || event.getCode() == KeyCode.LEFT)
       {
           if(Boneco.getLayoutX()-8 > 0)
           {
                kenny.andaEsquerda();
                Boneco.setLayoutX(Boneco.getLayoutX()-8);
           }
          
       }
       else if(event.getCode() == KeyCode.W || event.getCode() == KeyCode.UP)
       {
         if(Boneco.getLayoutY()-8 > 0)
           {
           kenny.andaCima();
            Boneco.setLayoutY(Boneco.getLayoutY()-8);
            }
       } 
        else if(event.getCode() == KeyCode.D || event.getCode() == KeyCode.RIGHT)
       {
            if(Boneco.getLayoutX()+8 + Boneco.getWidth() < Cenario.getWidth())
           {
           kenny.andaDireita();
            Boneco.setLayoutX(Boneco.getLayoutX()+8);
           }
            
       } 
        else if(event.getCode() == KeyCode.S || event.getCode() == KeyCode.DOWN)
       {
           if(Boneco.getLayoutY()+8 + Boneco.getHeight()< Cenario.getHeight())
           {
              kenny.andaBaixo();
            Boneco.setLayoutY(Boneco.getLayoutY()+8); 
           }
           
       } 
    }
    
}
