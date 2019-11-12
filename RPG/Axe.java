public class Axe extends Weapon{
    private static final double damage = 10;

    public Axe(){
        super(damage);
    }

    public String ascii_art(){
        return 
            "<|>\n" +
            " |\n"+
            " |\n";
    }
}   