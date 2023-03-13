package OOPS;

public class introduction {
    public static void main(String[] args) {
        // ojects of classes are created in the heap
        Pen p = new Pen();
        p.colour = "blue";
        p.tip = 5;
        System.out.println(p.colour+" "+p.tip);

        Student devansh = new Student();
        devansh.name = "Devansh singh";
        devansh.age = 20;
        float[] marks = {10,11,14};
        System.out.println(devansh.name);
        System.out.println(devansh.age);
        devansh.setPercentage(marks);
    }
}

class Pen{
    String colour;
    int tip;
}

class Student{
    String name;
    int age;
    float percentage;

    void setPercentage(float[] marks){
        for (float f : marks) {
            percentage+=f;
        }
        percentage/=marks.length;
        System.out.println("percentage: "+percentage+"%");
    }
}
