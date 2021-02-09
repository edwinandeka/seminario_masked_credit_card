/**
 * @class  Util
 * 
 * Se encarga de hacer validaciones genericas entre numeros
*/
package com.dowesoft.creditcard;

/**
 *
 * @author Edwin Ramiro Ospina Ruiz (edwinandeka@gmail.com)
 */
public class Util {
    
    
    /**
     * Valida que el texto ingresado sea un número de tarjeta de crédito válida
     * si es asi retorna true de lo contrario false
     * 
     * @param creditNumber, Texto de el numero de tarjeta de crédito a validar
     * @return (true, false)
     */
    public static boolean isValidCreditCard(String creditNumber){
        
        creditNumber = creditNumber.trim();
        
        // 1) validar el tamaño del string
        if (creditNumber.length()!= 19) {
            return false;
        }
        
        // 2) Validar los 4 bloques
        String[] blocks = creditNumber.split(" ");
        
        if (blocks.length != 4 ) {
            return false;
        }
        //3) validamos que cada bloque sea de tamaño 4
        for (String block : blocks) {
            if (blocks.length != 4 ) {
                return false;
            }
        }
               
        //4) validamos que cada bloque sea numerico
        for (String block : blocks) {
            if (!block.matches("\\d+")) {
                return false;
            }
        }
                
        // si pasa todas las validaciones anteriores es porque tiene la forma "0000 0000 0000 0000"
        return true;
    }
    
}
