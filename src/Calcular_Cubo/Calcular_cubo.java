/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calcular_Cubo;

/**
 *
 * @author alvar
 */
import javax.swing.*;

public class Calcular_cubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero natural"));
        
        int impar=numero*(numero-1)+1;
        
        int resultado=impar;
        
        for (int i=1;i<numero;i++){
            
            impar+=2;
            
            resultado+=impar;
        }
        
        System.out.println("EL cubo de " + numero + " es " + resultado);
   
    }
    
}
