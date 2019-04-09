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
public class DriversHeavyMachinary extends Driver {

    double salaryCrane, salaryWagons, salaryLiftTruck;
    Vector<String> VectorDHMachi = new Vector<String>(10, 2);

    public DriversHeavyMachinary() {
        super();
        this.salaryCrane = 0;
        this.salaryWagons = 0;
        this.salaryLiftTruck = 0;
    }

    public DriversHeavyMachinary(String name, String lastName, double salary, int ID, int number, String quality, String position, String schedule, double hours, String attribute1, String attribute2) {
        super(name, lastName, salary, ID, number, quality, position, hours, schedule, attribute1, attribute2);
        this.salaryCrane = salaryCrane;
        this.salaryWagons = salaryWagons;
        this.salaryLiftTruck = salaryLiftTruck;
    }

    @Override
    public void CalculaterSalary() {
        if (position == "Conductor de vagoneta" && schedule == "si" && quality == "si") {
            salaryWagons = ((salary * hours) + ((salary * hours) * 0.0395) + 6);
        } else {
            if (position == "Conductor de vagoneta" && schedule == "si" && quality == "no") {
                salaryWagons = ((salary * hours) + 6);
            } else if (position == "Conductor de vagoneta" && schedule == "no" && quality == "no") {
                salaryWagons = (((salary * hours) * 2) + 6);
            } else {
                if (position == "Conductor de vagoneta" && schedule == "no" && quality == "si") {
                    salary = (((salary * hours) * 2) + (((salary * hours) * 2) * 0.0395) + 6);
                } else {
                    if (position == "Conductor de gruas" && schedule == "si" && quality == "si") {
                        salaryCrane = ((salary * hours) + ((salary * hours) * 0.0395) + 8);
                    } else {
                        if (position == "Conductor de gruas" && schedule == "si" && quality == "no") {
                            salaryCrane = ((salary * hours) + 8);
                        } else {
                            if (position == "Conductor de gruas" && schedule == "no" && quality == "no") {
                                salaryCrane = (((salary * hours) * 2) + 8);
                            } else {
                                if (position == "Conductor de gruas" && schedule == "no" && quality == "si") {
                                    salaryCrane = (((salary * hours) * 2) + (((salary * hours) * 2) * 0.0395) + 8);
                                } else {
                                    if (position == "Conductor de montacargas" && schedule == "si" && quality == "si") {
                                        salaryLiftTruck = ((salary * hours) + ((salary * hours) * 0.0395) + 14);
                                    } else {
                                        if (position == "Conductor de montacargas" && schedule == "si" && quality == "no") {
                                            salaryLiftTruck = ((salary * hours) + 14);
                                        } else {
                                            if (position == "Conductor de montacargas" && schedule == "no" && quality == "no") {
                                                salaryLiftTruck = (((salary * hours) * 2) + 14);
                                            } else {
                                                if (position == "Conductor de montacargas" && schedule == "no" && quality == "si") {
                                                    salaryLiftTruck = (((salary * hours) * 2) + (((salary * hours) * 2) * 0.0395) + 14);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void llenar4() {
        String salida = "";
        if (position == "Conductor de vagoneta") {
            VectorDHMachi.addElement(name + "," + lastName + "," + salaryWagons + ", " + salary + "," + ID + "," + number + "," + quality + "," + position);
        } else if (position == "conductor de gruas") {
            VectorDHMachi.addElement(name + "," + lastName + "," + salaryCrane + ", " + salary + "," + ID + "," + number + "," + quality + "," + position);
        } else {
            VectorDHMachi.addElement(name + "," + lastName + "," + salaryLiftTruck + ", " + salary + "," + ID + "," + number + "," + quality + "," + position);
        }

        for (int i = 0; i <= VectorDHMachi.size(); i++) {
            salida += VectorDHMachi.elementAt(i);
        }
    }
}
