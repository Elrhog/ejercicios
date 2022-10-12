/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_programacion_Java_Libro;

/**
 *
 * @author alvar
 */

/* Desarrollar un programa que calcule al máximo común divisor 
    de dos número dados
*/

import java.util.Scanner;

public class Ej_6_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a, b;
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        
        a=entrada.nextInt();
        
        System.out.println();
        System.out.print("Introduce el segundo número: ");
        
        b=entrada.nextInt();
        
        int mcd=mcd(a,b);
        
        System.out.println();
        System.out.println("El m.c.d de " + a + " y " + b + " es: " + mcd);
        
    }
    
    static int minimo(int a, int b){
          
        int min;
    
        if(a<b) min=a;
        else min=b;
    
        return min;
    }
    
    static int mcd(int a, int b){
        
        int mcd=1;
        
        for(int i=minimo(a,b);i>=1;i--){
            
            if(a%i==0 && b%i==0){
                
                mcd=i;
                break;
            }
        }
        
        return mcd;
    }
    
}
