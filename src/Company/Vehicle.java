/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

import java.util.ArrayList;

/**
 *
 * @author Rita
 */
public abstract class Vehicle {
    String result="";
    String brand;
    int licensePlate;
    int year;
    float mileage;
    boolean american;
   
    ArrayList arraybrand=new ArrayList();
    ArrayList arrayLicensePlate=new ArrayList();

    public Vehicle(String brand, int licensePlate, int year, float mileage, boolean americano) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.year = year;
        this.mileage = mileage;
        this.american = americano;
    }
    
 public Vehicle() {
        this.brand = "";
        this.licensePlate =0;
        this.year = 0;
        this.mileage = 0;
        this.american=false;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(int licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public boolean getAmerican() {
        return american;
    }

    public void setAmerican(boolean americano) {
        this.american = americano;
    }

    public String output (){
      
        for(int i=0;i<arraybrand.size();i++){
            result+=arraybrand.get(i)+", "+arrayLicensePlate.get(i);
        }
        return result;
    }
    public String toString(){
        return "Nombre: "+this.brand+" - Año: "+this.year+" - Kilometraje: "+this.mileage+" - Americano: "+this.american+" - Serie: "+this.licensePlate+"\n";
    }
    
    public abstract void information();  
    
    public int size(){
        return getBrand().length()*2+4+4+4+1;
    }
    
    
}
