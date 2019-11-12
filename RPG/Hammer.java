public class Hammer extends Weapon{
    private static final double damage = 20;

    public Hammer(){
        super(damage);
    }

    public String ascii_art(){
        return 
            " _ _\n"+
            "|_|_|\n"+
            "  |\n"+
            "  |\n";
    }
}