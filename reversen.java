public class reversen{
    public static void main(String args[]){
        int n =10899;
        while(n > 0){
        int lastd = n%10;
    System.out.print(lastd + " ");
    n /=10;
        }
    {
        int m =10899;
        int rev =0;
    
        while(m>0){
            int ld = n%10;
            rev = (rev * 10) + ld; 
            n /=10;
        }
    }
    }

}