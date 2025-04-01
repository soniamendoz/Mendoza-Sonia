/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package POO;

import TP1.Empleado;
import javax.swing.JOptionPane;

/**
 *< > [ ]
 * @author LABO B
 */
public class Mercado {
 String nombre ;
 int edad;
 int NivelExper;
 Double Altura;

    public Mercado(String nombre, int edad, int NivelExper, Double Altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.NivelExper = NivelExper;
        this.Altura = Altura;
    }

   
   

    
    void Vender(){
        JOptionPane.showMessageDialog(null, nombre+" esta vendiendo...");
    }
    
     void Comprar(){
        JOptionPane.showMessageDialog(null, nombre+" Esta comprando...");
    }
     
     
}

class main{
    public static void main(String[] args) {
        Mercado personal=new Mercado("Esteban", 18, 9,1.70);
        personal.Comprar();
        personal.Vender();
    }
}