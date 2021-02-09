/**
 * @class CreditCard
 * 
 * Se encarga de enmascarar los números de tarjeta de crédito 
 */
package com.dowesoft.creditcard;

/**
 *
 * @author Edwin Ramiro Ospina Ruiz (edwinandeka@gmail.com)
 */
public class CreditCard {
    
    public static String ERROR_CREDIT_CARD = "ERROR_001";
    
    /**
     * Se encarga de enmascarar los números de tarjeta de crédito <br>
     * de forma que pasado un numero "1111 2222 3333 4444" <br>
     * lo transforma en "1111 XXXX XXXX 4444"
     * 
     * @param creditNumber cadena de texto con el número de tarjeta de crédito válido
     * @return [String] cadena de texto con el número de tarjeta de crédito enmascarado
     */
    public String maskCardCiclos(String creditNumber) {
        
        String maskedNumber = "";
        
        if(Util.isValidCreditCard(creditNumber)){
            for (int i = 0; i < creditNumber.length(); i++) {
                char c = creditNumber.charAt(i);
                if(i>=5 &&i<=14&&c!=' '){
                   maskedNumber+= 'X'; 
                } else {
                    maskedNumber+= c; 
                }
            }
            return maskedNumber;
        } else {
            return CreditCard.ERROR_CREDIT_CARD;
        }
    }
    
    /**
     * Se encarga de enmascarar los números de tarjeta de crédito <br>
     * de forma que pasado un numero "1111 2222 3333 4444" <br>
     * lo transforma en "1111 XXXX XXXX 4444"
     * 
     * @param creditNumber cadena de texto con el número de tarjeta de crédito válido
     * @return [String] cadena de texto con el número de tarjeta de crédito enmascarado
     */
    public String maskCardSubstring(String creditNumber) {
        
        String maskedNumber = "";
        
        if(Util.isValidCreditCard(creditNumber)){
            maskedNumber = creditNumber.substring(0, 4)+ " XXXX XXXX "+ creditNumber.substring(15, 19);
            return maskedNumber;
        } else {
            return CreditCard.ERROR_CREDIT_CARD;
        }
    }
    
    /**
     * Se encarga de enmascarar los números de tarjeta de crédito <br>
     * de forma que pasado un numero "1111 2222 3333 4444" <br>
     * lo transforma en "1111 XXXX XXXX 4444"
     * 
     * @param creditNumber cadena de texto con el número de tarjeta de crédito válido
     * @return [String] cadena de texto con el número de tarjeta de crédito enmascarado
     */
    public String maskCardSplit(String creditNumber) {
        
        String maskedNumber = "";
        
        if(Util.isValidCreditCard(creditNumber)){
            String[] temp = creditNumber.split(" ");
            maskedNumber = temp[0] + " XXXX XXXX "+ temp[3];
            return maskedNumber;
        } else {
            return CreditCard.ERROR_CREDIT_CARD;
        }
    }
    
}
