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
public class Estudiante {
    //ATRIBUTOS DE SU CLASE
    String nombre;
    int edad;
    Double facha;
    Double altura;
    String colorPelo;
   
    //CONSTRUCTORES
    public Estudiante(String nombre, int edad, Double facha, Double altura, String colorPelo) {
        this.nombre = nombre;
        this.edad = edad;
        this.facha = facha;
        this.altura = altura;
        this.colorPelo = colorPelo;
    }
    
    //METODO -> ACCION DEL OBJETO
    void estudiar (){
        System.out.println(nombre+" Esta estudiando...");
    }
    void rendir(){
        System.out.println(nombre+" Esta rindiendo...");
    }
    
    void horaLibre(){
        System.out.println("Estoy en hora libre");
        JOptionPane.showMessageDialog(null,nombre+ " Esta en hora libre");
    }
}

class main{
     public static void main(String[] args) {
        //CREANDO OBJETO
       Estudiante estudiante1 =new Estudiante("Luciana", 89,10.0,1.55, "Negro");
       Estudiante estudiante2 =new Estudiante("Tisiano", 16,10.0,1.72, "Negro");

       estudiante1.horaLibre();
       
       estudiante2.horaLibre();
       
    }
}
