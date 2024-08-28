package Taller;

public class Coche 
{    
    String marca;
    String modelo;
    int año;
    
    public Coche(String marca, String modelo, int año) 
    {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public Coche()
    {
        marca = "Kia";
        modelo = "Picanto";
        año = 2025;
    }
    
     public static void main (String [] args)
     {
        Coche info = new Coche();
        System.out.println("La marca del auto es: "+info.marca);
        System.out.println("El modelo del auto es: "+info.modelo);
        System.out.println("El año del auto es: "+info.año); 
     }
}