/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

import java.util.Vector;

/**
 *
 * @author Rita
 */
public abstract class Driver extends Employee {

   String schedule;
   double hours;

   
       public Driver() {
        super();
        this.schedule = "";
        this.hours = 0;
        
    }
       
    public Driver(String name, String lastName, double salary, int ID, int number, String quality, String position,double hours, String schedule,String attribute1, String attribute2) {
        super(name, lastName, salary, ID, number, quality, position, hours, schedule, attribute1, attribute2);

        
    }

   

    public String isSchedule() {
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

    public String isQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
 
    public abstract void CalculaterSalary();

    public void CalculaterSalary(String name, String lastName, Double salary, int ID, int employeeNumber, String position, String qualified) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean translateEmployee(Vector ve) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
