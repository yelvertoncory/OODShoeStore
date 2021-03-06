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
public class CreditDebitCard implements PaymentInterface{
    //Holds the name of the cardholder entered by the user
    private String cardHolder;
    //Holds the card number entered by the user
    private String cardNumber;
    //Holds the pin number entered by the user
    private String pinNumber;
    //Holds the security code entered by the user
    private String cvv;
    //3% subcharge for using credit card
    private double subcharge = .03;
    //creates balance variable
    private double balance;
    
    public CreditDebitCard(){
        this.cardHolder = "";
        this.cardNumber = "";
        this.pinNumber = "";
        this.cvv = "";
    }

    
    public void takePayment(String accountNumber, double amountCharged){
        setCardNum(accountNumber);
    }
    
    //Stores the required information, entered by the user, in order to
    //carryout a purchase
    public void takePayment(String holderName, String cardNum, String pin, String securityCode){
        setCardHolder(holderName);
        setCardNum(cardNum);
        setPinNumber(pin);
        setSecurityCode(securityCode);
    }
    //Strategy Pattern: takes the balance and adds a subcharge
   public double calculateTotal(double balance){
    balance = balance * (1 + subcharge);
    return balance;
   }
   
   //sets the CardHolder
    public void setCardHolder(String name){
        this.cardHolder = name;
    }
    
    //Sets the cardNumber if the card is validated
    public void setCardNum(String number){
        boolean result = validateCardNumber(number, 16);
        if(result){
            this.cardNumber = number;
        }
    }
    //sets the PIN number for the card
    public void setPinNumber(String pin){
        this.pinNumber = pin;
    }
    
    //sets the security code
    public void setSecurityCode(String code){
        this.cvv = code;
    }
    
    public void setInformation(String holderName, String pin, String code){
        
    }
    
    //validates length
    private boolean validateLength(String entry, int length){
        boolean result = false;
        result = entry.length() == length;
        return result;
    }
    
    //checks to see the input are numbers
    private boolean validateAreNumbers(String entry){
        boolean result = true;
        for(int i = 0; i < entry.length(); i++){
            if(!Character.isDigit(entry.charAt(i))){
                result = false;
            }
        }
        return result;
    }
    //returns true if the value is the proper length and the entry is numbers
    private boolean validateCardNumber(String entry, int length){
        boolean result = false;
        if(validateLength(entry, length)){
            if(validateAreNumbers(entry)){
                result = true;
            }
        }
        return result;
    }
}
