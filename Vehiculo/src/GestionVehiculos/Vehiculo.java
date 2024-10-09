package GestionVehiculos;

import java.util.Scanner;

public class Vehiculo
{
    String Tipo;
    String Modelo;
    int YearsFabricacion;
    String Color;
    String Disponibilidad;

    public Vehiculo(String Tipo, String Modelo, int YearsFabricacion, String Color,String Disponibilidad)
    {
        this.Tipo = Tipo;
        this.Modelo = Modelo;
        this.YearsFabricacion = YearsFabricacion;
        this.Color = Color;
        this.Disponibilidad = Disponibilidad;
    }

    public static void Menu()
    {
        System.out.println("1. Carros");
        System.out.println("2. Motos");
        System.out.println("3. Bici");
        System.out.println("0. Salir");
        System.out.print("\nIngreda una Opcion: ");
    }

    public static void main(String[] args) {

        int Opcion;

        Scanner Dato = new Scanner(System.in);

        Auto Carro1 = new Auto("Carro","lambo",1994,"rojo","Disponible");
        Auto Carro2 = new Auto("Carro","Mazda", 2000,"Negro","Disponible");

        Moto Moto1 = new Moto("Moto","Todo terreno", 2005,"Amarilla","Disponible");
        Moto Moto2 = new Moto("Moto","Montañera", 2009,"Verde","Disponible");

        Bici Bici1 = new Bici("Bici","Gravity",2010,"Blanca","Disponible");
        Bici Bici2 = new Bici("Bici","Pista",2002,"Rosado","Disponible");

        do {
            Menu();
            Opcion = Dato.nextInt();

            switch (Opcion) {
                case 1:
                    System.out.println(Carro1.Tipo);
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 0:
                    break;
            }
        }while(Opcion != 0);


    }
}