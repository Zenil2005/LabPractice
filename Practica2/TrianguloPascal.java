package mx.unam.fi.poo.g1.p56.Practica2;

/**
 * Clase TrianguloPascal
 * @author Grupo 1 de POO
 * @version Septiembre-2024
 * 
 */

public class TrianguloPascal {
    private int filas;

    /**
     * Constructor
     * @param n Número de filas del triángulo de Pascal
     */

    public TrianguloPascal(int filas) {
        setFilas(filas);
    }

    /**
     * Método set
     * @param filas -> Para cambiar el número de filas del triángulo
     * 
     */

    public void setFilas(int filas){
        this.filas = filas;
    }

    /**
     * Método get
     * @return -> Retorna el número de filas del triángulo
     * 
     */

    public int getFilas(){
        return this.filas;
    }

    /**
     * Método generar triángulo
     */

    public void generarTriangulo() {
        for (int i = 0; i < filas; i++) {
            for (int e = 0; e < filas - i; e++) {
                System.out.print(" ");
            }

            int c = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
                c = c * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
