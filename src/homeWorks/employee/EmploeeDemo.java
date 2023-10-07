package homeWorks.employee;

import java.util.Scanner;

public class EmploeeDemo {

    public static void main(String[] args) {

        EmployeeStorage employeeStorage = new EmployeeStorage();
        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEES");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY ID");
            System.out.println("Please input 4 for SEARCH EMPLOYEE BY COMPANY NAME");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input employee name");
                    String name = scanner.nextLine();
                    System.out.println("Please input employee surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employee employeeId");
                    String employeeId = scanner.nextLine();
                    System.out.println("Please input salary");
                    double salary = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input company");
                    String company = scanner.nextLine();
                    System.out.println("Please input employee position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, employeeId, salary, company, position);
                    employeeStorage.add(employee);
                    System.out.println("Employee created!");
                    break;
                case "2":
                    System.out.println("_________________");
                    employeeStorage.print();
                    System.out.println("_________________");
                    break;
                case "3":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    employeeStorage.search(keyword);
                    break;
                case "4":
                    System.out.println("Please input keyword");
                    keyword = scanner.nextLine();
                    employeeStorage.searchByCompany(keyword);
                    break;
                default:
                    System.out.println("Invalid command. try again");
            }
        }
    }
}
