import java.util.Scanner;

/* <h1>Tu amigable vecino</h1>
* Aquesta aplicació ens mostra la entrada d'un número per part de l'usuari.
* Fer comentaris adequats al vostre programa fa que sigui més fàcil d'utilitzar i s'assumeix que és un codi d'alta qualitat.
* @author  Alexander Guerra
* @version 1.0
* @since   14-12-2021
*/


/**
* @param numero Aquest és el número que ha introduït l'usuari.
*/

public class tuAmigableVecino {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        /*Contador de les vegades que funcionara el programa*/
        int contador = teclat.nextInt();
        int count = 1;
     
        
        while (count <= contador) {
            int s = teclat.nextInt();
            int a = teclat.nextInt();
            int b = teclat.nextInt();
        
        /*Fórmula per calcular recorregut mínim opció 1*/
        int opcio1 = (Math.abs(a-s) + Math.abs(b-a));
        /*Fórmula per calcular recorregut mínim opció 2*/
        int opcio2 = (Math.abs(b-s) + Math.abs(a-b));
            
            
        /*Condició per a escollir la opció més curta*/
        if (opcio1<=opcio2){
            System.out.println(opcio1);
        
        } else {
            System.out.println(opcio2);
        }
    
        /*Suma 1 al contador*/
        count++;
           

        }
    }
}