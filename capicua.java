 import java.util.Scanner;
 
/* Importació llibreria BigInteger */
import java.math.BigInteger;

public class capicua {
  public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);

    /* declaració de la variable Big Integer */
    int dada = teclat.nextInt();

    //int dada = teclat.nextInt();

    while(dada > 0){
      BigInteger deu = new BigInteger("10"); //long capicues = 10;

      /* dins del pow del BigInteger nomes poden ser dades de tipus primitius */ 
      BigInteger calcul1 = deu.pow((dada-1)/2); //Math.pow((dada -1)/2)
      BigInteger calcul2 = new BigInteger("9");
      BigInteger capicues = new BigInteger("10");

      if (dada > 1){
        capicues = calcul1.multiply(calcul2); //capicues = 9*(long)Math.pow((dada -1)/2);
      }

      System.out.println(capicues);

      dada = teclat.nextInt();
    }
  }
}
