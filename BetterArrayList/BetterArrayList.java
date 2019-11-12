public class BetterArrayList<T> {

    // private String type;
    // private int size
    private int index;
    private T[] BetterArrayList;
    
    
    public BetterArrayList(int size){
        // this.type = type;
        // this.size = size;
        // Object[] MyArrayList = new Object[10];
        BetterArrayList = (T[]) new Object[size];

    }

    public void addByIndex(int index ,T toAdd){
        this.index = index;
        BetterArrayList[index] = toAdd;
    }

    public void add(T toAdd){
        BetterArrayList[index++] = toAdd;
    }

    public void get(int index){
        System.out.println(BetterArrayList[index]);
    }



}