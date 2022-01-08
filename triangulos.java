import java.util.Scanner;

public class triangulos {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        /*Contador de les vegades que funcionara el programa*/
        int contador = teclat.nextInt();
        int count = 1;
    


        
        while (count <= contador) {
            int costatA = teclat.nextInt();
            int costatB = teclat.nextInt();
            int costatC = teclat.nextInt();
            
            /*Fórmula per calcular coseno A*/
            double cosA = (Math.pow(costatB, 2) + Math.pow(costatC, 2) - Math.pow(costatA, 2)) / (2 * costatB * costatC); 
            /*Fórmula per calcular coseno B*/
            double cosB = (Math.pow(costatA, 2) + Math.pow(costatC, 2) - Math.pow(costatB, 2)) / (2 * costatA * costatC); 
            
            /*Fórmula per calcular A*/
            double A = Math.acos(cosA);
            /*Fórmula per calcular B*/
            double B = Math.acos(cosB);
            /*Fórmula per calcular C*/
            double C = Math.PI - A - B;
            /* El radi mes gran*/
            double maxima;
            
            /*Condició per a escollir el radi més gran*/
            if (A >= B){
                maxima = A;
                if(A >= C){
                    maxima = A;
                } else{
                    maxima = C;
                } 
                }else {
                     if(B > C){
                         maxima = B;
                     } else {
                         maxima = C;
                     }
                }
            /*Fórmula per calcular els graus*/
            //double graus = (C - B - A);
           
            /*Mostrar el tipus de triangle*/
            if (maxima < Math.PI/2){
                System.out.println("ACUTANGULO");
            } else if (maxima == Math.PI/2){
                System.out.println("RECTANGULO");
            } else if (maxima > Math.PI/2 && Math.PI > maxima){ //utilitzem && per a dirli que ha de complir les dos condicions a la vegada
                System.out.println("OBSTUSANGULO");
            } else{
                System.out.println("IMPOSIBLE");
            }
           //System.out.println(maxima);  
           //System.out.println(Math.PI);
           //System.out.println(A);
           //System.out.println(B);
           //System.out.println(C);

    
            count++;/*/Suma 1 al contador*/

        }
    }
}