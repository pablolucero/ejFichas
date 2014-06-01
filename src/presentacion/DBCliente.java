package presentacion;

import negocio.Cliente;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class DBCliente {
    public boolean guardarCliente(Cliente cliente) {
        // la carpeta clientes la generamos a mano en el root del proyecto
        String ruta = "clientes\\" + cliente.getDni() + ".txt";
        File file = new File(ruta);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                return false;
            }
        }

        String contenido = cliente.getNombre() + "\n" + cliente.getDni();

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write(contenido);
            bf.close();
            fw.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Cliente getCliente(String dniABuscar) {
        String ruta =  "clientes\\" + dniABuscar + ".txt";
        File file = new File(ruta);
        if (!file.exists()) {
            return null;
        }

        try {
            Scanner sc = new Scanner(file);
            String nombre = sc.nextLine();
            String dni = sc.nextLine();
            return new Cliente(nombre, dni);
        }
        catch (Exception e) {
            return null;
        }
    }

}
