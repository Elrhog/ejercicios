/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_programacion_Java_Libro;

/**
 *
 * @author alvar
 */
public class Ej_5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] tabla=new int [4][4];
        
        boolean comprobante=true;
        
        for(int i=0;i<4;i++){
            
            System.out.println();
            
            for(int j=0;j<4;j++){
                
                tabla[i][j]=(int)Math.round(Math.random()*10);;
                
                System.out.print(tabla[i][j] + " ");
            }
        }
        
        System.out.println();
        
        for(int i=0;i<4;i++){
            
            for(int j=0;j<4;j++){
                
                if(tabla[i][j]!=tabla[j][i]){
                    
                    comprobante=false;
                     
                    break;
                }
                    
            }
            
        }
        
        if(comprobante) System.out.println("La tabla es simetrica");
            else System.out.println("La tabla no es simetrica");
    }
    
}
