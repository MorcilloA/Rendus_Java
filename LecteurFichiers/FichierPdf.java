/**
 * FichierTxt
 */
public class FichierPdf extends Fichier{

    private final static String extension = "pdf";

    public FichierPdf(String chemin, String nom){
        super(chemin, nom, extension);
    }
    
}