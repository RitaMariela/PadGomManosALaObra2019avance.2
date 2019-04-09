/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padgommanosalaobra2019;

import File.VehicleFile;
import Company.Automobile;
import Company.Driver;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import Company.HeavyMachinary;
import Company.Vehicle;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;

/**
 *
 * @author Rita
 */
public class InterfazVehicles {

    String result = "", r = "";
    Automobile at = new Automobile();
    HeavyMachinary HM = new HeavyMachinary();
    Vehicle vh = new Vehicle() {
        @Override
        public void information() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };

    public static VehicleFile vehicleFile;
    public static Vehicle vehicle1, vehicle2, vehicle3, vehicle4;

    public static void setUp() throws Exception {

        File fileVehicle = new File("./Vehicle.dat");

        vehicle1 = new Vehicle("Honda", 3344, 2000, 25000, true) {
            @Override
            public void information() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        vehicle2 = new Vehicle("Toyota", 3456, 500, 2300, false) {
            @Override
            public void information() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        vehicle3 = new Vehicle("Nissan", 8763, 300, 2500, true) {
            @Override
            public void information() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        //Insertar en el archivo
        vehicleFile = new VehicleFile(fileVehicle);
        vehicleFile.addEndVehicle(vehicle1);
        vehicleFile.addEndVehicle(vehicle2);
        vehicleFile.addEndVehicle(vehicle3);

    }

    public VBox InterfazV() {
        VBox vInterfazV = new VBox();

        GridPane gP3Employee = new GridPane();
        gP3Employee.setAlignment(Pos.CENTER);

        //gP3Employee.setAlignment(Pos.CENTER);
        VentanaMenu VM = new VentanaMenu();
        gP3Employee.setMinSize(700, 700);//tamaño gridpane
        gP3Employee.setVgap(10);
        gP3Employee.setHgap(10);

        //Label y ComboBox tipo
        Label lbType = new Label("Tipo de autos");
        gP3Employee.add(lbType, 0, 0);

        ComboBox CBType = new ComboBox();
        gP3Employee.add(CBType, 1, 0);
        CBType.getItems().addAll("Automobile", "Gruas", "Montacargas", "Vagonetas");

        //Label y TextField lbMarca
        Label lbBrand = new Label("Marca del auto");
        gP3Employee.add(lbBrand, 0, 1);

        TextField tFMarca = new TextField();
        gP3Employee.add(tFMarca, 1, 1);

        //Label y TexteField lb_Placa
        Label lbLicensePlate = new Label("Licencia del vehiculo");
        gP3Employee.add(lbLicensePlate, 0, 2);

        TextField tFLicensePlate = new TextField();
        gP3Employee.add(tFLicensePlate, 1, 2);

        Label lbyear = new Label("Año de Fabricación");
        gP3Employee.add(lbyear, 0, 3);

        TextField tFYear = new TextField();
        gP3Employee.add(tFYear, 1, 3);

        Label lbmileage = new Label("Kilometraje de vehiculo");
        gP3Employee.add(lbmileage, 0, 4);

        TextField tFmileage = new TextField();
        gP3Employee.add(tFmileage, 1, 4);

        Label lbAmericano = new Label("Fabricado en america");
        gP3Employee.add(lbAmericano, 0, 5);

        ComboBox CBAmerican = new ComboBox();
        gP3Employee.add(CBAmerican, 1, 5);
        CBAmerican.getItems().addAll("Si", "No");

        Label lB_Result = new Label();
        gP3Employee.add(lB_Result, 0, 10);

        Button bTNAdd = new Button("Agregar Vehiculo");
        gP3Employee.add(bTNAdd, 0, 8);
        bTNAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                File fileVehicle = new File("Vehicle.Dat");
                String brand = tFMarca.getText();
                int licensePlate = Integer.parseInt(tFLicensePlate.getText());
                int year = Integer.parseInt(tFYear.getText());
                float mileage = Float.parseFloat(tFmileage.getText());
                boolean a = false;
                if (CBAmerican.getValue().equals("Si")) {
                    a = true;
                }
                Vehicle ve = new Vehicle(brand, licensePlate, year, mileage, a) {
                    @Override
                    public void information() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                };

                try {
                    VehicleFile vf = new VehicleFile(fileVehicle);

                    if (vf.notRepite(Integer.parseInt(tFLicensePlate.getText()))) {
                        vf.addEndVehicle(ve);
                        lB_Result.setText("Agregado");
                        tFMarca.setText("");
                        tFYear.setText("");
                        tFmileage.setText("");
                        tFLicensePlate.setText("");
                    } else {
                        lB_Result.setText("El vehiculo ya existe, no pudo ser agregado");
                        tFLicensePlate.setText("");

                    }

                } catch (IOException ex) {
                }

            }

        });

        Button btNExit = new Button("Salir");
        gP3Employee.add(btNExit, 1, 8);
        btNExit.setOnAction((event) -> {
            gP3Employee.getChildren().clear();
            gP3Employee.setBackground(Background.EMPTY);
            vInterfazV.getChildren().clear();
        });

        vInterfazV.getChildren().addAll(gP3Employee);

        return vInterfazV;
    }

}
