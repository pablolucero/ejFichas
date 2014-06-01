package persistencia;

import java.util.Scanner;

public class IOManager {
    public static void print(String s){
        System.out.println(s);
    }

    public static int leerEntero(String mensajeInicio, String mensajeError){
        IOManager.print(mensajeInicio);
        Scanner scan=new Scanner(System.in);
        while(!scan.hasNextInt()){
            IOManager.print(mensajeError);
            scan.next();
        }
        int n=scan.nextInt();
        return n;
    }

    public static double leerDoble(String mensajeInicio, String mensajeError){
        IOManager.print(mensajeInicio);
        Scanner scan=new Scanner(System.in);
        while(!scan.hasNextDouble()){
            IOManager.print(mensajeError);
            scan.next();
        }
        double n=scan.nextDouble();
        return n;
    }

    public String leerPalabra(String mensajeInicio){
        IOManager.print(mensajeInicio);
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        return s;
    }

    public String leerLinea(String mensajeInicio){
        IOManager.print(mensajeInicio);
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        return s;
    }

    public void buscarCliente() {
        String dni = leerLinea("Ingrese dni: ");
    }
}
