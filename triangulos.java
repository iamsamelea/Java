/* Nom del programa: Triángulos
* La funció d'aquest programa és la de mostrar un missatge per pantalla depenent del tipus d'angle del triangle,
* tenim la informació de les mides dels 3 costats del triàngle amb les quals tindrem que treballar.
*
* Trobarem més informació al següent enllaç: https://www.aceptaelreto.com/problem/statement.php?id=180&cat=5
* 
* @authors Alexander Guerra, Tatiana Valentinyova, Samuel Lara
* @version 1.0
* @since   14-12-2021
*/

/* Importació de la llibreria Scanner */
import java.util.Scanner;

/* Primer bloc del programa */
public class triangulos {

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

            /* Declarem tres variables que seran els tres costats del triangle */
            int costatA = teclat.nextInt();
            int costatB = teclat.nextInt();
            int costatC = teclat.nextInt();

            /* Fórmula per calcular coseno A */
            double cosA = (Math.pow(costatB, 2) + Math.pow(costatC, 2) - Math.pow(costatA, 2))
                    / (2 * costatB * costatC);

            /* Fórmula per calcular coseno B */
            double cosB = (Math.pow(costatA, 2) + Math.pow(costatC, 2) - Math.pow(costatB, 2))
                    / (2 * costatA * costatC);

            /*
             * Declarem una variable de tipus double en el qual el seu valor és la fórmula
             * per calcular el radi de A
             */
            double A = Math.acos(cosA);
            /*
             * Declarem una variable de tipus double en el qual el seu valor és la fórmula
             * per calcular el radi de B
             */
            double B = Math.acos(cosB);
            /*
             * Declarem una variable de tipus double en el qual el seu valor és la fórmula
             * per calcular el radi de C
             */
            double C = Math.PI - A - B;

            /*
             * Declarem una variable de tipus double en el qual el seu valor serà el radi
             * més gran dels tres que tenim
             */
            double maxima;

            /*
             * Condició per a escollir l'angle més gran utilitzant una estructura
             * condicional niuada
             * En aquest cas comparem tots els costats amb tots els costats per així trobar
             * l'angle més gran
             * el qual s'assignará a la variable maxima per així poder treballar amb ella
             * més endevant.
             */
            if (A >= B) {
                maxima = A;
                if (A >= C) {
                    maxima = A;
                } else {
                    maxima = C;
                }
            } else {
                if (B > C) {
                    maxima = B;
                } else {
                    maxima = C;
                }
            }

            /*
             * Utilitzem una estructura condicional simple que seleccionará el missatge a
             * imprimir per pantalla depenent de si es cumpleix o no la condició de dins del
             * parèntesi.
             */
            if (maxima < Math.PI / 2) {
                System.out.println("ACUTÁNGULO"); // Si l'angle emmagatzemat a la variable maxima és més petit de 90º es
                                                  // mostrarà ACUTÁNGULO.
            } else if (maxima == Math.PI / 2) {
                System.out.println("RECTÁNGULO"); // Si l'angle emmagatzemat a la variable maxima és igual que 90º es
                                                  // mostrarà RECTÁNGULO.
            } else if (maxima > Math.PI / 2 && Math.PI > maxima) { // Utilitzem && per a dirli que ha de complir les dos
                                                                   // condicions a la vegada.
                System.out.println("OBSTUSÁNGULO"); // Si l'angle emmagatzemat a la variable maxima és més gran de 90º
                                                    // es mostrarà OBTUSÁNGULO.
            } else {
                System.out.println("IMPOSIBLE");// Si l'angle emmagatzemat a la variable maxima és més gran de 180º es
                                                // mostrarà IMPOSIBLE.
            }

            count++;// Operador d'increment que suma 1 a la variable count i així poder repetir el
                    // bucle fins a arribar al valor de la variable contador.

        }
    }
}