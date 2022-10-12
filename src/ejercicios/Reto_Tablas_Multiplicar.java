/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author alvar
 */
import javax.swing.*;
import java.util.*;

public class Reto_Tablas_Multiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner numero_tablas=new Scanner(System.in);
        
        System.out.println("¿Cuántas tablas quieres calcular?");
        
        int longitud_array=numero_tablas.nextInt();
        
        int [] tablas=new int [longitud_array];
        
        for(int i=0;i<longitud_array;i++){
            
            tablas[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de la tabla"));
            
        }
        
        for(int j=1;j<11;j++){
            
            System.out.println();
            
            for(int i=0;i<longitud_array;i++){
                
                System.out.print(tablas[i] + "x" + j + "=" + (tablas[i]*j) + " ");
                
            }
        }

    }
    
}
