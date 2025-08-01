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
// public  class bitmanipulation{
//     public static void oddoreven(int n) {
//         int bitmask = 1;
//         if((n & bitmask )== 0){
//             System.out.println(n+" is even");
//         }else {
//             System.out.println(n+" is odd");

//         }
//     }
//     public static void main(String[] args) {
//         oddoreven(3);
//         oddoreven(11);
//         oddoreven(8);
// }
// }

//                 set ith bit
// public  class bitmanipulation{
//     public static int setIthBit(int n, int i) {
//         int bitmask = 1 << i;
//             return n | bitmask;
//     }
//     public static void main(String[] args) {
//           System.out.println(setIthBit(10, 1)); 
//           System.out.println(setIthBit(10, 2)); 
//           System.out.println(setIthBit(10, 3)); 
//           System.out.println(setIthBit(10, 0)); 
// }
// }

//                   clear ith bit

// public  class bitmanipulation{
//     public static int clearIthBit(int n, int i) {
//         int bitmask = ~(1 << i);
//         return n & bitmask;
        
//     }
//     public static void main(String[] args) {
//         System.out.println(clearIthBit(10, 1));
//         System.out.println(clearIthBit(10, 2));
// }
// }

//                    update ith bit
// public  class bitmanipulation{
//     public static int updateIthBit(int n, int i, int val) {
//         int bitmask = (1 << i);
//         if(val == 0){
//             return n & ~bitmask;
//             }else {
//                 return n | bitmask;
//                 }
//                 }
//                 public static void main(String[] args) {
//                     System.out.println(updateIthBit(10, 1, 0));
//                     System.out.println(updateIthBit(10, 1, 1));
//                 }
// }

//                                clear last i bit
//  public  class bitmanipulation{
//      public static int clearLastBit(int n,int i) {
//         int bitmask = (~0 << i);
//         return n & bitmask;
//         }
//         public static void main(String[] args) {
//             System.out.println(clearLastBit(15,2));
//         }
//  }

//                         clear range of bits
 public  class bitmanipulation{
     public static int cleariBitsinrange(int n,int i,int j) {
        int a = (~0 << j + 1);
        int b = (1 << i) - 1;
        int bitmask = a |b;
        return n & bitmask;

        }
        public static void main(String[] args) {
            System.out.println(cleariBitsinrange(10,2,4));
        }
 }





