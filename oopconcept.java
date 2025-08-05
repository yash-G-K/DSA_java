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
// public class oopconcept{
//     public static void main(String[] args) {
//         student s1 = new student("yash" , 30);
//         System.out.println(s1.name);
//     }
// }

// class student{
//     String name;
//     int roll;

//     student(String name, int roll){
//         this.name = name;
//         this.roll = roll;
//     }
// }


// //                 types of constructor
// public class oopconcept{
//     public static void main(String[] args) {
//         student s1 = new student("yash" , 30);
//         System.out.println(s1.name);
//         student s2 = new student();
//         student s3 = new student(30);


//     }
// }

// class student{
//     String name;
//     int roll;

// // parameterized constructor  
//     student(String name, int roll){
//         this.name = name;
//         this.roll = roll;
//     }
//         student(){
//             System.out.println("this is called non parameterized constructor");
//         }
          
//         student(int roll){
//              this.roll = roll;
//         }

//     }


// //                        copy constructor
// class Address {
//     String city;

//     Address(String city) {
//         this.city = city;
//     }
// }

// class Student {
//     String name;
//     Address address;

//     // Constructor
//     Student(String name, Address address) {
//         this.name = name;
//         this.address = address;
//     }

//     // 🔹 Shallow Copy Constructor
//     Student(Student other, boolean shallow) {
//         this.name = other.name;
//         if (shallow) {
//             this.address = other.address; // just reference copy
//         } else {
//             this.address = new Address(other.address.city); // deep copy
//         }
//     }

//     void display(String label) {
//         System.out.println(label + " -> Name: " + name + ", City: " + address.city);
//     }
// }

// public class oopconcept {
//     public static void main(String[] args) {
//         Address addr = new Address("Pune");
//         Student s1 = new Student("Yash", addr);

//         // 🔸 Shallow Copy
//         Student s2 = new Student(s1, true);

//         // 🔸 Deep Copy
//         Student s3 = new Student(s1, false);

//         // Modify copied objects
//         s2.address.city = "Mumbai";  // affects s1 in shallow copy
//         s3.address.city = "Delhi";   // doesn't affect s1 in deep copy

//         // Display all
//         s1.display("Original");
//         s2.display("Shallow Copy");
//         s3.display("Deep Copy");
//     }
// }

//                           Destructor


//                       inheritnace multi and single and hierarchical

// public class oopconcept{
//     public static void main(String[] args) {
//         //Single  Inheritance
//         // Fish shark = new Fish();
//         // shark.eat();

//        // multilevel inheritance
//        dog tommy = new dog();
//        tommy.eat();
//        tommy.legs =4 ;
//        System.out.println(tommy.legs);

//        bird sparrow = new bird();
//        sparrow.eat();

// }
// }
// class Animal {
//      String color;

//      void eat(){
//         System.out.println("Eating");
//      }  

//      void breathe(){
//         System.out.println("Breathing");
//      }
// }

// class mammal extends Animal{
//     int legs;
//     void walk(){
//         System.out.println("Walking");  
//     }
// }

// class dog extends mammal{
//     int tail;
// }

// // //Derived class
// class Fish extends Animal{
//     void swim(){
//         System.out.println("Swimming");
//     }
// }

// class bird extends Animal{
//     void fly(){
//         System.out.println("Flying");
//         }
// }

//                   method overloading
// class TestOverloading {
//     void test(int a) {
//         System.out.println("int value: " + a);
//         }
//         void test(int a, int b) {
//             System.out.println("int values: " + a + " " + b);
//             }
//             void test(double a) {
//                 System.out.println("double value: " + a);
//                 }
//                 }
//                 public class oopconcept {
//                     public static void main(String[] args) {
//                         TestOverloading obj = new TestOverloading();
//                         obj.test(10);
//                         obj.test(10, 20);
//                         obj.test(10.5);
//                         }
//                         }


//                  method or function overridding
// public class oopconcept{
//     public static void main(String[] args) {
//         Deer d = new Deer();
//         d.eats();
//     }
// }
// class Animal {
//     void eats() {
//         System.out.println("Eating");
//     }
// }
// class Deer extends Animal {
//     void eats() {
//         System.out.println("Deer is eating grass");
//     }
// }

//                  packages in java
//               inbuilt packages and user defined packages


//                       abstract 

// public class oopconcept {
//     public static void main(String[] args) {
//     Deer d = new Deer();
//     d.eats();
//     d.walk();
//     System.out.println(d.color);

//     chicken c = new chicken();
//     c.eats();
//     c.walk();
// }
// }

// abstract class Animal {
//     String color;

//     Animal(){
//         color = "black";
//         System.out.println("Animal constructor called");
//     }
//     void eats(){
//         System.out.println("Eating");
//     }
//     abstract void walk();
//     }
    
//     class Deer extends Animal {
//         Deer(){
//             System.out.println("Deer constructor called");
//         }
//         void changecolor(){
//             color = "brown";
//         }
//         void walk() {  
//             System.out.println("Deer is walking");
//             }
//     }

// class chicken extends  Animal {
//     chicken(){
//         System.out.println("chicken constructor called");
//         }
//       void changecolor(){
//             color = "Yellow";
//         }
//     void walk() {
//         System.out.println("Chicken is walking");
//         }
// }



///                       interfaces

// public class oopconcept{
//     public static void main(String[] args) {
//         Queen q = new Queen();
//         q.moves();

// }}
// interface chessplayers {
//     void moves();
// }
// class Queen implements chessplayers {
//     public void moves() {
//         System.out.println("Up, down,left,right,diagonal (all directions)");
//         }
//         }
//         class Rook implements chessplayers {
//             public void moves() {
//                 System.out.println("Horizontal and vertical directions");
//                 }
//                 }
//                 class King implements chessplayers {
//                     public void moves() {
//                         System.out.println("One square in all directions");
//                         }
//                         }



// //                       static keyword
// public class oopconcept { // The public class name must match the file name
//     // Static variable for school name - shared by all Student objects
//     static String schoolName = "ABC Public School";

//     // Instance variables - unique for each Student object
//     String studentName;
//     int studentID;
//     String grade;

//     // Constructor to initialize instance variables
//     public oopconcept(String studentName, int studentID, String grade) {
//         this.studentName = studentName;
//         this.studentID = studentID;
//         this.grade = grade;
//     }

//     // Method to display student information
//     public void displayStudentInfo() {
//         System.out.println("Student Name: " + this.studentName);
//         System.out.println("Student ID: " + this.studentID);
//         System.out.println("Grade: " + this.grade);
//         System.out.println("School: " + oopconcept.schoolName); // Accessing static variable using class name
//         System.out.println("--------------------");
//     }

//     public static void main(String[] args) {
//         // Create instances of the oopconcept class
//         oopconcept student1 = new oopconcept("Alice", 101, "10th");
//         oopconcept student2 = new oopconcept("Bob", 102, "9th");
//         oopconcept student3 = new oopconcept("Charlie", 103, "11th");

//         // Display information for each student
//         student1.displayStudentInfo();
//         student2.displayStudentInfo();
//         student3.displayStudentInfo();

//         // You can also access the static schoolName directly using the class name
//         System.out.println("Global School Name: " + oopconcept.schoolName);

//         // If you change the static variable, it affects all instances
//         oopconcept.schoolName = "XYZ International School";
//         System.out.println("\n--- School Name Changed ---");

//         student1.displayStudentInfo(); // Alice now also belongs to XYZ International School
//     }
// }



//                super keyword
//study on own

