/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_programacion_Java_Libro;

/**
 *
 * @author alvar
 */
import java.util.*;

public class Ej_6_2 {

    /**
     * @param args the command line arguments
     */
    
    static int max;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Entrada=new Scanner(System.in);

                
        int a, b;
        
        System.out.print("Introduzca un numero: ");
        
        a = Entrada.nextInt();
        
        System.out.print("Introduzca otro numero: ");
        
        b = Entrada.nextInt();
        
        maximo(a,b);
                
        System.out.println("El número mayor es: " + max);

    }

    static void maximo(int a, int b) { // suponemos que los tres números serán distintos
        
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        
        Ej_6_2.max=max;
    }

}
