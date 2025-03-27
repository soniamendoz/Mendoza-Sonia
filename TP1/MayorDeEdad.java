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
public class MayorDeEdad {
    public static void main(String[] args) {
        System.out.println("Ingrese su edad");
        Scanner leer=new Scanner (System.in);
        int edad=leer.nextInt();
        
        if(edad>=16){
            System.out.println("Si puede conducir ");
        }
        else{
            System.out.println("No puede conducir");
        }
    }
}
