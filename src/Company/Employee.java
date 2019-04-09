/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

import java.util.ArrayList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.TextField;
import sun.rmi.transport.tcp.TCPEndpoint;

/**
 *
 * @author Rita
 */
public abstract class Employee {

    String name, lastName, position, quality, attribute1, attribute2, schedule;
    double salary, hours;
    int ID, number;

    String result;

    public Employee() {
        this.name = "";
        this.lastName = "";
        this.salary = 0.0;
        this.ID = 0;
        this.number = 0;
        this.position = "";
        this.quality = "";
        this.hours = 0.0;
        this.schedule = "";
        this.attribute1 = "";
        this.attribute2 = "";
    }
//constructor
    public Employee(String name, String lastName, double salary, int ID, int number, String quality, String position, double hours, String schedule, String attribute1, String attribute2) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.ID = ID;
        this.number = number;
        this.position = position;
        this.quality = quality;
        this.hours = hours;
        this.schedule = schedule;
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;

    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
//formulas
    public String toString() {
        //if de conductor de automovil
        if (this.quality.equals("Conductor de automovil") && this.position.equalsIgnoreCase("Si") && this.schedule.equalsIgnoreCase("dia")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + (this.salary * this.hours + ((this.salary * this.hours)) * 0.0395) + "\n";
        }
        if (this.quality.equals("Conductor de automovil") && this.position.equalsIgnoreCase("No") && this.schedule.equalsIgnoreCase("dia")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + (this.salary * this.hours) + "\n";
        }
        if (this.quality.equals("Conductor de automovil") && this.position.equalsIgnoreCase("No") && this.schedule.equalsIgnoreCase("noche")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + ((this.salary * this.hours) * 2) + "\n";
        }
        if (this.quality.equals("Conductor de automovil") && this.position.equals("Si") && this.schedule.equals("noche")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + (((this.salary * this.hours) * 2) + ((this.salary * this.hours) * 2) * 0.0395) + "\n";
        }

        //if de conductor de grua
        if (this.quality.equals("Conductor de grúa") && this.position.equals("Si") && this.schedule.equalsIgnoreCase("dia")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + ((this.salary * this.hours + ((this.salary * this.hours)) * 0.0395) + 8) + "\n";
        }
        if (this.quality.equals("Conductor de grúa") && this.position.equalsIgnoreCase("No") && this.schedule.equalsIgnoreCase("dia")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + ((this.salary * this.hours) + 8) + "\n";
        }
        if (this.quality.equals("Conductor de grúa") && this.position.equalsIgnoreCase("No") && this.schedule.equalsIgnoreCase("noche")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + (((this.salary * this.hours) * 2) + 8) + "\n";
        }
        if (this.quality.equals("Conductor de grúa") && this.position.equals("Si") && this.schedule.equals("noche")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + ((((this.salary * this.hours) * 2) + ((this.salary * this.hours) * 2) * 0.0395) + 8) + "\n";
        }

        //if de conductor de vagoneta
        if (this.quality.equals("Conductor Vagoneta") && this.position.equals("Si") && this.schedule.equalsIgnoreCase("dia")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + ((this.salary * this.hours + ((this.salary * this.hours)) * 0.0395) + 6) + "\n";
        }
        if (this.quality.equals("Conductor Vagoneta") && this.position.equalsIgnoreCase("No") && this.schedule.equalsIgnoreCase("dia")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + ((this.salary * this.hours) + 6) + "\n";
        }
        if (this.quality.equals("Conductor Vagoneta") && this.position.equalsIgnoreCase("No") && this.schedule.equalsIgnoreCase("noche")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + (((this.salary * this.hours) * 2) + 6) + "\n";
        }
        if (this.quality.equals("Conductor Vagoneta") && this.position.equals("Si") && this.schedule.equals("noche")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + ((((this.salary * this.hours) * 2) + ((this.salary * this.hours) * 2) * 0.0395) + 6) + "\n";
        }

        //if de conductor de montacargas
        if (this.quality.equals("Conductor Montacargas") && this.position.equals("Si") && this.schedule.equalsIgnoreCase("dia")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + ((this.salary * this.hours + ((this.salary * this.hours)) * 0.0395) + 14) + "\n";
        }
        if (this.quality.equals("Conductor Montacargas") && this.position.equalsIgnoreCase("No") && this.schedule.equalsIgnoreCase("dia")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + ((this.salary * this.hours) + 14) + "\n";
        }
        if (this.quality.equals("Conductor Montacargas") && this.position.equalsIgnoreCase("No") && this.schedule.equalsIgnoreCase("noche")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + (((this.salary * this.hours) * 2) + 14) + "\n";
        }
        if (this.quality.equals("Conductor Montacargas") && this.position.equals("Si") && this.schedule.equals("noche")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + ((((this.salary * this.hours) * 2) + ((this.salary * this.hours) * 2) * 0.0395) + 14) + "\n";
        }

        //if de conserje
        if (this.quality.equals("Conserje") && this.position.equals("Si")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + ((this.salary + (this.salary / 8)) + ((((this.salary / 8) * 0.25) * this.hours)) + this.salary + ((this.salary / 8) + (((this.salary / 8) * 0.25) * this.hours)) * 0.0395) + "\n";
        }
        if (this.quality.equals("Conserje") && this.position.equals("No")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + ((this.salary + (this.salary / 8) + (((this.salary / 8) * 0.25) * this.hours))) + "\n";
        }

        //if de administrativos
        //Tipo 1
        if (this.quality.equals("Administrativo tipo 1") && this.position.equals("Si")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + ((this.salary + (this.salary * 0.0395))) + "\n";
        }

        if (this.quality.equals("Administrativo tipo 1") && this.position.equals("No")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + ((this.salary)) + "\n";
        }
        //tipo 2

        if (this.quality.equals("Administrativo tipo 2") && this.position.equals("Si")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + ((this.salary + (this.salary * 0.20) + ((this.salary + (this.salary * 0.20)) * 0.0395))) + "\n";
        }

        if (this.quality.equals("Administrativo tipo 2") && this.position.equals("No")) {
            return "Nombre: " + this.name + " - LastName: " + this.lastName + " - Salary " + this.salary + " - ID" + this.ID + " - Number: " + this.number + "- Position:" + this.quality + "- Quality:" + this.position + "- Hours: " + this.hours + "- Schedule: " + this.schedule + "- Attribute 1: " + this.attribute1 + "- Attribute 2: " + this.attribute2 + " Salario Total: " + ((this.salary + (this.salary * 0.20))) + "\n";
        }

        return null;
    }
//me da el tamaño 
    public int size() {
        return (this.name.length() * 2) + (this.lastName.length() * 2) + 8 + 4 + 1 + (this.position.length() * 2);
    }

    public abstract void CalculaterSalary();

}
