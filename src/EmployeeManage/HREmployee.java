package EmployeeManage;

import java.util.Scanner;

public class HREmployee extends Employee {
    private int overTime;

    public HREmployee(int overTime) {
        super();
        this.overTime = overTime;
    }

    public HREmployee() {

    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.println("Nhap so gio lam them: ");
        overTime = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("So gio lam them la: " + overTime);
    }

    @Override
    public int totalSalary() {
        return this.salary = this.salary + this.overTime * 40000;
    }
}
