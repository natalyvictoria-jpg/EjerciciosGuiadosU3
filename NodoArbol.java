/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario;

/**
 *
 * @author nataly
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
