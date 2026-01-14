public class Operacion {

    private double numero1;
    private double numero2;
    private String tipo;
    private double resultado;

    public Operacion(double numero1, double numero2, String tipo, double resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.tipo = tipo;
        this.resultado = resultado;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public String getTipo() {
        return tipo;
    }

    public double getResultado() {
        return resultado;
    }
}
