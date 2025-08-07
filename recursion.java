//                      recursion

// print no from n to 1 (decreasing order)
public class recursion{
    public static void numbersdec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
    }
    System.out.print(n +" ");
    numbersdec(n-1);
    }

    public static void num_inc(int n) {
            if (n == 1) {
                System.out.print(n);
            return;
    }
        num_inc(n-1);
        System.out.print(n +" ");

        
    }
    public static void main(String[] args) {
        int n = 10;
        numbersdec(n);
        num_inc(n);
}
}
