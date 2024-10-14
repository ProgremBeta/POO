package GestionVehiculos;

import java.util.Scanner;

public class Auto extends Vehiculo
{

    public Auto(String Tipo, String Modelo, int YearsFabricacion, String Color,String Disponibilidad)
    {
        super(Tipo,Modelo,YearsFabricacion,Color,Disponibilidad);
    }

    public String GetTipo()
    {
        return Tipo;
    }

    public String GetModelo()
    {
        return Modelo;
    }

    public int  GetYearsFabricacion()
    {
        return YearsFabricacion;
    }

    public String GetColor()
    {
        return Color;
    }

    public String GetDisponibilidad()
    {
        return Disponibilidad;
    }

    public void SetDisponibilidad(String Disponibilidad)
    {
        this.Disponibilidad = Disponibilidad;
    }

    public static void Cambiazo()
    {
        char Continuar;
        System.out.println("\nPresiona Y/N para continuar: ");
        Scanner Gestion = new Scanner(System.in);
        Continuar = Gestion.next().charAt(0);
        if(Continuar == 'Y' || Continuar == 'y')
        {
            System.out.print("\nIngresa que vehiculo quieres prestar: ");
        }
        else if (Continuar == 'N' || Continuar == 'n' )
            System.out.println("\nGracias por visitar!!!!");
    }
}
