/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_programacion_Java_Libro;

/**
 *
 * @author alvar
 */
import javax.swing.*;

public class Ej_4_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] tabla=new int [10];
        int numero;
        
        for(int i=0;i<5;i++){
            
            tabla[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        }
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre " + tabla[0] + " y " + tabla[4]));
        
        for(int i=0;i<6;i++){
            
           if(numero<tabla[i] || tabla[i]==0){
               
               for(int j=5;j>=i;j--){
                   
                   tabla[j+1]=tabla[j];
                }
               
               tabla[i]=numero;
               
               break;
               
           }/*else{
               
               tabla[5]=numero;
           }  */             
                           
        }

        for(int i=0;i<6;i++){
            
            System.out.print(tabla[i] + " ");
        }
    }
    
}
