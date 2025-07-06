class parent{
    String name;
    int mark;
    int age;
     parent(String name,int mark,int age){
        this.name = name;
        this.age = age;
        this.mark = mark;
        System.out.println(name+" "+mark+" "+age);
    }
}
class child extends parent{
     child(String name,int mark,int age){
        super(name,mark,age);
    }
}
public class InheritanceAndConstructor {
    public static void main(String [] args){
        child obj = new child("kani",60,21);
    }
}
