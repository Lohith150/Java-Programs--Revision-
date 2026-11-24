class Student {
    private String name;
    private int rollnumber;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public int getRollNumber() {
        return rollnumber;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Lohith");
        s.setRollNumber(101);

        System.out.println(s.getName());
        System.out.println(s.getRollNumber());
    }
}