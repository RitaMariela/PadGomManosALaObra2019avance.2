/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import Company.Vehicle;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class VehicleFile {

    public RandomAccessFile randomAccessFile;
    private int regsQuantity;//me indica la cantidad de registros
    private int regSize;
    private String myFilePath;
    int location;

    public VehicleFile(File file) throws IOException {
        start(file);
    }

    private void start(File file) throws IOException {
        //almaceno la ruta
        myFilePath = file.getPath();

        //tamanno maximo de los registros dentro de esta 
        //clase
        this.regSize = 60;

        //una validacion basica
        if (file.exists() && !file.isFile()) {
            throw new IOException(file.getName()
                    + " is an invalid file");
        } else {
            //crear la nueva instancia de randomAccessFile
            randomAccessFile = new RandomAccessFile(file, "rw");

            //necesitamos indicar cuantos registros tiene el archivo
            this.regsQuantity = (int) Math.ceil((double) randomAccessFile.length() / (double) regSize);
        }
    }//fin start

    public void close() throws IOException {
        randomAccessFile.close();
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
    public boolean putValue(int position, Vehicle vehicle) throws IOException {
        //una pequenna validacion antes de insertar
        if (position >= 0 && position <= regsQuantity) {
            if (vehicle.size() > regSize) {
                System.err.print("7001 record size is out of bounds");
                return false;
            } else {
                //escribimos en archivo
                randomAccessFile.seek(position * regSize);
                randomAccessFile.writeUTF(vehicle.getBrand());
                randomAccessFile.writeInt(vehicle.getLicensePlate());
                randomAccessFile.writeInt(vehicle.getYear());
                randomAccessFile.writeFloat(vehicle.getMileage());
                randomAccessFile.writeBoolean(vehicle.getAmerican());

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
    public boolean addEndVehicle(Vehicle vehicle) throws IOException {
        //insertar al final del archivo
        boolean success = putValue(regsQuantity, vehicle);

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
    public Vehicle getVehicleposition(int position) throws IOException {
        //validacion de la posicion
        Vehicle myVehicle = new Vehicle() {
            
            @Override
            public void information() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        for (int i = 0; i < regsQuantity; i++) {
            if (position >= 0 && position <= regsQuantity) {
                //colocamos el puntero en el lugar 
                randomAccessFile.seek(position * regSize);

                //instancia de person
                //llevamos a cabo las lecturas
                myVehicle.setBrand(randomAccessFile.readUTF());
                myVehicle.setLicensePlate(randomAccessFile.readInt());
                myVehicle.setYear(randomAccessFile.readInt());
                myVehicle.setMileage(randomAccessFile.readFloat());
                myVehicle.setAmerican(randomAccessFile.readBoolean());

                //si es delete no retorno
                if (myVehicle.getLicensePlate() != 0) {

                    return myVehicle;
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

    /**
     * consulta todos los registros de mi archivo
     *
     * @return una lista de objetos tipo Person
     * @throws IOException
     */
    public List<Vehicle> getAllPersons() throws IOException {

        //variables a retornar
        List<Vehicle> vehicles = new ArrayList();
       
        

        //recorro todos mis registros y los inserto en la lista
        for (int i = 0; i < regsQuantity; i++) {
            Vehicle vehicleTemp = this.getVehicleposition(i);

            if (vehicleTemp != null && vehicleTemp.getLicensePlate() != 0) {
                vehicles.add(vehicleTemp);

            }
        }

        return vehicles;
    }//fin metodo

    

    public boolean EditRecord(int Serie, String nombre, int year, boolean american) throws IOException {
        Vehicle myVehicle;

        //buscar el registro para la eliminacion
        for (int i = 0; i < regsQuantity; i++) {

            //obtengo al vehiculo de esa posicion
            myVehicle = this.getVehicleposition(i);
            if (myVehicle == null) {

            } else {
                //pregunto si es el vehiculo que quiero editar 
                if (myVehicle.getLicensePlate() == Serie) {

                    randomAccessFile.seek(i * regSize);

                    randomAccessFile.writeUTF(nombre);
                    randomAccessFile.writeInt(myVehicle.getLicensePlate());
                    randomAccessFile.writeInt(year);
                    randomAccessFile.writeFloat(myVehicle.getMileage());
                    randomAccessFile.writeBoolean(american);
                    return this.putValue(Serie, myVehicle);
                }
            }
        }

        //si llega a este punto no encontro el vehiculo
        return false;
    }

    public Vehicle getVehiclSerie(int serie) throws IOException {
        //validacion de la posicion
        Vehicle myVehicle;
        for (int i = 0; i < regsQuantity; i++) {
            if (i >= 0 && i <= regsQuantity) {
                //colocamos el puntero en el lugar 
                myVehicle = this.getVehicleposition(i);
                if (myVehicle == null) {
                } else {

                    if (myVehicle.getLicensePlate() == serie) {
//                        getVehicleposition(i);
                        location=i;
                        return myVehicle;
                    }
                }
            } else {
                System.out.println("6001 position is out of bounds");
                return null;
            }

        }//fin de metodo
        return null;
    }

    public boolean notRepite(int serie) throws IOException {
        Vehicle myVehicle;
        for (int i = 0; i < regsQuantity; i++) {
            if (i >= 0 && i <= regsQuantity) {
                //colocamos el puntero en el lugar 

                myVehicle = this.getVehicleposition(i);
                System.out.println(myVehicle);
                if (myVehicle == null) {

                } else {

                    if (myVehicle.getLicensePlate() == serie) {
                        System.out.println("%%%%%%%%%%%%5");
                        return false;

                    }
                }
            }

        }//fin de metodo
        return true;
    }
    
    public void deleteRecord(int serie) throws IOException {
        Vehicle myVehicle;

        
        //si llega a este punto no encontro a la persona

       if (serie==getVehiclSerie(serie).getLicensePlate()){
           myVehicle=getVehiclSerie(serie);
           myVehicle.setLicensePlate(0);
           putValue(location, myVehicle);
           
       }
       
    }

}
