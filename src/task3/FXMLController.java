/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author HaNdSyA---
 */
public class FXMLController implements Initializable {

    @FXML
    public Button btn;
    
    int c =0;
    
    @FXML
    void press(ActionEvent event){
        c++;
        btn.setText("Pressed: " + c);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
