package twenty4thPractice.thirty1stClass;



public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(double salary, String name, int id) {
        super(salary, name, id);
        if (salary < 0) {
            throw new InvalidException("Found the Error");

        }
    }
    @Override
    public double calculateTax() {

        return getSalary() * 0.05;

        }

    @Override
    public String toString() {
        return "Name: "+getName()+" Id: "+getId()+" Salary: "+getSalary()+" Type: FullTime";
    }
}




