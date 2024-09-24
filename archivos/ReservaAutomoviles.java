import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Actor: Cliente
class Cliente {
    private String nombre;
    private List<Reserva> historialReservas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.historialReservas = new ArrayList<>();
    }

    public void reservarAutomovil(Sistema sistema, String modelo, String fechaInicio, String fechaFin) {
        Reserva nuevaReserva = sistema.reservarAutomovil(this, modelo, fechaInicio, fechaFin);
        if (nuevaReserva != null) {
            historialReservas.add(nuevaReserva);
            System.out.println("Reserva realizada: " + nuevaReserva);
        } else {
            System.out.println("No se pudo realizar la reserva.");
        }
    }

    public void cancelarReserva(Sistema sistema, Reserva reserva) {
        if (sistema.cancelarReserva(this, reserva)) {
            historialReservas.remove(reserva);
            System.out.println("Reserva cancelada: " + reserva);
        } else {
            System.out.println("No se pudo cancelar la reserva.");
        }
    }

    public void verHistorialReservas() {
        System.out.println("Historial de Reservas de " + nombre + ":");
        for (Reserva reserva : historialReservas) {
            System.out.println(reserva);
        }
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase: Sistema
class Sistema {
    private List<Reserva> reservas;

    public Sistema() {
        this.reservas = new ArrayList<>();
    }

    public Reserva reservarAutomovil(Cliente cliente, String modelo, String fechaInicio, String fechaFin) {
        Reserva nuevaReserva = new Reserva(cliente, modelo, fechaInicio, fechaFin);
        reservas.add(nuevaReserva);
        return nuevaReserva;
    }

    public boolean cancelarReserva(Cliente cliente, Reserva reserva) {
        return reservas.remove(reserva);
    }
}

// Clase: Reserva
class Reserva {
    private Cliente cliente;
    private String modelo;
    private String fechaInicio;
    private String fechaFin;

    public Reserva(Cliente cliente, String modelo, String fechaInicio, String fechaFin) {
        this.cliente = cliente;
        this.modelo = modelo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "cliente=" + cliente.getNombre() +
                ", modelo='" + modelo + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                '}';
    }
}

// Clase principal
 class reservarAutomovil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        Cliente cliente = new Cliente(nombre);

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Reservar Automóvil");
            System.out.println("2. Cancelar Reserva");
            System.out.println("3. Ver Historial de Reservas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Modelo del automóvil: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Fecha de inicio (YYYY-MM-DD): ");
                    String fechaInicio = scanner.nextLine();
                    System.out.print("Fecha de fin (YYYY-MM-DD): ");
                    String fechaFin = scanner.nextLine();
                    cliente.reservarAutomovil(sistema, modelo, fechaInicio, fechaFin);
                    break;

                case 2:
                    if (cliente.historialReservas.isEmpty()) {
                        System.out.println("No hay reservas para cancelar.");
                    } else {
                        System.out.println("Seleccione una reserva para cancelar:");
                        for (int i = 0; i < cliente.historialReservas.size(); i++) {
                            System.out.println((i + 1) + ". " + cliente.historialReservas.get(i));
                        }
                        int index = scanner.nextInt() - 1;
                        if (index >= 0 && index < cliente.historialReservas.size()) {
                            cliente.cancelarReserva(sistema, cliente.historialReservas.get(index));
                        } else {
                            System.out.println("Selección no válida.");
                        }
                    }
                    break;

                case 3:
                    cliente.verHistorialReservas();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
