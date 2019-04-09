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

   
    public RandomAccessFile randomAccesFile;
    private int regsQuantity;//me indica la cantidad de registros
    private int regSize;
    private String myFilePath;

    public HeavyMachinary() {
       
    }

    public HeavyMachinary(String Type, String brand, int licensePlate, int year, float mileage, boolean american) {
        super(brand, licensePlate, year, mileage, american);
       
    }

    @Override
    public void information() {

    }
    
    


    
    }
    


