package EmployeeManage;

import java.util.Scanner;

public class ITEmployee extends Employee {
    private int quantityTask;

    public ITEmployee(int quantityTask) {
        this.quantityTask = quantityTask;
    }

    public ITEmployee() {

    }

    public int getQuantityTask() {
        return quantityTask;
    }

    public void setQuantityTask(int quantityTask) {
        this.quantityTask = quantityTask;
    }

    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.println("Nhap so nhiem vu hoan thanh: ");
        quantityTask = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("So nhiem vu hoan thanh: " + quantityTask);
    }

    @Override
    public int totalSalary() {
        return this.salary = this.salary + this.quantityTask * 500000;
    }
}
