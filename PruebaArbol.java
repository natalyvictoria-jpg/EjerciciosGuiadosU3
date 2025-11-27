/*
 * Materia: Estructura de Datos - Unidad 3
 * Nombre: NATALY VICTORIA GONZALEZ AVILES
 * Fecha: Martes 25 de noviembre de 2025
 * Grupo: GTID0141
 */

package arbolbinario;

/**
 * Clase PruebaArbol:
 * Contiene el método main para probar el funcionamiento del Árbol Binario.
 * Inserta varios valores en el árbol y luego ejecuta el recorrido Inorden.
 */
public class PruebaArbol {

    public static void main(String[] args) {

        ArbolBinario arbol = new ArbolBinario(); // Se crea el árbol

        System.out.println("Insertando valores: 50, 30, 70, 20, 40");

        // Inserciones de ejemplo (construcción del árbol)
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);

        // Ejecución del recorrido Inorden (muestra valores ordenados)
        arbol.recorrerInorden();  
        // Salida esperada: 20 30 40 50 70
    }
}
