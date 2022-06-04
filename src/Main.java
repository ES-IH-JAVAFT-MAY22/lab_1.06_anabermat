import classes.Employee;
import java.io.FileWriter;
import java.io.IOException;


public class Main {


    public static void main(String[] args) throws IOException {
        Employee e1 = new Employee("Juan",22,658925,62350);
        Employee e2 = new Employee("Alba",35,854725,75080);
        Employee e3 = new Employee("Carlos",47,965824,59802);
        Employee e4 = new Employee("Julia",28,758925,36520);
        Employee e5 = new Employee("Ana",32,589632,18596);
        Employee e6 = new Employee("Enrique",26,365872,19550);
        Employee e7 = new Employee("Marta",58,658742,27850);
        Employee e8 = new Employee("Mario",20,924586,30650);
        Employee e9 = new Employee("Sara",39,325478,50250);
        Employee e10 = new Employee("Jaime",42,254789,16580);

        FileWriter fileWriter = new FileWriter("employees.txt", true);
        fileWriter.write(e1.getName() + " " + e1.getAge() + " " + e1.getId() + " " + e1.getSalary() + "\n");
        fileWriter.write(e2.getName() + " " + e2.getAge() + " " + e2.getId() + " " + e2.getSalary() + "\n");
        fileWriter.write(e3.getName() + " " + e3.getAge() + " " + e3.getId() + " " + e3.getSalary() + "\n");
        fileWriter.write(e4.getName() + " " + e4.getAge() + " " + e4.getId() + " " + e4.getSalary() + "\n");
        fileWriter.write(e5.getName() + " " + e5.getAge() + " " + e5.getId() + " " + e5.getSalary() + "\n");
        fileWriter.write(e6.getName() + " " + e6.getAge() + " " + e6.getId() + " " + e6.getSalary() + "\n");
        fileWriter.write(e7.getName() + " " + e7.getAge() + " " + e7.getId() + " " + e7.getSalary() + "\n");
        fileWriter.write(e8.getName() + " " + e8.getAge() + " " + e8.getId() + " " + e8.getSalary() + "\n");
        fileWriter.write(e9.getName() + " " + e9.getAge() + " " + e9.getId() + " " + e9.getSalary() + "\n");
        fileWriter.write(e10.getName() + " " + e10.getAge() + " " + e10.getId() + " " + e10.getSalary() + "\n");

        fileWriter.close();
    }





}
