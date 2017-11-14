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
    
    public Inventory(ArrayList<Product> cStock){
        stock = cStock;
        last = cStock.size();
    }
    
    public Product getProduct(int cUPC){
        return stock.get(cUPC);
    }
    
    public Product removeProduct(int cUPC){
        Product temp = stock.get(cUPC);
        stock.remove(cUPC);
        return temp;
    }
}
