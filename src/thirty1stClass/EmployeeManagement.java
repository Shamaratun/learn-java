package twenty4thPractice.thirty1stClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("C:\\Git\\learn-java\\src\\thirty1stClass\\file.csv"))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                String name = data[0].trim();
                int id = Integer.parseInt(data[1].trim());
                double salary = Double.parseDouble(data[2].trim());
                String employeeType = data[3].trim();

                if ("FullTime".equalsIgnoreCase(employeeType)) {
                  employees.add(new FullTimeEmployee(salary, name, id));
                } else if ("Contract".equalsIgnoreCase(employeeType)) {
                    employees.add(new ContractEmployee(salary, name, id));
                }else if ("PartTime".equalsIgnoreCase(employeeType)) {
                    employees.add(new PartTimeEmployee(salary, name, id));
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        try (PrintWriter writer = new PrintWriter("C:\\Git\\learn-java\\src\\thirty1stClass\\Employee_Updates")) {
            for (Employee employee : employees) {
//                employee.setSalary(120);
                if(employee instanceof PartTimeEmployee){
                    employee.setSalary(3000);
                }
                writer.println(employee); // Writes employee object as string
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred during writing: " + e.getMessage());
        }
    }
}
