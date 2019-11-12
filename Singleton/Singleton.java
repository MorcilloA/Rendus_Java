public class Singleton{
     public static void main(String[] args){
        
        // MoteurAudio m1 = new MoteurAudio();
        // MoteurAudio m2 = new MoteurAudio();
        // MoteurAudio m3 = new MoteurAudio();
        // System.out.println(m3.x);
        
        MoteurAudio m1 = MoteurAudio.getInstance();
        MoteurAudio m2 = MoteurAudio.getInstance();
        m2.x = 2;
        System.out.println(m1.x);
        System.out.println(m2.x);


     }
}