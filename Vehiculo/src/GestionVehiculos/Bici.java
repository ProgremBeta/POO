package GestionVehiculos;

public class Bici extends Vehiculo
{
    public Bici(String Tipo, String Modelo , int YearsFabricacion, String Color,String Disponibilidad)
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
}
