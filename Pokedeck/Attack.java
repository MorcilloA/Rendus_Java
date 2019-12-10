/**
 * Attack
 */

import java.util.*;
import java.io.*;
public class Attack {

    private String name, description;
    private int damages;

    public Attack() {


        System.out.println("Creation of a new Attack");
        //Define the input zone
        Scanner inputZone = new Scanner(System.in);
        //Initialization of the name
        System.out.println("Enter the name :");
        String name = inputZone.next();
        inputZone.nextLine();
        System.out.println("You entered : "+ name);
        this.name = name;

        System.out.println("Enter the description :");
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String description = inputZone.nextLine();
        // String description = br.readLine();
        System.out.println("You entered : "+ description);
        this.description = description;

        System.out.println("Enter the amount of damage :");
        int damages = inputZone.nextInt();
        System.out.println("You entered : "+ damages);
        this.damages = damages;
    }

    public int getDamages() {
        return this.damages;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDamages(int damages) {
        this.damages = damages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}