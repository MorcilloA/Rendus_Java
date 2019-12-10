/**
 * Deck
 */
import java.util.*;

public class Deck {

    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<Card>();
    }

    public ArrayList<Card> getDeck() {
        return this.deck;
    }

    public Boolean addCard(Card newCard) {
        return true;
    }

    public Boolean removeCard(String pokemonName, String pokemonType) {
        return true;
    }

}