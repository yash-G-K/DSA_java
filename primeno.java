import java.util.*;

public class primeno{
    public static void main(String args[]){
     System.out.print("enter a number");
     Scanner sc= new Scanner(System.in);
     int n = sc.nextInt();

     if(n == 2){
        System.out.print("n is prime");
     }else{
          boolean isprime= true;
     for(int i=2;i<=Math.sqrt(n);i++){
        if(n % i ==0){
          isprime = false;
        }
     }
     if(isprime =true){
        System.out.println("n is prrime");
     }else{
      System.out.println(" n is not prime");
     }
     }
    }
}