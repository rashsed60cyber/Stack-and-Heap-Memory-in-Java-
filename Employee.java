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
