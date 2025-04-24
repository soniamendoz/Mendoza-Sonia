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
public class EdadesDeMiFamilia {
    public static void main(String[] args) {
         int[] edadesFamilia={8,15,40,42,18};
        JOptionPane.showMessageDialog(null, "La edad de la segunda persona es: \n"+edadesFamilia[1]);
        
        
        JOptionPane.showInternalMessageDialog(null, "Las edades de 5 miembros de mi familia son:");
        for(int i=0;i<edadesFamilia.length;++i){
            JOptionPane.showMessageDialog(null,"En la  pocision "+i+" esta "+ edadesFamilia[i]);
        }
    }
}
