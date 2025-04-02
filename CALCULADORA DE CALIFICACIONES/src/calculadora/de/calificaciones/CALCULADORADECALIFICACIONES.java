/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.de.calificaciones;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class CALCULADORADECALIFICACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
         System.out.print("Ingrese la calificación de los parciales (0-100): ");
         double notaParciales = scanner.nextDouble();
         System.out.print("Ingrese la calificación del proyecto (0-100): ");
         double notaProyecto = scanner.nextDouble();
         System.out.print("Ingrese la calificación del examen final (0-100): ");
         double notaExamenFinal = scanner.nextDouble();
         if (notaParciales < 0 || notaParciales > 100 || 
             notaProyecto < 0 || notaProyecto > 100 || 
             notaExamenFinal < 0 || notaExamenFinal > 100) {
             System.out.println("Error: Las calificaciones deben estar entre 0 y 100.");
         } else {
             double notaFinal = (notaParciales * 0.40) + (notaProyecto * 0.30) + (notaExamenFinal * 0.30);
             System.out.println("La calificación final del estudiante es: " + notaFinal);
         }
         
         }    
          
    }
    

