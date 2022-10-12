/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_programacion_Java_Libro;

/**
 *
 * @author alvar
 */
import javax.swing.*;

public class Ej_5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n, m;
        
        n=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de filas"));
        m=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de filas"));
        
        int[][] tabla=new int [n][m];
        
        for(int i=0;i<n;i++){
            
            System.out.println();
            
            for(int j=0;j<m;j++){
                         
                tabla[i][j]=i+j;
                
                System.out.print(tabla[i][j] + " ");
            }
        }
                
    }
    
}
