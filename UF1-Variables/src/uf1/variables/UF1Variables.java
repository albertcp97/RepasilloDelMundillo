/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1.variables;

import java.util.Scanner;

/**
 *
 * @author Albert
 */
public class UF1Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Enteros (positivos y negativos) // se diferencia por la capacidad el long es el que más
        int numero1=0;        
        short numero2=0;
        long numero3=0;
        
        //decimales //se diferencia por la capacidad, double es el que más tiene y en double no hace falta añadir f al final del decimal
        float decimal1=0.0f;
        double decimal2=0.0;
        
        //boolean (true o false)
        boolean bandera=false;
        
        //String
        String cadena1="hola";
        char letra = 'a';
        
        
        //Convertir datos a un tipo diferente (mirar la teoria donde hay el mapa conceptual de las variables)
        //CONVERSIONES DIRECTAS
        //podemos asignar variables de un mismo tipo siempre que en la escalera esten por encima de este (double esta por encima de int y por eso no hace falta
        //hacer una conversion explicita)
        double num1= numero1;
        num1=numero2;
        num1=numero3;
        
        //Conversiones explicitas (necesario hacer un casteo)
        numero1=(int)num1;
        
        //Conversiones a otros tipos de variable (Ex. string a int o int a string)
        String intacadena=numero1+"";
         intacadena=String.valueOf(numero1);
         
         numero1=Integer.parseInt(intacadena);
         num1=Double.parseDouble(intacadena);
         //Boolean.parseDouble(intacadena);
         //Float.parseFloat("string");
         
         Scanner sc= new Scanner(System.in);
         
         String string1=sc.nextLine();
         numero1=sc.nextInt();
         //IMPORTANTE: al hacer nextInt() el o cualquier dato numerico, el intro se queda en el buffer. OJO si luego volveis a pedir un string, si no
         //se vacia el buffer, ese nextLine() se lo va saltar, guardando nada en la variable string (ENTRE SCANNER PARA NUMEROS NO PASA NADA)
         sc.nextLine();
         string1=sc.nextLine();
         
         //scanner devuelve un String y con el parseInt lo transformamos en un int
        int stringANumero= Integer.parseInt(sc.nextLine());
        
        //hacer actividades de conversion de datos y salidas de texto (println y printf)
    }
    
}
