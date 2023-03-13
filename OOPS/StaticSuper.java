package OOPS;

public class StaticSuper {
    public static void main(String[] args) {
        School s1 = new School();
        s1.setInfo("devansh", 1);
        s1.getInfo();
        System.out.println(s1.percentage(1, 3, 60)); 
    }
}
// static used to share same variable oer method of a given class
// variables, functions, blocks, nested class can be static
class School{
    static String schoolName = "NIET";
    String name;
    int roll;
    float percent;
    static int percentage(int P, int C, int M){
        return (P+C+M)/3;
    }
    void setInfo(String name, int roll){
        this.name= name;
        this.roll = roll;
    }
    void getInfo(){
        System.out.println(this.name +" "+ this.roll+" "+schoolName+"");
    }
}