import java.util.*;

public class Carte{

    private static String[] couleurs = {"de Pique", "de Trefle", "de Coeur", "de Carreaux"};
    private static String[] valeurs = {"2","3","4","5","6","7","8","9","10","Valet","Dame","Roi","As"};
    private String couleur;
    private String valeur;
    private int indexValue;

    public Carte(int v, int c){
        this.couleur = couleurs[c];
        this.valeur = valeurs[v];
        this.indexValue = v;
    }

    public String getCouleur(){
        return this.couleur;
    }

    public int getIndexValue(){
        return this.indexValue;
    }

    public String getValeur(){
        return this.valeur;
    }

    public String getAll(){
        return this.valeur+' '+this.couleur;
    }

    // public String Compare(Carte j1, Carte j2){
    //     if(j1.getIndexValue() > j2.getIndexValue()){
    //         P1.RetakeCard(table);
    //         System.out.println("Le Joueur 1 remporte le tour.");
    //     }else if(j1.getIndexValue() < j2.getIndexValue()){
    //         P2.RetakeCard(table);
    //         System.out.println("Le Joueur 2 remporte le tour.");
    //     }else{
    //         System.out.println("BATAILLE !!!");
    //     }
    // }

    // public Bool compare(int otherCardValue, String otherCardColor){
        
    // }
}