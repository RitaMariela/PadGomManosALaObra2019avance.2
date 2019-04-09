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
public class DriversAutobmobile extends Driver {

    double salaryA;
    Vector<String> VectorDAuto = new Vector<String>(10, 2);

    public DriversAutobmobile() {
        super();
        this.salaryA = 0;
    }

    public DriversAutobmobile( String name, String lastName, double salary, int ID, int number, String quality, String position,String schedule, double hours, String attribute1,String attribute2) {
        super(name, lastName, salary, ID, number, quality, position, hours, schedule, attribute1, attribute2);
         this.salaryA = salaryA;
    }

    @Override
    public void CalculaterSalary() {
        if (position == "Conductor de Automovil" && schedule == "si" && quality == "si") {
            salaryA = ((salary * hours) + ((salary * hours) * 0.0395));
        } else {
            if (position == "Conductor de Automovil" && schedule == "si" && quality == "no") {
                salaryA = (salary) * hours;
            } else if (position == "Conductor de Automovil" && schedule == "no" && quality == "no") {
                salaryA = (salary * hours) * 2;
            } else {
                if (position == "Conductor de Automovil" && schedule == "no" && quality == "si") {
                    salaryA = ((salary * hours) * 2) + (((salary * hours) * 2) * 0.0395);
                }

            }

        }

    }

    public void llenar3() {
        String salida1 = "";
        VectorDAuto.addElement(name + "," + lastName + "," + salaryA + ", " + salary + "," + ID + "," + number + "," + quality + "," + position);
        VectorDAuto.addElement("Ana" + "," + "Rojas" + "," + "$41,58" + "," + "5" + "," + "3827354" + "," + "43" + "," + "si" + "," + "Conductora de automovil");

        for (int i = 0; i <= VectorDAuto.size(); i++) {
            salida1 += VectorDAuto.elementAt(i);
        }
    }
}
