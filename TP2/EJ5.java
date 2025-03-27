/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TP2;
import java.util.Scanner;
/**
 *< > [ ]
 * @author LABO B
 */
public class EJ5 {
    public static void main(String[] args) {
         System.out.println("Ingrese dos numeros enteros");
      Scanner leer=new Scanner (System.in);
      String num2=leer.next();
      
      Scanner lee=new Scanner (System.in);
      String num1=lee.next();
      
      int numero2=Integer.parseInt(num1);
      int numero1=Integer.parseInt(num2);
      
      if (numero2==numero1){
          System.out.println("Estos numeros son iguales");
      }
      else{
          System.out.println("Estos numeros no son iguales");
      }
    }

}
