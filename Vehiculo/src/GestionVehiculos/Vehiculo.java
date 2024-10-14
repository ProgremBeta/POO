package GestionVehiculos;

import java.util.ArrayList;
import java.util.List;
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
        System.out.print("\nIngresa una Opcion: ");
    }

    public static void main(String[] args) {

        int Opcion,Alquiler=0;
        List <String> ListaVehiculosAlquilados = new ArrayList<>();

        Scanner Dato = new Scanner(System.in);
        Usuario Usuario1 = new Usuario("Juan","Betancur",19,10596994);

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
                    System.out.println("\nModelo: "+Carro1.GetModelo()+"\nFabricacion: "+Carro1.GetYearsFabricacion()+"\nColor: "+Carro1.GetColor()+"\nDisponibilidad: "+Carro1.GetDisponibilidad());
                    System.out.println("\nModelo: "+Carro2.GetModelo()+"\nFabricacion: "+Carro2.GetYearsFabricacion()+"\nColor: "+Carro2.GetColor()+"\nDisponibilidad: "+Carro2.GetDisponibilidad());
                    Auto.Cambiazo();
                    Alquiler = Dato.nextInt();
                    if(Alquiler == 1)
                    {
                        ListaVehiculosAlquilados.add(Carro1.GetTipo());
                        ListaVehiculosAlquilados.add(Carro1.GetModelo());
                        Carro1.SetDisponibilidad("Alquilado por "+ Usuario1.GetNombre());
                        ListaVehiculosAlquilados.add(Carro1.GetDisponibilidad());
                    }
                    else if (Alquiler == 2)
                        ListaVehiculosAlquilados.add(Carro2.GetTipo());
                        ListaVehiculosAlquilados.add(Carro2.GetModelo());
                        Carro2.SetDisponibilidad("Alquilado por "+ Usuario1.GetNombre());
                        ListaVehiculosAlquilados.add(Carro2.GetDisponibilidad());
                    break;

                case 2:
                    System.out.println("\nModelo: "+Moto1.GetModelo()+"\nFabricacion: "+Moto1.GetYearsFabricacion()+"\nColor: "+Moto1.GetColor()+"\nDisponibilidad: "+Moto1.GetDisponibilidad());
                    System.out.println("\nModelo: "+Moto2.GetModelo()+"\nFabricacion: "+Moto2.GetYearsFabricacion()+"\nColor: "+Moto2.GetColor()+"\nDisponibilidad: "+Moto2.GetDisponibilidad());
                    Auto.Cambiazo();
                    Alquiler = Dato.nextInt();
                    if(Alquiler == 1)
                    {
                        ListaVehiculosAlquilados.add(Moto1.GetTipo());
                        ListaVehiculosAlquilados.add(Moto1.GetModelo());
                        Moto1.SetDisponibilidad("Alquilado por "+ Usuario1.GetNombre());
                        ListaVehiculosAlquilados.add(Moto1.GetDisponibilidad());
                    }
                    else if (Alquiler == 2)
                        ListaVehiculosAlquilados.add(Moto2.GetTipo());
                        ListaVehiculosAlquilados.add(Moto2.GetModelo());
                        Moto2.SetDisponibilidad("Alquilado por "+ Usuario1.GetNombre());
                        ListaVehiculosAlquilados.add(Moto2.GetDisponibilidad());
                    break;

                case 3:
                    System.out.println("\nModelo: "+Bici1.GetModelo()+"\nFabricacion: "+Bici1.GetYearsFabricacion()+"\nColor: "+Bici1.GetColor()+"\nDisponibilidad: "+Bici1.GetDisponibilidad());
                    System.out.println("\nModelo: "+Bici2.GetModelo()+"\nFabricacion: "+Bici2.GetYearsFabricacion()+"\nColor: "+Bici2.GetColor()+"\nDisponibilidad: "+Bici2.GetDisponibilidad());
                    Auto.Cambiazo();
                    Alquiler = Dato.nextInt();
                    if(Alquiler == 1)
                    {
                        ListaVehiculosAlquilados.add(Bici1.GetTipo());
                        ListaVehiculosAlquilados.add(Bici1.GetModelo());
                        Bici1.SetDisponibilidad("Alquilado por "+ Usuario1.GetNombre());
                        ListaVehiculosAlquilados.add(Bici1.GetDisponibilidad());
                    }
                    else if (Alquiler == 2)
                        ListaVehiculosAlquilados.add(Bici2.GetTipo());
                        ListaVehiculosAlquilados.add(Bici2.GetModelo());
                        Bici2.SetDisponibilidad("Alquilado por "+ Usuario1.GetNombre());
                        ListaVehiculosAlquilados.add(Bici2.GetDisponibilidad());
                    break;

                case 0:
                    int Contador = 1;
                    for(int i = 0; i < ListaVehiculosAlquilados.size(); i++)
                    {
                        System.out.println(ListaVehiculosAlquilados.get(i));
                        if(Contador == 3)
                        {
                            System.out.println("\n");
                            Contador = 0;
                            System.out.println("Daño");
                        }
                        Contador++;
                    }
                    break;
            }
        }while(Opcion != 0);
    }
}