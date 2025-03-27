/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TP2;
import java.util.Scanner;
import java.util.Random;
/**
 *< > [ ]
 * @author LABO B
 */
public class EJ6 {
    public static void main(String[] args) {
        
        for(int i=1;(i<=1);++i){
            System.out.println("");
        System.out.println("Ingresa 1 para lanazar el dado o Ingrese 2 para salir");
        Scanner leer=new Scanner (System.in);
        int num=leer.nextInt();
        if(num==1){
            System.out.println("....Tirando el dado....");
            Random random=new Random();
            
            int numero=random.nextInt(6)+1;
            
            System.out.println("¡Te toco "+numero+"!");
            i=i-1;
        }else{
            if(num==2){
                System.out.println("Saliste de esta ronda ");
            }
            else{
                System.out.println("ERROR...:(");
                }
        }
        }
        
    }
}
