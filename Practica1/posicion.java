package mx.unam.fi.poo.g1.p56.Practica1;

/**
 * Clase posicion
 * @author Grupo 1 de POO
 * @version Septiembre-2024
 * 
 */

public class posicion {
    private double x;
    private double y;

    /**
     * Método constructor
     * @param x -> Atributo de la coordenada x
     * @param y -> Atributo de la coordenada y
     */

    public posicion(double x, double y){
        setLg(x);
        setLt(y);
    }

    /**
     * Método set
     * @param x -> Para cambiar la coordenada x de la posición
     * 
     */

    public void setLg(double x){
        this.x = x;
    }

    /**
     * Método set
     * @param y -> Para cambiar la coordenada y de la posición
     * 
     */

    public void setLt(double y){
        this.y = y;
    }

    /**
     * Método get
     * @return -> Retorna la coordenada x de la posición
     * 
     */

    public double getLg(){
        return this.x;
    }

    /**
     * Método set
     * @return -> Retorna la coordenada y de la posición
     * 
     */

    public double getLt(){
        return this.y;
    }

    /**
     * Método para medir la distancia entre dos posiciones
     * @param d -> La posición destino
     * @return Retorna la distancia como double
     */

    public double distancia(posicion d){
        return (6371.01 * Math.acos(Math.sin(this.x) * Math.sin(d.x) + Math.cos(this.x) * Math.cos(d.x) * Math.cos(d.y - this.y)));
    }
    
}
