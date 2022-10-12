/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aprende_Java_con_ejercicios;

/**
 *
 * @author alvar
 */

// Elaborar un programa que ordene un array de tipos de palabras

import javax.swing.*;

public class Ejercicio_7_14 {

    /**
     * @param args the command line arguments
     */        
            
    public static void main(String[] args) {
        // TODO code application logic here
        
        String [] colores={"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String [] palabras=new String [8];
        String [] array_colores=new String [8];
        String [] array_no_colores=new String [8];
        String [] array_final=new String [8];
                                       
        
        for(int i=0;i<8;i++){
            
            palabras[i]=JOptionPane.showInputDialog("Introduce una palabra");
        }
        
        for(int i=0;i<8;i++){
            
            for(int j=0;j<9;j++){
                
                if(palabras[i].equalsIgnoreCase(colores[j])){
                    
                    
                }
            }
        }                
    }
    
}
