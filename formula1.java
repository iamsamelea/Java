import java.util.Scanner;

public class formula1 {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        /* número d'entrenos */
        int E = teclat.nextInt();

        /* nom del pilot */
        String nomPilot = teclat.next();
        System.out.println("Nom Pilot: "+ nomPilot);
        
       
        /* Fer E vegades: */
        while(E <= 6){
            /* llegir 1 temps */
            double tempsEntrenament = teclat.nextDouble();

            /* sumar temps */
            double sumaTempsEntrenaments = tempsEntrenament += tempsEntrenament;
            System.out.println(sumaTempsEntrenaments);

            /* comptar si és menor o igual a 10 */
            if(tempsEntrenament <= 10 ){
                System.out.println("Es menor que 10");
            } else{
                System.out.println("Es major que 10");
            }

            /* Càlcul promig */
            double calculPromig = sumaTempsEntrenaments / E;
            System.out.println("Promig: " + calculPromig);

            /* Percentatges d'entrenos bo */
            int BO;
            System.out.println("Percentatges d'entrenos BO: " + "%");
        
            E++;
        }

        
    } 
}