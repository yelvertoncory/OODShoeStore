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
public class paymentContext {
    //creats PaymentInterface
    private PaymentInterface paymentMethod;
    
    //Constructor for our Strategy interface
    public paymentContext(PaymentInterface paymentMethod){
    this.paymentMethod = paymentMethod;
    }
    
    //executes the method dependent on the payment strategy
    public double executePayment(double balance){
        return paymentMethod.calculateTotal(balance);
    }
}
