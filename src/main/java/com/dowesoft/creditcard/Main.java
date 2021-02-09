/**
 * @class Main
 * 
 * Se encarga de recolectar el número de la tarjeta de credito
 * y de gestionar el enmascarado de esta.
 */
package com.dowesoft.creditcard;

import javax.swing.JOptionPane;

/**
 *
 * @author Edwin Ramiro Ospina Ruiz (edwinandeka@gmail.com)
 */
public class Main {
    public static void main(String[] args) {

        String creditNumber = JOptionPane.showInputDialog("Ingrese el número de su tarjeta de crédito");

        CreditCard card = new CreditCard();

        // test de todos los metodos
        System.out.println("maskCardCiclos " + card.maskCardCiclos(creditNumber));
        System.out.println("maskCardSubstring " + card.maskCardSubstring(creditNumber));
        System.out.println("maskCardSplit " + card.maskCardSplit(creditNumber));

        String maskedNumber = card.maskCardCiclos(creditNumber);

        if (maskedNumber == CreditCard.ERROR_CREDIT_CARD) {
            JOptionPane.showMessageDialog(null, "Número de tarjeta de crédito no válido", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Número de su tarjeta de crédito " + card.maskCardCiclos(creditNumber));
        }

        System.exit(0);

    }

}
