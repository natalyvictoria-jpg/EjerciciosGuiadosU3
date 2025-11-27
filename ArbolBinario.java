/**
 * Materia: Estructura de Datos - Unidad 3
 * Nombre: NATALY VICTORIA GONZALEZ AVILES
 * Fecha: Martes 25 de noviembre de 2025
 * Grupo: GTID0141
 *
 * Clase ArbolBinario:
 * Representa un Árbol Binario de Búsqueda (ABB), donde cada nodo puede tener
 * un hijo izquierdo y un hijo derecho. Permite insertar valores y realizar
 * el recorrido Inorden.
 */

package arbolbinario;

public class ArbolBinario {

    private NodoArbol raiz; // Nodo raíz del árbol

    // Constructor: inicializa el árbol vacío
    public ArbolBinario() {
        this.raiz = null;
    }

    /**
     * Método público para insertar un valor en el árbol.
     * Llama a un método recursivo que coloca el valor en su posición correcta.
     */
    public void insertar(int valor) {
        this.raiz = insertarRecursivo(this.raiz, valor);
    }

    /**
     * Inserta de forma recursiva un nuevo valor.
     * Si el nodo actual es null, se crea un nuevo nodo.
     * Si el valor es menor, va al hijo izquierdo; si es mayor, al derecho.
     */
    private NodoArbol insertarRecursivo(NodoArbol actual, int valor) {
        if (actual == null) {
            return new NodoArbol(valor);
        }

        if (valor < actual.getDato()) {
            actual.hijoIzquierdo = insertarRecursivo(actual.hijoIzquierdo, valor);
        } else if (valor > actual.getDato()) {
            actual.hijoDerecho = insertarRecursivo(actual.hijoDerecho, valor);
        }

        return actual; // Se retorna el nodo actual actualizado
    }

    /**
     * Método público para recorrer el árbol en orden (Inorden).
     * Imprime los valores de menor a mayor.
     */
    public void recorrerInorden() {
        System.out.print("Recorrido Inorden: ");
        recorrerInordenRecursivo(this.raiz);
        System.out.println();
    }

    /**
     * Recorrido Inorden:
     * 1. Visitar hijo izquierdo
     * 2. Visitar nodo actual
     * 3. Visitar hijo derecho
     */
    private void recorrerInordenRecursivo(NodoArbol nodo) {
        if (nodo != null) {
            recorrerInordenRecursivo(nodo.hijoIzquierdo);
            System.out.print(nodo.getDato() + " ");
            recorrerInordenRecursivo(nodo.hijoDerecho);
        }
    }
}


