/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Estudiante {
    static int edad;
    static String nombre;
    
    public Estudiante(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
  
     public static void main (String [] args){
        System.out.println("Ingrese el nombre del estudiante: ");
        Scanner nombre1 = new Scanner (System.in);
        nombre = nombre1.nextLine();
        System.out.println("Ingrese la edad del estudiante: ");
        Scanner edad1 = new Scanner (System.in);
        edad = edad1.nextInt();
        System.out.println("El nombre del estuante es: "+nombre); 
        System.out.println("La edad del estudiante es: "+edad);
     }
     }
