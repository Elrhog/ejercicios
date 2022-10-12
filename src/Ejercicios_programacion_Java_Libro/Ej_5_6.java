/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_programacion_Java_Libro;

/**
 *
 * @author alvar
 */
public class Ej_5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] tabla=new int [10][10];
        
        int suma=0;
        
        for (int i=0;i<10;i++){
            
            System.out.println();
            
            for(int j=0;j<10;j++){
                
                tabla[i][j]=(int)Math.round(Math.random()*10);
                
                suma+=tabla[i][j];
                
                System.out.print(tabla[i][j] + " ");
            }
            
            System.out.print(" - " + suma);
        }
    }
    
}
