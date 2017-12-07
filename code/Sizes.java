/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodonlinestoreproject;

/**
 *
 * @author Cory
 */
public class Sizes {
    private float size;
    private int quantity;
    
    //Creates a generic Size object, setting each field to a value of zero.
    //Used in the pullShoe method from the Product class.
    public Sizes(){
        size = 0;
        quantity = 0;
    }
    
    //Creates a new Sizes object
    //Accepts a float as the size for this object, and an integer as the 
    //Quantity to fill for this object (the number of shoes to fill to stock for
    //this respective size).
    public Sizes(float cSize, int cQuantity){
        this.size = cSize;
        this.quantity = cQuantity;
    }
    
    public float getSize(){
        return this.size;
    }
    
    //Decrements the value in the quantity field by the integer amount passed
    //as the parameter, if the parameter value is less than or equal to the
    //amount held in this object's quantity field
    //Returns a boolean value; True if the amount was successfully decrememnted
    //and false otherwise
    public boolean removeQuantity(int numToRemove){
        boolean removed = false;
        //Checks to see if this object's quantity is greater than 0 (That there
        //are any shoes of this size in stock)
        if(this.quantity > 0){
            //Removes the number of shoes passed as a parameter if the passed
            //amount is less than or equal to the amount held in quantity (less
            //than or equal to the number of shoes remaining)
            if(quantity >= numToRemove){
                quantity -= numToRemove;
                removed = true;
            }
            else{
                removed = false;
            }
        }
        return removed;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public void setQuantity(int cQuantity){
        this.quantity = cQuantity;
    }
}
