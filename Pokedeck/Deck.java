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

}