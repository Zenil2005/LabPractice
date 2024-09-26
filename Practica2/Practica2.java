package mx.unam.fi.poo.g1.p56.Practica2;
import java.util.Scanner;
import mx.unam.fi.poo.g1.p56.Practica2.TrianguloPascal;

/**
 * Clase principal de la Práctica 2
 * @author Grupo 1 de POO
 * @version Septiembre de 2024
 */


public class Practica2 {
    
    /**
     * Metodo main
     * Se ejecuta todo el funcionamiento de la aplicación 
     * @param args -> Arreglo por defecto del metodo main
     */
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int n = en.nextInt();
        en.close();

        TrianguloPascal triangulo = new TrianguloPascal(n);
        triangulo.generarTriangulo();
    }
}
