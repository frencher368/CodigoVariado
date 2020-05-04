package MetodosVoraces;
import javax.swing.JOptionPane;
/**
 * @author Alejandro Erazo
 */

public class Menu
{
    // ------------------------------------------------------------------------------------------------------------------------------------------------
    // PROBLEMA.
    // Solucionar el problema de la mochila por Backtracking
    // 
    // -- GUIA --
    // https://www.youtube.com/watch?v=ZKnwBJ8q2TE&list=WL&index=31&t=0s (Crear arbol, crear menu)
    // https://www.youtube.com/watch?v=l8XPkY_q4Qs (Mostrar datos inOrden)
    // ------------------------------------------------------------------------------------------------------------------------------------------------
	
    /**
     * Metodo MAIN
    */
    public static void main (String [] arg)
    {
        // Variables	
	int opcion = 0;
	int elemento;
	String nombre;
	ArbolBinario arbolito = new ArbolBinario ();
		
	/**
	 * Menu
         * (Do,While para que se repitan hasta que la opcion sea 2)
         */
	do {
            try {
		opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
			"1. Agregar un nodo \n" +
			"2. Recorrer arbol InOrden\n" +
                        "3. Recorrer arbol\n" +
                        "4. Salir \n" +
			"Elige una opcion... ","Arboles Binarios",
			JOptionPane.QUESTION_MESSAGE));
				
		switch (opcion)
		{
                    case 1:
			elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el numero del nodo: ", "Agregando nodo", JOptionPane.QUESTION_MESSAGE));
                                    nombre = JOptionPane.showInputDialog(null,
                                    "Ingresa el nombre del nodo: ", "Agregando nodo", JOptionPane.QUESTION_MESSAGE);
                                    arbolito.agregarNodo(elemento, nombre);
                    break;
						
                    case 2:
			if (!arbolito.estaVacio())
                            arbolito.inOrden(arbolito.raiz);
                        else
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                    
                    case 3:
			
                    break;
                    
                    case 4:
			JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                    break;
	
                    default:
			JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                    break;
		}
			
		}catch (NumberFormatException n)
		{
                    JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
		}
	}while (opcion != 4);
    }
}
