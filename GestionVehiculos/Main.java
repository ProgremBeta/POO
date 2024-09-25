package gestionvehiculos;
import java.util.Scanner;
 
/**
 *
 * @author User
 */
public class Main{
    public static void main(String [] args){
        System.out.println("Ingrese la marca del auto: ");
        Scanner modelo1 = new Scanner (System.in);
        String modelo = modelo1.nextLine();
        System.out.println("Ingrese el precio de compra del auto: ");
        Scanner compra1 = new Scanner (System.in);
        int precioCompra = compra1.nextInt();
        System.out.println("Ingrese el ID del auto: ");
        Scanner ID1 = new Scanner (System.in);
        int id = ID1.nextInt();
        System.out.println("Ingrese los años del auto: ");
        Scanner annosuso1 = new Scanner (System.in);
        int annosUso = annosuso1.nextInt();
       
        Pruebas_vehiculo pruebas_vehiculo = new Pruebas_vehiculo(modelo, precioCompra, id, annosUso);
        pruebas_vehiculo.mostrarInformacion();
    }
    
   
}

