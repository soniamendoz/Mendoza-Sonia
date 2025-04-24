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
public class MiMochilaEscolar {
        
    public static void main(String[] args) {
     String[] mochila = { "Carpeta","Cartuchera","lapizera","lapiz","cuaderno"};
   JOptionPane.showInternalMessageDialog(null,"Los utiles de la pocision 2 y 4 son: \n"+ mochila[2]+"\n"+mochila[4]);

   JOptionPane.showInternalMessageDialog(null, "Todos los utiles que llevo  son: ");
    for(int i=0; i< mochila.length ; ++i ){
   JOptionPane.showMessageDialog(null,""+ mochila[i]+"\n");
    }
    
    }
    
}
