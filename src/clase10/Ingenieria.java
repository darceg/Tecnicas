package clase10;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ingenieria {

    DecimalFormat df = new DecimalFormat("#.00");
    double promedio, parcial1, parcial2, examenfinal;

    //programacion, calculo, ingles
    public void programacion() {
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del primer parcia"));
        parcial2 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del segundo parcial"));
        examenfinal = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del último parcial"));
        promedio = (parcial1 + parcial2 + examenfinal) / 3;
        JOptionPane.showMessageDialog(null, "El promedio es:" + promedio);
    }

    public void calculo() {
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del primer parcial"));
        parcial2 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del segundo parcial"));
        examenfinal = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del último parcial"));
        promedio = (parcial1 + parcial2 + examenfinal) / 3;
        JOptionPane.showMessageDialog(null, "El promedio es:" + promedio);
    }

    public void ingles() {
        parcial1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del primer parcial"));
        parcial2 = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del segundo parcial"));
        examenfinal = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del último parcial"));
        promedio = (parcial1 + parcial2 + examenfinal) / 3;
        JOptionPane.showMessageDialog(null, "El promedio es:" + promedio);
    }

    public static void main(String[] args) {
        Ingenieria notas = new Ingenieria();
        int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Digite el promedio según corresponda"
                    + "\n 1) Programacion "
                    + "\n 2) Calculo"
                    + "\n 3) Ingles"
                    + "\n 0) Salir"));
            switch (menu) {
                case 1:
                    notas.programacion();
                    break;
                case 2:
                    notas.calculo();
                    break;
                case 3:
                    notas.ingles();
                    break;

            }
        } while (menu != 0);
    }
}
