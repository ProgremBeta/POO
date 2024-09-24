/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionvehiculos;

/**
 *
 * @author User
 */
public class vehiculo {
    
    public String modelo;
    public int precioCompra;
    public int id;
    public int annosUso;
    
    public vehiculo(String modelo, int precioCompra, int id){
    
    this.modelo = modelo;
    this.precioCompra = precioCompra;
    this.id = id;
    
}
    
    public String getModelo(){
        return modelo;
    }
    public String setModelo(){
        return modelo;
    } 
    public int getPrecioCompra(){
        return precioCompra;
    }
    public int setPrecioCompra(){
        return precioCompra;
    }
    public int getID(){
        return id;
    }
    public int setID(){
        return id;
    } 
    public void mostarInformacion(){
        System.out.println("El modelo del auto es: "+ modelo);
        System.out.println("El precio de compra del ato es de: "+ precioCompra);
        System.out.println("El id del auto es: "+ id);

    }
}
