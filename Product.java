/*
 * Author: Terrell Blakey
 * Date: November 11, 2017
 * Purpose: Creates a Product class that will be used to create product items for
 * an online store application
*/
package OOD_FinalProject_ShoeStore;

import java.util.ArrayList;

public class Product {
    
    private String name;
    private String color;
    private String style;
    private double price;
    private ArrayList<Sizes> shoeSizes;
    private long upc;
    
    public Product(String cName, String cColor, String cStyle, float cPrice, int[] cSizes, long cUpc){
        this.name = cName;
        this.color = cColor;
        this.style = cStyle;
        this.price = cPrice;
        this.upc = cUpc;
        for (int i = 0; i < cSizes.length; i++){
            shoeSizes.add(new Sizes(cSizes[i], 20));
        }
    }
    
    //This function decrements the quantity of the specified size and
    //returns a Shoe object with the values of the specified size, this object's
    //name, this object's color, this object's price, and this object's upc
    public Shoe removeShoe(float cSize){
        
    }
    
    public String getProductName(){
        return this.name;
    }
    
    public String getColor(){
        return this.color;
    }
    
    /*public String showColors(){
        String message = "Available colors: ";
        for(int i = 0; i < colors.size(); i ++){
            message += colors.get(i) + ", ";
        }
        return message;
    }*/
    
    public String getStyle(){
        return this.style;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public long getUpc(){
        return this.upc;
    }
    
    public String displayShoeInfo(){
        String message = "";
        for( Sizes tempShoe: this.shoeSizes){
            message += "\nSize: " + tempShoe.getSize() + "\nQuantity: " + tempShoe.getQuantity() + "\nUPC: " + this.getUpc();
            message += "\n";
        }
        return message;
    }
    
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    
}
