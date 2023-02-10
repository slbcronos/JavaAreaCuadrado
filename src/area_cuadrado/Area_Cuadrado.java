/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_cuadrado;

import javax.swing.JOptionPane;
/**
 *
 * @author Salvador
 */
public class Area_Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sacar el Perimetro, Area y Costo de Metro cuadrado de un cuadrado.
        Cuadrado  c1;
        
        float lado1;
        float lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el Lado 1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el Lado 2: "));
        
        System.out.println("Sistema para Saber Perimetro, Area de un Cuadrilatero");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------");
        
        if (lado1 == lado2){
            c1 = new Cuadrado(lado1);
        }else{
            c1 = new Cuadrado(lado1,lado2);
        }
        //Salida
        System.out.println("-------------------------------------------------");
        System.out.println("Datos de Lado 1: "+ lado1);
        System.out.println("Datos de Lado 2: "+ lado2);
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        
        System.out.println("El Perimetro es: " + c1.getPerimetro());
        System.out.println("El Area es: " + c1.getArea());
        System.out.println("------------------------------------------------");
        

        
        
        
    }
    
}
