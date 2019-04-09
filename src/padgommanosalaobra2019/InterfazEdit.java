/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padgommanosalaobra2019;

import FileEmployees.EmployeesFile;
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

/**
 *
 * @author sebas
 */
public class InterfazEdit {

    public VBox InterfazEB() {
        VBox vInterfazEB = new VBox();
        GridPane gPSB = new GridPane();
        VentanaMenu VM = new VentanaMenu();

        gPSB.setMinSize(950, 900);//tamaño gridpane
        gPSB.setVgap(10);
        gPSB.setHgap(10);
        gPSB.setAlignment(Pos.TOP_CENTER);
        gPSB.setTranslateX(-110);
        gPSB.setTranslateY(-5);
        

        Label lB_position = new Label("Posicion del empleado");
        gPSB.add(lB_position, 0, 0);

        ComboBox CBposition = new ComboBox();
        gPSB.add(CBposition, 0, 1);
        CBposition.getItems().addAll("Conductor de automovil", "Conductor de grúa", "Conductor Montacargas", "Conductor Vagoneta", "Conserje", "Administrativo tipo 1",
                "Administrativo tipo 2");

        Label lB_id = new Label("ID del empleado a buscar a buscar");
        gPSB.add(lB_id, 0, 2);

        TextField tF_id = new TextField();
        gPSB.add(tF_id, 0, 3);

        TextArea tA_search = new TextArea();
        gPSB.add(tA_search, 0, 5);
        tA_search.setTranslateX(-10);

        Button bTN_search = new Button("Buscar");
        gPSB.add(bTN_search, 0, 4);
        bTN_search.setOnAction((event) -> {
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
                    tA_search.setText(ef.getEmployeeSerie(Integer.parseInt(tF_id.getText())).toString());
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor de grúa")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee2);
                    tA_search.setText(ef.getEmployeeSerie(Integer.parseInt(tF_id.getText())).toString());
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor Montacargas")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee3);
                    tA_search.setText(ef.getEmployeeSerie(Integer.parseInt(tF_id.getText())).toString());
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor Vagoneta")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee4);
                    tA_search.setText(ef.getEmployeeSerie(Integer.parseInt(tF_id.getText())).toString());
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conserje")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee5);
                    tA_search.setText(ef.getEmployeeSerie(Integer.parseInt(tF_id.getText())).toString());
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Administrativo tipo 1")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee6);
                    tA_search.setText(ef.getEmployeeSerie(Integer.parseInt(tF_id.getText())).toString());
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Administrativo tipo 2")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee7);
                    tA_search.setText(ef.getEmployeeSerie(Integer.parseInt(tF_id.getText())).toString());
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        Button bTN_delete = new Button("Borrar");
        gPSB.add(bTN_delete, 0, 6);
        bTN_delete.setOnAction((event) -> {
            File fileEmployee = new File("Automile.Dat");
            File fileEmployee2 = new File("Crane.Dat");
            File fileEmployee3 = new File("wagons.Dat");
            File fileEmployee4 = new File("LiftTruck.Dat");
            File fileEmployee5 = new File("Janitor.Dat");
            File fileEmployee6 = new File("Adminitration1.Dat");
            File fileEmployee7 = new File("Administration2.Dat");
            int id = Integer.parseInt(tF_id.getText());

            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor de automovil")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee);
                    ef.deleteRecord(id);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor de grúa")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee2);
                    ef.deleteRecord(id);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor Montacargas")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee3);
                    ef.deleteRecord(id);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor Vagoneta")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee4);
                    ef.deleteRecord(id);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conserje")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee5);
                    ef.deleteRecord(id);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Administrativo tipo 1")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee6);
                    ef.deleteRecord(id);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Administrativo tipo 2")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee7);
                    ef.deleteRecord(id);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        Label lB_salary2 = new Label("Nuevo Salario");
        gPSB.add(lB_salary2, 0, 7);

        TextField tF_salary2 = new TextField();
        gPSB.add(tF_salary2, 0, 8);

        Label lbHours2 = new Label("nuevas horas");
        gPSB.add(lbHours2, 0, 9);

        TextField tFHours2 = new TextField();
        gPSB.add(tFHours2, 0, 10);

        Label lb_schedule2 = new Label("Dia o noche");
        gPSB.add(lb_schedule2, 0, 11);

        TextField tFSchedule2 = new TextField();
        gPSB.add(tFSchedule2, 0, 12);

        Button bTN_edit = new Button("Editar");
        gPSB.add(bTN_edit, 1, 12);
        bTN_edit.setOnAction((event) -> {
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
                    ef.EditRecord(Integer.parseInt(tF_id.getText()), Double.parseDouble(tF_salary2.getText()), Double.parseDouble(tFHours2.getText()), tFSchedule2.getText());
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor de grúa")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee2);
                    ef.EditRecord(Integer.parseInt(tF_id.getText()), Double.parseDouble(tF_salary2.getText()), Double.parseDouble(tFHours2.getText()), tFSchedule2.getText());
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor Montacargas")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee3);
                    ef.EditRecord(Integer.parseInt(tF_id.getText()), Double.parseDouble(tF_salary2.getText()), Double.parseDouble(tFHours2.getText()), tFSchedule2.getText());
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor Vagoneta")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee4);
                    ef.EditRecord(Integer.parseInt(tF_id.getText()), Double.parseDouble(tF_salary2.getText()), Double.parseDouble(tFHours2.getText()), tFSchedule2.getText());
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conserje")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee5);
                    ef.EditRecord(Integer.parseInt(tF_id.getText()), Double.parseDouble(tF_salary2.getText()), Double.parseDouble(tFHours2.getText()), tFSchedule2.getText());
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Administrativo tipo 1")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee6);
                    ef.EditRecord(Integer.parseInt(tF_id.getText()), Double.parseDouble(tF_salary2.getText()), Double.parseDouble(tFHours2.getText()), tFSchedule2.getText());
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Administrativo tipo 2")) {
                try {
                    EmployeesFile ef = new EmployeesFile(fileEmployee7);
                    ef.EditRecord(Integer.parseInt(tF_id.getText()), Double.parseDouble(tF_salary2.getText()), Double.parseDouble(tFHours2.getText()), tFSchedule2.getText());
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        Button btNExit = new Button("Salir");
        btNExit.setTranslateX(25);
        gPSB.add(btNExit, 1, 6);
        btNExit.setOnAction((event) -> {
            gPSB.getChildren().clear();
            gPSB.setBackground(Background.EMPTY);
            vInterfazEB.getChildren().clear();
        });
        btNExit.setTranslateX(-15);
       
        vInterfazEB.getChildren().addAll(gPSB);

        return vInterfazEB;
    }

}
