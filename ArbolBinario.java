package arbolbinario;


import arbolbinario.NodoArbol;

public class ArbolBinario {

    private NodoArbol raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    // Método público
    public void insertar(int valor) {
        this.raiz = insertarRecursivo(this.raiz, valor);
    }

    // Método privado recursivo
    private NodoArbol insertarRecursivo(NodoArbol actual, int valor) {
        if (actual == null) {
            return new NodoArbol(valor);
        }

        if (valor < actual.getDato()) {
            actual.hijoIzquierdo = insertarRecursivo(actual.hijoIzquierdo, valor);
        } else if (valor > actual.getDato()) {
            actual.hijoDerecho = insertarRecursivo(actual.hijoDerecho, valor);
        }

        return actual;
    }

    // Recorrido Inorden
    public void recorrerInorden() {
        System.out.print("Recorrido Inorden: ");
        recorrerInordenRecursivo(this.raiz);
        System.out.println();
    }

    private void recorrerInordenRecursivo(NodoArbol nodo) {
        if (nodo != null) {
            recorrerInordenRecursivo(nodo.hijoIzquierdo);
            System.out.print(nodo.getDato() + " ");
            recorrerInordenRecursivo(nodo.hijoDerecho);
        }
    }
}
