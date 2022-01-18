import java.util.Scanner;
 
/* Importació llibreria BigInteger */
import java.math.BigInteger;

public class prova {
  public static void main(String[] args) {
    Scanner teclat = new Scanner(System.in);

    /* declaració de la variable Big Integer */
    BigInteger deu = new BigInteger ("10");

    BigInteger capicues = deu.pow((10-1)/2);

    BigInteger nou = new BigInteger("9");

    BigInteger multiplicacio = capicues.multiply(nou);

    System.out.println(multiplicacio);
    }
  }
