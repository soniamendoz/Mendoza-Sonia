/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TP3;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *< > [ ]
 * @author LABO B
 */
public class JuegoAdivinanza {
    int numeroSecreto;
    int intentos; 

    public JuegoAdivinanza(int numeroSecreto, int intentos) {
     Random num=new Random();
        this.numeroSecreto = num.nextInt(10)+1;
        this.intentos = intentos=0;
    }
   
   public void jugar(){
        int adivinanza=0;
        int maxIntentos=3;
        for(int i=1;i<=maxIntentos;++i){
           String entrada= JOptionPane.showInputDialog("Intento "+i+" de "+maxIntentos+"\n Adivina el numero entre 1 y 10");
           adivinanza=Integer.parseInt(entrada);
        
        intentos++;
        if (adivinanza<numeroSecreto){
            JOptionPane.showMessageDialog(null,"Muy BAJO");    
        }
        else if (adivinanza>numeroSecreto){
      JOptionPane.showMessageDialog(null,"Muy ALTO");    
    
        }else{
       JOptionPane.showMessageDialog(null,"CORRECTO lo lograste en "+i+" intentos");    
        }
     
    }

   JOptionPane.showMessageDialog(null, "SE ACABARON LOS INTENTOS :(");
   
  return;
    }
   
    public static void main(String[] args) {
        JuegoAdivinanza juego=new JuegoAdivinanza(0, 0);
        juego.jugar();
    }
   
    }
   


