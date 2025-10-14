// // abasic hasing operations
// import java.util.*;
// public class hashing{
//     public static void main(String[] args) {
//         //create
//         HashMap<String,Integer> map = new HashMap<>();

//         //insert O(1)
//         map.put("india", 30);
//         map.put("china", 20);
//         map.put("usa", 40);

//         System.out.println(map);

//         //get O(1)
//         System.out.println(map.get("india"));
//         System.out.println(map.get("pakistan")); //null value prints

//         //contains key O(1)
//         System.out.println(map.containsKey("india"));  //true
//         System.out.println(map.containsKey("pakistan")); //false
        
//         //remove O(1)
//         map.remove("china");
//         System.out.println(map);

//         //size O(1)
//         System.out.println(map.size());

//         //Empty O(1)
//         System.out.println(map.isEmpty());
//         map.clear();  // clear all the elements
//         System.out.println(map.isEmpty());
//     }
// }


//iteration and print
// import java.util.*;
// public class hashing{
//     public static void main(String[] args) {
//         //create
//         HashMap<String,Integer> map = new HashMap<>();

//         //insert O(1)
//         map.put("india", 30);
//         map.put("china", 20);
//         map.put("usa", 40);
//         map.put("pakistan", 10);

//         //iteration
//         Set<String> keys = map.keySet();    //o(n)
//         System.err.println(keys);

//         for(String k : keys){   //o(n)
//             System.out.println("keys=" +k+ ", values=" + map.get(k));  //o(1)
//         }
//     }
// }


//implementation of hashmap
// import java.util.*;

// public class hashing {
//     static class HashMap<K, V> {
//         private class Node {
//             K key;
//             V value;

//             public Node(K key, V value) {
//                 this.key = key;
//                 this.value = value;
//             }
//         }

//         private int n; // number of key-value pairs
//         private int N; // number of buckets
//         private LinkedList<Node>[] buckets;

//         @SuppressWarnings("unchecked")
//         public HashMap() {
//             this.N = 4;
//             this.buckets = new LinkedList[N];
//             for (int i = 0; i < N; i++) {
//                 buckets[i] = new LinkedList<>();
//             }
//         }

//         private int hashFunction(K key) {
//             int hc = key.hashCode();
//             return Math.abs(hc) % N;
//         }

//         private int searchInLL(K key, int idx) {
//             LinkedList<Node> ll = buckets[idx];
//             for (int i = 0; i < ll.size(); i++) {
//                 if (ll.get(i).key.equals(key)) {
//                     return i;
//                 }
//             }
//             return -1;
//         }

//         public void put(K key, V value) {
//             int idx = hashFunction(key);
//             int di = searchInLL(key, idx);

//             if (di == -1) {
//                 buckets[idx].add(new Node(key, value));
//                 n++;
//             } else {
//                 buckets[idx].get(di).value = value; // update value
//             }

//             double lambda = (double) n / N;
//             if (lambda > 2.0) {
//                 rehash();
//             }
//         }

//         @SuppressWarnings("unchecked")
//         private void rehash() {
//             LinkedList<Node>[] oldBuckets = buckets;
//             N = N * 2;
//             buckets = new LinkedList[N];
//             for (int i = 0; i < N; i++) {
//                 buckets[i] = new LinkedList<>();
//             }

//             n = 0; // reset count
//             for (LinkedList<Node> ll : oldBuckets) {
//                 for (Node node : ll) {
//                     put(node.key, node.value);
//                 }
//             }
//         }

//         public V get(K key) {
//             int idx = hashFunction(key);
//             int di = searchInLL(key, idx);
//             if (di == -1) return null;
//             return buckets[idx].get(di).value;
//         }

//         public boolean containsKey(K key) {
//             int idx = hashFunction(key);
//             int di = searchInLL(key, idx);
//             return di != -1;
//         }

//         public V remove(K key) {
//             int idx = hashFunction(key);
//             int di = searchInLL(key, idx);
//             if (di == -1) return null;
//             Node node = buckets[idx].remove(di);
//             n--;
//             return node.value;
//         }

//         public boolean isEmpty() {
//             return n == 0;
//         }

//         // ✅ FIXED: keySet() should be inside the HashMap class
//         public ArrayList<K> keySet() {
//             ArrayList<K> keys = new ArrayList<>();
//             for (int i = 0; i < N; i++) {
//                 LinkedList<Node> ll = buckets[i];
//                 for (Node node : ll) {
//                     keys.add(node.key);
//                 }
//             }
//             return keys;
//         }
//     }

//     // Example usage
//     public static void main(String[] args) {
//         HashMap<String, Integer> map = new HashMap<>();
//         map.put("India", 100);
//         map.put("US", 50);
//         map.put("China", 150);
//         map.put("India", 120); // update

//         ArrayList<String> keys = map.keySet();
//         for (String key : keys) {
//             System.out.println(key + " -> " + map.get(key));
//         }

//         System.out.println("India -> " + map.get("India"));
//         System.out.println("Contains US? " + map.containsKey("US"));
//         map.remove("US");
//         System.out.println("Contains US? " + map.containsKey("US"));
//     }
// }


//linked hashmap
// import java.util.*;
//    public class hashing{
//     public static void main (String[] args) {
//         LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
//         //insert O(1) print in order of insertion
//         map.put("india", 30);
//         map.put("china", 20);
//         map.put("usa", 40);
//         map.put("pakistan", 10);

//         System.out.println(map);
        
//         //hashmap - random order
//         HashMap<String,Integer> map2 = new HashMap<>();
//         map2.put("india", 30);
//         map2.put("china", 20);
//         map2.put("usa", 40);
//         map2.put("pakistan", 10);
//         System.out.println(map2);
       
//         //tree hashmap - sorted order of keys
//         TreeMap<String,Integer> map3 = new TreeMap<>();
//         map3.put("india", 30);
//         map3.put("china", 20);
//         map3.put("usa", 40);    
//         map3.put("pakistan", 10);
//         System.out.println(map3);
//         }
//     }



// majority element - > n/3 times
import java.util.*;

// public class hashing{
//     public static void main(String[] args) {
//         int arr[] = {1,3,2,1,2,1,3,1,3};
//         int n = arr.length;
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i  =0; i<n; i++){
//             if(map.containsKey(arr[i])){
//                 map.put(arr[i],map.get(arr[i])+1);
//             }else{
//                 map.put(arr[i],1);
//                 //one line solution
//         //   map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
//             }
//         }
        

//         Set<Integer> keys = map.keySet();
//         for(Integer k : keys){
//             if(map.get(k) > n/3){
//                 System.out.println(k);
//             }
//         }
//     }
// }


//valid anagram
// public class hashing{
//     public static boolean isanagram(String s, String s2){
//         if(s.length() != s2.length()){
//             return false;
//         }
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(int i =0;i<s.length();i++){
//             char ch =s.charAt(i);
//             map.put(ch,map.getOrDefault(ch, 0) + 1);
//         }

//         for(int i =0;i<s2.length();i++){
//             char ch =s2.charAt(i);
//             if(map.containsKey(ch)){
//                 if(map.get(ch) == 1){
//                     map.remove(ch);
//                 }else{
//                     map.put(ch,map.get(ch)-1);
//                 }
//             }else{
//                 return false;
//             }
//         }
//         return map.isEmpty();
//     }
//     public static void main(String[] args) {
//         String s1 = "race";
//         String s2 = "care";
//             System.out.println(isanagram(s1,s2));
//         }
//     }



// HashSet
// import java.util.*;
public class hashing{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //insert O(1)
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(3); //duplicate not added
        System.out.println(set);

        //contains O(1)
        System.out.println(set.contains(3));
        System.out.println(set.contains(6));

        //remove O(1)
        set.remove(3);
        System.out.println(set);

        //size O(1)
        System.out.println(set.size());

        //empty O(1)
        System.out.println(set.isEmpty());
    }
}