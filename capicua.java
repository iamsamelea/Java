 import java.util.Scanner;
 
/* Importació llibreria BigInteger */
import java.math.BigInteger;

public class capicua {
  public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);

    /* declaració de la variable Big Integer */
    int dada = teclat.nextInt();

    /* declarem un bucle while a on lo diem que funcioni sempre que dada sigui major que 0 */
    while(dada > 0){

      /* declarem les variables de tipus BigInteger per a començar a treballar */
      BigInteger deu = new BigInteger("10"); //long capicues = 10;

      /* dins del pow del BigInteger nomes poden ser dades de tipus primitius */ 
      BigInteger calcul1 = deu.pow((dada-1)/2); //Math.pow((dada -1)/2)
      BigInteger calcul2 = new BigInteger("9");
      BigInteger capicues = new BigInteger("10");


      /* declarem un condicional a on li diem que si dada és major que 1 ens torni per pantalla el resultat de capicua situat dins de la condició */
      if (dada > 1){
        capicues = calcul1.multiply(calcul2); //capicues = 9*(long)Math.pow((dada -1)/2);
      }

      System.out.println(capicues);

      /* utilitzem l'input de la variable dada per a tornar a escriure els numeros que volem saber que son capicua depenent del número de digits que el componen */
      dada = teclat.nextInt();
    }
  }
}
