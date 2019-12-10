/**
 * Pokedeck
 */
import java.util.*;

public class Pokedeck {

    public static void main(String[] args) {
        // System.out.println("test");

        ArrayList<String> actions = new ArrayList<>();
        actions.add("choose");
        actions.add("createDeck");
        actions.add("addCard");
        actions.add("stopProgram");

        Deck myDeck = new Deck();

        Boolean running = true;

        while (running) {
            
            System.out.println("Choose your action from the list :");
            //Define the input zone
            
            Scanner inputZone = new Scanner(System.in);
            
            for (int i = 1; i < actions.size(); i++) {
                System.out.println(actions.get(i));
            }
            String action = inputZone.next();
            
            while (!actions.contains(action)) {
                System.out.println("Action undefined please select an action from the list below :");
                for (int i = 0; i < actions.size(); i++) {
                    System.out.println(actions.get(i));
                }
                action = inputZone.next();
            }

            switch (action) {
                // case "createDeck":
                    // Deck myNewDeck = new Deck();
                    // break;

                case "addCard":
                    if (Deck.getCpt() != 0) {
                        Card newCard = new Card();
                        myDeck.addCard(newCard);
                    }
                    break;

                case "stopProgram":
                    System.out.println("Program stopped");
                    running = false;
                    break;
            
                default:
                    running = true;
                    break;
            }


        
            // System.out.println(myDeck.getDeck().get(0).getName());
        }



    }
}   