package GestionVehiculos;

public class Usuario
{
    String Nombre;
    String Apellido;
    int Edad;
    int Id;

    public Usuario(String Nombre,String Apellido,int Edad,int Id)
    {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Id = Id;
    }

    public String GetNombre()
    {
        return Nombre;
    }

    public String GetApellido()
    {
        return Apellido;
    }

    public int GetId()
    {
        return Id;
    }

}
