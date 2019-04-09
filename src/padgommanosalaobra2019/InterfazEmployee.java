/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padgommanosalaobra2019;

import Company.Driver;
import Company.DriversHeavyMachinary;
import Company.HeavyMachinary;
import Company.Employee;
import FileEmployees.EmployeesFile;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Pos;
import javafx.scene.Scene;
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
 * @author Rita
 */
public class InterfazEmployee {

    public static EmployeesFile employeeFile;

    String result = "";
    ArrayList al_List = new ArrayList();
    ArrayList arrayname = new ArrayList();
    ArrayList arrayLastname = new ArrayList();
    ArrayList arraySalary = new ArrayList();
    ArrayList arrayID = new ArrayList();
    ArrayList arrayNumber = new ArrayList();
    ArrayList arrayQuality = new ArrayList();
    ArrayList arrayPosition = new ArrayList();

    DriversHeavyMachinary DHM = new DriversHeavyMachinary();
    Company.Employee emp = new Company.Employee() {
        @Override
        public void CalculaterSalary() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };

    public VBox employee() {
        VBox vEmployee = new VBox();

        GridPane gPEmployee = new GridPane();
        VentanaMenu VM = new VentanaMenu();

        gPEmployee.setMinSize(600, 750);//tamaño gridpane
        gPEmployee.setAlignment(Pos.TOP_CENTER);

        gPEmployee.setVgap(10);
        gPEmployee.setHgap(10);

        Label lbName = new Label("Nombre");
        gPEmployee.add(lbName, 0, 0);
        //col, fila
        TextField tFName = new TextField();
        gPEmployee.add(tFName, 0, 1);
        //Espacio Apellido
        Label lb_LastName = new Label("Apellidos");
        gPEmployee.add(lb_LastName, 1, 0);
        //col, fila
        TextField tFLastName = new TextField();
        gPEmployee.add(tFLastName, 1, 1);

        //Salario de Empleado
        Label lbSalary = new Label("Salario");
        gPEmployee.add(lbSalary, 0, 2);

        TextField tFSalary = new TextField();
        gPEmployee.add(tFSalary, 1, 2);

        //Numero de empleado
        Label lbEmployeeNumber = new Label("Número de empleado");
        gPEmployee.add(lbEmployeeNumber, 0, 4);

        TextField tFEmployeeNumber = new TextField();
        gPEmployee.add(tFEmployeeNumber, 1, 4);

        //Identificacion
        Label lbID = new Label("Cédula");
        gPEmployee.add(lbID, 0, 3);

        TextField tFID = new TextField();
        gPEmployee.add(tFID, 1, 3);
        //Label ComBox position
        Label lbCBposition = new Label("Position del empleado");
        gPEmployee.add(lbCBposition, 0, 5);

        TextField tF_A1 = new TextField();
        gPEmployee.add(tF_A1, 1, 9);
        TextField tF_A2 = new TextField();
        gPEmployee.add(tF_A2, 1, 10);

        ComboBox CBposition = new ComboBox();
        gPEmployee.add(CBposition, 1, 5);
        CBposition.getItems().addAll("Conductor de automovil", "Conductor de grúa", "Conductor Montacargas", "Conductor Vagoneta", "Conserje", "Administrativo tipo 1",
                "Administrativo tipo 2");

        CBposition.setOnAction((event) -> {
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor de automovil")) {
                Label lbA1 = new Label("Donador de Organos");
                gPEmployee.add(lbA1, 0, 9);
//                 new TextField();
//                
                Label lbA2 = new Label("Problemas Legales");
                gPEmployee.add(lbA2, 0, 10);
                new TextField();

            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor de grúa")) {
                Label lbA1 = new Label("Donador de Organos");
                gPEmployee.add(lbA1, 0, 9);
//                 new  TextField();
//                gPEmployee.add(tF_A1, 1, 9);
                Label lbA2 = new Label("Problemas Legales");
                gPEmployee.add(lbA2, 0, 10);
                new TextField();
//                gPEmployee.add(tF_A2, 1, 10);
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor Montacargas")) {
                Label lbA1 = new Label("Donador de Organos");
                gPEmployee.add(lbA1, 0, 9);
//                 new TextField();
//                gPEmployee.add(tF_A1, 1, 9);
                Label lbA2 = new Label("Problemas Legales");
                gPEmployee.add(lbA2, 0, 10);
//                 new TextField();
//                gPEmployee.add(tF_A2, 1, 10);
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conductor Vagoneta")) {
                Label lbA1 = new Label("Donador de Organos");
                gPEmployee.add(lbA1, 0, 9);
//                 new TextField();
//                //gPEmployee.add(tF_AV1, 1, 9);
                Label lbA2 = new Label("Problemas Legales");
                gPEmployee.add(lbA2, 0, 10);
//                new TextField();
//                gPEmployee.add(tF_A2, 1, 10);
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Conserje")) {
                Label lbA1 = new Label("Area de Limpieza");
                gPEmployee.add(lbA1, 0, 9);
//                 new TextField();
//                gPEmployee.add(tF_A1, 1, 9);
                Label lbA2 = new Label("Lesiones");
                gPEmployee.add(lbA2, 0, 10);
//                new TextField();
//                gPEmployee.add(tF_A2, 1, 10);
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Administrativo tipo 1")) {
                Label lbA1 = new Label("Area de trabajo");
                gPEmployee.add(lbA1, 0, 9);
//                 new TextField();
//                gPEmployee.add(tF_A1, 1, 9);
                Label lbA2 = new Label("Habilidades de Software");
                gPEmployee.add(lbA2, 0, 10);
//                 new TextField();
//                gPEmployee.add(tF_A2, 1, 10);
            }
            if (CBposition.getSelectionModel().getSelectedItem().equals("Administrativo tipo 2")) {
                Label lbA1 = new Label("Area de trabajo");
                gPEmployee.add(lbA1, 0, 9);
//                 new TextField();
//                gPEmployee.add(tF_A1, 1, 9);
                Label lbA2 = new Label("Habilidades de Software");
                gPEmployee.add(lbA2, 0, 10);
//                new TextField();
//                gPEmployee.add(tF_A2, 1, 10);
            }
        });

        //Label Combox qualify
        Label lbCBqualify = new Label("Ingresar la position del empleado");
        gPEmployee.add(lbCBqualify, 0, 6);
//        
        Label lBresult = new Label();
        gPEmployee.add(lBresult, 0, 12);

        ComboBox CBqualify = new ComboBox();
        gPEmployee.add(CBqualify, 1, 6);
        CBqualify.getItems().addAll("Si", "No");

        Label lB_Horas = new Label("Horas");
        gPEmployee.add(lB_Horas, 0, 7);

        TextField tF_horas = new TextField();
        gPEmployee.add(tF_horas, 1, 7);

        Label lB_DN = new Label("Dia o Noche");
        gPEmployee.add(lB_DN, 0, 8);

        TextField tF_DN = new TextField();
        gPEmployee.add(tF_DN, 1, 8);

        Button bTNAdd = new Button("Agregar Empleado");
        gPEmployee.add(bTNAdd, 0, 11);
        bTNAdd.setOnAction((event) -> {
            lBresult.setText("Agregado");
//            al_List.add(tFName.getText() + ", " + tFLastName.getText() + ", " + Integer.parseInt(tFSalary.getText()) + ", " + Integer.parseInt(tFEmployeeNumber.getText()) + ", " + Integer.parseInt(tFID.getText()) + ", " + CBposition.getSelectionModel().getSelectedItem() + ", " + CBqualify.getSelectionModel().getSelectedItem());
//            arrayname.add(tFName.getText());
//            arrayID.add(Integer.parseInt(tFID.getText()));

            File fileEmployee = new File("Automile.Dat");
            File fileEmployee2 = new File("Crane.Dat");
            File fileEmployee3 = new File("wagons.Dat");
            File fileEmployee4 = new File("LiftTruck.Dat");
            File fileEmployee5 = new File("Janitor.Dat");
            File fileEmployee6 = new File("Adminitration1.Dat");
            File fileEmployee7 = new File("Administration2.Dat");
            String name = tFName.getText();
            String lastName = tFLastName.getText();
            double salary = Double.parseDouble(tFSalary.getText());
            int ID = Integer.parseInt(tFID.getText());
            int EmployeeNumber = Integer.parseInt(tFEmployeeNumber.getText());
            String position = "" + CBposition.getSelectionModel().getSelectedItem();
            String quilify = "" + CBqualify.getSelectionModel().getSelectedItem();
            double hours = Double.parseDouble(tF_horas.getText());
            String schedule = tF_DN.getText();
            String attribute1 = tF_A1.getText();
            String attribute2 = tF_A2.getText();

            Employee em = new Employee(name, lastName, salary, ID, EmployeeNumber, position, quilify, hours, schedule, attribute1, attribute2) {
                @Override
                public void CalculaterSalary() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };

            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor de automovil")){
                try {
                    EmployeesFile ef= new EmployeesFile(fileEmployee);
                    ef.addEndEmployee(em);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor de grúa")){
                try {
                    EmployeesFile ef= new EmployeesFile(fileEmployee2);
                    ef.addEndEmployee(em);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor Montacargas")){
                try {
                    EmployeesFile ef= new EmployeesFile(fileEmployee3);
                    ef.addEndEmployee(em);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor Vagoneta")){
                try {
                    EmployeesFile ef= new EmployeesFile(fileEmployee4);
                    ef.addEndEmployee(em);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(CBposition.getSelectionModel().getSelectedItem().equals("Conserje")){
                try {
                    EmployeesFile ef= new EmployeesFile(fileEmployee5);
                    ef.addEndEmployee(em);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(CBposition.getSelectionModel().getSelectedItem().equals("Administrativo tipo 1")){
                try {
                    EmployeesFile ef= new EmployeesFile(fileEmployee6);
                    ef.addEndEmployee(em);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(CBposition.getSelectionModel().getSelectedItem().equals("Administrativo tipo 2")){
                try {
                    EmployeesFile ef= new EmployeesFile(fileEmployee7);
                    ef.addEndEmployee(em);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            

        });

//        TextField tF_ID2 = new TextField();
//        gPEmployee.add(tF_ID2, 0, 11);
//        TextArea ta_information = new TextArea();
//        gPEmployee.add(ta_information, 0, 12);
//        ta_information.setMaxSize(300, 100);
//        ta_information.setMinSize(300, 100);
//        Button btnsearch = new Button("Buscar Empleado por ID");
//        gPEmployee.add(btnsearch, 1, 11);
//        btnsearch.setOnAction((event) -> {
//            for (int i = 0; i < al_List.size(); i++) {
//                if (arrayname.get(i).equals(tF_ID2.getText())) {
//                    result = "" + al_List.get(i);
//                }
//
////            }
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor de automovil")&& CBqualify.getSelectionModel().getSelectedItem().equals("Si")&&tF_DN.getText().equals("dia"))
//               result+=", el salario es: "+((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText())) + ((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText())) * 0.0395));
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor de automovil")&& CBqualify.getSelectionModel().getSelectedItem().equals("No")&&tF_DN.getText().equals("dia"))
//                result+=", el salario es: "+((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText())));
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor de automovil") && CBqualify.getSelectionModel().getSelectedItem().equals("No") && tF_DN.getText().equals("noche"))
//                result+=", el salario es: "+((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText()))*2);
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor de automovil") && CBqualify.getSelectionModel().getSelectedItem().equals("Si") && tF_DN.getText().equals("noche"))
//                result+=", el salario es: "+(((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText())))*2 + (((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText()))*2) * 0.0395));
////            
////            
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor de grúa")&& CBqualify.getSelectionModel().getSelectedItem().equals("Si")&&tF_DN.getText().equals("dia"))
//                result+=", el salario es: "+((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText())) + ((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText())) * 0.0395)+8);
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor de grúa")&& CBqualify.getSelectionModel().getSelectedItem().equals("No")&&tF_DN.getText().equals("dia"))
//                result+=", el salario es: "+((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText()))+8);
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor de grúa")&& CBqualify.getSelectionModel().getSelectedItem().equals("No")&&tF_DN.getText().equals("noche"))
//                result+=", el salario es: "+(((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText()))*2)+8);
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor de grúa")&& CBqualify.getSelectionModel().getSelectedItem().equals("Si")&&tF_DN.getText().equals("noche"))
//                result+=", el salario es: "+(((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText()))*2) + (((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText()))*2) * 0.0395)+8);
//            
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor Vagoneta")&& CBqualify.getSelectionModel().getSelectedItem().equals("Si")&&tF_DN.getText().equals("dia"))
//                result+=", el salario es: "+((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText())) + ((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText())) * 0.0395)+6);
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor Vagoneta")&& CBqualify.getSelectionModel().getSelectedItem().equals("No")&&tF_DN.getText().equals("dia"))
//                result+=", el salario es: "+((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText()))+6);
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor Vagoneta")&& CBqualify.getSelectionModel().getSelectedItem().equals("No")&&tF_DN.getText().equals("noche"))
//                result+=", el salario es: "+(((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText()))*2)+6);
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor Vagoneta")&& CBqualify.getSelectionModel().getSelectedItem().equals("Si")&&tF_DN.getText().equals("noche"))
//                result+=", el salario es: "+(((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText()))*2) + (((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText()))*2) * 0.0395)+6);
//            
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor Montacargas")&& CBqualify.getSelectionModel().getSelectedItem().equals("Si")&&tF_DN.getText().equals("dia"))
//                result+=", el salario es: "+((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText())) + ((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText())) * 0.0395)+14);
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor Montacargas")&& CBqualify.getSelectionModel().getSelectedItem().equals("No")&&tF_DN.getText().equals("dia"))
//                result+=", el salario es: "+((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText()))+14);
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor Montacargas")&& CBqualify.getSelectionModel().getSelectedItem().equals("No")&&tF_DN.getText().equals("noche"))
//                result+=", el salario es: "+(((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText()))*2)+14);
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conductor Montacargas")&& CBqualify.getSelectionModel().getSelectedItem().equals("Si")&&tF_DN.getText().equals("noche"))
//                result+=", el salario es: "+(((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText()))*2) + (((Integer.parseInt(""+tFSalary.getText()) * Integer.parseInt(""+tF_horas.getText()))*2) * 0.0395)+14);
//            
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conserje")&& CBqualify.getSelectionModel().getSelectedItem().equals("Si"))
//                result+=((Integer.parseInt(""+tFSalary.getText()))+((Integer.parseInt(""+tFSalary.getText()))/8)+((((Integer.parseInt(""+tFSalary.getText()))/8)*0.25)*(Integer.parseInt(""+tF_horas.getText())))+(((Integer.parseInt(""+tFSalary.getText()))+((Integer.parseInt(""+tFSalary.getText()))/8)+((((Integer.parseInt(""+tFSalary.getText()))/8)*0.25)*(Integer.parseInt(""+tF_horas.getText())))*0.0395)));
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Conserje")&& CBqualify.getSelectionModel().getSelectedItem().equals("No"))
//                result+=((Integer.parseInt(""+tFSalary.getText()))+((Integer.parseInt(""+tFSalary.getText()))/8)+((((Integer.parseInt(""+tFSalary.getText()))/8)*0.25)*(Integer.parseInt(""+tF_horas.getText()))));
//           
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Administrativo tipo 1")&& CBqualify.getSelectionModel().getSelectedItem().equals("Si"))
//                result+=((Integer.parseInt(""+tFSalary.getText()))*((Integer.parseInt(""+tFSalary.getText()))*0.0395));
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Administrativo tipo 1")&& CBqualify.getSelectionModel().getSelectedItem().equals("No"))
//                result+=(Integer.parseInt(""+tFSalary.getText()));
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Administrativo tipo 2")&& CBqualify.getSelectionModel().getSelectedItem().equals("Si"))
//                result+=(((Integer.parseInt(""+tFSalary.getText()))+(((Integer.parseInt(""+tFSalary.getText()))*0.20)+(Integer.parseInt(""+tFSalary.getText())))*0.0395)+((Integer.parseInt(""+tFSalary.getText()))*0.20));
//            if(CBposition.getSelectionModel().getSelectedItem().equals("Administrativo tipo 2")&& CBqualify.getSelectionModel().getSelectedItem().equals("No"))
//                result+=(((Integer.parseInt(""+tFSalary.getText()))+(((Integer.parseInt(""+tFSalary.getText()))*0.20))));
// 
//
//            
//            
//            
//            
//            ta_information.setText(result);
//        });
        Button btNExit = new Button("Salir");
        gPEmployee.add(btNExit, 0, 18);
        btNExit.setOnAction((event) -> {
            gPEmployee.getChildren().clear();
            gPEmployee.setBackground(Background.EMPTY);
            vEmployee.getChildren().clear();
        });
        vEmployee.getChildren().addAll(gPEmployee);
        return vEmployee;
    }
}
