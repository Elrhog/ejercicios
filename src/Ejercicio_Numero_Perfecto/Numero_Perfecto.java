/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_Numero_Perfecto;

/**
 *
 * @author alvar
 */
import javax.swing.*;

public class Numero_Perfecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        int comprobante;
        
        for(int i=numero;i>0;i--){
            
            comprobante=0;
            
            for(int j=i-1;j>0;j--){
                
                if(i%j==0){
                    
                    comprobante=comprobante+j;
                    
                }
                                
            }
            
            if (comprobante==i){
                
                System.out.println("El primer número perfecto es " + comprobante);
                
                break;
            
            }
        }
    }
    
}
