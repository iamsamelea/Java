/*
* Introduïr les notes d'un alumne i depenent de si está aprovat o suspes ens mostrará un missatge per pantalla,
* si l'alumne està suspes podrà mostrar dos missatges diferents per pantalla depenent de si la nota és major o menor
* que 3.
*
* @authors Alexander Guerra, Samuel Lara
* @version 1.0
* @since   20-01-2022
*/

import java.util.Scanner;
public class exempleCondicionalNiuat {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        int nota = teclat.nextInt();

        if(nota >= 5){ //Si la nota és igual o major que 5 aprovat
            System.out.println("Aprovat");
        } else{
            if(nota >= 3){ //Condicional simple niuat per a mostrar dos resultats diferents 
                           // si la condició del if() pare no es compleix
                System.out.println("Casi aproves");
            } else{
                System.out.println("A recuperar");
            }
        }

    }
}