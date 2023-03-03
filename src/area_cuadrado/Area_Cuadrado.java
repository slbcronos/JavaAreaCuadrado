/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_cuadrado;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
//import java.text.DecimalFormatSymbols;
//import java.util.Locale;
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
  
        DecimalFormat formatea = new DecimalFormat("###,###.##");
      
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
        System.out.println("             AREA DE UN CUADRADO                 ");
        System.out.println("-------------------------------------------------");
        System.out.println("Datos de Lado 1: "+ lado1);
        System.out.println("Datos de Lado 2: "+ lado2);
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        
        //JOptionPane.showMessageDialog(null,"El perimetro es: "+ String.format("%.2f", c1.getPerimetro(),"Importante") );
        //JOptionPane.showMessageDialog(null,"El perimetro es: "+ String.format("%.2f", c1.getArea()) );
        JOptionPane.showMessageDialog(null,"Perimetro: "+formatea.format(c1.getPerimetro()));
        JOptionPane.showMessageDialog(null,"Area: "+formatea.format(c1.getArea()));
        
 
        //System.out.println("El Perimetro es: " + c1.getPerimetro());
       // System.out.println("El Area es: " + c1.getArea());
        //System.out.println("---------------------//---------------------------");
        

        
        
        
    }
    
}
