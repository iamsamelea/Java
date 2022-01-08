import java.util.Scanner;

public class mejorImposible{
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
    
        /* Tamany de la cuadricula */
        int cuadricula = teclat.nextInt();


        /* While Loop per a demanar les vegades que faci falta iniciar el programa */
        while ( cuadricula != 0 ){

            
            /* Posició inicial */
            int x1 = teclat.nextInt();
            int y1 = teclat.nextInt();

            /* Posició final */
            int x2 = teclat.nextInt();
            int y2 = teclat.nextInt();

            /* Cálcul posició inicial */
            int puntInici = x1 - y1;


            /* Cálcul posició final */
            int puntFinal = x2 - y2;

                /* Posició inicial i posició final están en la mateixa diagonal? */
                if ( puntInici == puntFinal ) {
                    System.out.println("1"); //Están a la mateixa diagonal
                } 
                else if ( Math.abs(puntInici) %2 == Math.abs(puntFinal) %2 ){
                    System.out.println("2"); //Estan a la mateixa diagonal i son els dos parells o imparells
                } 
                else {
                    System.out.println("IMPOSIBLE"); //No estan a la mateixa diagona i no son els dos parells ni imparells
                }

                cuadricula = teclat.nextInt(); //torna a demanar el tamany de la cuadricula sempre que no sigui 0
            }
    }
}
