//package Taller;
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
    
    public void calcularArea (float longitud, float anchoRactangulo)
    {
        float resultado = longitud * anchoRectangulo;
        System.out.println("el area del rectangulo es: "+ resultado);
    }
    
    public void calcularPerimetro (float longitud,float anchoRectangulo)
    {
        float resultado =  (2*(longitud))+(2*(anchoRectangulo));
        System.out.println("el perimetro del rectangulo es: "+ resultado);
    }
  
    public static void main (String [] args)
    {
        Scanner Area = new Scanner(System.in);
        longitud = Area.nextFloat();

        Scanner Perimetro = new Scanner(System.in);
        anchoRectangulo = Perimetro.nextFloat();

        calcularArea(longitud,anchoRectangulo);
        calcularPerimetro(longitud,anchoRectangulo);
    }
}
