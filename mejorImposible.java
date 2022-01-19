/* Nom del programa: Mejor Imposible
* Aquest programa fa que un personatge que es troba situat a un punt en concret d'una cuadrícula de 5x5 nomès pugui moure's en diagonal,
* llavors haurem de saber si ha de fer 1 o 2 moviments nomes per a anar desde el punt a on està situat fins al punt de destí.
*
* Trobarem més informació al següent enllaç: https://www.aceptaelreto.com/problem/statement.php?id=130&cat=5
* 
* @authors Alexander Guerra, Tatiana Valentinyova, Samuel Lara
* @version 1.0
* @since   14-12-2021
*/

/* Importació de la llibreria Scanner */
import java.util.Scanner;

/* Primer bloc del programa */
public class mejorImposible {

    /* Bloc main o principal */
    public static void main(String[] args) {

        /* Declaració de la variable Scanner */
        Scanner teclat = new Scanner(System.in);

        /* Tamany de la cuadricula */
        int cuadricula = teclat.nextInt();

        /*
         * While Loop per a demanar les vegades que faci falta iniciar el programa.
         * Si cuadricula és diferent a 0 continúa el programa, si cuadricula es igual a
         * 0 para el programa.
         */
        while (cuadricula != 0) {

            /*
             * Posició inicial
             * Declarem les dos variables a on la variable "x1" serà una posició de la
             * cuadrícula respecte a l'eix X
             * i la variable "y1" serà una altra posició de la cuadrícula respecte a l'eix
             * Y,
             * que en conjunt ens donarà el punt de sortida.
             */
            int x1 = teclat.nextInt();
            int y1 = teclat.nextInt();

            /*
             * Posició final
             * Declarem les dos variables a on la variable "x2" serà una posició de la
             * cuadrícula respecte a l'eix X
             * i la variable "y2" serà una altra posició de la cuadrícula respecte a l'eix
             * Y,
             * que en conjunt ens donarà el punt final al qual tenim que arribar.
             */
            int x2 = teclat.nextInt();
            int y2 = teclat.nextInt();

            /* Cálcul posició inicial */
            int puntInici = x1 - y1;

            /* Cálcul posició final */
            int puntFinal = x2 - y2;

            /*
             * Posició inicial i posició final están en la mateixa diagonal?
             * Utilitzem una estructura condicional simple que seleccionará el missatge a
             * imprimir per pantalla depenent de si es cumpleix o no la condició de dins del
             * parèntesi.
             */
            if (puntInici == puntFinal) {
                System.out.println("1"); // El punt inicial i el punt final estàn a la mateixa diagonal, llavors
                                         // l'usuari nomès tindrà que fer un moviment.
            } else if (Math.abs(puntInici) % 2 == Math.abs(puntFinal) % 2) {
                System.out.println("2"); // El punt final no està a la mateixa diagonal i son els dos parells o
                                         // imparells, llavors l'usuarí farà dos moviments.
            } else {
                System.out.println("IMPOSIBLE"); // No estan a la mateixa diagonal i no son els dos parells ni
                                                 // imparells, llavors serà imposible arribar al punt final.
            }

            cuadricula = teclat.nextInt(); // Utilitzem la variable cuadricula per a tornar a demanar el tamany de la
                                           // cuadricula.
        }
    }
}
