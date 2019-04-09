/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padgommanosalaobra2019;

import Company.HeavyMachinary;
import File.VehicleFile;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author sebas
 */
public class InterfazSearchVehicle {

    boolean b= false;
    InterfazVehicles iv = new InterfazVehicles();
    HeavyMachinary hv = new HeavyMachinary();
    String result;

    public VBox InterfazSV() {
        VBox vInterfazSV = new VBox();
        GridPane gPSearchV = new GridPane();
        VentanaMenu VM = new VentanaMenu();

        gPSearchV.setMinSize(700, 850);//tamaño gridpane
        gPSearchV.setVgap(10);
        gPSearchV.setHgap(10);
        gPSearchV.setAlignment(Pos.TOP_CENTER);

        Label lB_serie = new Label("Serie del vehiculo a buscar");
        gPSearchV.add(lB_serie, 0, 0);

        TextField tF_Serie = new TextField();
        gPSearchV.add(tF_Serie, 0, 1);

        TextArea tA_search = new TextArea();
        gPSearchV.add(tA_search, 0, 3);

        Button bTN_search = new Button("Buscar");
        gPSearchV.add(bTN_search, 0, 2);
        bTN_search.setOnAction((event) -> {
//            for (int i = 0; i <iv.aL_information.size() ; i++) {
//                    result+="\n"+ iv.aL_information.get(i);  
//            }
//            tA_search.setText(result);
            File fileVehicle = new File("Vehicle.Dat");
            try {
                VehicleFile vf = new VehicleFile(fileVehicle);
                
                
                tA_search.setText(vf.getVehiclSerie(Integer.parseInt(tF_Serie.getText())).toString());
               

            } catch (IOException ex) {
                Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
            }

        });

        Button bTN_delete = new Button("Borrar");
        gPSearchV.add(bTN_delete, 0, 4);
        bTN_delete.setOnAction((event) -> {
            File fileVehicle = new File("Vehicle.Dat");
            int serie = Integer.parseInt(tF_Serie.getText());
            try {
                VehicleFile vf = new VehicleFile(fileVehicle);
                //tA_search.setText(""+vf.getVehicle(Integer.parseInt(tF_Serie.getText())-1));
                vf.deleteRecord(serie);

            } catch (IOException ex) {
                Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        Label lB_name = new Label("Nombre");
        gPSearchV.add(lB_name, 0, 6);

        TextField tF_name = new TextField();
        gPSearchV.add(tF_name, 0, 7);

        Label lbYear2 = new Label("año");
        gPSearchV.add(lbYear2, 0, 8);

        TextField tFYear2 = new TextField();
        gPSearchV.add(tFYear2, 0, 9);

        Label lb_American = new Label("Americano");
        gPSearchV.add(lb_American, 0, 10);

        ComboBox cBAmerican = new ComboBox();
        cBAmerican.getItems().addAll("Si", "No");
        gPSearchV.add(cBAmerican, 0, 11);

        Button bTN_edit = new Button("Editar");
        gPSearchV.add(bTN_edit, 1, 11);
        
        
        
        bTN_edit.setOnAction((event) -> {
            if(cBAmerican.getSelectionModel().getSelectedItem().equals("Si")){
                b =true;   
            }
            
            File fileVehicle = new File("Vehicle.Dat");
            try {
                VehicleFile vf = new VehicleFile(fileVehicle);
                //tA_search.setText(""+vf.getVehicle(Integer.parseInt(tF_Serie.getText())-1));
                vf.EditRecord(Integer.parseInt(tF_Serie.getText()),tF_name.getText(),Integer.parseInt(tFYear2.getText()),b);

            } catch (IOException ex) {
                Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
        Button btNExit = new Button("Salir");
        gPSearchV.add(btNExit, 0, 5);
        btNExit.setOnAction((event) -> {
            gPSearchV.getChildren().clear();
            gPSearchV.setBackground(Background.EMPTY);
            vInterfazSV.getChildren().clear();
        });

        vInterfazSV.getChildren().addAll(gPSearchV);
        return vInterfazSV;
    }

}
