//                      recursion
// print no from n to 1 (decreasing order)

public class recursion{
    public static void numbers(int n) {
        if (n == 0) {
            return;
    }
    System.out.print(n +" ");
    numbers(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        numbers(n);
}
}