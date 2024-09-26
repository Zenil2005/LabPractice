package mx.unam.fi.poo.g1.p56.Practica4;
import mx.unam.fi.poo.g1.p56.Practica4.CuentaBanco;

/**
 * Clase principal de la Práctica 4
 * @author Grupo 1 de POO
 * @version Septiembre de 2024
 * 
 */

public class Practica4 {

    /**
     * Metodo main
     * Se ejecuta todo el funcionamiento de la aplicación 
     * @param args -> Arreglo por defecto del metodo main
     * 
     */
        public static void main (String[] args){
            CuentaBanco C1= new CuentaBanco("Leonardo Neria", 3481049, 3500.5);
            CuentaBanco C2 = new CuentaBanco("Diego Corona", 3214910, 5200.3);
    
            System.out.println("Detalles de las cuentas de Banco: \n");
            C1.ImprimirInfo();
            C2.ImprimirInfo();
    
            System.out.println("Despues de depositar 5200 en ambas cuentas: \n");
            C1.DepositarDinero(5200);
            C2.DepositarDinero(5200);
    
            C1.ImprimirInfo();
            C2.ImprimirInfo();
    
            System.out.println("Despues de retirar 1700 en ambas cuentas: \n");
            C1.RetirarDinero(1700);
            C2.RetirarDinero(1700);
    
            C1.ImprimirInfo();
            C2.ImprimirInfo();
        }
        
}
