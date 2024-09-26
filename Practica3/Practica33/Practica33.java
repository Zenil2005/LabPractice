package mx.unam.fi.poo.g1.p56.Practica3.Practica33;
import mx.unam.fi.poo.g1.p56.Practica3.Practica33.StringP3;

import java.util.HashMap;

/**
 * Clase principal del tercer programa de la Práctica 3
 * @author Grupo 1 de POO
 * @version Septiembre de 2024
 */

public class Practica33{
    /**
     * Metodo main
     * Se ejecuta todo el funcionamiento de la aplicación 
     * @param args -> Arreglo por defecto del metodo main
     */
    public static void main(String[]args){
        HashMap<StringP3, Integer> HS = new HashMap<StringP3, Integer>();

        StringP3 n1 = new StringP3("Juanito");
        StringP3 n2 = new StringP3("Emmnuel");
        StringP3 n3 = new StringP3("Leonardo");
        StringP3 n4 = new StringP3("Daniel");

        HS.put(n1, 1);
        HS.put(n2, 2);
        HS.put(n3, 3);
        HS.put(n4,4);

        System.out.println("\nPara el tercer ejercicio: ");
        System.out.println("El mapa contiene las siguientes llaves con los siguientes valores: " + HS);
        System.out.println("Al buscar la llave: " + n2.getCadena());
        if (n2.getValor(HS)!= null){
        System.out.println("El valor de la llave " + n2.getCadena() + " es " + n2.getValor(HS) + "\n");
        }

    }
}