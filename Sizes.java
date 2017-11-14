/*
 * Author: Terrell Blakey
 * Date: November 12, 2017
 * Purpose: Holds the size of the shoe, as well as the quantity of that particular
 * size that is currently in stock, the color, and the UPC
 */
package OOD_FinalProject_ShoeStore;

/**
 *
 * @author Rell
 */
public class Sizes {
    
    private float size;
    private int quantity;
    
    public Sizes(float cSize, int cQuantity){
        this.size = cSize;
        this.quantity = cQuantity;
    }
    
    public float getSize(){
        return this.size;
    }
    
    public String removeQuantity(int numToRemove){
        String message = "0";
        if(this.quantity > 0){
            if(quantity >= numToRemove){
                message = String.valueOf(numToRemove);
                quantity -= numToRemove;
            }
            else{
                message = "Requested: " + numToRemove + ", Stock: " + this.quantity;
            }
        }
        else{
            message = "Currently out of stock on this item";
        }
        
        return message;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public void setQuantity(int cQuantity){
        this.quantity = cQuantity;
    }
}
