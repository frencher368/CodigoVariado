package Otros;
/**
 *
 * @author Alejandro Erazo
 */

public class Prueba
{
    // ------------------------------------------------------------------------------------------------------------------------------------------------
    // PROBLEMA.
    // Calcular numeros combinatorios
    // ------------------------------------------------------------------------------------------------------------------------------------------------

    public int NumCombinatorios (int n1, int n2)
    {
	int factorialM = 1;
	int factorialK = 1;
	int Denominador = n1 - n2;
		
        while ( n1 > n2 )
	{
            factorialM = factorialM * n1;
            n1--;
	}
		
	while ( Denominador != 0 )
	{
            factorialK = factorialK * Denominador;
            Denominador--;
	}
		
        int Resultado = factorialM / factorialK;
	return Resultado;
    }
}
