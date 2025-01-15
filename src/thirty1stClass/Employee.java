package twenty4thPractice.thirty1stClass;



abstract class Employee implements TaxCalculator{


    private double salary;
    private int id;
    private String name;


    public Employee(double salary, String name, int id) {
        this.salary = salary;
        this.name = name;
        this.id = id;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




}

