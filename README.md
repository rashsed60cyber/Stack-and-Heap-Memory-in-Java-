# Date : 15 -10 -2026
# Assingment : 02 
# Stack-and-Heap-Memory-in-Java-

# Program 1: Student.java
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

# Program 2: Employee.java

public class Employee {
    int salary; // instance variable

    void display() {
        int bonus = 5000; // local variable

        // local inner class
        class Report {
            void show() {
                System.out.println("Report Object Created");
                System.out.println("Report Identity Hash Code: " + System.identityHashCode(this));
                System.out.println("Report: Employee salary is " + salary);
            }
        }

        System.out.println("Employee Object Created");
        System.out.println("Employee Identity Hash Code: " + System.identityHashCode(this));
        System.out.println();
        System.out.println("Inside display() Method:");
        System.out.println("Salary (Instance Variable): " + salary);
        System.out.println("Bonus (Local Variable): " + bonus);
        System.out.println();

        Report r = new Report();
        r.show();

        System.out.println();
        System.out.println("Memory Concept:");
        System.out.println("Employee object -> Heap");
        System.out.println("Report object -> Heap");
        System.out.println("salary -> Instance field");
        System.out.println("bonus -> Local variable in display()");
        System.out.println("show() -> Executes in its own method frame");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.salary = 30000;
        e.display();
    }
}
