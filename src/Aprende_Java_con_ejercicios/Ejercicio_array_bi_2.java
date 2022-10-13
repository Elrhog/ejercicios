/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aprende_Java_con_ejercicios;

/**
 *
 * @author alvar
 */
public class Ejercicio_array_bi_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] tabla=new int [5][6];
        
        for(int i=0;i<tabla.length-1;i++){
            
            for (int j=0;j<tabla[i].length-1;j++){
                
                tabla[i][j]=(int)Math.round(Math.random()*10);
                
                tabla[i][tabla[i].length-1]+=tabla[i][j];
                tabla[tabla.length-1][j]+=tabla[i][j];
                tabla[tabla.length-1][tabla[i].length-1]+=tabla[i][j];                                          
               
            }
        }
        
        for(int i=0;i<5;i++){
            
            System.out.println();
            
            for(int j=0;j<6;j++){
                
                System.out.print(tabla[i][j] + " ");
            }
        }
    }
    
}
