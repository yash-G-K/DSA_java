import java.util.*;

public class basics{
    public static void main(String args[]){
      System.out.println("hello world!");
      System.out.println("hello world!");
      System.out.println("hello world!");

      System.out.print("Enter a number:");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 1;
      while(count<=n){
        System.out.println(count);
        count +=1;
        
      }
    }
}
