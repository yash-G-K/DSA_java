import java.util.*;

public class calculator{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println(" enter a :");
              int a = sc.nextInt();

       System.out.println(" enter b :");
              int b = sc.nextInt();

        System.out.println(" enter operator :");
               char op = sc.next().charAt(0);

            switch(op) {
            case '+' : System.out.println("a+b =" + (a+b));
            break; 
            case '-' : System.out.println("a-b =" + (a-b));
            break;
            case '*' : System.out.println("a*b =" + (a*b));
            break;
            case '/' : System.out.println("a/b =" + (a/b));
            break;
            case '%' : System.out.println("a%b");
            break;
            default : System.out.println("operator not present");
               
        }
    }
}
