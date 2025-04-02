/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificar.edad.para.votar;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class VERIFICAREDADPARAVOTAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Usted es elegible para votar.");
         } else {
             System.out.println("Usted no es elegible para votar.");
         }    
        }
        
    }
    
}
