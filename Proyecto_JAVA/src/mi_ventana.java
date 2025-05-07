import javax.swing.JOptionPane;

import javax.swing.JOptionPane; // 👈 Importación necesaria

public class mi_ventana {
    public static void main(String[] args) {
        // Mostrar un mensaje
        JOptionPane.showMessageDialog(null, "¡Hola desde JOptionPane!");

        // Pedir al usuario su nombre
        String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");

        // Mostrar el nombre que ingresó el usuario
        JOptionPane.showMessageDialog(null, "Hola, " + nombre);
    }
}
