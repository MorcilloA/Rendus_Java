/**
 * FichierTxt
 */
public class FichierTxt extends Fichier{

    private final static String extension = "txt";

    public FichierTxt(String chemin, String nom){
        super(chemin, nom, extension);
    }
    
}