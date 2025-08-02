//                classes and objects defination
// classes groups of real world entities 
// objects instances of classes entities in the real world

public class oopconcept{
    public static void main(String[] args) {
        // creating an object of the class
        pen p1 = new pen();
        p1.setcolor("blue");
        System.out.println(p1.getColor());      
    }
}

class pen{
    private String color; // Made it private for better encapsulation
    int tip;

    void setcolor(String newcolor){
        color = newcolor;
    }
    
    String getColor() { // Added getter method to access color
        return color;
    }
    
    void settip(int newtip){
        tip = newtip;
    }
}

class student{
    String name; // Corrected to String
    int age;
    String grade; // Corrected to String

    int calculate(int p, int c, int m){ // Changed return type and return statement
        int total = (p + c + m)/3;
        return total; // Return the calculated total
    }
}
