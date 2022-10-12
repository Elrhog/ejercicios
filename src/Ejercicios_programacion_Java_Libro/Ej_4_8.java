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

public class Ej_4_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] tabla=new int [10];
        
        int numero, posicion;
                
        for(int i=0;i<8;i++){
            
            tabla[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero"));
            
        }
                
        posicion=Integer.parseInt(JOptionPane.showInputDialog("Introduce una posición entre 0 y 8"));
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un nuevo número"));
        
        for(int i=7;i>=posicion;i--){
            
            tabla[i+1]=tabla[i];
        }
        
        tabla[posicion]=numero;
        
        for(int i=0;i<10;i++){
            
            System.out.print(tabla [i] + " ");
            
        }
    }
    
}
