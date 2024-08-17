package practiceInterview;

public class Employee {
    private String firstname;
    private String lastname;
    private int age;
    private double sal;

    public Employee(String firstname, String lastname, int age, double sal) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sal = sal;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public double getSal() {
        return sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                '}';
    }
}
