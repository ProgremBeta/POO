package Taller;
import java.util.Scanner;

public class Rectangulo 
{    
    static float longitud;
    static float anchoRectangulo;
    
    public Rectangulo (float longitud, float anchoRectangulo)
    {
        this.longitud = longitud;   
        this.anchoRectangulo = anchoRectangulo; 
    }    
    
    public static void calcularArea (float longitud, float anchoRactangulo)
    {
        float resultado = longitud * anchoRectangulo;
        System.out.println("el area del rectangulo es: "+ resultado);
    }
    
    public static void calcularPerimetro (float longitud,float anchoRectangulo)
    {
        float resultado =  (2*(longitud))+(2*(anchoRectangulo));
        System.out.println("el perimetro del rectangulo es: "+ resultado);
    }
  
    public static void main (String [] args)
    {
        System.out.print("Ingrese la longitud: ");
        Scanner Area = new Scanner(System.in);
        longitud = Area.nextFloat();

        System.out.print("Ingrese el ancho del rectangulo: ");
        Scanner Perimetro = new Scanner(System.in);
        anchoRectangulo = Perimetro.nextFloat();

        calcularArea(longitud,anchoRectangulo);
        calcularPerimetro(longitud,anchoRectangulo);
    }
}
