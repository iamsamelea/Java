
/*Acumula números fins arribar a 100 i para el programa. 
*
* @authors Alexander Guerra, Samuel Lara
* @version 1.0
* @since   20-01-2022
*/
import java.util.Scanner;

public class exempleAcumulador {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int acumulador = 0;
        int numero;
        int c = 1;

        while (c <= 100) { // Quan c sigui major o igual que 100 para el bucle

            System.out.println("Insereix una quantitat");
            numero = teclat.nextInt(); // demana numero per teclat
            acumulador = acumulador + numero; // a la variable acumulador se li assigna el valor de acumular + numero

            System.out.println("La quantitat acumulada és de " + acumulador);
            c = acumulador; // assigna el valor de acumulador a la variable c per a poder fer la comparació
                            // a la condicio del bucle.
        }
    }
}