package multiplicacion.de.matrices;

public class multiplicacion_matrices 
{
    int[][] matrixA;
    int[][] matrixB;
    int[][] resultMatrix;
    int size= 3;

    public multiplicacion_matrices(int[][] matrixA, int[][] matrixB) 
    {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.resultMatrix = new int[size][size];
    }

    public void mulMatrices() 
    {
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            {
                for (int k = 0; k < size; k++) 
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
            }
        }
    }

    public void printResultMatriz() 
    {
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
                System.out.print(resultMatrix[i][j] + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int[][] matrixA = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = 
        {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        multiplicacion_matrices multiplicacion = new multiplicacion_matrices(matrixA, matrixB);
        multiplicacion.mulMatrices();
        multiplicacion.printResultMatriz();
    }
}
