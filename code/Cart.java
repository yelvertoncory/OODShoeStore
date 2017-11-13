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
    private double total;
    private int count;
    private ArrayList<Object> cart = new ArrayList<>();
    
    public Cart(double total, int count){
        this.total = total;
        this.count = count;
        ArrayList<Object> cart = new ArrayList<Object>();
    }
    
    public void addToTotal(double cost){
        total+=cost;
    }
    public void addToCount(){
        count++;
    }
    public void addProduct(Object o){
        cart.add(o);
        addToCount();
        //addToTotal(o.getCost);
    }
    
    public double getTotal(Cart c){
        return c.total;
    }
    public int getCount(Cart c){
        return c.count;
    }
    
    public void deleteItem(Object o){
        if(!hasNext()){
            cart.remove(o);
        }
    }
    
    public void clearCart(){
        cart.clear();
    }
    
    public void checkout(Cart c){
       c.cart.clear();
       this.count  = 0;
       this.total = 0;
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
