package Taller;

public class Estudiante 
{
    int edad;
    String nombre;
    
    public Estudiante(int edad, String nombre) 
    {
        this.edad = edad;
        this.nombre = nombre;
    }

    Estudiante()
    {
        edad = 18;
        nombre = "Stiven";
    }

     public static void main (String [] args)
     {
        Estudiante info = new Estudiante();
        System.out.println("La edad del estudiante es: "+info.edad);
        System.out.println("el nombre del estuante es: "+info.nombre); 
     }
 }
