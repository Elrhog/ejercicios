/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_programacion_Java_Libro;

/**
 *
 * @author alvar
 */
import java.util.Scanner;

public class Ej_6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] numeros=new int [3];
        
        Scanner entrada=new Scanner(System.in);
        
        for(int i=0;i<numeros.length;i++){
            
            System.out.println("Introduce un numero");
            
            numeros[i]=entrada.nextInt();
        }    
        
        System.out.println();
        System.out.println("El mayor de los tres es: " + maximo(numeros[0],numeros[1],numeros[2]));
    }
    
    static int maximo(int a, int b, int c){
        
        int max;
        
        if(a>b && a>c) max =a;
        else if(b>c) max=b;           
        else max=c;
        
        return max;                
    }
       
}
