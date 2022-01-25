import java.util.Scanner;

public class formula1revisio {
  public static void main(String[] args) {

    Scanner teclat = new Scanner(System.in);

    /* Llegir el número de pilots P */
    int numeroPilots = teclat.nextInt();
    int quantitatPilots = 1;

    while (quantitatPilots <= numeroPilots) {
      /* Llegir el número d’entrenos E (entrenos) */
      int entrenos = teclat.nextInt();

      /* Nom del Pilot */
      String nomPilot = teclat.next();

      /* Declarem e inicialitzem variables */
      int acumulador = 0;
      int bo = 0;

      /* Fer entrenos vegades */
      for (int vegades = 0; entrenos > vegades; vegades++) {

        /* llegir enter: temps d'un entreno */
        int tempsentreno = teclat.nextInt();

        /* Anar sumant els temps */
        int tempstotal = tempsentreno;
        acumulador = acumulador + tempstotal;

        /* comptar si el temps és menor o igual a 10 (entreno BO) */
        if (tempsentreno <= 10) {
          bo++;
        }
      }

      /* Formula per a calcular el percentatge Bo */
      int percent = bo * 100 / entrenos;

      /* Calcul temps promig voltes */
      double promig = acumulador / entrenos;

      /* Missatges sortida per pantalla */
      System.out.println("Nom pilot: " + nomPilot);
      System.out.println("Promig: " + promig);
      System.out.println("Percentatge d'entrenos BO: " + percent + "%");

      quantitatPilots++;

    }
  }
}