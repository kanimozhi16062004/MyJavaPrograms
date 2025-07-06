public class Constructor {
    int age;
    String name;
    String std;
    Constructor(String name,int age){
        this("hghg");
        this.name=name;
        this.age=age;
        System.out.println(name+ " "+age);
    }
    Constructor(String std){
        this.std=std;
        System.out.println(std);
    }
    public static void main(String [] args){
        Constructor a = new Constructor("kani",21);
        //Constructor a2 = new Constructor("hgh");
    }
}
