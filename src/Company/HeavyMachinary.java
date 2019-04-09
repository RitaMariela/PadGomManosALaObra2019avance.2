/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Rita
 */
public class HeavyMachinary extends Vehicle {

    String Type;
    ArrayList aL_information = new ArrayList();
    String arreglo[] = new String[aL_information.size()];
    public RandomAccessFile randomAccesFile;
    private int regsQuantity;//me indica la cantidad de registros
    private int regSize;
    private String myFilePath;

    public HeavyMachinary() {
        this.Type = "";
    }

    public HeavyMachinary(String Type, String brand, int licensePlate, int year, float mileage, boolean american) {
        super(brand, licensePlate, year, mileage, american);
        this.Type = Type;
    }

    @Override
    public void information() {

    }
    
    
     public void addV( String brand, String licensePlate, int year, float mileage, String american)throws IOException{
         randomAccesFile.seek(randomAccesFile.length());
         randomAccesFile.writeUTF(brand);
         randomAccesFile.writeUTF(licensePlate);
         randomAccesFile.writeInt(year);
         randomAccesFile.writeFloat(mileage);
         randomAccesFile.writeUTF(american );
     }

    
    }
    


