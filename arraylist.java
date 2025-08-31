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

        // get operation
        System.out.println(list.get(2));   

        // remove operation
        list.remove(2);
        System.out.println(list);

        // set operation at index
        list.set(0, 99);
        System.out.println(list);

        //contains operation
        System.out.println(list.contains(99));
        System.out.println(list.contains(3));

        // size operation
        System.out.println(list.size());

        list.add(2, 3);
        System.out.println(list);

        // iteration print arraylist
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
 }