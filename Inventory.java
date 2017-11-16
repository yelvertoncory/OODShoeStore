/*
 * Author: Terrell Blakey
 * Date: November 12, 2017
 * Purpose: Creates an inventory class to hold an array list of products
 */
package OOD_FinalProject_ShoeStore;

import java.util.ArrayList;

public class Inventory {
    
    private ArrayList<Product> stock;
    private int last;
    private float selectedSize;
    
    //Pre-populate (hardcode the stock)
    public Inventory(ArrayList<Product> cStock){
        stock = cStock;
        last = cStock.size();
    }
    
    //remove this method
    public Product getProduct(int cUPC){
        return stock.get(cUPC);
    }
    
    public Product getShoe  (int cUPC, float selectedSize){
        Product temp = stock.get(cUPC);
        stock.remove(cUPC);
        return temp;
    }
}
