/**
 * MATERIA: Estructura de Datos - Unidad 3
 * NOMBRE: NATALY VICTORIA GONZALEZ AVILES
 * FECHA: Martes 25 de Noviembre de 2025
 * GRUPO: GTID0141
 *
 * Clase NodoArbol:
 * Representa la unidad básica de un Árbol Binario. 
 * Cada nodo contiene un dato entero y referencias a sus hijos izquierdo y derecho.
 */
package arbolbinario;

/**
 *
 * @author victoria
 */
public class NodoArbol {
        private int dato;  
     
    public NodoArbol hijoIzquierdo; 
    public NodoArbol hijoDerecho; 
 
    public NodoArbol(int valor) { 
        this.dato = valor; 
        this.hijoIzquierdo = null; 
        this.hijoDerecho = null; 
    } 
     
    // ---------------------------------------- 
    // MÉTODOS GETTERS Y SETTERS (Encapsulamiento) 
    // ---------------------------------------- 
 
    // Getter para obtener el dato 
    public int getDato() { 
        return dato; 
    } 
 
    // Setter para modificar el dato (Si fuera necesario) 
    public void setDato(int nuevoDato) { 
        this.dato = nuevoDato; 
    } 
}

