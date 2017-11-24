/*
 * Author: Terrell Blakey
 * Date: November 12, 2017
 * Purpose: Creates an inventory class to hold an array list of products
 */
package OOD_FinalProject_ShoeStore;

import java.util.ArrayList;

public class Inventory {
    
    private ArrayList<Product> stock;
    private float selectedSize;
    private int selectedQuantity;
    
    //Pre-populate (hardcode the stock)
    public Inventory(ArrayList<Product> cStock){
        stock = cStock;
    } 
    
    public Product getProduct(int cUPC){
        return stock.get(cUPC);
    }
    
    public void setSize(float targetSize){
        selectedSize = targetSize;
    }
    
    public void setQuantity(int targetQuantity){
        selectedQuantity = targetQuantity;
    }
    
    //Pulls a Shoe object to be added to the cart
    public Product getShoe  (int cUPC, float selectedSize){
        Product temp = stock.get(cUPC);
        stock.get(cUPC).pullShoe(selectedSize, selectedQuantity);
        return temp;
    }
}
