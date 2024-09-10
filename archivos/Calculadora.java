//package calculadora;
import java.util.Scanner;

public class Calculadora {

    public int a;
    public int b;
    public int resultado;
    
    public Calculadora (int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int Multiplicacion()
    {
        
        for(int i=0; i<b; i++)
        {
            resultado+=a;
        }
        return resultado;
    }

    public int Division()
    {
        while(a>=b)
        {
          a -= b;
          resultado++;
        }
        
        return resultado;
    }
    
    public static void main(String [] args) {
        System.out.print("Ingresa el primer numero: ");
        Scanner num1 = new Scanner(System.in);
        int a = num1.nextInt();
        
        System.out.print("Ingresa el segundo numero: ");
        Scanner num2 = new Scanner(System.in);
        int b = num2.nextInt();
        
        Calculadora multiplicacion = new Calculadora (a, b);
        int resultado = multiplicacion.Multiplicacion();
        System.out.println("La multiplicacion de "+a+" y "+b+" es ="+resultado);
        
        Calculadora division = new Calculadora (a, b);
        int resultado1 = division.Division();
        System.out.println("La division de "+a+" y "+b+" es ="+resultado1);
    }

}