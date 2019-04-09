/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padgommanosalaobra2019;

import Company.Vehicle;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import File.VehicleFile;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sebas
 */
public class Inventory {
    Company.Vehicle vh= new Vehicle() {
        @Override
        public void information() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    String Resultado="";
    InterfazVehicles iv=new InterfazVehicles();

    public VBox invtCar() {
        VBox vinvtacar= new VBox();
        GridPane gPInventory = new GridPane();
        gPInventory.setAlignment(Pos.CENTER);

        gPInventory.setMinSize(700, 700);//tamaño gridpane
       

        gPInventory.setVgap(10);
        gPInventory.setHgap(10);

        Label lB_Inventory = new Label("Inventario de Vehiculos");
        gPInventory.add(lB_Inventory, 0, 1);

        TextArea tA_Inventory = new TextArea();
        gPInventory.add(tA_Inventory, 0, 2);
//        for (int i = 0; i < iv.aL_information.size(); i++) {
//           Resultado+=iv.aL_information.get(i);
            
        //}
       // tA_Inventory.setText(Resultado);
        //System.out.println(Resultado);
        
        Button bTN_Invetory= new Button("Inventario");
        gPInventory.add(bTN_Invetory, 0, 0);
        bTN_Invetory.setOnAction((event) -> {
                File fileVehicle = new File("Vehicle.Dat");
            try {
                VehicleFile vf=new VehicleFile(fileVehicle);
                List<Vehicle> vehicles = vf.getAllPersons();
                
                for(Vehicle currentVehicle: vehicles){
                    tA_Inventory.setText(vehicles.toString());
            
        }
            } catch (IOException ex) {
                Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
            }
              
          
            
        });
        
        
          Button btNExit= new Button("Salir");
         gPInventory.add(btNExit, 0, 3);
         btNExit.setOnAction((event) -> {gPInventory.getChildren().clear();
         gPInventory.setBackground(Background.EMPTY);
         vinvtacar.getChildren().clear();
         });
        
         vinvtacar.getChildren().addAll(gPInventory);
        return vinvtacar;
    }

}
