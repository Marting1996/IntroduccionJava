/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionjava;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Punto8 {
        public static void main(String [] args) {
            Scanner input = new Scanner(System.in);
            int  n1, n2;
            
            System.out.println("Ingresa el primer número: ");
            n1 = Integer.parseInt(input.nextLine());
            System.out.println("Ingresa el segundo número: ");
            n2 = Integer.parseInt(input.nextLine());            
            
            System.out.println("La division en int de los números es de: " + n1/n2);
            System.out.println("La division en double de los números es de: " + (double)n1/n2);
                         
        }
}
