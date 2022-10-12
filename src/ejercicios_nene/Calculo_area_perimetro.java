/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_nene;

/**
 *
 * @author alvar
 */
public class Calculo_area_perimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                        
        Circulo circulo1=new Circulo(3);
        Circulo circulo2=new Circulo(5);
        Circulo circulo3=new Circulo(1);
        
        System.out.println("El area del ciruclo cuyo radio es: " + circulo1.getRadio() +
                " es " + circulo1.area());
        System.out.println("El perimetro del primer circulo es: " + circulo1.perimetro());
        
        circulo1.setRadio(5);
         
        System.out.println("El area del nuevo radio es: " + circulo1.area());
        
        System.out.println();
        
        if(circulo1.getRadio()>circulo2.getRadio() && circulo1.getRadio()>circulo3.getRadio())
            System.out.println("El area del circulo mayor es: " + circulo1.area());
        else if(circulo2.getRadio()>circulo3.getRadio())
            System.out.println("El area del circulo mayor es: " + circulo2.area());
        else System.out.println("El area del circulo mayor es: " + circulo3.area());
        
        System.out.println("contador_circulo vale: " + Circulo.getContador_circulo());
        
        System.out.println();
                                        
    }
    
}
