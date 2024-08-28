package Taller;

public class Rectangulo 
{    
    float longitud;
    float anchoRectangulo;
    
    public Rectangulo (float longitud, float anchoRectangulo)
    {
        this.longitud = longitud;   
        this.anchoRectangulo = anchoRectangulo; 
    }    
    
    public float calcularArea ()
    {
        return longitud * anchoRectangulo;
    }
    
    public float calcularPerimetro ()
    {
        return longitud + longitud + anchoRectangulo + anchoRectangulo;
    }

    Rectangulo()
    {
        longitud = 1.0f;
        anchoRectangulo = 2.0f;
    }
  
    public static void main (String [] args)
    {
        Rectangulo area = new Rectangulo();
        System.out.println("el area del rectangulo es de: "+area.calcularArea());
        System.out.println("el perimetro del rectangulo es de: "+area.calcularPerimetro());
    }
}