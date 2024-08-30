//package Taller;

import java.util.Scanner;

public class Calculadora 
{
    static float numero1;
    static float numero2;
    static float resultado;
    
    public Calculadora (float numero1,float numero2,float resultado)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }

    public static  void sumar(float numero1,float numero2)
    {
        resultado = numero1 + numero2;
        System.out.println("El resultado de la suma de "+numero1+" y numero "+numero2+" es: "+ resultado);
        //return resultado;
    }

    public static void restar(float numero1,float numero2)
    {
        resultado = numero1 - numero2;
        System.out.println("El resultado de la resta de "+numero1+" y numero "+numero2+" es: "+ resultado);
        //return resultado;
    }

    public static void multiplicar(float numero1,float numero2)
    {
        resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicacion de "+numero1+" y numero "+numero2+" es: "+ resultado);
        //return resultado;
    }

    public static void dividir(float numero1,float numero2)
    {
        resultado = numero1 / numero2;
        System.out.println("El resultado de la division de "+numero1+" y numero "+numero2+" es: "+ resultado);
        //return resultado;
    }

    public static void main(String[] args)
    {
        System.out.println("Ingresa primer numero: ");
        Scanner num1 = new Scanner(System.in);
        numero1 = num1.nextInt();
        
        System.out.println("Ingresa primer numero: ");
        Scanner num2 = new Scanner(System.in);
        numero2 = num2.nextInt();

        sumar( numero1, numero2);
        restar( numero1, numero2);
        multiplicar(numero1,numero2);
        dividir(numero1,numero2);
    }   
}