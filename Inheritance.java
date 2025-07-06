class Parent{
    void display(){
        System.out.println("this is parent");
    }
}
class Child extends Parent{
    String a;
    void show(String a){
        this.a=a;
        System.out.println(a);
    }
    void display(){
        System.out.println("Parent Override");
    }
}
public class Inheritance {
    public static void main(String args []){
        Child c = new Child();
        Parent b = new Child();
        c.display();
        b.display();
        c.show("This is Child");
    }
}
