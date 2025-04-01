/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package POO;

import javax.swing.JOptionPane;

/**
 *< > [ ]
 * @author LABO B
 */
public class Perro {
    String nombre;
    String raza;
   
    
    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    
    
    void Ladrar(){
        JOptionPane.showMessageDialog(null, "el Perro te esta ladrando: GUAU! GUAU!");
    }
    
     void Comer(){
        JOptionPane.showMessageDialog(null, "El perrro esta comiendo...");
    }
     
      void Correr(){
        JOptionPane.showMessageDialog(null, "El perro esta corriendo...");
    }
      
       void DarLaPatita(){
        JOptionPane.showMessageDialog(null, "El perro te esta dando la patita...");
    }
}
class main{
    public static void main(String[] args) {
     
       Perro perro =new Perro("Luna", "Caniche");
     perro.Ladrar();
     perro.Comer();
     perro.Correr();
     perro.DarLaPatita();
    }
}
