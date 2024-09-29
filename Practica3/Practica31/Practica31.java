package mx.unam.fi.poo.g1.p56.Practica3.Practica31;
import mx.unam.fi.poo.g1.p56.Practica3.Practica31.StringP3;

/**
 * Clase principal del primer programa de la Práctica 3
 * @author Grupo 1 de POO
 * @version Septiembre de 2024
 * 
 */
public class Practica31{
    /**
     * Metodo main
     * Se ejecuta todo el funcionamiento de la aplicación 
     * @param args -> Arreglo por defecto del metodo main
     */
    public static void main(String[]args){

        StringP3 n1 = new StringP3("Juanito");
        StringP3 n2 = new StringP3("Emmanuel");
        StringP3 n3 = new StringP3("Leonardo");
        StringP3 n4 = new StringP3("Daniel");

        System.out.println("\nPara el primer ejercicio: ");
        System.out.println("Nombre original: " + n1.getCadena());
        System.out.println("Nombre después de cambiar el caracter a por o: " + n1.ReemplazarCaracter('a', 'o') + "\n");

    }
}