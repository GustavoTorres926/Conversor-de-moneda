import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner lectura =  new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;
        while (opcion !=8){
            System.out.println(
                    "*************************************************************\n" +
                    "Conversor de moneda\n" +
                    "*************************************************************\n" +
                    "Selecciona la acción que deseas realizar: \n\n" +
                    "1. Dolar -> Peso Colombiano\n" +
                    "2. Peso Colombiano -> Dolar\n" +
                    "3. Dolar -> Peso Argentino\n" +
                    "4. Peso Argentino -> Dolar\n" +
                    "5. Dolar -> Real Brasileño\n" +
                    "6. Real Brasileño -> Dolar\n" +
                    "7. Realizar otra conversión\n" +
                    "8. Salir del programa.");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.Otraconversion(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Error.");
                    break;
            }
        }
    }
}
