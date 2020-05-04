package Otros;
/**
 *
 * @author Alejandro Erazo
 */

public class Operaciones
{
    /**
     * Hallar par de puntos más cercano (Codigo normal)
     */
    int Coordenada [][] = new int [2][10];
    
    public void LlenarPuntos ( )
    {
        for (int i=0; i<Coordenada.length; i++)
	{
            for (int j=0; j<Coordenada[i].length; j++)
            {
                Coordenada[i][j] = (int) (Math.random());
            }
	}
    }
	
    /**
     * Calcular fibonacci de un numero (Codigo Divide y venceras) //METODO 1
     */
    boolean fibonacci2 (int n, int i, int j)
    {
	int v[] = new int [100];
		
	if ( i > j )
            return false;
        int med = (i+j)/2;
		
	if (v[med] == n)
            return true;
		
	if (n > v[med])
            return fibonacci2(n, i+1, j);
	else
            return fibonacci2(n, i, j-1);
    }
	
    /**
     * Calcular fibonacci de un numero (Codigo Programacion dinamica) //METODO 2
     */
    public int fibonacci3 (int num)
    {
        int vec[] = new int[num+1];
	vec[0] = 0;
	vec[1] = 1;
		
	for ( int i = 2; i <= num; i++)
            vec[i] = vec[i-1] + vec[i-2];
	return vec[num];
    }
	
    // ------------------------------------------------------------------------------------------------------------------------------------------------
    // PROBLEMA.
    // Un almacén de zapatos hizo una estrategia de venta muy ambiciosa que consiste en surtir su mayor punto de venta con la mercancía mas valiosa
    // que se encuentre en su principal bodega, para esto le hace un incentivo a los trabajadores que se encargan de transportar la mercancía.
    // Los trabajadores deben cargar el camión teniendo en cuenta que la mercancía cuenta con un tamaño y un precio.
    // ¿Como acomodar la mercancia en el camión para obtener la mayor cantidad de ganancias en el principal punto de venta?
    //     Elemento     Tamaño     Precio
    //        1          18         $168
    //        2          25         $146
    //        3          36         $135
    //        4          40         $178
    //        5          15         $140
    // Tener en cuenta que la bodega del cambio tiene un tamaño de 80.
    // ------------------------------------------------------------------------------------------------------------------------------------------------
	
    /**
     * Calcular por fuerza bruta 
     */
    public void Almacen_FB ()
    {
        int Max = 80;
        int V [][] = new int [6][6];
		
	int Tamaño [] = { 18, 25, 36, 40, 15 };
	int Ganancias [] = { 168, 146, 135, 178, 140 };
	int i, w;
		
	for(i=0; i<a; i++)
	{
            for(i=0; i<a; i++)
            {
                // Desarrollo
            }
	}
    }
	
    /**
     * Calcular por divide y venceras
     */
    public void Almacen_DV ()
    {
	// ***** EJEMPLO ***** //
	
	int Num [] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		
	// https://www.youtube.com/watch?v=teuiGVBpO3w
		
    }
	
    /**
     * Calcular por programacion dinamica 
     */
    public void Almacen_PD ()
    {
	int Max = 80;
	int V [][] = new int [6][6];
		
        int Tamaño [] = { 18, 25, 36, 40, 15 };
	int Ganancias [] = { 168, 146, 135, 178, 140 };
	int i, w;
		
	// Llenamos la fila 0 y la columna 0 con ceros.
	for (i = 0; i < 6; i++)
            {	
		V [i][0] = 0;
		for (w = 0; w < 6; w++)
            	{
                    V [0][w] = 0;
		}
            }
		
	for (i = 1; i < 6; i++)
        {
            for (w = 1; w < 6; w++)
            {
		if (Tamaño [0]<Max) // el elemento puede ser parte de la solucion
                    if (Ganancias [0] + V[i-1][w-Tamaño [0]] > V[i-1][w])
			V[i][w] = Ganancias [0] + V[i-1][w-Tamaño [0]];
                    else
			V[i][w] = V[i-1][w];
                    else
			V[i][w] = V[i-1][w]; // Tamaño en la posicion 1 > w
            }
	}
	// https://www.youtube.com/watch?v=fVrPwSkSo0Iv
	// https://www.youtube.com/watch?v=IZHvQTx2bZ0
    }
}
