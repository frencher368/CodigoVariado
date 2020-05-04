package OtrosMetodos;
/**
 * @author Alejandro Erazo
 */

public class Metodos {
    
    // ----------------------------------
    // Metodos
    // ----------------------------------
    
    /**
     * Calcular fibonacci de un numero (Codigo normal)
     */
    public int fibonacci1 (int n)
    {
	if (n==0 || n==1)
            return 1;
	else
            return fibonacci1(n-1)+fibonacci1(n-2);
    }
    
    // ------------------------------------------------------------------------------------------------------------------------------------------------
    // PROBLEMA.
    // Calcular el numero combinatorio teniendo en cuenta la siguiente formula
    // (M/K) = M! / K! (M! - K!)
    // * Tener en cuenta que la variable n1 debe ser mas grande que n2
    // * Video guia: https://www.youtube.com/watch?v=jD2h-3nkGEA
    // ------------------------------------------------------------------------------------------------------------------------------------------------
	
    public int NumCombinatorios (int n1, int n2)
    {
	int factorialM = 1;
	int factorialK = 1;
	int Denominador = n1 - n2;
		
	while ( n1 > n2 ){
            factorialM = factorialM * n1;
            n1--;
	}
		
	while ( Denominador != 0 ){
            factorialK = factorialK * Denominador;
            Denominador--;
	}
		
	int Resultado = factorialM / factorialK;
	return Resultado;
    }
    
    /**
    * Algoritmo para encontrar una palabra en un texto
    */
    public void encontrarPalabra ( ){
        String Texto = "Érase una vez un pobre campesino. Una noche se encontraba sentado, atizando el fuego, mientras su esposa hilaba sentada junto a él. Ambos se lamentaban de hallarse en un hogar sin niños.";
        // Cada vez que halla un espacio, separa la palabra y la guarda en una posicion
        String [] palabras = Texto.split(" ");
        String buscar = "sentada";
        int coincidencias = 0;
        
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(buscar)){
                coincidencias = coincidencias + 1;
            }
        }
        System.out.println("En el texto se encontro la palabra: " + buscar + " " + coincidencias + " Veces");
    }
    
    /**
    * Algoritmo para convertir una palabra en numeros ASCII y sacarle una clave (Hashing)
    */
    public void prueba ( ){
        String datas = "Esposa";
        System.out.println(datas);
        int llave = 0;
        
        for (int i = 0; i < datas.length(); i++) {
            int as = datas.charAt(i);
            System.out.print(as);
            llave += as;
        }
        int a = llave%23;
        System.out.println(" La llave es: " + a);
    }

    
    
    // ----------------------------------
    // Metodo Main
    // ----------------------------------
    public static void main (String arg []) {
        
        Metodos inicio = new Metodos();
        inicio.encontrarPalabra();
    }
}
