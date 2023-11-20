/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleSales;

/**
 *
 * @author nmsaf
 */
public class car extends vehicle{

    /**
     * @return the numberOfDoors
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * @param numberOfDoors the numberOfDoors to set
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    private int numberOfDoors;
    
    public car(String manufacturer, double basePrice, int numberOfDoors){
        super("car", manufacturer, basePrice);
        this.numberOfDoors = numberOfDoors;
    }
    
    // override
    @Override
    public double calculateTax(){
        return 0.12 * getBasePrice();
    }
    
    @Override
    public double calculateTotalPrice(){
        return getBasePrice() + calculateTax();
    }
     
}
