/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcular.precio.con.descuento;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class CALCULARPRECIOCONDESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
         System.out.print("Ingrese el precio original del producto: ");
         double precioOriginal = scanner.nextDouble();
         double descuento = 0;
         if (precioOriginal <= 100) {
             descuento = 0; // Sin descuento
         } else if (precioOriginal > 100 && precioOriginal <= 200) {
             descuento = 0.10; // 10% de descuento
         } else if (precioOriginal > 200 && precioOriginal <= 500) {
             descuento = 0.20; // 20% de descuento
         } else if (precioOriginal > 500) {
             descuento = 0.25; // 25% de descuento
         }    
          double precioFinal = precioOriginal - (precioOriginal * descuento);
          System.out.println("El precio final después del descuento es: " + precioFinal);
          
         }
        
    }
    
}
