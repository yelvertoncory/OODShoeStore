/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodonlinestoreproject;

import java.text.DecimalFormat;

/**
 *
 * @author Cory
 */
public class PayPal implements PaymentInterface {
    //Holds the name of the cardholder entered by the user
    private String cardHolder;
    //holds the balance of the shoes in the carts
    private double balance;
    //value for verifying that there is in fact a balance greater than 0
    private boolean paymentResult;
    //5% subcharge for using Paypal
    private final double payPalSubCharge = 0.05;
    
    //Constructor for PayPal
    public PayPal(double balance, String cardHolder){
        this.balance = balance;
        this.paymentResult = false;
        this.cardHolder = cardHolder;
    }
    
    //sets the cardHolder name
    public void setCardHolder(String name){
        this.cardHolder = name;
    }
    
    //method to return a boolean variable to check to see there is a balance greater than 0
    public boolean takePayment(double balance){
       if(balance > 0){
            paymentResult = true;
       }
       else{
           paymentResult = false;
       }
       return paymentResult;
    }
    
    
    //Strategy Pattern: takes the balance and adds the 5% subcharge 
    public double calculateTotal(double balance){
        return balance * (1 + payPalSubCharge);
    }
    
    //Prints the total rounded to the nearest two decimal places
    public void printTotal(double balance){
    DecimalFormat f = new DecimalFormat("##.00");
    
    System.out.println("Total is: $" + f.format((calculateTotal(balance))));
    }
}
