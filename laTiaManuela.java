import java.util.Scanner;

/* <h1>La Tía Manuela</h1>
* Aquesta aplicació ens mostra un número que será la quantitat de vegades que s'executará el programa,
* ens demanarà per pantalla els costats de la joguina i de la caixa i tenim que veure si la joguina cap dins,
* una vegada encaixada comparará els costats i ens mostrará per pantalla i la caixa SIRVE o NO SIRVE per a la joguina
* @author  Samuel Lara
* @version 1.0
* @since   10-01-2022
*/

public class laTiaManuela {

    /**
     * @param args
     */
    public static void main(String[] args) {

        /* Declarem una variable Scanner */
        Scanner teclat = new Scanner(System.in);

        /*
         * Declarem les variables que ens ajudaran a conseguir fer el loop, tant el
         * contador com el count
         */
        int contador = teclat.nextInt();
        int count = 1;

        /* Inicialitzem el loop amb un while loop i li donem una condició */
        while (count <= contador) {

            /*
             * Declarem els que seran els tres costats de les variables que faran referencia
             * a la joguina
             */
            int joguinaCostat1 = teclat.nextInt();
            int joguinaCostat2 = teclat.nextInt();
            int joguinaCostat3 = teclat.nextInt();

            /*
             * Declarem els que seran els tres costats de les variables que faran referencia
             * a la caixa
             */
            int caixaCostat1 = teclat.nextInt();
            int caixaCostat2 = teclat.nextInt();
            int caixaCostat3 = teclat.nextInt();

            /* No funciona correctament */
            if (joguinaCostat1 < caixaCostat1) { // Joguina costat 1
                System.out.println("SIRVE");
            } else if (joguinaCostat1 < caixaCostat2) {
                System.out.println("SIRVE");
            } else if (joguinaCostat1 < caixaCostat3) {
                System.out.println("SIRVE");
            } else if (joguinaCostat2 < caixaCostat1) { // Joguina costat 2
                System.out.println("SIRVE");
            } else if (joguinaCostat2 < caixaCostat2) {
                System.out.println("SIRVE");
            } else if (joguinaCostat2 < caixaCostat3) {
                System.out.println("SIRVE");
            } else if (joguinaCostat3 < caixaCostat1) { // Joguina costat 3
                System.out.println("SIRVE");
            } else if (joguinaCostat3 < caixaCostat2) {
                System.out.println("SIRVE");
            } else if (joguinaCostat3 < caixaCostat3) {
                System.out.println("SIRVE");
            } else {
                System.out.println("NO SIRVE");
            }

            count++;

            /*
             * if (joguinaCostat1 < caixaCostat1 || joguinaCostat1 < caixaCostat2 ||
             * joguinaCostat1 < caixaCostat3) {
             * System.out.println("SIRVE");
             * } else if (joguinaCostat2 < caixaCostat1 || joguinaCostat2 < caixaCostat2
             * || joguinaCostat2 < caixaCostat3) {
             * System.out.println("SIRVE");
             * } else if (joguinaCostat3 < caixaCostat1 || joguinaCostat3 < caixaCostat2
             * || joguinaCostat3 < caixaCostat3) {
             * System.out.println("SIRVE");
             * } else {
             * System.out.println("NO SIRVE");
             */
        }

    }
}