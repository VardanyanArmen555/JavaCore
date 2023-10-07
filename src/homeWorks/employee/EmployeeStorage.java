package homeWorks.employee;

import classwork.library.Book;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size;

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getEmployeeId() + " " + employees[i].getSalary() + " " + employees[i].getCompany() + " " + employees[i].getPosition());
        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().contains(keyword)) {
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getEmployeeId() + " " + employees[i].getSalary() + " " + employees[i].getCompany() + " " + employees[i].getPosition());

            }
        }
    }
    public void searchByCompany(String keyword) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().contains(keyword)) {
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getEmployeeId() + " " + employees[i].getSalary() + " " + employees[i].getCompany() + " " + employees[i].getPosition());

            }
        }
    }

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;

    }
}
