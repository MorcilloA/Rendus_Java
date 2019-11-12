import java.util.*;
public class Joueur{

    private ArrayList<Carte> paquetSplitted;
    private int point;

    public Joueur(ArrayList<Carte> paquetSplitted){
        this.paquetSplitted = paquetSplitted;
        this.point = paquetSplitted.size();
    }

    public ArrayList<Carte> getPaquet(){
        return this.paquetSplitted;
    }

    public int getPoint(){
        return this.point;
    }

    public Carte TirerCarte(){
        Carte chosen = this.paquetSplitted.get(0);
        paquetSplitted.remove(0);
        this.point = paquetSplitted.size();
        return chosen;
    }

    public void RetakeCard(ArrayList<Carte> newCards){
        this.paquetSplitted.addAll(newCards);
        this.point = paquetSplitted.size();
    }
}