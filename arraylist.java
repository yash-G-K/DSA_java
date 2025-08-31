import java.util.ArrayList;
 public class arraylist{
    public static void main(String[] args) {
        //classname<datatype> refvariablename = new classname<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        list2.add("Hello");
        list2.add("World");

        System.out.println(list2);
        System.out.println(list2.size());   
    }
 }