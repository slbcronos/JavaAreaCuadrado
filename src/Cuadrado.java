/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salvador
 */
public class Cuadrado {
    
    double LadoCuadrado;

    public Cuadrado(double LadoCuadrado) {
        this.LadoCuadrado = LadoCuadrado;
    }
    
    //Metodos
    
    public double PerimetroCuadrado(double lado){
        
        double Perimetro = lado * 4;
        return Perimetro;
    }
}
