package Backtracking;
/**
 * @author Alejandro Erazo
*/

public class ArbolBinario
{
    // Atributos
    NodoArbol raiz;

    // Contructor
    public ArbolBinario ( )
    {
        raiz = null;
    }
	
    // Metodos
	
    /**
    * Agrega un nodo
    */
    public void agregarNodo (int d, String nom)
    {
    
        NodoArbol nNodo = new NodoArbol(d, nom);
		
	if (raiz == null)
	{
            raiz = nNodo;
	}
        else
        {
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
			
            while (true)
            {
		padre = auxiliar;
		if (d < auxiliar.dato)
		{
                    auxiliar = auxiliar.HijoIzquierdo;
                    if (auxiliar == null)
                    {
			padre.HijoIzquierdo = nNodo;
			return;
                    }
		}
		else
		{
                    auxiliar = auxiliar.HijoDerecho;
                    if (auxiliar == null)
                    {
			padre.HijoDerecho = nNodo;
			return;
                    }
		}
            }
	}
    }
	
    /**
    * Nos indica cuando el arbol esta vacio
    */
    public boolean estaVacio ()
    {
	return raiz == null;
    }
	
    /**
     * Recorrer el arbol en InOrden
     */
    public void inOrden (NodoArbol R)
    {
	if (R != null)
	{
            inOrden(R.HijoIzquierdo);
            System.out.println(R.dato);
            inOrden(R.HijoDerecho);
	}
    }
}
