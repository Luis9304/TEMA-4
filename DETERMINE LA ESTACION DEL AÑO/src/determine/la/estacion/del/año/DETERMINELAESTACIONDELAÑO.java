/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package determine.la.estacion.del.año;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class DETERMINELAESTACIONDELAÑO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número del mes (1-12): ");
        int mes = scanner.nextInt();
        String estacion;
        switch (mes) {
            case 12: // Diciembre
            case 1:  // Enero
            case 2:  // Febrero
                estacion = "Invierno";
                break;
             case 3:  // Marzo
             case 4:  // Abril
             case 5:  // Mayo
                 estacion = "Primavera";
                 break;
             case 6:  // Junio
             case 7:  // Julio
             case 8:  // Agosto
                 estacion = "Verano";
                 break;
            case 9:  // Septiembre
            case 10: // Octubre
            case 11: // Noviembre
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes inválido"; // Para cualquier número fuera de 1-12
                break;
        }
        System.out.println("La estación correspondiente es: " + estacion);
        
        }
        
    }
    

