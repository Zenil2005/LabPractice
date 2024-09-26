package mx.unam.fi.poo.g1.p56.Practica3.Practica32;
import mx.unam.fi.poo.g1.p56.Practica3.Practica32.StringP3;

import java.util.ArrayList;

/**
 * Clase principal del segundo programa de la Práctica 3
 * @author Grupo 1 de POO
 * @version Septiembre de 2024
 */

public class Practica32{
    /**
     * Metodo main
     * Se ejecuta todo el funcionamiento de la aplicación 
     * @param args -> Arreglo por defecto del metodo main
     */
    public static void main(String[]args){
        ArrayList<StringP3> Al = new ArrayList<StringP3>();

        StringP3 n1 = new StringP3("Juanito");
        StringP3 n2 = new StringP3("Emmnuel");
        StringP3 n3 = new StringP3("Leonardo");
        StringP3 n4 = new StringP3("Daniel");
        
        Al.add(n1);
        Al.add(n3);
        Al.add(n2);

        System.out.println("\nSegundo ejercicio: ");
        System.out.println("La ArrayList original es: ");
        for (StringP3 Array : Al){
            System.out.println(Array.getCadena());
        }
        System.out.println("\nLa ArrayList después de reemplazar el segundo elemento por: " + n4.getCadena());
        Al = n4.CambiarSegundoElemento(Al);
        for (StringP3 Array : Al){
            System.out.println(Array.getCadena());
        }
        System.out.println();
    }
}