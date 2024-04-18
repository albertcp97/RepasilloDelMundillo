/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1.bucles;

import java.util.Scanner;

/**
 *
 * @author Albert
 */
public class UF1Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println("\nFor");
        for(int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
        
        System.out.println("\nWhile");
        int num = 0;
        while (num < 10) {
            System.out.println(num);
            num++;
        }
        
        System.out.println("\ndoWhile");
        num = 10;
        do {            
            System.out.println(num);
            num++;
        } while (num < 10);
        
        boolean bandera = true;
        Scanner sc = new Scanner(System.in);
        while (bandera) {
            boolean validar = true;
            int opcion = 0;
            
            // Validación de entrada de usuario
            while (validar) {
                System.out.println("Introduce un número mayor o igual a 0:");
                if (sc.hasNextInt()) {
                    num = sc.nextInt();
                    sc.nextLine();
                    if (num >= 0) {
                        validar = false;
                    } else {
                        System.out.println("El número debe ser mayor o igual a 0");
                    }
                } else {
                    System.out.println("Tienes que introducir un número");
                    sc.nextLine(); // Limpiar el buffer
                }
            }
            
            // Menú de opciones
            System.out.println("1: Sumar\n2: Restar\n3: Salir");
            // Validación de entrada de usuario para el menú
            validar = true;
            while (validar) {
                System.out.println("Seleccione una opción:");
                if (sc.hasNextInt()) {
                    opcion = sc.nextInt();
                    sc.nextLine();
                    if (opcion >= 1 && opcion <= 3) {
                        validar = false;
                    } else {
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    }
                } else {
                    System.out.println("Tienes que introducir un número");
                    sc.nextLine(); // Limpiar el buffer
                }
            }
            
            // Switch-case para manejar la opción seleccionada
            switch(opcion) {
                case 1:
                    System.out.println("Sumar");
                    break;
                case 2:
                    System.out.println("Restar");
                    break;
                case 3:
                    bandera = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("No existe esa función");
            }
        }
        sc.close(); // Cerrar el scanner al finalizar
        
    }
    
}
