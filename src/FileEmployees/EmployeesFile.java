/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileEmployees;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import Company.Employee;
import Company.Vehicle;

/**
 *
 * @author Rita
 */
public class EmployeesFile {

    //atributos
    /**
     *
     */
    public RandomAccessFile randomAccessFile2;
    private int regsQuantity;//me indica la cantidad de registros
    private int regSize;
    private String myFilePath;
    int location;

    //constructor
    /**
     *
     * @param file
     * @throws IOException
     */
    public EmployeesFile(File file) throws IOException {
        start(file);
    }

    /**
     * instancia el random access file y coloca el valor de mis variables
     * privadas
     *
     * @param file
     * @throws IOException
     */
    private void start(File file) throws IOException {
        //almaceno la ruta
        myFilePath = file.getPath();

        //tamanno maximo de los registros dentro de esta 
        //clase
        this.regSize = 140;

        //una validacion basica
        if (file.exists() && !file.isFile()) {
            throw new IOException(file.getName()
                    + " is an invalid file");
        } else {
            //crear la nueva instancia de randomAccessFile
            randomAccessFile2 = new RandomAccessFile(file, "rw");

            //necesitamos indicar cuantos registros tiene el archivo
            this.regsQuantity = (int) Math.ceil((double) randomAccessFile2.length() / (double) regSize);
        }
    }//fin start

    /**
     * cierra la conexion de mi programa con el archivo que estoy manipulando
     *
     * @throws IOException
     */
    public void close() throws IOException {
        randomAccessFile2.close();
    }

    /**
     * indica la cantidad de registros del archivo actual
     *
     * @return cantidad de registros
     */
    public int fileSize() {
        return regsQuantity;
    }

    /**
     * inserta un nuevo registro pero en una posicion existente
     *
     * @param position
     * @param person
     * @return
     * @throws IOException
     */
    public boolean putValue(int position, Employee employee) throws IOException {
        //una pequenna validacion antes de insertar
        if (position >= 0 && position <= regsQuantity) {
            if (employee.size() > regSize) {
                System.err.print("7001 record size is out of bounds");
                return false;
            } else {
                //escribimos en archivo
                randomAccessFile2.seek(position * regSize);
                randomAccessFile2.writeUTF(employee.getName());
                randomAccessFile2.writeUTF(employee.getLastName());
                randomAccessFile2.writeDouble(employee.getSalary());
                randomAccessFile2.writeInt(employee.getID());
                randomAccessFile2.writeInt(employee.getNumber());
                randomAccessFile2.writeUTF(employee.getPosition());
                randomAccessFile2.writeUTF(employee.getQuality());
                randomAccessFile2.writeDouble(employee.getHours());
                randomAccessFile2.writeUTF(employee.getSchedule());
                randomAccessFile2.writeUTF(employee.getAttribute1());
                randomAccessFile2.writeUTF(employee.getAttribute2());

                return true;
            }
        } else {
            System.err.print("7002 position is "
                    + "out of bounds of this file");
            return false;
        }

    }//fin metodo

    /**
     * agrega un registro nuevo pero al final del archivo, por esa razon se
     * incrementa la cantidad de registros
     *
     * @param person
     * @return
     * @throws IOException
     */
    public boolean addEndEmployee(Employee person) throws IOException {
        //insertar al final del archivo
        boolean success = putValue(regsQuantity, person);

        if (success) {
            ++regsQuantity;
        }
        return success;
    }

    /**
     * obtiene un registro de una persona en la posicion indicada
     *
     * @param position
     * @return objeto de tipo Person con los datos del registro de esa persona
     * @throws IOException
     */
    public Employee getEmployeeposition(int position) throws IOException {
        //validacion de la posicion
        Employee myEmployee = new Employee() {
            @Override
            public void CalculaterSalary() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        for (int i = 0; i < regsQuantity; i++) {
            if (position >= 0 && position <= regsQuantity) {
                //colocamos el puntero en el lugar 
                randomAccessFile2.seek(position * regSize);

                //instancia de person
                //llevamos a cabo las lecturas
                myEmployee.setName(randomAccessFile2.readUTF());
                myEmployee.setLastName(randomAccessFile2.readUTF());
                myEmployee.setSalary(randomAccessFile2.readDouble());
                myEmployee.setID(randomAccessFile2.readInt());
                myEmployee.setNumber(randomAccessFile2.readInt());
                myEmployee.setPosition(randomAccessFile2.readUTF());
                myEmployee.setQuality(randomAccessFile2.readUTF());
                myEmployee.setHours(randomAccessFile2.readDouble());
                myEmployee.setSchedule(randomAccessFile2.readUTF());
                myEmployee.setAttribute1(randomAccessFile2.readUTF());
                myEmployee.setAttribute2(randomAccessFile2.readUTF());

                //si es delete no retorno
                if (myEmployee.getID() != 0) {

                    return myEmployee;
                } else {

                    return null;
                }

            } else {
                System.err.println("6001 position is out of bounds");
                return null;
            }

        }//fin de metodo
        return null;
    }

    public Employee getEmployeeSerie(int serie) throws IOException {
        //validacion de la posicion
        Employee myEmployee;
        for (int i = 0; i < regsQuantity; i++) {
            if (i >= 0 && i <= regsQuantity) {
                //colocamos el puntero en el lugar 
                myEmployee = this.getEmployeeposition(i);
                if (myEmployee == null) {
                } else {

                    if (myEmployee.getID() == serie) {
//                        getVehicleposition(i);
                        location = i;
                        return myEmployee;
                    }
                }
            } else {
                System.out.println("6001 position is out of bounds");
                return null;
            }

        }//fin de metodo
        return null;
    }

    /**
     * consulta todos los registros de mi archivo
     *
     * @return una lista de objetos tipo Person
     * @throws IOException
     */
    public List<Employee> getAllPersons() throws IOException {

        //variables a retornar
        List<Employee> persons = new ArrayList<Employee>();

        //recorro todos mis registros y los inserto en la lista
        for (int i = 0; i < regsQuantity; i++) {
            Employee emploTemp = this.getEmployeeposition(i);

            if (emploTemp != null) {
                persons.add(emploTemp);
            }
        }

        return persons;
    }//fin metodo

    public void deleteRecord(int id) throws IOException {
        Employee myEmployee;

        if (id == getEmployeeSerie(id).getID()) {
            myEmployee = getEmployeeSerie(id);
            myEmployee.setID(0);
            putValue(location, myEmployee);

        }

    }

    public boolean EditRecord(int id, Double salary, Double hours, String schedule) throws IOException {
        Employee myEmployee;

        //buscar el registro para la eliminacion
        for (int i = 0; i < regsQuantity; i++) {

            //obtengo al vehiculo de esa posicion
            myEmployee = this.getEmployeeposition(i);
            if (myEmployee == null) {

            } else {
                //pregunto si es el vehiculo que quiero editar 
                if (myEmployee.getID() == id) {

                    randomAccessFile2.seek(i * regSize);
                    randomAccessFile2.writeUTF(myEmployee.getName());
                    randomAccessFile2.writeUTF(myEmployee.getLastName());
                    randomAccessFile2.writeDouble(salary);
                    randomAccessFile2.writeInt(myEmployee.getID());
                    randomAccessFile2.writeInt(myEmployee.getNumber());
                    randomAccessFile2.writeUTF(myEmployee.getPosition());
                    randomAccessFile2.writeUTF(myEmployee.getQuality());
                    randomAccessFile2.writeDouble(hours);
                    randomAccessFile2.writeUTF(schedule);
                    randomAccessFile2.writeUTF(myEmployee.getAttribute1());
                    randomAccessFile2.writeUTF(myEmployee.getAttribute2());

                    return this.putValue(id, myEmployee);
                }
            }
        }

        //si llega a este punto no encontro el vehiculo
        return false;
    }

}
