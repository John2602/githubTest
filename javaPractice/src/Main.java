public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
        s.insertRecord(2000,"John Smith");
        s.display();
        s1.insertRecord(2032,"John ");
        s1.display();
    }
}
