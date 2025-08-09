//               tiling problem

public class recursion2{
    public static int tilingproblem(int n){ // 2 x n floor
    //base case
    if(n ==1 || n==0){
        return 1;
    }
    //kaam
    //vertical chioices
    int fnm1 = tilingproblem(n-1);

    //horizonatal choices 
    int fnm2 = tilingproblem(n-2);

     int toways=fnm1 + fnm2;
     return toways;
    }
    public static void main(String[] args) {
        System.out.println(tilingproblem(7));
        
    }

}