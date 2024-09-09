//package taller;

import java.util.Scanner;

public class CuentaBancaria {
    
    static int numeroCuenta;
    static int saldo;
    static int resultado;
    static int monto;
    static int numero;
    
    public CuentaBancaria(int numeroCuenta, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.resultado = resultado;
        this.monto = monto;
        this.numero = numero;
    }
    public static void deposito () {
        System.out.println("Ingrese el dinero a depositar: ");
        Scanner monto1 = new Scanner (System.in);
        monto = monto1.nextInt();
        resultado = saldo + monto;
       
}
        
    public static void retiro(){
        System.out.println("Ingrese el dinero a retirar: ");
        Scanner monto1 = new Scanner (System.in);
        monto = monto1.nextInt();
        resultado = saldo - monto;
        
} 
       
    public static void main (String [] args){
        System.out.println("Ingrese el numero de la cuenta: ");
        Scanner numeroCuenta1 = new Scanner (System.in);
        numeroCuenta = numeroCuenta1.nextInt();
        System.out.println("Ingrese 1 si quiere depositar o ingrese 2 si quiere retirar: ");
        Scanner numero1 = new Scanner (System.in);
        numero = numero1.nextInt();
        if(numero == 1){
            deposito();
        }
        else if (numero == 2){
            retiro();
    }
        System.out.println("Su numero de cuenta es: "+numeroCuenta);
        System.out.println("Su saldo es: "+resultado);
    }
}
