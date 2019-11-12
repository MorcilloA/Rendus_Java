import java.util.*;

public class RPGMain{

    public static void main(String[] args){

        ArrayList<Weapon> store =new ArrayList <>();
        store.add(new Hammer());
        store.add(new Axe());
        for(Weapon w : store) {
            System.out.println(w.ascii_art());
        }

    }

}