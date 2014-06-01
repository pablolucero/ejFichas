package persistencia;

import negocio.Cliente;

public class Menu extends IOManager {

    public void mostrarMenu() {
        IOManager.print("Seleccione una opcion:");
        IOManager.print("1. Cargar cliente");
        IOManager.print("2. Leer cliente");
        IOManager.print("3. Salir");
    }

    public int getOpcion() {
        int opcion = IOManager.leerEntero("Seleccione la opcion", "Debe seleccionar un numero");
        return opcion;
    }

    public String leerCadena(String queLeer) {
        return leerLinea("Ingrese el " + queLeer);
    }

    public void mostrarResultado(Cliente cliente) {
        print("Nombre: " + cliente.getNombre() + "  " + cliente.getDni());
    }

    public void printOpcionInvalida() {
        print("Ha seleccionado una opcion invalida");
    }

    public void printFinDelPrograma() {
        IOManager.print("Fin del programa");
    }
}