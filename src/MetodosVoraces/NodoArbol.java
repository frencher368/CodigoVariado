package MetodosVoraces;
/**
 * @author Alejandro Erazo
 */

public class NodoArbol
{
    // Atributos
	
    int dato;
    String nombre;
    NodoArbol HijoIzquierdo, HijoDerecho;
	
    // Constructor
	
    public NodoArbol (int d, String nom)
    {
	this.dato = d;
	this.nombre = nom;
		
	this.HijoDerecho = null;
	this.HijoIzquierdo = null;
    }
	
    /**
     * Muestra la informacion completa del objeto, valor de todos los atributos
     */
    public String toString ()
    {
	return nombre + "el dato es: " + dato;
    }
}
