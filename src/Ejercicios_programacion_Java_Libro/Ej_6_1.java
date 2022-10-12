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

public class Ej_6_1 {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        // TODO code application logic here      
       
        int num;
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Introduzca un numero: ");
        
        num=entrada.nextInt();
        
        System.out.println("---------------------------");
        
        mostrar(num);
        
        System.out.println("---------------------------");

    }

    static void mostrar(int num) {
        
        for (int i = 0; i < num; i++) {
            
            System.out.println("Módulo ejecutándose");
        }
    }

}
