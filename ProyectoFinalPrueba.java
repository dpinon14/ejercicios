import javax.swing.*;

public class ProyectoFinalPrueba {

    static int v;
    static int p, opc = 0;
    static  int anb = 0, annb = 0;
    static  int enec = 0, febc = 0, marc = 0, abrc = 0, mayc = 0, junc = 0, julc = 0, agoc = 0, sepc = 0, octc = 0, novc = 0, dicc = 0;
    static String usuario, contraseña, op, mes, año, us, alu;
    static  String veces;

    public static void main(String[] args) {

        startMenu();

        if ((p == 28) && (usuario.equals("DPP"))) {

            JOptionPane.showMessageDialog(null, "Acceso permitido");

        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado");
            startMenu();
        }

    }

    public static void startMenu() {
        JOptionPane.showMessageDialog(null, "PROYECTO FINAL\n Fundamentos de programacion\n");

        usuario = JOptionPane.showInputDialog("Usuario:\n");

        contraseña = JOptionPane.showInputDialog("\nContraseña:\n");
        p = Integer.parseInt(contraseña);




    }
}
