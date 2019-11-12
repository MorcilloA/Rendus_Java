import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Fichier
 */
public abstract class Fichier implements FilesInterface{

    private BufferedReader myFile;
    // private String chemin = "Test.txt";
    // private String nom, extension;
    private String chemin, nom, extension;

    public Fichier(String chemin, String nom, String extension) {
        this.chemin = chemin;
        this.extension = extension;
        this.nom = nom;
        // this.myFile = new BufferedReader(new FileReader(chemin));
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public String getChemin(){
        return this.chemin;
    }
    
    public String getExtension(){
        return this.extension;
    }

    public void Lire() {

        String line;
        // BufferedReader(new FileReader("foo.in"))
        
        
        try {
            this.myFile = new BufferedReader(new FileReader(this.chemin));
            
            while ((line = this.myFile.readLine()) != null) {
                System.out.println(line);
            }


        }catch (IOException e) {

            e.printStackTrace();

        }
    }

    public void ALenvers() {
        
        
        try {
            String line;
            this.myFile = new BufferedReader(new FileReader(this.chemin));
            ArrayList<String> lignes = new ArrayList<>();
            
            while ((line = this.myFile.readLine()) != null) {
                // System.out.println(line);
                lignes.add(line);
            }

            // System.out.println(lignes.size());
            
            for (int i = lignes.size()-1 ; i >= 0; i--) {
                System.out.println(lignes.get(i));
            }
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
    }

    public void Palindrome() {
        
        
        try {
            String line;
            this.myFile = new BufferedReader(new FileReader(this.chemin));
            ArrayList<String> lignes = new ArrayList<>();
            
            while ((line = this.myFile.readLine()) != null) {
                // System.out.println(line);
                lignes.add(line);
            }

            // System.out.println(lignes.size());
            
            for (int i = lignes.size()-1 ; i >= 0; i--) {
                for (int j = lignes.get(i).length()-1; j >= 0; j--) {
                    
                    System.out.print(lignes.get(i).charAt(j));
                }
                System.out.println(" ");
            }
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
    }

    public void diff(String otherFilePath){


        try {
            String line;
            this.myFile = new BufferedReader(new FileReader(this.chemin));
            BufferedReader otherFile = new BufferedReader(new FileReader(otherFilePath));
            ArrayList<String> lignes = new ArrayList<>();
            ArrayList<String> lignes2 = new ArrayList<>();


            
            while ((line = this.myFile.readLine()) != null) {
                // System.out.println(line);
                lignes.add(line);
                
            }
            
            while ((line = otherFile.readLine()) != null) {
                // System.out.println(line);
                lignes2.add(line);
                
            }

            for (int i = 0  ; i <= (lignes.size()>=lignes2.size()?lignes.size()-1:lignes2.size()-1) ; i++) {
                if (i <= (lignes.size()<=lignes2.size()?lignes.size()-1:lignes2.size()-1)) {
                    if (lignes.get(i).equals(lignes2.get(i))) {
                        System.out.println(lignes.get(i)+" (identiques) "+lignes2.get(i));
                    }else{
                        System.out.println(lignes.get(i)+" (differents) "+lignes2.get(i));
                    }
                }else{
                    System.out.println( (i>lignes.size()-1?"        ":lignes.get(i)) +" (ligne en plus) "+ ( i>lignes2.size()-1?"        ":lignes2.get(i)) );
                }
            }

            // System.out.println(lignes.size());
            
            // for (int i = lignes.size()-1 ; i >= 0; i--) {
            //     for (int j = lignes.get(i).length()-1; j >= 0; j--) {
                    
            //         System.out.print(lignes.get(i).charAt(j));
            //     }
            //     System.out.println(" ");
            // }
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }

    }



    
}