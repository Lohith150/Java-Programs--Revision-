
class Person {
    String name;

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

public class PersonDemo {
    public static void main(String[] args) {

        Manager m = new Manager();

        m.name = "Lohith";
        m.employeeId = 101;
        m.department = "Computer Science";

        m.displayPerson();
        m.displayEmployee();
        m.displayManager();
    }
}
