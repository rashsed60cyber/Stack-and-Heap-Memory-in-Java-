public class Student {
    int age; // instance variable

    void display() {
        int marks = 85; // local variable
        System.out.println("Student Object Created");
        System.out.println("Object Identity Hash Code: " + System.identityHashCode(this));
        System.out.println("Instance Variable (age): " + age);
        System.out.println("Local Variable (marks): " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.age = 20;
        s.display();
    }
}
