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
public class Shoe {
      private String shoeName;
        private String shoeColor;
        private float shoeSize;
        private int shoeUpc;
        private double shoePrice;
        private int quantity;
        
        //Creates a new Shoe object
        public Shoe(Product cItem, float cSize, int cQuantity){
            this.shoeName = cItem.getProductName();
            this.shoeColor = cItem.getColor();
            this.shoePrice = cItem.getPrice();
            this.shoeSize = cSize;
            this.quantity = cQuantity;
            this.shoeUpc = cItem.getUpc();
            //This print line is used for testing purposes only
            //System.out.println("Name: " + this.shoeName + "\nColor: " + this.shoeColor + "\nPrice: $" + this.shoePrice);
        }
        
        public String getName(){
            return this.shoeName;
        }
        
        public String getColor(){
            return this.shoeColor;
        }
        
        public float getSize(){
            return this.shoeSize;
        }
        
        public int getUpc(){
            return this.shoeUpc;
        }
        
        public double getPrice(){
            return this.shoePrice;
        }
        
        public int getQuantity(){
            return this.quantity;
        }
        
        public String toString(){
            return "\nName: " + this.shoeName + "\nColor: " + this.shoeColor + 
                    "\nSize: " + this.shoeSize + "\nUPC: " + this.shoeUpc + 
                    "\nPrice " + this.shoePrice + "\nquantity: " + this.quantity;
        }
}
