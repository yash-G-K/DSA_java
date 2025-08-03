//                classes and objects defination
// classes groups of real world entities 
// objects instances of classes entities in the real world

// public class oopconcept{
//     public static void main(String[] args) {
//         // creating an object of the class
//         pen p1 = new pen();
//         p1.setcolor("blue");
//         System.out.println(p1.getColor());      

//          bankaccount b = new bankaccount();
//         b.username = "yash kalbhute";
//         b.setpass("yash123");
//     }
// }

// class pen{
//     private String color; // Made it private for better encapsulation
//     int tip;

//     void setcolor(String newcolor){
//         color = newcolor;
//     }
    
//     String getColor() { // Added getter method to access color
//         return color;
//     }
    
//     void settip(int newtip){
//         tip = newtip;
//     }
// }

// class student{
//     String name; // Corrected to String
//     int age;
//     String grade; // Corrected to String

//     int calculate(int p, int c, int m){ // Changed return type and return statement
//         int total = (p + c + m)/3;
//         return total; // Return the calculated total

//     }
// }


//               access specifiers


// public class oopconcept{
//     public static void main(String[] args) {
//         // creating an object of the class   

//          bankaccount b = new bankaccount();
//         b.username = "yash kalbhute";
//         b.setpass("yash123");
//     }
// }


// class bankaccount{
//     public String username;
//     private String password;//only accessesd by class
//     public void setpass(String pwd){
//         password = pwd;
//     }
// }

// //          getters and setters
// class person {
//     // Private fields - encapsulation
//     private String name;
//     private int age;
    
//     // Setter for name
//     public void setName(String name) {
//         this.name = name;
//     }
    
//     // Getter for name
//     public String getName() {
//         return name;
//     }
    
//     // Setter for age
//     public void setAge(int age) {
//         if (age > 0) {  // Basic validation
//             this.age = age;
//         }
//     }
    
//     // Getter for age
//     public int getAge() {
//         return age;
//     }
// }

// // Usage example:
// public class oopconcept {
//     public static void main(String[] args) {
//         person person = new person();
        
//         // Using setters to set values
//         person.setName("John");
//         person.setAge(25);
        
//         // Using getters to retrieve values
//         System.out.println("Name: " + person.getName());
//         System.out.println("Age: " + person.getAge());
//     }
// }


//                   encaptulation
//                  constructor
public class oopconcept{
    public static void main(String[] args) {
        student s1 = new student("yash" , 30);
        System.out.println(s1.name);
    }
}

class student{
    String name;
    int roll;

    student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
}