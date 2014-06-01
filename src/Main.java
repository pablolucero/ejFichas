import persistencia.IOCliente;
import persistencia.Menu;
import presentacion.DBCliente;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();

        int opcion = menu.getOpcion();

        boolean fin = false;

//        while (!fin) {

            switch (opcion) {
                case 1:
                    IOCliente ioCliente = new IOCliente();
                    ioCliente.cargarCliente();
            }
//        }
    }
}
