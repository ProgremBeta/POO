/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiplicacion.de.matrices;

/**
 *
 * @author User
 */
public class multiplicacion_matrices {
    private int[][] matrixA;
    private int[][] matrixB;
    private int[][] resultMatrix;
    private int size;

    // Constructor
    public multiplicacion_matrices(int[][] matrixA, int[][] matrixB) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.size = matrixA.length;
        this.resultMatrix = new int[size][size];
    }

    // Método para la multiplicación de matrices
    public void mulMatrices() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
    }

    // Método para imprimir la matriz resultante
    public void printResultMatriz() {
        System.out.println("Matriz Resultante:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método principal
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Crear objeto de la clase MultiplicacionMatrices
        multiplicacion_matrices multiplicacion = new multiplicacion_matrices(matrixA, matrixB);

        // Realizar la multiplicación de matrices
        multiplicacion.mulMatrices();

        // Imprimir la matriz resultante
        multiplicacion.printResultMatriz();
    }
}
