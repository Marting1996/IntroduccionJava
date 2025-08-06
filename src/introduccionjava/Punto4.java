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
public class Punto4 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
    
        System.out.print("Ingresa tu nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingresa tu edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Te llamas: " + nombre + " y tienes " + edad + " años");
            
    }
}
