import javax.swing.*;

public class Convertidor {

    double pesos;
    double bolivares = 0.0014;
    double conversion;

    public Convertidor() {
        PesosBolivares();
    }

    public void PesosBolivares() {
        pesos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en pesos "));
        conversion = pesos * bolivares;
        JOptionPane.showMessageDialog(null, pesos + " Es igual a " + conversion + " bolivares");


    }

    public static void main(String[] args) {

        new Convertidor();
    }
}
