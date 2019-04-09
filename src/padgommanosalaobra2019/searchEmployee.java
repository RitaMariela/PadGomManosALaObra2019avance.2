/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padgommanosalaobra2019;

import Company.Employee;
import FileEmployees.EmployeesFile;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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

/**
 *
 * @author sebas
 */
public class searchEmployee {

    String resultado = "";
    Company.Employee em = new Company.Employee() {
        @Override
        public void CalculaterSalary() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };

    public VBox InterfazSE() {
        VBox vInterfazSE = new VBox();
        GridPane gPSearchE = new GridPane();
        VentanaMenu VM = new VentanaMenu();

        gPSearchE.setMinSize(700, 850);//tamaño gridpane
        gPSearchE.setVgap(10);
        gPSearchE.setHgap(10);
        gPSearchE.setAlignment(Pos.TOP_CENTER);

        Label lbCBposition = new Label("Nombre del empleado");
        gPSearchE.add(lbCBposition, 0, 2);
        lbCBposition.setTranslateX(30);

        ComboBox CBposition = new ComboBox();
        gPSearchE.add(CBposition, 1, 1);
        CBposition.getItems().addAll("Conductor de automovil", "Conductor de grúa", "Conductor Montacargas", "Conductor Vagoneta", "Conserje", "Administrativo tipo 1",
                "Administrativo tipo 2");
        CBposition.setTranslateX(-30);

        Label lbname = new Label("Ingresar posición");
        gPSearchE.add(lbname, 0, 1);
        lbname.setTranslateX(30);

        TextField tFName = new TextField();
        gPSearchE.add(tFName, 1, 2);
        tFName.setTranslateX(-30);

        TextArea tA_search = new TextArea();
        gPSearchE.add(tA_search, 0, 3);
        tA_search.setTranslateX(60);
        tA_search.setTranslateY(40);
        tA_search.maxHeight(50);
        tA_search.minHeight(50);

        Button bTN_search = new Button("Buscar empleado");
        gPSearchE.add(bTN_search, 1, 30);
        bTN_search.setOnAction(((event) -> {
            File fileEmployee = new File("Automile.Dat");
            File fileEmployee2 = new File("Crane.Dat");
            File fileEmployee3 = new File("wagons.Dat");
            File fileEmployee4 = new File("LiftTruck.Dat");
            File fileEmployee5 = new File("Janitor.Dat");
            File fileEmployee6 = new File("Adminitration1.Dat");
            File fileEmployee7 = new File("Administration2.Dat");
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor de automovil")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee);
                    List<Employee> persons = ef.getAllPersons();
                    for (Employee cuEmployee : persons) {
                        tA_search.setText(persons.toString());

                    }

                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor de grúa")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee2);
                    List<Employee> persons = ef.getAllPersons();
                    for (Employee cuEmployee : persons) {
                        tA_search.setText(persons.toString());

                    }
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor Montacargas")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee3);
                    List<Employee> persons = ef.getAllPersons();
                    for (Employee cuEmployee : persons) {
                        tA_search.setText(persons.toString());

                    }
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor Vagoneta")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee4);
                    List<Employee> persons = ef.getAllPersons();
                    for (Employee cuEmployee : persons) {
                        tA_search.setText(persons.toString());

                    }
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conserje")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee5);
                    List<Employee> persons = ef.getAllPersons();
                    for (Employee cuEmployee : persons) {
                        tA_search.setText(persons.toString() + "\n");

                    }
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Administrativo tipo 1")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee6);
                    List<Employee> persons = ef.getAllPersons();
                    for (Employee cuEmployee : persons) {
                        tA_search.setText(persons.toString());

                    }
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Administrativo tipo 2")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee7);
                    List<Employee> persons = ef.getAllPersons();
                    for (Employee cuEmployee : persons) {
                        tA_search.setText(persons.toString());

                    }
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }));

        Button btNExit = new Button("Salir");
        btNExit.setTranslateX(25);
        gPSearchE.add(btNExit, 0, 30);
        btNExit.setOnAction((event) -> {
            gPSearchE.getChildren().clear();
            gPSearchE.setBackground(Background.EMPTY);
            InterfazSE().getChildren().clear();
        });

        vInterfazSE.getChildren().addAll(gPSearchE);
        return vInterfazSE;
    }

}
