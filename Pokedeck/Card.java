import java.util.*;

/**
 * Card
 */
public class Card {

    private String name, type, description;
    private int hp;
    private ArrayList<String> typeList = new ArrayList<>();
    private ArrayList<Attack> attacks = new ArrayList<>();


    public Card() {

        //Fullfill the types list
        typeList.add("grass");
        typeList.add("fire");
        typeList.add("water");
        typeList.add("lightning");
        typeList.add("psychic");
        typeList.add("fighting");
        typeList.add("darkness");
        typeList.add("metal");
        typeList.add("fairy");
        typeList.add("dragon");
        typeList.add("colorless");

        //Creation proccessus
        System.out.println("Creation of a new Pokemon");
        //Define the input zone
        Scanner inputZone = new Scanner(System.in);
        //Initialization of the name
        System.out.println("Enter the name :");
        String name = inputZone.next();
        System.out.println("You entered : "+ name);

        this.name = name;

        //Initialization of the type + check if it's in the typeList
        System.out.println("Enter the type from the list below :");
        for (int i = 0; i < this.typeList.size(); i++) {
            System.out.println(this.typeList.get(i));
        }
        String type = inputZone.next();
        System.out.println("You entered : "+ type);
        
        while (!this.typeList.contains(type)) {
            System.out.println("The type you gave doesn't exist.");
            System.out.println("Enter the type from the list below :");
            for (int i = 0; i < this.typeList.size(); i++) {
                System.out.println(this.typeList.get(i));
            }
            type = inputZone.next();
            System.out.println("You entered : "+ type);
        }
        
        this.type = type;

        //Initialization of the hp + ckeck if it's an integer
        System.out.println("Enter the life points amount :");
        int hp = inputZone.nextInt();
        
        // while (hp != (int)Integer.parseInt(hp)) {
        //     System.out.println("You need to enter a numeric value.");
        //     System.out.println("Enter the life points amount :");
        //     hp = inputZone.nextInt();
        // }

        System.out.println("You entered : "+ hp);
        
        this.hp = hp;

        this.description = "undefined";

    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    public int getHp() {
        return this.hp;
    }

    public void getTypeList() {
        for (int i = 0; i < this.typeList.size(); i++) {
            System.out.println(this.typeList.get(i));
        }
    }

    public ArrayList<Attack> getAttacks() {
        return this.attacks;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    public Boolean addAttack() {
        Attack newAttack = new Attack();
        attacks.add(newAttack);
        return true;
    }

    public Boolean removeAttack(String attackName) {
        // attacks.remove(attackName);
        return true;
    }

    public void modifyDescription() {

        Scanner inputZone = new Scanner(System.in);
        System.out.println("Current description :");
        System.out.println(this.description);
        System.out.println("Enter the new one :");
        // inputZone.nextLine();
        String description = inputZone.nextLine();
        System.out.println("You entered : "+ description);

        this.description = description;
    }


}