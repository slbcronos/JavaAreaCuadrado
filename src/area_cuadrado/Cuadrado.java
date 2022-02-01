package area_cuadrado;

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
    //Atributos
    private float lado1;
    private float lado2;
    
    //metodo constructor 1, funciona solo si los lados no son iguales, "cuadrilateros"
    public Cuadrado(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //contructor para lados iguales "cuadrados"

    public Cuadrado(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    
    //Metodos
    public float getPerimetro() {
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }
    
        public float getArea() {
        float area = lado1 * lado2;
        return area;
    }
    
    
    
    
}
