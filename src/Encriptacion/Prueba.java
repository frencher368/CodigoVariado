package Encriptacion;
/**
 * @author Alejandro Erazo
 */

public class Prueba
{
    // Atributos
    char Matriz [][] = new char [27][27];
    String Abecedario = new String("abcdefghijklmnñopqrstuvwxyzabcdefghijklmnñopqrstuvwxyz");
    
    // Metodos
	
    /**
     * Llena la matriz
     */
    public void LlenarMatriz ( )
    {
	for (int i = 0; i < 27; i++)
	{
	//Matriz [i][i] = Abecedario.charAt(i);
            for (int j = 0; j < 27; j++)
            {
		Matriz [0][j] = Abecedario.charAt(j); Matriz [1][j] = Abecedario.charAt(j+1); Matriz [2][j] = Abecedario.charAt(j+2);
		Matriz [i][0] = Abecedario.charAt(i); Matriz [i][1] = Abecedario.charAt(i+1); Matriz [i][2] = Abecedario.charAt(i+2);
								
		Matriz [3][j] = Abecedario.charAt(j+3); Matriz [4][j] = Abecedario.charAt(j+4); Matriz [5][j] = Abecedario.charAt(j+5);
		Matriz [i][3] = Abecedario.charAt(i+3); Matriz [i][4] = Abecedario.charAt(i+4); Matriz [i][5] = Abecedario.charAt(i+5);

		Matriz [6][j] = Abecedario.charAt(j+6); Matriz [7][j] = Abecedario.charAt(j+7); Matriz [8][j] = Abecedario.charAt(j+8);
		Matriz [i][6] = Abecedario.charAt(i+6); Matriz [i][7] = Abecedario.charAt(i+7); Matriz [i][8] = Abecedario.charAt(i+8);
				
		Matriz [9][j] = Abecedario.charAt(j+9); Matriz [10][j] = Abecedario.charAt(j+10); Matriz [11][j] = Abecedario.charAt(j+11);
		Matriz [i][9] = Abecedario.charAt(i+9); Matriz [i][10] = Abecedario.charAt(i+10); Matriz [i][11] = Abecedario.charAt(i+11);
				
		Matriz [12][j] = Abecedario.charAt(j+12); Matriz [13][j] = Abecedario.charAt(j+13); Matriz [14][j] = Abecedario.charAt(j+14);
		Matriz [i][12] = Abecedario.charAt(i+12); Matriz [i][13] = Abecedario.charAt(i+13); Matriz [i][14] = Abecedario.charAt(i+14);
								
		Matriz [15][j] = Abecedario.charAt(j+15); Matriz [16][j] = Abecedario.charAt(j+16); Matriz [17][j] = Abecedario.charAt(j+17);
		Matriz [i][15] = Abecedario.charAt(i+15); Matriz [i][16] = Abecedario.charAt(i+16); Matriz [i][17] = Abecedario.charAt(i+17);

		Matriz [18][j] = Abecedario.charAt(j+18); Matriz [19][j] = Abecedario.charAt(j+19); Matriz [20][j] = Abecedario.charAt(j+20);
		Matriz [i][18] = Abecedario.charAt(i+18); Matriz [i][19] = Abecedario.charAt(i+19); Matriz [i][20] = Abecedario.charAt(i+20);
				
		Matriz [21][j] = Abecedario.charAt(j+21); Matriz [22][j] = Abecedario.charAt(j+22); Matriz [23][j] = Abecedario.charAt(j+23);
		Matriz [i][21] = Abecedario.charAt(i+21); Matriz [i][22] = Abecedario.charAt(i+22); Matriz [i][23] = Abecedario.charAt(i+23);
				
		Matriz [24][j] = Abecedario.charAt(j+24); Matriz [25][j] = Abecedario.charAt(j+25); Matriz [26][j] = Abecedario.charAt(j+26);
		Matriz [i][24] = Abecedario.charAt(i+24); Matriz [i][25] = Abecedario.charAt(i+25); Matriz [i][26] = Abecedario.charAt(i+26);
		}
	}
    }
	
    /**
     * Encripta el texto segun la matriz
     */
    public void EncriptarTexto ()
    {
        String texto = "hola";
	char array[] = texto.toCharArray();
			
	for (int i = 0; i < array.length; i++)
	{
            for (int j = 0; j < array.length; j++)
            {
		if (array[i] == Matriz [0][j] && array[i] == Matriz [i][0])
		{
                    array[i] = Matriz[i][j];
		}
            }
	}	
	String Encriptado = String.valueOf(array);
	System.out.println(Encriptado);
    }
	
	
    public static void main (String [] arg)
    {
	Prueba op = new Prueba ();
	op.EncriptarTexto();
    }
}
