public class Rectangel {
    int lenght;
    int breath;
    Rectangel(){
        System.out.println("Default Constructor Called");
    }
    Rectangel(int lenght,int breath){
        this();
        this.lenght=lenght;
        this.breath=breath;
    }
    void display(){
        System.out.println(lenght+" "+breath);
    }
    public static void main(String [] args){
        Rectangel a = new Rectangel(20,30);
        a.display();
    }
}
