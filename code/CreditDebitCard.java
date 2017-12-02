/*
 * Author: Terrell Blakey
 * Date: November 29, 2017
 * Purpose: Creates a class designed to accept Credit Card information in order
 * to perform a payment. 
 * Version: 2.0
 */
package OOD_FinalProject_ShoeStore;

public class CreditDebitCard implements PaymentInterface{
    
    //Holds the name of the cardholder entered by the user
    private String cardHolder;
    //Holds the card number entered by the user
    private String cardNumber;
    //Holds the pin number entered by the user
    private String pinNumber;
    //Holds the security code entered by the user
    private String cvv;
    
    public CreditDebitCard(){
        this.cardHolder = "";
        this.cardNumber = "";
        this.pinNumber = "";
        this.cvv = "";
    }

    @Override
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
    
    public void setCardHolder(String name){
        this.cardHolder = name;
    }
    
    public void setCardNum(String number){
        boolean result = validateCardNumber(number, 16);
        if(result){
            this.cardNumber = number;
        }
    }
    
    public void setPinNumber(String pin){
        this.pinNumber = pin;
    }
    
    public void setSecurityCode(String code){
        this.cvv = code;
    }
    
    public void setInformation(String holderName, String pin, String code){
        
    }
    
    private boolean validateLength(String entry, int length){
        boolean result = false;
        result = entry.length() == length;
        return result;
    }
    
    private boolean validateAreNumbers(String entry){
        boolean result = true;
        for(int i = 0; i < entry.length(); i++){
            if(!Character.isDigit(entry.charAt(i))){
                result = false;
            }
        }
        return result;
    }
    
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

