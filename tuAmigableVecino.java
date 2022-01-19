/* Nom del programa: Tu amigable vecino
* La funció d'aquest programa és la de calcular la distància en metres que ha de recorrer Spiderman
* des de la seva posició fins a desactivar les dos bombes.
*
* Trobarem més informació al següent enllaç: https://www.aceptaelreto.com/problem/statement.php?id=474&cat=5
* 
* @authors Alexander Guerra, Tatiana Valentinyova, Samuel Lara
* @version 1.0
* @since   15-12-2021
*/

/* Importació de la llibreria Scanner */
import java.util.Scanner;

/* Primer bloc del programa */
public class tuAmigableVecino {

    /* Bloc main o principal */
    public static void main(String[] args) {

        /* Declaració de la variable Scanner */
        Scanner teclat = new Scanner(System.in);

        /*
         * Variables que utilitzarem per al bucle comptador
         * declarem la variable contador que és la que ficara l'usuari mitjançant el
         * teclat
         * i declarem la variable count que serà l'encarregada de fer la comparació.
         */
        int contador = teclat.nextInt();
        int count = 1;

        /*
         * Declarem un bucle while a on la condició és que
         * sempre que la variable count sigui més petita que la variable contador
         * torni a fer una pasada el bucle, s'anira sumant 1 a count al acabar el bucle
         * amb l'operador d'increment ++
         */
        while (count <= contador) {

            /*
             * Declarem tres variables que representaran la posició de Spiderman i de les
             * dos bombes
             */
            int s = teclat.nextInt(); // posició Spiderman
            int a = teclat.nextInt(); // posició Bomba A
            int b = teclat.nextInt(); // posició Bomba B

            /* Variable que emmagatzema la fórmula per calcular recorregut mínim opció 1 */
            int opcio1 = (Math.abs(a - s) + Math.abs(b - a));

            /* Variable que emmagatzema la fórmula per calcular recorregut mínim opció 2 */
            int opcio2 = (Math.abs(b - s) + Math.abs(a - b));

            /*
             * Utilitzem una estructura condicional simple que seleccionará el missatge a
             * imprimir per pantalla depenent de si es cumpleix o no la condició de dins del
             * parèntesi.
             */
            if (opcio1 <= opcio2) {
                System.out.println(opcio1); // Si l'opció 1 és més petita o igual que l'opció 2 ens mostrará per
                                            // pantalla l'opció 1.

            } else {
                System.out.println(opcio2); // Si la condició d'abans no és compleix es mostrará per pantalla l'opció 2.
            }

            count++; // Operador d'increment que suma 1 a la variable count i així poder repetir el
                     // bucle fins a arribar al valor de la variable contador.

        }
    }
}