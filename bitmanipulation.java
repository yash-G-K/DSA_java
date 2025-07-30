//   below there ARE 6 CODES of bit manipulation like and ,or ,XOR,compliment,left shift,right shift


// public  class bitmanipulation{
//     public static void main(String[] args) {
//         System.out.println(5 & 6);
// }
// }


// public  class bitmanipulation{
//     public static void main(String[] args) {
//         System.out.println(5 | 6);
// }
// }


// public  class bitmanipulation{
//     public static void main(String[] args) {
//         System.out.println(5 ^ 6);
// }
// }


// public  class bitmanipulation{
//     public static void main(String[] args) {
//         System.out.println(~0);
// }
// }


// public  class bitmanipulation{
//     public static void main(String[] args) {
//         System.out.println(5 << 2);
// }
// }


// public  class bitmanipulation{
//     public static void main(String[] args) {
//         System.out.println(6 >> 1);
// }
// }



//                  bit number is even or odd
public  class bitmanipulation{
    public static void oddoreven(int n) {
        int bitmask = 1;
        if((n & bitmask )== 0){
            System.out.println(n+" is even");
        }else {
            System.out.println(n+" is odd");

        }
    }
    public static void main(String[] args) {
        oddoreven(3);
        oddoreven(11);
        oddoreven(8);
}
}
