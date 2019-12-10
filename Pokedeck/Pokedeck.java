/**
 * Pokedeck
 */
import java.util.*;

public class Pokedeck {

    public static void main(String[] args) {

        ArrayList<String> actions = new ArrayList<>();
        actions.add("getDeck");
        actions.add("findCard");
        actions.add("addCard");
        actions.add("changeDescription");
        actions.add("addAttack");
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
                case "getDeck":
                    ArrayList<Card> cards = myDeck.getDeck();
                    for (int i = 0; i < cards.size(); i++) {
                        
                        System.out.println("--------------------");
                        System.out.println("Card"+(i+1));
                        System.out.println("Name : "+cards.get(i).getName());
                        // System.out.println(" ");
                        System.out.println("Type : "+cards.get(i).getType());
                        // System.out.println(" ");
                        System.out.println("Health points : "+cards.get(i).getHp());
                        // System.out.println(" ");
                        System.out.println("Description : "+cards.get(i).getDescription());
                        // System.out.println(" ");
                        System.out.println("Attacks : ");
                        // System.out.println(" ");
                        for (int j = 0; j < cards.get(i).getAttacks().size(); j++) {
                            System.out.println("   - Name : "+cards.get(i).getAttacks().get(j).getName());
                            System.out.println("     Damages : "+cards.get(i).getAttacks().get(j).getDamages());
                            System.out.println("     Description : "+cards.get(i).getAttacks().get(j).getDescription());
                        }
                    }
                    break;

                case "findCard":
                    myDeck.findCard(myDeck);
                    break;

                case "addCard":
                    if (Deck.getCpt() != 0) {
                        Card newCard = new Card();
                        myDeck.addCard(newCard);
                    }
                    break;

                case "changeDescription":
                    System.out.println("Type the number of the card you want to change the description of : ");
                    for (int i = 0; i < myDeck.getDeck().size(); i++) {
                        System.out.println((i+1) + " - "+myDeck.getDeck().get(i).getName());
                    }
                    int cardIndex1 = inputZone.nextInt()-1;
                    myDeck.getDeck().get(cardIndex1).modifyDescription();
                    break;

                case "addAttack":
                    System.out.println("Type the number of the card you want to add an attack on : ");
                    for (int i = 0; i < myDeck.getDeck().size(); i++) {
                        System.out.println((i+1) + " - "+myDeck.getDeck().get(i).getName());
                    }
                    int cardIndex2 = inputZone.nextInt()-1;
                    myDeck.getDeck().get(cardIndex2).addAttack();
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