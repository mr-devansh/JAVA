package OOPS;

public class Constructor {
    public static void main(String[] args) {
        cons s1 = new cons("devansh");
        cons s2 = new cons("devansh", 10);
    }
}
class cons{
    String name;
    int roll;
// here we used polymorphism(overloading) as we used same name but different
// number of parameters or different types of parameters
    cons(){
        System.out.println("hello un-named student");
    }
    cons(String name){
        this.name = name;
    }
    cons(String name, int roll){
        this.name = name;
        this.roll = roll;
    }   
}
// Constructor- special method that is invoked automatically 
//              at the time of object creation,
//             1. have saame name as the class.
//             2. no return type.
//             3. only called once.
//             4. memory allocated only when constructor called.

// Types- 1. non parameteried
//        2. parameteried
//        3. copy parameteried