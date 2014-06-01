package persistencia;

import negocio.Cliente;
import presentacion.DBCliente;

public class IOCliente extends IOManager {

    public void cargarCliente() {
        String nombre = leerLinea("Ingrese nombre: ");
        String dni = leerLinea("Ingrese dni: ");
        Cliente cliente = new Cliente(nombre, dni);

        DBCliente db = new DBCliente();
        if (db.guardarCliente(cliente)) {
            print("Cliente guardado");
        } else {
            print("Error al guardar");
        }
    }

    public void buscarCliente() {
        String dni = leerLinea("Ingrese DNI: ");
        DBCliente db = new DBCliente();
        Cliente cliente = db.getCliente(dni);
        if (cliente == null) {
            print("Cliente inexistente");
        } else {
            print("Cliente: " + cliente.getNombre());
        }
    }
}
