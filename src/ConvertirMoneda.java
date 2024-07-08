import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvert;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("Tasa de cambio hoy \n1" + monedaBase+ " = " + monedas.conversion_rate()+ " " +monedaTarget);
        System.out.println("Ingrese la cantidad que desea convertir: " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvert = cantidad * monedas.conversion_rate();
        System.out.println(cantidad + " " +monedaBase+ " = " + cantidadConvert + " " + monedas.target_code());
    }

    public static void Otraconversion(ConsultarMoneda consulta, Scanner lectura){
        System.out.println("Ingrese código de moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda que desea obtener: ");
        String monedaCambiar = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaCambiar, consulta, lectura);
    }
}
