/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TP1;

import java.util.Scanner;

/**
 *< > [ ]
 * @author LABO B
 */
public class RECETA {
    public static void main(String[] args) {
    String nombre;
String ingredientes;
int Tiempo;
String Dificultad;
 
        System.out.println("Ingrese el nombre de la receta");
        Scanner leer=new Scanner (System.in);
          nombre=leer.next();
          
         System.out.println("Ingrese sus ingredientes ");
        Scanner ed=new Scanner (System.in);
         ingredientes=ed.next();
         
        System.out.println("Ingrese los minutos de tardanza ");
         Scanner ti=new Scanner (System.in);
         Tiempo=ti.nextInt();
        
         System.out.println("Ingrese la Dificultad (Dificil,Medio,Facil) ");
           Scanner sa=new Scanner (System.in);
         Dificultad=sa.next();
        
        System.out.println("El nombre de la RECETA es: "+nombre);
        System.out.println("Sus ingredientes son: "+ingredientes);
        System.out.println("Y tarda  "+Tiempo+" minutos"+" de dificultad es: "+Dificultad);
       

    }

}
