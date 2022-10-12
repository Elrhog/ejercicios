/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aprende_Java_con_ejercicios;

/**
 *
 * @author alvar
 */
public class Ejercicio_array_bi_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] tabla=new int [6][10];
        
        for(int i=0;i<6;i++){
            
            for(int j=0;j<10;j++){
                
                tabla[i][j]=(int)Math.round(Math.random()*1000);
            }            
        }
        
        
    }
    
}
