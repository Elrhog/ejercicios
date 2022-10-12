/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_programacion_Java_Libro;

/**
 *
 * @author alvar
 */

/* desarrola un programa que calcule el mínimo común multiplo
    de dos número
*/

import java.util.Scanner;

public class Ej_7_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a, b, mcm;
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Introduce el primer número: ");
        
        a=entrada.nextInt();
        
        System.out.println();
        System.out.println("Introduce el segundo número: ");
        
        b=entrada.nextInt();
        mcm=mcm(a,b);
        
        System.out.println();
        System.out.println("El m.c.m de " + a + " y " + b + " es: " + mcm);
    }
    
    static int maximo(int a, int b){
        
        int max;
        
        if(a>b) max=a;
        else max=b;
        
        return max;
    }
    
    static int mcm(int a, int b){
        
        int mcm=maximo(a,b);
        int i=1;
        
        while(mcm%a!=0 || mcm%b!=0){
            
            i++;
            mcm=maximo(a,b)*i;
        }
        
        return mcm;
    }
    
}
