/**
 * LecteurFichier
 */
public class LecteurFichier {

    public static void main(String[] args){

        FichierTxt txt = new FichierTxt("Test.txt", "test");
        FichierTxt txt2 = new FichierTxt("Test2.txt", "test");
        FichierTxt txt3 = new FichierTxt("Test3.txt", "test");

        //Afficher le nom, l'extension et le chemin du fichier
        System.out.println("Nom du fichier : "+txt.getNom());
        System.out.println("Chemin du fichier : "+txt.getChemin());
        System.out.println("Extension du fichier : "+txt.getExtension());
        System.out.println("");

        //Lire le fichier normalement
        System.out.println("Lecture normale :");
        txt.Lire();
        System.out.println("");

        //Lire le fichier en plaçant ses lignes à l'envers
        System.out.println("Lignes a l'envers :");
        txt.ALenvers();
        System.out.println("");

        //Lire le fichier en plaçant ses caractères à l'envers
        System.out.println("Lettres a l'envers :");
        txt.Palindrome();
        System.out.println("");

        //Comparer différents textes sur la similarité de ses lignes
        System.out.println("Comparaisons :");
        txt.diff(txt2.getChemin());
        System.out.println("");
        txt.diff(txt3.getChemin());
        // txt3.diff(txt.getChemin());
        
    
    }
}