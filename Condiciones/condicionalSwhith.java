/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Condiciones;
import java.util.Scanner;
/**
 *< > [ ]
 * @author LABO B
 */
public class condicionalSwhith {
     public static void main(String[] args) {
        int n1,n2; // Valor fijo asignado
        String signo;
         System.out.println("Ingrese dos numeros");
        Scanner n11=new Scanner (System.in);
        n1=n11.nextInt();
        Scanner n22=new Scanner (System.in);
        n2=n22.nextInt();
         System.out.println("Ingrese el signo del calculo que quire hacer");
        Scanner leer=new Scanner (System.in);
        signo=leer.next();
         
        // Evaluamos la opción con switch
        switch (signo) {
            case "+":
                System.out.println("La suma es igual a "+(n1+n2));
                break;
            case "-":
                System.out.println("La resta es "+(n1-n2));
                break;
            case "*":
                System.out.println("La multiplicacion es "+(n1*n2));
                break;
            default:
                System.out.println("La division es "+(n1/n2));
        }

        System.out.println("Fin del programa.");
    }

}
