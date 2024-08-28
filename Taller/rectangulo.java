/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;


/**
 *
 * @author User
 */
public class rectangulo {
    
    float longitud;
    float anchoRectangulo;
    
    public rectangulo (float longitud, float anchoRectangulo){
        this.longitud = longitud;   
        this.anchoRectangulo = anchoRectangulo; 
    }    
    
    public float calcularArea (){
        return longitud * anchoRectangulo;
    }
    
    public float calcularPerimetro (){
        return longitud + longitud + anchoRectangulo + anchoRectangulo;
    }
    rectangulo(){
        longitud = 1.0f;
        anchoRectangulo = 2.0f;
    }
  
    public static void main (String [] args){
        rectangulo area = new rectangulo();
        System.out.println("el area del rectangulo es de: "+area.calcularArea());
        System.out.println("el perimetro del rectangulo es de: "+area.calcularPerimetro());
    }
}
