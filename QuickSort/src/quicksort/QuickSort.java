
package quicksort;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = particion(arreglo, inicio, fin);

            quickSort(arreglo, inicio, pivote - 1);
            quickSort(arreglo, pivote + 1, fin);
        }
    }

    public static int particion(int[] arreglo, int inicio, int fin) {
        int pivote = arreglo[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (arreglo[j] <= pivote) {
                i++;
                intercambiar(arreglo, i, j);
            }
        }

        intercambiar(arreglo, i + 1, fin);
        return i + 1;
    }

    public static void intercambiar(int[] arreglo, int i, int j) {
        int temporal = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temporal;
    }

    public static void main(String[] args) {
        int[] numeros = {8, 3, 5, 1, 9, 2};

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(numeros));

        quickSort(numeros, 0, numeros.length - 1);

        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(numeros));
    }
}
