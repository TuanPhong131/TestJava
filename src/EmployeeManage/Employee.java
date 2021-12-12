package EmployeeManage;

import java.util.Random;
import java.util.Scanner;

public class Employee {

    private int id;
    private String name;
    private String gender;
    private int age;
    private String homeTown;
    protected int salary;

    public Employee() {
    }


    public Employee(int id, String name, String gender, int age, String homeTown, int salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.homeTown = homeTown;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void input(Scanner scanner) {
        System.out.println("Nhap id nhan vien: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten nhan vien: ");
        name = scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gender = scanner.nextLine();
        System.out.println("Nhap que quan: ");
        homeTown = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age = scanner.nextInt();
        System.out.println("Nhap luong co ban: ");
        salary = scanner.nextInt();
    }

    public void output() {
        System.out.println("-------------------");
        System.out.println("Thong tin nhan vien la: ");
        System.out.println("ID: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Gioi tính: " + gender);
        System.out.println("Tuoi: " + age);
        System.out.println("Que quan: " + homeTown);
    }

    public int totalSalary() {
        return 0;
    }
}
