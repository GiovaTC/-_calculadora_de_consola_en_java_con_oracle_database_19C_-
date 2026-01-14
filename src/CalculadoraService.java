public class CalculadoraService {

    public static double calcular(double a, double b, int opcion) {
        return switch (opcion) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            case 4 -> {
                if (b == 0) {
                    throw new ArithmeticException("division por cero");
                }
                yield a / b;
            }
            default -> throw new IllegalArgumentException("opcion inválida");
        };
    }

    public static String nombreOperacion(int opcion) {
        return switch (opcion) {
            case 1 -> "suma";
            case 2 -> "resta";
            case 3 -> "multiplicacion";
            case 4 -> "division";
            default -> "desconocida";
        };
    }
}
