package mx.unam.fi.poo.g1.p56.Practica3.Practica31;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase StringP3
 * @author Grupo 1 de POO
 * @version Septiembre-2024
 * 
 */

public class StringP3 {
    private String cadena;

    /**
     * Método constructor
     * Para construir la cadena
     * @param n -> Atributo para la cadena recibida
     * 
     */

    public StringP3(String n){
        setCadena(n);
    }

    /**
     * Método set
     * @param cadena -> Para cambiar la cadena
     * 
     */

    public void setCadena(String cadena){
        this.cadena = cadena;
    }

    /**
     * Método get
     * @return -> Retorna la cadena del objeto
     */

    public String getCadena(){
        return this.cadena;
    }

    /**
     * Método print
     * Para imprimir la cadena
     * 
     */

    public void ImprimirCad(){
        System.out.println(cadena);
    }

    /**
     * Método Reemplazar Caracter
     * @param original -> Parámetro para el caracter original
     * @param reemplazo -> Parámetro para el caracter con el que se reemplazará
     * @return -> Retorna la cadena modificada
     * 
     */

    public String ReemplazarCaracter(char original, char reemplazo){
        return this.cadena.replace(original, reemplazo);
    }

    /**
     * Método reemplazar segundo elemento
     * @param ArrayL -> Parámetro para recibir la cadena a modificar
     * @return -> Devuelve la ArrayList modificada
     */

    public ArrayList<StringP3> CambiarSegundoElemento(ArrayList<StringP3> ArrayL){
        ArrayL.set(1, this);
        return ArrayL;
    }

    /**
     * Método para obtener el valor de una llave dada
     * @param HS -> Parámetro para recibir el HashMap a modificar
     * @return -> Retorna el valor de la llave dada
     */

    public Integer getValor(HashMap<StringP3, Integer> HS){
        if (HS.containsKey(this)){
            return HS.get(this);
        }
        else{
            System.out.println("No contiene la llave dada");
            return null;
        }
    }
    /**
     * Método para indicar cómo se imprimirá la clase
     * @return -> Retorna la cadena de la clase
     */
    @Override
    public String toString(){
        return this.getCadena();
    }
}