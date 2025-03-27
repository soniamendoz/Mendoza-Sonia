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
public class Empleado {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        
        System.out.println("Ingrese su nombre completo");
        String nombreCompleto=leer.next();
                Scanner ed=new Scanner (System.in);

        System.out.println("Ingrese su edad ");
        int edad=ed.nextInt();
           Scanner sa=new Scanner (System.in);

        System.out.println("Ingrese el salario ");
        int salario=sa.nextInt();
        
        System.out.println("Su nombre es: "+nombreCompleto);
        System.out.println("Su edad es: "+edad);
        System.out.println("El salario es: "+salario);
    }
}
