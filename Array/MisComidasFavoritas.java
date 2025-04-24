/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Array;

import javax.swing.JOptionPane;

/**
 *< > [ ]
 * @author LABO B
 */
public class MisComidasFavoritas {
 public static void main(String[] args) {
     String[] comidasFavoritas = { "Lomito","Locro","Albondigas","Sopa de mani","Zapallitos rellenos"};
     
   JOptionPane.showInternalMessageDialog(null,"Mi segundo plato favorito es: \n"+ comidasFavoritas[1]);

   JOptionPane.showInternalMessageDialog(null, "Mis 5 comidas favoritas son: ");
    for(int i=0; i< comidasFavoritas.length ; ++i ){
   JOptionPane.showMessageDialog(null,""+ comidasFavoritas[i]);
    }
    
    }
}
