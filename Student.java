import java.util.Scanner;
public class Student {
    String name;
    int mark;
    String college;
    void display(){
        System.out.println(name+" "+mark+" "+college);
    }
}
class A{
    public static void main(String [] args){
        Student s1=new Student();
        s1.name="kani";
        s1.mark=90;
        s1.college="KNCET";
        s1.display();
    }
}
