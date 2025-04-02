/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertidor.de.grados;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class CONVERTIDORDEGRADOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
         System.out.print("Ingrese la temperatura en grados Celsius: ");
         double celsius = scanner.nextDouble();
         System.out.println("Seleccione la conversión deseada:");
         System.out.println("1. Convertir a Fahrenheit");
         System.out.println("2. Convertir a Kelvin");
         int opcion = scanner.nextInt();
         double temperaturaConvertida;
         switch (opcion) {
            case 1:
                 temperaturaConvertida = (celsius * 9 / 5) + 32;
                 System.out.println("La temperatura en Fahrenheit es: " + temperaturaConvertida);
                 break;
            case 2:  
                temperaturaConvertida = (celsius + 273.15);
                System.out.println("La temperatura en Kelvin es: " + temperaturaConvertida);
                break;
            default:
                System.out.println("Opción inválida. Por favor seleccione 1 o 2.");
                break;
        }       
                 
         }
    }
    

