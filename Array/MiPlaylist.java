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
public class MiPlaylist {
    public static void main(String[] args) {
        String[] canciones={"Rage", "Tres estrellas en el conjunto", "soltera","me enamore","TQG"};
        JOptionPane.showMessageDialog(null, "Mi primera y ultima cancion son:\n"+canciones[0]+"\n"+canciones[4]);
        
        
        JOptionPane.showInternalMessageDialog(null, "Mis 5 canciones favoritas son: ");
        for(int i=0;i<canciones.length;++i){
            JOptionPane.showMessageDialog(null, canciones[i]);
        }
    }
}
