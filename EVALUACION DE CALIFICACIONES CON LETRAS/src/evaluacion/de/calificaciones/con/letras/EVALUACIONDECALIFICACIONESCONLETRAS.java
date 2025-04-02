/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacion.de.calificaciones.con.letras;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class EVALUACIONDECALIFICACIONESCONLETRAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su calificación numérica: ");
        int calificacion = scanner.nextInt();
        if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("La calificación es: A");
         } else if (calificacion >= 80 && calificacion <= 89) {
             System.out.println("La calificación es: B");
         } else if (calificacion >= 70 && calificacion <= 79) {
             System.out.println("La calificación es: C");
        } else if (calificacion >= 60 && calificacion <= 69) {
            System.out.println("La calificación es: D");
         } else if (calificacion < 60) {
             System.out.println("La calificación es: F");
         } else {
              System.out.println("Error: Calificación fuera de rango (0-100).");
         }
        
        }

        
    }
    
}
