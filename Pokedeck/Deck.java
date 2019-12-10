/**
 * Deck
 */
import java.util.*;

public class Deck {

    private ArrayList<Card> deck;
    private static int cpt = 1;

    public Deck() {
        this.deck = new ArrayList<Card>();
        Deck.cpt++;
    }

    public ArrayList<Card> getDeck() {
        return this.deck;
    }

    public static int getCpt() {
        return Deck.cpt;
    }

    public Boolean addCard(Card newCard) {
        if(deck.add(newCard)){
            return true;
        }else{
            return false;
        }
    }

    public Boolean removeCard(String pokemonName, String pokemonType) {
        return true;
    }

    public void findCard(Deck deck) {
        
        Scanner inputZone = new Scanner(System.in);
        System.out.println("Enter the name of the searched card : ");
        String name = inputZone.next();
        System.out.println("Enter the type of the searched card : ");
        String type = inputZone.next();

        Boolean found = false;

        for (int i = 0; i < deck.getDeck().size(); i++) {
            String compareName = deck.getDeck().get(i).getName();
            String compareType = deck.getDeck().get(i).getType();
            if(compareName == name && compareType == type) {

                System.out.println("test");
                // System.out.println(deck.getDeck().get(i).getName());
                found = true;
                break;
            }
            
        }

        if (!found) {
            System.out.println("Impossible to find your card");
        }

    }

}