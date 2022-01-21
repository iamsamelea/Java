/* Nom del programa: capicua
* Aquesta aplicació ens mostra quants números capicua hi han que continguin la quantitat de digits
* que introdueix l'usuari.
*
* Trobarem més informació al següent enllaç: https://www.aceptaelreto.com/problem/statement.php?id=259&cat=6
*
* @authors Alexander Guerra, Tatiana Valentinyova, Samuel Lara
* @version 1.0
* @since   18-01-2022
*/

/* Importació de la llibreria Scanner */
import java.util.Scanner;

/* Importació de la llibreria BigInteger */
import java.math.BigInteger;

/* Primer bloc del programa */
public class capicua {

  /* Bloc main o principal */
  public static void main(String[] args) {

    /* Declaració de la variable Scanner */
    Scanner teclat = new Scanner(System.in);

    /* Declaració de la variable que utilitzarem més endevant a l'exercici */
    int dada = teclat.nextInt();

    /*
     * Declarem un bucle while a on la condició és que
     * sempre que la variable dada sigui més gran que 0
     * torni a fer una pasada el bucle, si la variable dada és igual a 0 el programa
     * s'acabarà
     */
    while (dada > 0) {

      /*
       * Declarem les variables de tipus BigInteger per a començar a treballar, aquest
       * tipus de dada
       * serveixen per a poder treballar amb números més grans que (-2^63), llavors la
       * sintaxi que utilitzem és bastant diferent, en aquest cas es declara igual que
       * una variable de tipus Scanner i dins del parentesi fiquem el número entre
       * comilles com si fos un String.
       */

      BigInteger deu = new BigInteger("10");
      BigInteger calcul1 = deu.pow((dada - 1) / 2); // paert dela formula per a calcular els dígits, dins del pow del BigInteger
                                                    // nomes poden ser dades de tipus primitius. Perusar pow entre parèntesi psem el exponent, que ha de serenter
      BigInteger calcul2 = new BigInteger("9");
      BigInteger capicues = new BigInteger("10"); // Aquesta és la variable que mostrará al resultat de números capicues
                                                  // d'un digit

      /*
       * Declarem un condicional a on li diem que si dada és major que 1 ens torni per
       * pantalla el resultat de capicua situat dins de la condició
       */

      /*
       * Utilitzem una estructura condicional simple que seleccionarà el missatge a
       * imprimir per pantalla depenent de si es cumpleix o no la condició de dins del
       * parèntesin en aquest cas si dada és major que 1 se li assignará un nou valor
       * a la variable capicua.
       */
      if (dada > 1) {
        capicues = calcul1.multiply(calcul2); // Aquesta es la sintaxi per a multiplicar numeros de tipus BinInteger, li
                                              // diem que calcul1 es multipliqui per el valor dins del parèntesis que en
                                              // aquest cas es calcul2 i ens tornarà un valor de tipus BigInteger.
                                                // capicues guardarà calcul1*calcul2.
      }

      System.out.println(capicues); // Imprimim per pantalla el resultat final que s'ha emmagatzemat a la variable
                                    // capicues.

      /*
       * Utilitzem l'input de la variable dada per a tornar a escriure els numeros que
       * volem saber que son capicua depenent del número de digits que el componen.
       */
      dada = teclat.nextInt();
    }
  }
}
