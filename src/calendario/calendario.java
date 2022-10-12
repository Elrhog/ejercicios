/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calendario;

/**
 *
 * @author alvar
 */
public class calendario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int i=0;i<5;i++){
        
            for(int j=1;j<=7;j++){
                                              
                System.out.print((j+(7*i)) + " ");
                
                if(j+(7*i)==30){
                    
                    break;
                }
            }
            
            System.out.println();
            
        }        
        
    }
    
}
