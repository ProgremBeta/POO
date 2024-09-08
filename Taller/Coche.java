package taller;
import java.util.Scanner;

public class Coche {
    
    static String marca;
    static String modelo;
    static int año;
    
    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
     public static void main (String [] args){
        System.out.println("Escriba la marca del auto: ");
        Scanner marca1 = new Scanner (System.in);
        marca = marca1.nextLine();
        System.out.println("escriba el modelo del auto: ");
        Scanner modelo1 = new Scanner (System.in);
        modelo = modelo1.nextLine();
        System.out.println("Escriba el año del auto: "); 
        Scanner año1 = new Scanner (System.in);
        año = año1.nextInt();
        System.out.println("La marca del auto es: "+marca);
        System.out.println("El modelo del auto es: "+modelo);
        System.out.println("El año del auto es: "+año); 

     }
    
}
