/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author User
 */
public class Calculadora {
    
    int suma;
    int resta;
    int multiplicacion;
    int division;
    int numero1;
    int numero2;
    
    public Calculadora (int suma, int resta, int multiplicacion, int division){
        
        this.suma = suma;
        this.resta = resta;
        this.multiplicacion = multiplicacion;
        this.division = division;
        
    }
    
    public void calcularSuma(int numero1, int numero2){
        this.suma = numero1 + numero2;
    }
    public void calcularResta(int numero1, int numero2){
        this.resta = numero1 - numero2;
    }
    public void calcularMultiplicacion(int numero1, int numero2){
        this.multiplicacion = numero1 * numero2;
    }
    public void calcularDivision(int numero1, int numero2){
        this.division = numero1 / numero2;
    }
    
    public static void main (String [] args){
        Calculadora info = new Calculadora(0, 0, 0, 0);
        info.calcularSuma(5, 5);
        System.out.println("La suma es:"+info.suma);
        info.calcularResta(5, 5);
        System.out.println("La resta es:"+info.resta);
        info.calcularMultiplicacion(5, 5);
        System.out.println("La multiplicacion es:"+info.multiplicacion);
        info.calcularDivision(5, 5);
        System.out.println("La division es:"+info.division);
    }   
}
