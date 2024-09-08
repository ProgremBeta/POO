import java.util.Scanner;

public class CrearMatriz {
    // Atributos
    static int[][] matriz;
    static int tamaño;
    static int numeroPar = 2; 
    static int numeroImpar = 1;    
    static int fib1 = 0, fib2 = 1;

    public CrearMatriz(int tamaño) {
        this.tamaño = tamaño;
        this.matriz = new int[tamaño][tamaño];
    }

    public static void llenarMatriz() {

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i == j) {
                    matriz[i][j] = numeroPar;
                    numeroPar += 2;
                } else if (i < j) {
                    matriz[i][j] = numeroImpar;
                    numeroImpar += 2;
                } else {
                    matriz[i][j] = fib1;
                    int siguienteFib = fib1 + fib2;
                    fib1 = fib2;
                    fib2 = siguienteFib;
                }
            }
        }
    }

    public void imprimirMatriz() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz: ");
        int tamaño = scanner.nextInt();

        CrearMatriz matriz = new CrearMatriz(tamaño);

        llenarMatriz(); 
        matriz.imprimirMatriz();
    }
}
