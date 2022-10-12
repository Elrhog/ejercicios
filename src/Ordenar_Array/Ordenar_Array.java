/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ordenar_Array;

/**
 *
 * @author alvar
 */
import java.util.*;

public class Ordenar_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int chivato;
        int posicion=0;
        int menor;
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("¿Cuántas posiciones quieres que tenga tu array?");
        
        int longitud_array=entrada.nextInt();
        
        int [] array=new int[longitud_array];
        
        for(int i=0;i<array.length;i++){
            
            array[i]=(int)Math.round(Math.random()*100);
            
        }
        
        System.out.println("Tu array es:");
        
        for(int i=0;i<longitud_array;i++){
            
            System.out.print(array[i] + " ");
            
        }
        
        System.out.println();
        System.out.println();
        System.out.println("Elige una opción: \n1. Ordenar de mayor a menor \n2. Ordenar de menor a mayor \n3. Introducir un número en la array");
        
        switch(entrada.nextInt()){
            
            case 1:
                
                for(int z=0;z<array.length;z++){
                    
                    for(int i=z;i<array.length;i++){
                        
                        chivato=0;
                        
                        for(int j=i+1;j<array.length;j++){
                            
                            if(array[i]>array[j]){
                                
                                chivato++;
                            }
                        }
                        
                        if(chivato==0){
                            
                            posicion=i;
                            
                            break;                            
                        }
                    }
                   
                    menor=array[posicion];
                                                            
                    for(int i=posicion-1;i>=z;i--){
                        
                        array[i+1]=array[i];
                        
                    }   
                   
                    /*array[posicion]=array[z];*/
                            
                    array[z]=menor;
                                        
                }
                
                for(int i=0;i<array.length;i++){
                    
                    System.out.print(array[i] + " ");
                }
                
                break;
                
                
        }
    }
    
    
    public static void muestraTabla(int[] tabla){
        for(int i=0; i<tabla.length;i++){
            System.out.print(i);
            
        }
    
    }    
}
