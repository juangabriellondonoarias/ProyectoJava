import javax.swing.JOptionPane;

public class Ejercicio {
	
	public static void main(String[] args){
		
		 int numero;

	        do {
	            String input = JOptionPane.showInputDialog(null, "Ingrese un número (ingrese 5 para salir):");
	            numero = Integer.parseInt(input);
	        } while (numero != 5);

	        JOptionPane.showMessageDialog(null, "¡Has ingresado el número 5! El programa ha terminado.");
	}

}
