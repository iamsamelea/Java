/* Demanar la edat de forma numeral per a acabar el programa si s'escriu en forma de text torna a fer un altre intento.
*
* @authors Alexander Guerra, Samuel Lara
* @version 1.0
* @since   20-01-2022
*/

import java.util.Scanner;

public class exempleBucleHasnext {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix la teva edat en lletres : ");

        while (!teclat.hasNextInt()) { // Si l'input per teclat és diferent de tipus enter tornará a fer el bucle.
            teclat.next(); // Utilització de la variable per a que torni a fer el bucli i no sigui infinit.
            System.out.println("Torna a intentar amb números per a que s'acabi el programa");
        }

        int edat = teclat.nextInt(); // Si surt del bucle s'emmagatzema el número en la variable edat.

        System.out.println("la teva edat es de: " + edat + " anys");
    }
}