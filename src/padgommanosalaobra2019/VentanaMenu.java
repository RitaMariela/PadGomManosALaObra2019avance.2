/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padgommanosalaobra2019;

import java.awt.Image;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;

/**
 *
 * @author Rita
 */
public class VentanaMenu {

    VBox vMenu = new VBox();
    VBox vWindows = new VBox();

    public Scene Menu() {
        InterfazEmployee em = new InterfazEmployee();
        searchEmployee sm = new searchEmployee();
        Inventory ivt = new Inventory();
        InterfazSearchVehicle isv = new InterfazSearchVehicle();
        InterfazEdit ie = new InterfazEdit();

        InterfazVehicles iv = new InterfazVehicles();

        vMenu = new VBox();
        vWindows.setStyle("-fx-background-color:#9AC0CD");
        vMenu.setStyle("-fx-background-image: url(autos.png);"
                + "    -fx-background-repeat: no-repeat;"
                + "    -fx-background-size: 700 700;"
                + "    -fx-background-position: center;");

        Scene scene1 = new Scene(vMenu, 700, 700);

        MenuBar mB_Menu = new MenuBar();

        //Menu employees
        Menu menu_Employees = new Menu("Empleados");

        //SubMenu Buscar
        MenuItem mI_search = new MenuItem("Buscar empleado");
        mI_search.setOnAction((event) -> {
            vWindows.getChildren().clear();
            vWindows.getChildren().addAll(sm.InterfazSE());
        });

        //subMenu agregar
        MenuItem mI_add = new MenuItem("Agregar empleado");

        mI_add.setOnAction((event) -> {
            vWindows.getChildren().clear();
            vWindows.getChildren().addAll(em.employee());
        });

        MenuItem mI_Edit = new MenuItem("Editar empleado");
        mI_Edit.setOnAction((event) -> {
            vWindows.getChildren().clear();
            vWindows.getChildren().addAll(ie.InterfazEB());
        });

        //Menu autos
        Menu menu_cars = new Menu("Vehiculo");

        //SubMenu agregarVehiculo
        MenuItem mI_addV = new MenuItem("Agregar vehiculo");
        mI_addV.setOnAction((event) -> {
            vWindows.getChildren().clear();
            vWindows.getChildren().add(iv.InterfazV());
        });

        //SubMenu inventario vehiculos
        MenuItem mI_inventory = new MenuItem("Inventario vehiculo");
        mI_inventory.setOnAction((event) -> {
            vWindows.getChildren().clear();
            vWindows.getChildren().add(ivt.invtCar());
        });

        MenuItem mI_searchV = new MenuItem("Buscar Vehiculo");
        mI_searchV.setOnAction((event) -> {
            vWindows.getChildren().clear();
            vWindows.getChildren().add(isv.InterfazSV());
        });

        menu_Employees.getItems().addAll(mI_add, mI_search, mI_Edit);
        menu_cars.getItems().addAll(mI_addV, mI_searchV, mI_inventory);

        mB_Menu.getMenus().addAll(menu_Employees, menu_cars);
        ((VBox) scene1.getRoot()).getChildren().addAll(mB_Menu, vWindows);

        return scene1;

    }

}
