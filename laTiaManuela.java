/* Nom del programa: La tía Manuela
* Aquesta aplicació ens mostra un número que será la quantitat de vegades que s'executará el programa,
* ens demanarà per pantalla els costats de la joguina i de la caixa i tenim que veure si la joguina cap dins,
* una vegada encaixada comparará els costats i ens mostrará per pantalla i la caixa SIRVE o NO SIRVE per a la joguina.
*
* Trobarem més informació al següent enllaç: https://www.aceptaelreto.com/problem/statement.php?id=542&cat=5
*
* @authors Alexander Guerra, Tatiana Valentinyova, Samuel Lara
* @version 1.0
* @since   10-01-2022
*/

/* Importació de la llibreria Scanner */
import java.util.Scanner;

/* Primer bloc del programa */
public class laTiaManuela {

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
             * Declarem les variables que faran referencia als costats/mides de la joguina
             */
            int joguinaCostat1 = teclat.nextInt();
            int joguinaCostat2 = teclat.nextInt();
            int joguinaCostat3 = teclat.nextInt();

            /*
             * Declarem les variables que faran referencia als costats/mides de la caixa
             */
            int caixaCostat1 = teclat.nextInt();
            int caixaCostat2 = teclat.nextInt();
            int caixaCostat3 = teclat.nextInt();

            /*
             * Utilitzem una estructura condicional simple que seleccionarà el missatge a
             * imprimir per pantalla depenent de si es cumpleix o no la condició de dins del
             * parèntesi en aquest cas compara cada costat de la joguina amb cada costat de
             * la caixa de transport
             * si el costat de la joguina toca amb el costat de la caixa donarà NO SIRVE
             * si no toca SIRVE.
             */
            if (joguinaCostat1 >= caixaCostat1 && joguinaCostat1 >= caixaCostat2 &&
                    joguinaCostat1 >= caixaCostat3) {
                System.out.println("NO SIRVE");
            } else if (joguinaCostat2 >= caixaCostat1 && joguinaCostat2 >= caixaCostat2
                    && joguinaCostat2 >= caixaCostat3) {
                System.out.println("NO SIRVE");
            } else if (joguinaCostat3 >= caixaCostat1 && joguinaCostat3 >= caixaCostat2
                    && joguinaCostat3 >= caixaCostat3) {
                System.out.println("NO SIRVE");
            } else {
                System.out.println("SIRVE");
            }

            count++; // Operador d'increment que suma 1 a la variable count i així poder repetir el
            // bucle fins a arribar al valor de la variable contador.
        }

    }
}
