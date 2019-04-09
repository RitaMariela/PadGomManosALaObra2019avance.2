/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Rita
 */
public class Janitor extends Employee {

    double hours, salaryJanitor;

    public Janitor(String name, String lastName, double salary, int ID, int number, String quality, String position, double hours, String schedule, String attribute1, String attribute2) {
        super(name, lastName, salary, ID, number, quality, position, hours, schedule, attribute1, attribute2);
        this.hours = hours;
        this.salaryJanitor = salaryJanitor;
    }

//    public double getHours() {
//        return hours;
//    }
//
//    public void setHours(double hours) {
//        this.hours = hours;
//    }
//
//    public double getSalaryJanitor() {
//        return salaryJanitor;
//    }
//
//    public void setSalaryJanitor(double salaryJanitor) {
//        this.salaryJanitor = salaryJanitor;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
//
//    public String getQuality() {
//        return quality;
//    }
//
//    public void setQuality(String quality) {
//        this.quality = quality;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public int getID() {
//        return ID;
//    }
//
//    public void setID(int ID) {
//        this.ID = ID;
//    }
//
//    public int getNumber() {
//        return number;
//    }
//
//    public void setNumber(int number) {
//        this.number = number;
//    }

    @Override
    public void CalculaterSalary() {

    }
}
