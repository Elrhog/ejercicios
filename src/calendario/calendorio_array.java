/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calendario;

/**
 *
 * @author alvar
 */
public class calendorio_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] calendario=new int [5][7];                     
        
        for(int i=0;i<5;i++){
            
            for(int j=0;j<7;j++){
                
                calendario[i][j]=(j+1)+(i*7);
                
                if((j+1)+(i*7)==30){
                    
                    break;
                }
            }
        }
        
        for(int[]fila:calendario){                        
            
            for(int z:fila){
                
                System.out.print(z + " ");
                                
            }
            
            System.out.println();
            
        }
        
        System.out.println();
                
        System.out.println(calendario[0][4]);
    }
    
}
