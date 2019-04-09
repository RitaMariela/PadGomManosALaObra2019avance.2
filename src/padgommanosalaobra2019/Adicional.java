/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padgommanosalaobra2019;

import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Rita
 */
public class Adicional {
    
    public VBox adicional(){
        VBox vAdicional= new VBox();
       GridPane gP2Employee=new GridPane(); 
       gP2Employee.setAlignment(Pos.CENTER);
       gP2Employee.setMinSize(700, 700);//tamaño gridpane 2
       gP2Employee.setAlignment(Pos.TOP_CENTER);
       //Label y ComboBox de horario
       
        Label lbSchedule = new Label("Horario");
            gP2Employee.add(lbSchedule, 0, 0);
            
        ComboBox CBposition = new ComboBox();
        gP2Employee.add(CBposition,0,1);
        CBposition.getItems().addAll("Diurno", "Nocturno");
        
         Label lbHours = new Label("Horas trabajadas");
            gP2Employee.add(lbSchedule, 1, 0);
            
         TextField tfHours=new TextField();
         gP2Employee.add(tfHours, 1, 1);
         
         vAdicional.getChildren().addAll(gP2Employee);
        
     return vAdicional;   
    }
    
    
}
