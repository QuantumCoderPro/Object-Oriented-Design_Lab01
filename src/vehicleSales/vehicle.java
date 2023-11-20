/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleSales;

/**
 *
 * @author nmsaf
 */
public class vehicle {
    

    /**
     * @return the vehicleType
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * @param vehicleType the vehicleType to set
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the basePrice
     */
    public double getBasePrice() {
        return basePrice;
    }

    /**
     * @param basePrice the basePrice to set
     */
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    
    private String vehicleType;
    private String manufacturer;
    private double basePrice;
    
    public vehicle(String vehicleType, String manufacturer, double basePrice){
        this.vehicleType = vehicleType;
        this.manufacturer = manufacturer;
        this.basePrice = basePrice;
    }
    public double calculateTax(){
        return 0.1 * basePrice;
    }
    public double calculateTotalPrice(){
        return basePrice + calculateTax();
    }
    
    public double calculateTotalPrice(double discountPercentage) {
        if (discountPercentage >= 0 && discountPercentage <= 100) {
            double discountAmount = (discountPercentage / 100) * calculateTotalPrice();
            return calculateTotalPrice() - discountAmount;
        } else {
            return calculateTotalPrice();
        }
    }
 
    public void displayDetails(){
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Base Price: Rs." + basePrice + "/=");
        System.out.println("Total Price: Rs." + calculateTotalPrice() + "/=");
    }
}
