/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_nene;

/**
 *
 * @author alvar
 */
public class Circulo {
    
    private int radio;
    private static int contador_circulo=0;

    public static int getContador_circulo() {
        return contador_circulo;
    }
    
    public Circulo(int r){
        
        radio=r;
        contador_circulo++;
    }
    
    public double area(){
                        
        return radio*Math.pow(Math.PI, 2);                
    }
    
    public double perimetro(){
        
        return 2*Math.PI*radio;
    }
    
    public int getRadio(){
        
        return radio;
    }
    
    public void setRadio(int r){
        
        if(r>0) radio=r;
        
    }
    
}
