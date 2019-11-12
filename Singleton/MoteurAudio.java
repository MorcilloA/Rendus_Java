public class MoteurAudio{

    int x;

    // public MoteurAudio(){
    //     this.x = 0;
    // }
    static MoteurAudio instance = null;
    private MoteurAudio(){
        x = 0;
    }

    public static MoteurAudio getInstance(){
        if (instance == null) {
            instance = new MoteurAudio();
        }
        return instance;

    }

}