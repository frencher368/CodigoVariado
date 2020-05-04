package Otros;
import javax.swing.JOptionPane;
/**
 *
 * @author Alejandro Erazo
 */

public class Main
{
    public static void main ( String arg []) throws Exception
    {
        /**
         * Clase Operaciones
	 */
	Prueba op = new Prueba();
		
	/**
	 * Pedir numeros
	 */
	int n1;
	n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
	
	int n2;
	n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		
	System.out.println("El resultado es: " + op.NumCombinatorios(n1, n2));
    }	
}
