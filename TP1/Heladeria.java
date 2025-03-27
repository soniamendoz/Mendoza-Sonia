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
public class Heladeria {
    public static void main(String[] args) {
        String gusto;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingres un gusto de helado: ");
        gusto= leer.nextLine().toLowerCase();
        
        if (gusto.equals("chocolate")
                || gusto.equals("vainilla") 
                || gusto.equals("frutilla")
                || gusto.equals("dulce de leche")) {
            
            System.out.println("Si tenemos "+gusto);
            
        }else{
            System.out.println("Gusto no disponible");
        }
        
    }
}
