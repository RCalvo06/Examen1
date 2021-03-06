
/**
 * Menu
 */
import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {

        CalcularMulta conductor = new CalcularMulta();

        int opcion;
        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Seleccione un opcion: \n" + "1.Calcular Multa \n" + "2.Dibujar T \n" + "3.Salir \n"));
            switch (opcion) {
            case 1:
                double multa = Double
                        .parseDouble(JOptionPane.showInputDialog(null, "Digite a la velocidad a la que iba"));

                multa = conductor.calcularMulta(multa);
                if (multa == 0) {
                    System.out.println("Usted no tiene ninguna multa");
                } else {
                    System.out.println("El valor de su multa es de " + multa);
                }
                break;

            case 2:
            int tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el tamanho de la T"));
                tam = 

            case 3:
                System.out.println("Saliendo....");
                break;
            default:
                System.out.println("Favor ingrese una opcion valida");
                break;

            }

        } while (opcion != 3);

    }
}