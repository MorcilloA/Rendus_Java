public class MyArrayList{

    private String type;
    private int size;
    // private int index;
    private Object[] MyArrayList;
    
    
    public MyArrayList(String type, int size){
        this.type = type;
        this.size = size;
        // Object[] MyArrayList = new Object[10];
        MyArrayList = new Object[size];

    }

    public void add(int index ,Object toAdd){
        MyArrayList[index] = toAdd;
    }

    public void get(int index){
        System.out.println(MyArrayList[index]);
    }



}