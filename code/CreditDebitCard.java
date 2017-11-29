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

    //Stores the required information, entered by the user, in order to
    //carryout a purchase
    @Override
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

//Code Structure 1.0 (Initial Draft)

/*private String holderName;
private String pinNum;
private String verificationCode;
private String cardNum;

public CreditDebitCard(){
    this.holderName = "";
    this.pinNum = "";
    this.verificationCode = "";
    this.cardNum = "";
}

public CreditDebitCard(String name, String pinNumber, String securityCode, String cardNumber){
        this.holderName = name;
        this.pinNum = pinNumber;
        this.verificationCode = securityCode;
        this.cardNum = cardNumber;
    }

public void setHolderName(String name){
    this.holderName = name;
}

public void setPinNum(String pinNumber){
    this.pinNum = "";
}

public void setVerificationCode(String verCode){
    this.verificationCode = "";
}

public void setCardNum(String cardNumber){
    boolean validLength = validateCardNumber(cardNumber);
    if(validLength){
        this.cardNum = cardNumber;
    }
}

public String getHolderName(){
    return this.holderName;
}

public String getEncryptedNumber(){
    String encrypted = "";
    int cutoff = this.cardNum.length() - 4;
    for(int i = 0; i < cutoff; i++){
        encrypted += "X";
    }
    for(int i = cutoff; i < this.cardNum.length(); i++){
        encrypted += this.cardNum.charAt(i);
    }
    return encrypted;
}

public String toString(){
    String output = "";
    output = "Card Holder: " + this.holderName;
    output += "\nCard Number: " + this.getEncryptedNumber();
    return output;
}

private boolean validateCardNumber(String number){
    boolean result = false;
    result = number.length() == 16;
    return result;
}
}*/
