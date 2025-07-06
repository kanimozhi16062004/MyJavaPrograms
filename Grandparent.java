class Grandparents {
    String name;
    Grandparents(String name){
        this.name=name;
    }
    void Show(){
        System.out.println(name);
    }
}
class Parents extends Grandparents{
    String name;
    int age;
    Parents(String name,int age){
        super(name);
        this.name=name;
        this.age=age;
    }
    void Show(){
        System.out.println(name+" "+age);
    }
}
public class Grandparent{
    public static void main(String args[]){
        Parents a= new Parents("kani",21);
        a.Show();
    }
}
