package GestionVehiculos;

public class Moto extends Vehiculo
{
    public Moto(String Tipo, String Modelo , int YearsFabricacion, String Color,String Disponibilidad)
    {
        super(Tipo,Modelo,YearsFabricacion,Color,Disponibilidad);
    }
    public void GetTipo(String Tipo)
    {
        this.Tipo = Tipo;
    }

    public void GetModelo(String Modelo)
    {
        this.Modelo = Modelo;
    }

    public void GetYearsFabricacion(int YearsFabricacion)
    {
        this.YearsFabricacion = YearsFabricacion;
    }

    public void GetColor(String Color)
    {
        this.Color = Color;
    }

    public void GetDisponibilidad(String Disponibilidad)
    {
        this.Disponibilidad = Disponibilidad;
    }
    public String SetDisponibilida()
    {
        return Disponibilidad;
    }
}
