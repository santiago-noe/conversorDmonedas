import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ApiService api = new ApiService();

        try {

            Moneda tasas = api.obtenerTasas("USD");

            int opcion = 0;

            while (opcion != 7) {

                System.out.println("\n===== CONVERSOR DE MONEDAS =====");
                System.out.println("1. USD -> ARS");
                System.out.println("2. ARS -> USD");
                System.out.println("3. USD -> BRL");
                System.out.println("4. BRL -> USD");
                System.out.println("5. USD -> PEN");
                System.out.println("6. PEN -> USD");
                System.out.println("7. Salir");
                System.out.print("Elija una opción: ");

                opcion = lectura.nextInt();

                if (opcion == 7) {
                    break;
                }

                System.out.print("Ingrese el valor: ");
                double monto = lectura.nextDouble();

                double resultado = 0;

                switch (opcion) {

                    case 1:
                        resultado = Conversor.convertir(monto, tasas.getRate("ARS"));
                        break;

                    case 2:
                        resultado = Conversor.convertir(monto, 1 / tasas.getRate("ARS"));
                        break;

                    case 3:
                        resultado = Conversor.convertir(monto, tasas.getRate("BRL"));
                        break;

                    case 4:
                        resultado = Conversor.convertir(monto, 1 / tasas.getRate("BRL"));
                        break;

                    case 5:
                        resultado = Conversor.convertir(monto, tasas.getRate("PEN"));
                        break;

                    case 6:
                        resultado = Conversor.convertir(monto, 1 / tasas.getRate("PEN"));
                        break;

                    default:
                        System.out.println("Opción inválida.");
                        continue;
                }

                System.out.println("Valor convertido: " + resultado);

            }

        } catch (Exception e) {
            System.out.println("Error al obtener tasas: " + e.getMessage());
        }

    }
}
