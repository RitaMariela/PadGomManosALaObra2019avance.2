/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

import java.util.Vector;

/**
 *
 * @author Rita y Sebastian
 * Proyecto1
 */
public class Administrative extends Employee {

    String category;
    double salaryAdm1, salaryAdm2;

    public Administrative() {
        super();
        this.category = "";
        this.salaryAdm1 = 0;
        this.salaryAdm2 = 0;
    }

    public Administrative(String category, double salaryAdm1, double salaryAdm2, String name, String lastName, double salary, int ID, int number, String quality, String position, double hours, String schedule, String attribute1, String attribute2) {
        super(name, lastName, salary, ID, number, quality, position, hours, schedule, attribute1, attribute2);
        this.category = category;
        this.salaryAdm1 = salaryAdm1;
        this.salaryAdm2 = salaryAdm2;

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getSalaryAdm1() {
        return salaryAdm1;
    }

    public void setSalaryAdm1(double salaryAdm1) {
        this.salaryAdm1 = salaryAdm1;
    }

    public double getSalaryAdm2() {
        return salaryAdm2;
    }

    public void setSalaryAdm2(double salaryAdm2) {
        this.salaryAdm2 = salaryAdm2;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
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

    @Override
    public void CalculaterSalary() {
        if (category == "1" && quality == "si") {
            salaryAdm1 = salary + (salary * 0.0395);
        } else {
            if (category == "1" && quality == "no") {
                salaryAdm1 = salary;
            } else {
                if (category == "2" && quality == "si") {
                    salaryAdm2 = salary + (((salary * 0.20) + salary) * 0.0395) + (salary * 0.20);
                } else {
                    if (category == "2" && quality == "no") {
                        salaryAdm2 = salary + (salary * 0.20);
                    }
                }
            }
        }
    }

}
