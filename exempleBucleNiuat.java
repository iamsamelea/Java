/* Mostrar per pantalla les taules de multiplicar de 1 fins al 10
*
* @authors Alexander Guerra, Samuel Lara
* @version 1.0
* @since   20-01-2022
*/
public class exempleBucleNiuat {
    public static void main(String[] args) {

        int multiplicacio;

        /*
         * Bucle for al qual declarem una variable dins de tipus int, al que li fiquem
         * una condició de que si la variable és menor o igual a 10 continuï el bucle i
         * que se li sumi 1 més al número.
         * 
         * El funcionament d'aquest programa és la de si es cumpleix la funció del bucle
         * for pare para al bucle fill i llavors comprova si es cumpleix la funció del
         * bucle fill i si es així fa la multiplicació i torna fer el bucle fill pero
         * sumant 1 al valor, quan arriba a més de 10 surt i torna a fer el bucle pare
         * pero aquesta vegada sumant 1 i torna al bucle fill i així fa la taula de
         * multiplicar del 2, i aixií contantment fins que ja no es cumpleixi cap
         * condició.
         */
        for (int num1 = 1; num1 <= 10; num1++) {
            for (int num2 = 1; num2 <= 10; num2++) { // Bucle niuat que fa la mateixa funció que el bucle pare.
                multiplicacio = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + multiplicacio);
            }
            System.out.println(); // Espai per a separar les taules de multiplicar
        }
    }
}