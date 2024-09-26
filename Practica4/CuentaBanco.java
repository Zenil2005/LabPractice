package mx.unam.fi.poo.g1.p56.Practica4;

/**
 * Clase CuentaBanco
 * @author Grupo 1 de POO
 * @version Septiembre-2024
 * 
 */

public class CuentaBanco {
    private String nombre;
    private int cuenta;
    private double depositoInicial;

    /**
     * Método constructor
     * Para construir cuenta
     * @param n -> Atributo para el nombre del propietario
     * @param c -> Atributo para el número de cuenta
     * @param d -> Atributo para el depósito de la cuenta
     * 
     */

    public CuentaBanco(String n, int c, double d){
        setNombre(n);
        setCuenta(c);
        setDepositoInicial(d);
    }

    /**
     * Método set
     * @param nombre -> Para cambiar el nombre del propietario
     * 
     */

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Método get
     * @return -> Retorna el nombre del propietario de la cuenta
     * 
     */

    public String getNombre(){
        return this.nombre;
    }
    /**
     * Método set
     * @param cuenta -> Para cambiar el número de cuenta del propietario
     * 
     */

    public void setCuenta(int cuenta){
        this.cuenta = cuenta;
    }

    /**
     * Método get
     * @return -> Retorna el número de cuenta
     * 
     */

    public int getCuenta(){
        return this.cuenta;
    }

    /**
     * Método set
     * @param depositoInicial -> Para cambiar el depósito de la cuenta
     * 
     */

    public void setDepositoInicial(double depositoInicial){
        this.depositoInicial = depositoInicial;
    }

    /**
     * Método get
     * @return -> Retorna el depósito Inicial de la cuenta
     * 
     */

    public double getDepositoInicial(){
        return this.depositoInicial;
    }

    /**
     * Método print
     * Para imprimir la información de la cuenta
     * 
     */

    public void ImprimirInfo(){
        System.out.println("El nombre del propietario de la cuenta es: " + nombre);
        System.out.println("La número de cuenta es: " + cuenta);
        System.out.println("El deposito inicial es: " + depositoInicial);
        System.out.println();
    }

    /**
     * Método depositar
     * @param deposito -> Para sumar al depósito de la cuenta
     * 
     */

    public void DepositarDinero(double deposito){
        depositoInicial = depositoInicial + deposito;
    }

    /**
     * Método retirar
     * @param retiro -> Para restar al depósito de la cuenta
     */

    public void RetirarDinero(double retiro){
        depositoInicial = depositoInicial - retiro;
        System.out.println("El dinero se ha retirado con éxito");
        System.out.println();
    }
}