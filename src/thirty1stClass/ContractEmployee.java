package twenty4thPractice.thirty1stClass;

import static java.lang.Character.getName;

public class ContractEmployee extends Employee implements TaxCalculator {

    public ContractEmployee(double salary, String name, int id) {
        super(salary, name, id);

    }

    @Override
    public double calculateTax() {
        double taxRate = 0.025;  // Example: 0.025% tax rate for contract employees
        return getSalary() * taxRate;

    }

    @Override
    public String toString() {
        return "Name: "+getName()+" Id: "+getId()+" Salary: "+getSalary()+" Type: Contract";
    }

}



