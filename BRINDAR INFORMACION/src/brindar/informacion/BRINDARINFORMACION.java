/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package brindar.informacion;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class BRINDARINFORMACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de un artista, película, serie o algo de su preferencia: ");
        String preferencia = scanner.nextLine().toLowerCase();
        switch (preferencia) {
            case "michael jackson":
                System.out.println("Michael Jackson fue un cantante, compositor y bailarín estadounidense, conocido como el 'Rey del Pop'.");
            case "the godfather":
                 System.out.println("El Padrino (The Godfather) es una película dirigida por Francis Ford Coppola.");
                  System.out.println("Es considerada una de las mejores películas de la historia del cine, basada en la novela de Mario Puzo.");
            case "stranger things":
                 System.out.println("Stranger Things es una serie de ciencia ficción y terror creada por los hermanos Duffer.");
                 System.out.println("Se desarrolla en la década de 1980 y sigue a un grupo de niños mientras enfrentan eventos paranormales.");
                break;
            case "mona lisa":
                System.out.println("La Mona Lisa es una famosa pintura renacentista de Leonardo da Vinci.");
                 System.out.println("Se encuentra en el Museo del Louvre en París y es conocida por su enigmática sonrisa.");
            case "the beatles":
                System.out.println("The Beatles fue una banda de rock británica formada en Liverpool en 1960.");
                 System.out.println("Está considerada como la banda más exitosa y aclamada de todos los tiempos.");
                break;
            default:
                System.out.println("Lo siento, no tengo información sobre esa preferencia.");
               break;
           
        
                
        }
        
    }
    
}
