package calculadora;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Calculadora {

    public int a;
    public int b;
    public int resultado=0;
    
    public Calculadora (int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    
    public static void Multiplicacion(int a, int b, int resultado)
    {
        resultado=0;
        for(int i=0; i>b; i++)
        {
            resultado= resultado+a;
        }
    }
    
    //public static void Division(int a, int b)
    //{
    //    resultado= 
    //}
            
    public static void main(String[] args) {
        System.out.println("Ingresa primer numero: ");
        Scanner num1 = new Scanner(System.in);
        a = num1.nextInt();
    }
    
}
