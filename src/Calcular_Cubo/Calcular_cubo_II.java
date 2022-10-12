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

public class Calcular_cubo_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        
        int impar=-1;
        
        int resultado=0;
        
        for(int i=1;i<=numero;i++){
            
            for(int j=1;j<=i;j++){
                
                impar+=2;
                
                if(i==numero){
                    
                    resultado+=impar;
                }
            }
        }
        
        System.out.println(resultado);
    }
    
}
