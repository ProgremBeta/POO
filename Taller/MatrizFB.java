import java.util.Scanner;

public class CrearMatriz {
    // Atributos
    static int[][] matriz;
    static int tamaño;
    static int numeroPar = 2; // Inicialización para la diagonal principal
    static int numeroImpar = 1; // Inicialización para el triángulo superior
    static int fib1 = 0, fib2 = 1; // Inicialización para la serie de Fibonacci4

    // Constructor
    public CrearMatriz(int tamaño) {
        this.tamaño = tamaño;
        this.matriz = new int[tamaño][tamaño]; // Inicializar la matriz
      
    }

    // Método para llenar la matriz según el patrón
    public static void llenarMatriz() {


        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i == j) {
                    // Diagonal principal: números pares
                    matriz[i][j] = numeroPar;
                    numeroPar += 2;
                } else if (i < j) {
                    // Triángulo superior: números impares
                    matriz[i][j] = numeroImpar;
                    numeroImpar += 2;
                } else {
                    // Triángulo inferior: números de la serie de Fibonacci
                    matriz[i][j] = fib1;
                    int siguienteFib = fib1 + fib2;
                    fib1 = fib2;
                    fib2 = siguienteFib;
                }
            }
        }
    }

    // Método para imprimir la matriz
    public void imprimirMatriz() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }

    // Método principal (main)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño de la matriz
        System.out.print("Ingrese el tamaño de la matriz: ");
        int tamaño = scanner.nextInt();

        // Crear un objeto de la clase CrearMatriz
        CrearMatriz matriz = new CrearMatriz(tamaño);

        llenarMatriz(); // Llenar la matriz según el patrón especificado

        // Imprimir la matriz resultante
        matriz.imprimirMatriz();
    }
}
