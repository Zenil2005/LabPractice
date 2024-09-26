package mx.unam.fi.poo.g1.p56.Practica1;
import mx.unam.fi.poo.g1.p56.Practica1.posicion;
import java.util.Scanner;

/**
 * Clase principal de la Practica 1
 * @author Grupo 1 de POO
 * @version Septiembre de 2024
 */
public class Practica1 {
    /**
     * Metodo main
     * Se ejecuta todo el funcionamiento de la aplicación 
     * @param args -> Arreglo por defecto del metodo main
     */
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa para medir la distancia entre dos puntos de la Tierra");
        
        System.out.println("Posición de origen: ");
        System.out.print("Ingresa la coordenada x: ");
        double x1 = entrada.nextDouble();
        System.out.print("Ingresa la coordenada y: ");
        double y1 = entrada.nextDouble();

        System.out.println("\nPosición de destino: ");
        System.out.print("Ingresa la coordenada x: ");
        double x2 = entrada.nextDouble();
        System.out.print("Ingresa la coordenada y: ");
        double y2 = entrada.nextDouble();

        posicion p1 = new posicion(x1, y1);
        posicion p2 = new posicion(x2, y2);

        System.out.println("\nLa distancia entre los dos puntos es: " + p1.distancia(p2));
    }
    
}
