/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertidor.de.monedas;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class CONVERTIDORDEMONEDAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en pesos mexicanos (MXN): ");
        double cantidadMXN = scanner.nextDouble();
        System.out.println("Seleccione la moneda a la que desea convertir:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        int opcion = scanner.nextInt();
        double cantidadConvertida;
        switch (opcion) {
            case 1:
                cantidadConvertida = cantidadMXN * 0.058; 
                System.out.println("La cantidad convertida a Dólares (USD) es: " + cantidadConvertida);
                break;
            case 2:
                cantidadConvertida = cantidadMXN * 0.052; 
                break;
            case 3:
                cantidadConvertida = cantidadMXN * 1.93;
                System.out.println("La cantidad convertida a Bahts (THB) es: " + cantidadConvertida);
                 break;
            case 4:
                cantidadConvertida = cantidadMXN * 7.65;
                System.out.println("La cantidad convertida a Yenes (JPY) es: " + cantidadConvertida);
                 break;
            case 5:
                cantidadConvertida = cantidadMXN * 77.5;
                System.out.println("La cantidad convertida a Wones (KRW) es: " + cantidadConvertida);
                break;
            case 6:
                cantidadConvertida = cantidadMXN * 0.082;
                System.out.println("La cantidad convertida a Dólares Australianos (AUD) es: " + cantidadConvertida);
                   break;
            case 7:
                cantidadConvertida = cantidadMXN * 0.21;
                System.out.println("La cantidad convertida a Soles (PEN) es: " + cantidadConvertida);
                break;
            case 8:
                cantidadConvertida = cantidadMXN * 0.077; 
                System.out.println("La cantidad convertida a Dólares Canadienses (CAD) es: " + cantidadConvertida);
                break;
            case 9:
                cantidadConvertida = cantidadMXN * 25.30; 
                System.out.println("La cantidad convertida a Bolívares (VES) es: " + cantidadConvertida);
                 break;
            case 10:  
                cantidadConvertida = cantidadMXN * 8.4;
                System.out.println("La cantidad convertida a Pesos Argentinos (ARS) es: " + cantidadConvertida);
                 break;
             default:
                 System.out.println("Opción inválida. Por favor seleccione un número entre 1 y 10.");
                 break;
         }
        
  
          
                  
       
             
           
                        
                
                
                
        }

     
        
    }
    

