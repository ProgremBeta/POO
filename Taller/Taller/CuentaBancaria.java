package Taller;

public class CuentaBancaria 
{    
    int numeroCuenta;
    int saldo;
    
    public CuentaBancaria(int numeroCuenta, int saldo) 
    {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void deposito (int monto) 
    {
        this.saldo = saldo + monto;
    }
        
    public void retiro(int monto)
    {
        this.saldo = saldo - monto;
    } 

    CuentaBancaria()
    {
        numeroCuenta = 312121212;
        saldo = 2000000;
    }
       
    public static void main (String [] args)
    {
        CuentaBancaria info = new CuentaBancaria();
        System.out.println("Su numero de cuenta es: "+info.numeroCuenta);
        System.out.println("Su saldo es: "+info.saldo);
        info.deposito(1000);
        System.out.println("Despues de depositar su saldo es: " + info.saldo);
        info.retiro(0);
        System.out.println("Despues de retirar su saldo es: " + info.saldo);
    }
}
