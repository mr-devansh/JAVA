package OOPS;
// interface is blueprint of class
// intereface are used to implement multiple inheritance
// also to acheive total abstractions, 100% always
public class Intereface {
    public static void main(String[] args) {
        deer d = new deer();
        d.carns();
        d.herbs();
    }
}
// all methods are public, abstract ans without implementation
// variables can be final public or static
interface herbivore{
    abstract void herbs();
}
interface carnivore{
    abstract void carns();
}
class deer implements herbivore, carnivore{
    public void herbs(){
        System.out.println("deer eats plants");
    }
    public void carns(){
        System.out.println("deer eats animals");
    }
}