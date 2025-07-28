
public class string {
    public static void printletters(String s) {
        for(int i =0 ;i < s.length() ; i++) {
            System.out.print(s.charAt(i) + " ");
            }
        System.out.println();
    }
    public static void main(String[] args) {
        // String str = "Hello, World!"; //1st method
        // System.out.println(str);
        // System.out.println(str.length());
        // String str2 = new String("yash");//2nd method

        // Scanner sc = new Scanner(System.in);//user taken
        // System.out.print("Enter your name: ");
        // String name = sc.nextLine(); //next only take word but next line take it as whole line
        // System.out.println("Your name is " + name);
        // System.out.println(name.length());


        // sc.close();

        //                         concatination
        String str = "yash";
        String str2 = "kumar";
        String str3 = str + " " + str2;
        printletters(str3);
    }
}
