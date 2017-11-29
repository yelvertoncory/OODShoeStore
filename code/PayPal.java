/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payment;

/**
 *
 * @author yelverton_cory
 */

import java.text.DecimalFormat;
import java.util.*;

public class PayPal {
    private double balance;
    private boolean paymentResult;
    private final double payPalSubCharge = 0.05;
    
    public PayPal(double balance, boolean paymentResult){
        this.balance = balance;
        this.paymentResult = paymentResult;
    }
    
    public boolean makePayment(double balance){
       if(balance > 0){
            paymentResult = true;
       }
       else{
           paymentResult = false;
       }
       return paymentResult;
    }
    
    public double calculateTotal(double balance){
        return balance * (1 + payPalSubCharge);
    }
    
    public void printTotal(double balance){
    DecimalFormat f = new DecimalFormat("##.00");
    
    System.out.println("Total is: $" + f.format((calculateTotal(balance))));
    }
}
