/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

/**
 *
 * @author Cory
 */


import java.util.ArrayList;
import java.util.Iterator;

public class Cart implements Iterator{
    //keeps a running total of the cost of items in the cart
    private double total;
    //counts the number of items in the cart
    private int count;
    //using an  ArrayList for my cart
    private ArrayList<Object> cart = new ArrayList<>();
    
    //constructor for cart
    public Cart(double total, int count, ArrayList<Object> cart){
        this.total = total;
        this.count = count;
        this.cart = new ArrayList<Object>();
    }
    
    //adds the cost to the total. will pass a shoe.getCost() eventually
    public void addToTotal(double cost){
        total+=cost;
    }
    // adds one to the count everytime a shoe is added
    public void addToCount(){
        count++;
    }
    
    //Adds an object based on the object name
    public void addProduct(Object o){
        cart.add(o);
        addToCount();
        //addToTotal(o.getCost);
    }
    //adds an object by letting you specify the index
    public void addProduct(int index, Object o){
        cart.add(index,o);
         //addToTotal(o.getCost);
    }
    //returns the value of total when called
    public double getTotal(Cart c){
        return c.total;
    }
    //returns the current number of items in cart when called
    public int getCount(Cart c){
        return c.count;
    }
    
    //removes a specified object when called
    public void deleteItem(Object o){
        if(!hasNext()){
            cart.remove(o);
            //total = total - o.getCost();
            count -= 1;
        }
    }
    //clears out the current cart and sets total/count to 0
    public void clearCart(){
        cart.clear();
        count = 0;
        total = 0;
    }
    
    public void checkout(Cart c){
      //not sure yet
    }

    @Override
    public boolean hasNext() {
        return !cart.isEmpty();
    }

    @Override
    public Object next() {
        if(!hasNext()){
            return cart.remove(cart.size() - 1);    
        }
        else{
            return null;
        }
    }
    
}
