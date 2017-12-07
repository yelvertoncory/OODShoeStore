/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodonlinestoreproject;

import java.util.ArrayList;

/**
 *
 * @author Cory
 */
public class Inventory {
    private ArrayList<Product> stock;
    private float selectedSize;
    private int selectedQuantity;
    
    //Pre-populate the inventory with default items (Items for OOD project)
    public Inventory(){
        //Creates an array of valid shoe sizes to be used in the instantiation
        //of each new shoe product
        float[] sizes = new float[9];
        float currentSize = 8;
        for(int x = 0; x < sizes.length; x++){
            sizes[x] = currentSize;
            currentSize += 0.5;
        }
        
        //Fills the array list with 10 shoes
        stock = new ArrayList<>(6);
        stock.add(new Product("Array 10s", "Black & White", "Running", 89.99, sizes, 0));
        stock.add(new Product("Queue 11s", "Black & Blue", "Running", 89.99, sizes, 1));
        stock.add(new Product(".Hack 5s", "Red & Black", "Running", 69.99, sizes, 2));
        stock.add(new Product("Recursion 9s", "Green & White", "Running", 79.99, sizes, 3));
        stock.add(new Product("Stack 12s", "Maroon & Black", "Basketball", 89.99, sizes, 4));
        stock.add(new Product("Binary Series 18", "Red & Blue", "Basketball", 120.99, sizes, 5));
        stock.add(new Product("Array 8s", "Cyan & White", "Basketball", 99.99, sizes, 6));
        stock.add(new Product("Object Formals", "White", "Dress", 59.99, sizes, 7));
        stock.add(new Product("Tree Slides", "Black", "Dress", 69.99, sizes, 8));
        stock.add(new Product("Iterator Steps", "Grey", "Dress", 59.99, sizes, 9));
    }   
    //Pre-populate (with an specified assortment of Product objects)
    public Inventory(ArrayList<Product> cStock){
        stock = cStock;
    } 
    
    public Product getProduct(int cUPC){
        return stock.get(cUPC);
    }
    
    public void setSelectedSize(float targetSize){
        selectedSize = targetSize;
    }
    
    public float getSelectedSize(){
        return (float)this.selectedSize;
    }
    
    public void setSelectedQuantity(int targetQuantity){
        selectedQuantity = targetQuantity;
    }
    
    public int getSelectedQuantity(){
        return this.selectedQuantity;
    }
    
    //Pulls a Shoe object to be added to the cart
    public Shoe getShoe(int cUPC){
        Product selectedItem = stock.get(cUPC);
        System.out.println("Pulling Shoe: " + stock.get(cUPC).getProductName() + "; in size: " + selectedSize + "; of quantity: " + selectedQuantity);
        Shoe buyerShoe = selectedItem.pullShoe(selectedSize, selectedQuantity);
        return buyerShoe;
    }
    
    //Returns an item back to stock
    public void returnToStock(Shoe returnedShoe){
        stock.get(returnedShoe.getUpc()).incrementQuantity(returnedShoe.getSize(), returnedShoe.getQuantity());
    }
    //Make this function add a product back to stock, these items will be added from
    //the cart when the user decides to remove a product
    public void addToStock(int cUPC, float shoeSize, int quantity){
        stock.get(cUPC).incrementQuantity(shoeSize, quantity);
    }
    
    public int getNumProducts(){
        return this.stock.size();
    }
}
