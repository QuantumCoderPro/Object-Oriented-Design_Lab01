/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleSales;

/**
 *
 * @author nmsaf
 */
public class vehiclesales {
    
    public static void main(String[] args){
        
        // create instances
        vehicle vehicle1 = new vehicle("SUV", "Toyota", 30000000);
        car car1 = new car("Honda", 25000000, 4);
        motarcycle motarcycle1 = new motarcycle("Harley-Davidson", 1500000, true);
        
        // display details and prices
        System.out.println("Vehicle 1:");
        vehicle1.displayDetails();
        
         System.out.println("\nCar 1:");
        car1.displayDetails();
        
         System.out.println("\nMotarcycle 1:");
        motarcycle1.displayDetails();
        
        System.out.println();
        
        // calculate and dispaly discounted prices
        double discPer1 = 10.0;
        double discPer2 = 18.0;
        
        System.out.println("Discounted Price:");
        System.out.println("Vehicle 1 (Discount is:" +  discPer1 + "%): RS." + vehicle1.calculateTotalPrice( discPer1) + "/=");
        
        System.out.println("Car 1 (Discount is:" +  discPer2 + "%): RS." + car1.calculateTotalPrice( discPer2) + "/=");
        
        System.out.println("Motarcycle 1 (Discount is:" +  discPer2 + "%): RS." + motarcycle1.calculateTotalPrice( discPer2) + "/=");
    }
}
