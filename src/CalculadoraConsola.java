import java.util.Scanner;

public class CalculadoraConsola {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        OperacionDAO dao = new OperacionDAO();

        int opcion;

        do {
            System.out.println("\n=== CALCULADORA JAVA + ORACLE 19c ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese número 1: ");
                double n1 = sc.nextDouble();

                System.out.print("Ingrese número 2: ");
                double n2 = sc.nextDouble();

                try {
                    double resultado =
                            CalculadoraService.calcular(n1, n2, opcion);

                    String tipo =
                            CalculadoraService.nombreOperacion(opcion);

                    System.out.println("Resultado: " + resultado);

                    Operacion op =
                            new Operacion(n1, n2, tipo, resultado);

                    dao.guardarOperacion(op);

                    System.out.println("Operación registrada en la base de datos.");

                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        } while (opcion != 0);

        System.out.println("Programa finalizado.");
        sc.close();
    }
}   