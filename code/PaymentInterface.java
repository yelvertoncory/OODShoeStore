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
public interface PaymentInterface {
    //create calculatetotal method for all payment types to implement, this is the strategy pattern
     public double calculateTotal(double amountCharged);
    //public void takePayment(String holderName, String cardNum, String pin, String securityCode);
}
