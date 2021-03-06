public class CalcularMulta {

    public double calcularMulta(double mul) {
        double facturaActual = 0;
        if (mul > 150) {
            facturaActual = 50000;
        } else if (mul > 120) {
            facturaActual = 20000;
        } else if (mul > 100) {
            facturaActual = 10000;
        }

        return facturaActual;
    }

}
