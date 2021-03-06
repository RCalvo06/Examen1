import javax.swing.JOptionPane;

public class DibujarT {

    private int horizontal;
    private int vertical;

    public DibujarT(int hor, int vert) {

        horizontal = hor;
        vertical = vert;

    }

    public void dibujarT(int tam) {

        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño de la T que desea crear"));

        int horizontal = tamanho;
        int vertical = tamanho - 2;
        int centro = (tamanho * 2) / tamanho;
        int v = 0;
        int impar = tamanho / 2;

        if (impar > 0) {

            for (int i = 0; i < horizontal; i++) {

                System.out.print("* ");

            }

            System.out.println();

            while (v <= vertical) {

                for (int i = 0; i <= centro; i++) {

                    System.out.print(" ");

                }

                System.out.println("*");

                v++;
            }

        } else {

            System.out.println("Ingrese un numero impar");
        }

    }

}
