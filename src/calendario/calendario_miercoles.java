/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calendario;

/**
 *
 * @author alvar
 */
import java.util.*;

public class calendario_miercoles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        
        int diaNumero=10;
        
        System.out.println("¿En que día de la semana cae el día 1?");
        
        while(diaNumero==10){                      
        
            String dia=entrada.nextLine();
            
            switch(dia){
                
                case "lunes": 
                    diaNumero=0;
                    break;
                case "martes":
                    diaNumero=1;
                    break;
                case "miercoles":
                    diaNumero=2;
                    break;
                case "jueves":
                    diaNumero=3;
                    break;
                case "viernes":
                    diaNumero=4;
                    break;
                case "sabado":
                    diaNumero=5;
                    break;
                case "domingo":
                    diaNumero=6;
                    break;
                default:
                    System.out.println("Introduce un día valido");
            }
                    
        }
        
        for(int i=0;i<5;i++){
        
            for(int j=1-diaNumero;j<=7-diaNumero;j++){                                             
                                
                if(j+(7*i)<1){
                    
                    System.out.print("  ");
                    
                }else{
                    
                    System.out.print((j+(7*i)) + " ");
                    
                }
                
                if(j+(7*i)==30){
                    
                    break;
                }
            }
            
            System.out.println();
            
        }
    }
    
}
