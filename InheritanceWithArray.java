class Studentss {
    String name;
    int age;
    Studentss(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}
public class InheritanceWithArray {
    public static void main(String args[]) {
            Studentss[] students = new Studentss[3];
            students[0] = new Studentss("Aarav", 20);
            students[1] = new Studentss("Diya", 22);
            students[2] = new Studentss("Kabir", 19);
            for (Studentss s : students) {
                s.display();
            }
        }

    }
