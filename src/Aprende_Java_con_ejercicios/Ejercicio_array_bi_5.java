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
        int [] coordenadasMaximo=new int[2];
        int [] coordenadasMinimo=new int[2];
        int maximo=Integer.MIN_VALUE;
        int minimo=Integer.MAX_VALUE;
        
        
        for(int i=0;i<6;i++){
            
            System.out.println();
            
            for(int j=0;j<10;j++){
                
                tabla[i][j]=(int)Math.round(Math.random()*1000);
                
                if(tabla[i][j]>maximo){
                    
                    maximo=tabla[i][j];
                    
                    coordenadasMaximo[0]=i;
                    coordenadasMaximo[1]=j;
                }
                
                if(tabla[i][j]<minimo){
                    
                    minimo=tabla[i][j];
                    
                    coordenadasMinimo[0]=i;
                    coordenadasMinimo[1]=j;
                }   
                
                System.out.print(tabla[i][j] + " ");
            }            
        }
        
        System.out.println();
        System.out.println();
        System.out.println("El mayor numero de la tabla es: " + maximo + 
                " y se encuentra en la posicion (" + coordenadasMaximo[0] +
                ", " + coordenadasMaximo[1] + ")");
        
        System.out.println();
        System.out.println("El menor numero de la tabla es: " + minimo + 
                " y se encuentra en la posicion (" + coordenadasMinimo[0] +
                ", " + coordenadasMinimo[1] + ")");
    }
    
}
