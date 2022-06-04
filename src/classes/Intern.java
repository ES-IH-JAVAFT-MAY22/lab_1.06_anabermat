package classes;

public class Intern extends Employee {

    private int salary;


    public Intern(String name, int age, int id, int salary, int salary1) {
        super(name, age, id, salary);
        this.salary = salary1;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary<20000) {
            this.salary = salary;
        } else {
            this.salary = 20000;
        }
    }
}
