/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TP3;
import javax.swing.JOptionPane;
import  java.io.PrintStream;
/**
 *< > [ ]
 * @author LABO B
 */
public class Calculadora {
  
     double operador1;       
     double operador2;

    public Calculadora(double operador1, double operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    } 
    
    public double sumar(double operador1,double operador2){
     return operador1+operador2;

    }
    
     public double restar(double operador1,double operador2){
        return operador1-operador2;
    }
     
     public double multiplicar(double operador1,double operador2){
        return operador1*operador2;
    }
     
     public double dividir(double operador1,double operador2){
        if(operador2!=0){
        return operador1/operador2;
        }else{
          JOptionPane.showInternalMessageDialog(null, "NO SE PUEDE DIVIDIR");
          return 0;
        } 
    }
     
     public static void main(String[] args) {
         Calculadora calcu=new Calculadora(0, 0);
        String num1=JOptionPane.showInputDialog("Ingresa el primer numero");
        String num2=JOptionPane.showInputDialog("Ingresa el segundo numero");
      double op1=Integer.parseInt(num1);
      double op2=Integer.parseInt(num2);
      String entrada=JOptionPane.showInputDialog("Calculadora:\n1.suma\n2.resta\n3.multiplicacion\n4.dividir");
      double result=0;

      switch(entrada){
          case "1":
                result=calcu.sumar(op1, op2);
              break;
              
                  case "2":
                result=calcu.restar(op1, op2);
 
              break;
              
                  case "3":
                result=calcu.multiplicar(op1, op2);

              break;
  
                  case "4":
                 result=calcu.dividir(op1, op2);

              break;
              
              default:JOptionPane.showMessageDialog(null, "ERROR"); 
              
      }

        JOptionPane.showMessageDialog(null, "El resultado es: "+ result);
    }

}




