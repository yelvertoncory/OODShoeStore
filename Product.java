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
    
    //Creates a new product object. The passed cUPC value is used to reference,
    //the index this object is stored at in a data structure.
    public Product(String cName, String cColor, String cStyle, double cPrice, int[] cSizes, long cUpc){
        this.name = cName;
        this.color = cColor;
        this.style = cStyle;
        this.price = cPrice;
        this.upc = cUpc;
        //Creates an arraylist of class Sizes for each value in the cSizes parameter,
        //and creates each size with a quantity of 10 shoes for each respective size
        shoeSizes = new ArrayList<Sizes>(10);
        for (int i = 0; i < cSizes.length; i++){
            shoeSizes.add(new Sizes(cSizes[i], 10));
        }
    }
    
    //Decrements the quantity of the passed cSize parameter by the number
    //passed as the cQuantity parameter, and returns a Shoe object with the
    //required information from this Product, as well as a size and quantity.
    //Size and quantity are selected from the GUI.
    public Shoe pullShoe(float cSize, int cQuantity){
        //Creates a Size object that will be used to store the size requested 
        //by the user, and the quantity of said size requested by the user;
        Sizes selectedSize = new Sizes();
        //Boolean value that will be used to return the requested shoe(s) if
        //the size and requested quantity order can be fulfilled.
        boolean result = false;
        //Defines the Shoe object that will be returned.
        Shoe pulledShoe;
        //Searches for the Size object matching the size selected by the user
        //and sets selectedSize to the appropriate size object if it is found
        //and decrements the quantity of the selected size.
        //result is true if the correct amount of shoes are successfully removed,
        //remains false otherwise.
        for(Sizes tempSize: shoeSizes){
            if(tempSize.getSize() == cSize){
                selectedSize = tempSize;
                result = selectedSize.removeQuantity(cQuantity);
                }
        }
        //Returns a new Shoe object requested by the user if the appropriate
        //quantity was removed in the previous step, returns null otherwise.
        if(result){
            pulledShoe = new Shoe(this, cSize, cQuantity);
            return pulledShoe;
        }
        else{
            return null;
        }
    }
    
    public String getProductName(){
        return this.name;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public String getStyle(){
        return this.style;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public long getUpc(){
        return this.upc;
    }
    
    //Returns a string variable displaying each of this object's field information
    //on a new line
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
    
    public void incrementQuantity(float shoeSize, int quantity){
        for(int i = 0; i < shoeSizes.size(); i++){
            if(shoeSizes.get(i).getSize() == shoeSize){
                shoeSizes.get(i).setQuantity(shoeSizes.get(i).getQuantity() + quantity);
            }
        }
    }
    
    //Inner Shoe class used to return Shoe objects (Returned to the cart in this
    //program
    public class Shoe{
        
        private String shoeName;
        private String shoeColor;
        private float shoeSize;
        private long shoeUpc;
        private double shoePrice;
        private int quantity;
        
        //Creates a new Shoe object
        private Shoe(Product cItem, float cSize, int cQuantity){
            this.shoeName = cItem.getProductName();
            this.shoeColor = cItem.getColor();
            this.shoePrice = cItem.getPrice();
            this.shoeSize = cSize;
            this.quantity = cQuantity;
            //This print line is used for testing purposes only
            System.out.println("Name: " + this.shoeName + "\nColor: " + this.shoeColor + "\nPrice: $" + this.shoePrice);
        }
    }
}
