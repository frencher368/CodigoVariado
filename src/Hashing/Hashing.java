package Hashing;
import javax.swing.JOptionPane;
/**
 * @author Alejandro Erazo
 */

public class Hashing {
    
    // ------------------ 20 obras del museo de louvre ------------------
    // 1. La balsa de la Medusa, 2. La Gioconda
    // 3. Las bodas de Caná, 4. La Victoria de Samotracia
    // 5. La Venus de Milo, 6. La coronación de Napoleón
    // 7. La Libertad guiando al pueblo, 8. Los caballos de Marly
    // 9. El león de Monzón, 10. Retrato de una joven
    // 11. Los toros alados, 12. El esclavo moribundo de Miguel Ángel
    // 13. El escriba sentado, 14. La Encajera
    // 15. Gabrielle de Estrées y su hermana, 16. El baño turco
    // 17. El tahúr del as de diamantes, 18. La momia
    // 19. Las aves, 20. Sarcófago de Cerveteri
    // Pagina ASICII
    // https://elcodigoascii.com.ar/

    String obrasLouvre [] = {"la balsa de la medusa",
                             "la gioconda",
                             "las bodas de cana",
                             "la victoria de samotracia",
                             "la venus de milo",
                             "La coronación de napoleón",
                             "la libertad guiando al pueblo",
                             "los caballos de marly",
                             "el león de monzón",
                             "retrato de una joven",
                             "los toros alados",
                             "el esclavo moribundo de miguel angel",
                             "el escriba sentado",
                             "la encajera",
                             "gabrielle de estrées y su hermana",
                             "el baño turco",
                             "el tahúr del as de diamantes",
                             "la momia",
                             "las aves",
                             "sarcófago de cerveteri"};
    
    /**
    * Arreglo para almacenar la informacion (Hashing)
    */
    public String obrasLouvre2 [ ] = new String [ 30 ];
    
    // ----------------------------------
    // Metodos
    // ----------------------------------
    public void MetodoHashing ( ){
        
        int llave = 0;
        String data;
        
        for (int k = 0; k < 20; k++) {
            data = obrasLouvre [k];
            
            for (int i = 0; i < data.length(); i++){
                int as = data.charAt(i);
                llave += as;
            }
            int indice = llave%23;
            
            if ( obrasLouvre2 [indice] == null ){
                obrasLouvre2[indice] = obrasLouvre[k];
                System.out.println(obrasLouvre[k]+" Se guardo correctamente en la posicion = "+indice);
            } else{
                System.out.println("Se detecto una colision");
                for (int y = indice+1; y < 30; y++) {
                    if(obrasLouvre2 [y] == null){
                        obrasLouvre2[y] = obrasLouvre[k];
                        System.out.println(obrasLouvre[k]+" Se guardo correctamente en la posicion = "+y);
                        y = 30;
                        System.out.println("Se resolvio la colision");
                    }
                }
            }
        }
        
        for (int i = 0; i < 30; i++) {
            System.out.println("Dato " +i+": "+obrasLouvre2 [i]);
        }
    }

    // ----------------------------------
    // Metodo Main
    // ----------------------------------
    public static void main (String arg []) {
        
        Hashing inicio = new Hashing();
        inicio.MetodoHashing();
    }
}
