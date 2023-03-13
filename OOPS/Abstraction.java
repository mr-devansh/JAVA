package OOPS;
// mainly have two things abstract classes and interface
public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        Chicken c = new Chicken();
        h.eat();
        h.walk();
        c.eat();
        c.walk();
    }
}
// abstract class:
// we cannot create its instances
// can create abstract functions also
// can have abstract constructors
// constructors are called as per the hierarchy
abstract class Animal{
    void eat(){
        System.out.println("eat");
    }
    abstract void walk();

}
class Horse extends Animal{
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walk on 2 legs");
    }
}