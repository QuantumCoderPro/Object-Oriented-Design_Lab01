/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicleSales;

/**
 *
 * @author nmsaf
 */
public class motarcycle extends vehicle{

    /**
     * @return the hasSidecar
     */
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * @param hasSidecar the hasSidecar to set
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
    private boolean hasSidecar;
    
    public motarcycle(String manufacturer, double basePrice, boolean hasSidecar ){
        super("motarcycle", manufacturer, basePrice);
        this.hasSidecar = hasSidecar;
    }
    
    // override
    @Override
     public double calculateTotalPrice() {
        if (hasSidecar) {
            return getBasePrice() + 1000;
        } else {
            return getBasePrice();
        }
    }
}
