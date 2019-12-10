/**
 * Attack
 */
public abstract class Attack {

    private String name, description;
    private int damages;

    public Attack(String name, int damages, String description) {
        this.name = name;
        this.description = description;
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