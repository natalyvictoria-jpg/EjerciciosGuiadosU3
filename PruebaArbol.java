/**
 * MATERIA: Estructura de Datos - Unidad 3
 * NOMBRE: NATALY VICTORIA GONZALEZ AVILES
 * FECHA: Martes 25 de Noviembre de 2025
 * GRUPO: GTID0141
 *
 * Clase PruebaArbol:
 * Clase principal que prueba el funcionamiento del Árbol Binario.
 * Inserta valores de ejemplo y realiza el recorrido Inorden
 * para comprobar que los datos quedan ordenados.
 */

public class PruebaArbol {

    public static void main(String[] args) {

        ArbolBinario arbol = new ArbolBinario();

        System.out.println("Insertando valores: 50, 30, 70, 20, 40");

        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);

        // Muestra los valores ordenados
        arbol.recorrerInorden();
        // Salida esperada: 20 30 40 50 70
    }
}
