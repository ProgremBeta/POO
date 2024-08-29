//package Taller;

import java.util.Scanner;

public class Calculadora 
{
    static int numero1;
    static int numero2;
    float resultado;
    
    public Calculadora (int numero1,int numero2,float resultado)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }

    public float  sumar(int numero1,int numero2)
    {
        resultado = numero1 + numero2;
        System.out.println("El resultado de la suma de "+numero1+" y numero "+numero2+" es: "+ resultado);
        return resultado;
    }

    public float restar(int numero1,int numero2)
    {
        resultado = numero1 - numero2;
        System.out.println("El resultado de la resta de "+numero1+" y numero "+numero2+" es: "+ resultado);
        return resultado;
    }

    public float multiplicar(int numero1,int numero2)
    {
        resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicacion de "+numero1+" y numero "+numero2+" es: "+ resultado);
        return resultado;
    }

    public float dividir(int numero1,int numero2)
    {
        resultado = numero1 / numero2;
        System.out.println("El resultado de la division de "+numero1+" y numero "+numero2+" es: "+ resultado);
        return resultado;
    }

    public static void main(String[] args)
    {
        System.out.println("Ingresa primer numero: ");
        Scanner num1 = new Scanner(System.in);
        numero1 = num1.nextInt();
        
        System.out.println("Ingresa primer numero: ");
        Scanner num2 = new Scanner(System.in);
        numero2 = num2.nextInt();

        //Calculadora FuncionSuma = new Calculadora(); FuncionSuma.sumar(int numero1;int numero2);
        
        System.out.println("cambio hecho 2");
    }   
}