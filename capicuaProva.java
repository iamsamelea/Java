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
public class capicuaProva {

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

      /* declarem les variables de tipus BigInteger per a començar a treballar */
      BigInteger deu = new BigInteger("10"); // long capicues = 10;

      /* dins del pow del BigInteger nomes poden ser dades de tipus primitius */
      BigInteger calcul1 = deu.pow((dada - 1) / 2); // Math.pow((dada -1)/2)
      BigInteger calcul2 = new BigInteger("9");
      BigInteger capicues = new BigInteger("10");

      /*
       * declarem un condicional a on li diem que si dada és major que 1 ens torni per
       * pantalla el resultat de capicua situat dins de la condició
       */
      if (dada > 1) {
        capicues = calcul1.multiply(calcul2); // capicues = 9*(long)Math.pow((dada -1)/2);
      }

      System.out.println(capicues);

      /*
       * utilitzem l'input de la variable dada per a tornar a escriure els numeros que
       * volem saber que son capicua depenent del número de digits que el componen
       */
      dada = teclat.nextInt();
    }
  }
}
