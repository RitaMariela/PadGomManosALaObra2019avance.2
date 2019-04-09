/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padgommanosalaobra2019;

import File.VehicleFile;
import Company.Vehicle;
import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Rita
 */
public class PadGomManosALaObra2019 extends Application {

    @Override
    public void start(Stage primaryStage) {
        VentanaMenu vm = new VentanaMenu();
        primaryStage.setTitle("PadGom Manos a la Obra 2019");
        primaryStage.setScene(vm.Menu());

        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        launch(args);
        Company.Employee em;
        em = new Company.Employee() {
            @Override
            public void CalculaterSalary() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        Company.Vehicle vh = new Vehicle() {
            @Override
            public void information() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

    }
}
