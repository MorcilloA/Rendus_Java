public class Main{
    public static void main(String[] args){

        BetterArrayList<Integer> test = new BetterArrayList<>(10);

        test.addByIndex(0,6);
        test.add(8);
        // test.add(1,"test");
        for(int i = 0; i < test.length; i++){
            if(test.get(i) != null){

                test.get(i);
            }
        }
        // test.get(1);
        // System.out.println(test[0]);

    }
}