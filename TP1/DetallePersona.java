/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
/**
 *< > [ ]
 * @author LABO B
 */
public class DetallePersona {
    public static void main(String[] args) {
    String nombreCompleto="Sonia Mendoza";
int edad=17;
 double altura=1.60;
 String letra;

String paisDeOrigen="Argentina ";
        System.out.println("Ingrese C si esta casado o S si esta soltero");
Scanner letr=new Scanner (System.in);
 letra=letr.next();

        System.out.println("Nombre: "+nombreCompleto);
        System.out.println("Edad: "+edad);
        System.out.println("Altura: "+altura);
        System.out.println("Pais de origen: "+paisDeOrigen);
if(letra=="C"){
    System.out.println("Esta casado/a");
}
else{
        System.out.println("Esta soltero");
    }


    }

}

