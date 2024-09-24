/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionvehiculos;


/**
 *
 * @author User
 */
public class Pruebas_vehiculo extends vehiculo{
    static int tasaDepreciacion;
    
    public Pruebas_vehiculo(String modelo, int precioCompra, int id){
        super(modelo, precioCompra, id);
    }

    public static int calcularValorDepreciado(int precioCompra, int annosUso){
        tasaDepreciacion = precioCompra/annosUso;
        return tasaDepreciacion;
    }
    public void mostrarInformacion(){
        System.out.println("Modelo: "+getModelo()+
                "\nPrecio: "+getPrecioCompra()+
                "\nID: "+getID());
    }
}
