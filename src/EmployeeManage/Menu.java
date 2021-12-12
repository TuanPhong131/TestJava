package EmployeeManage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    ArrayList<HREmployee> hrEmployees = new ArrayList<>();
    ArrayList<ITEmployee> itEmployees = new ArrayList<>();

    public void inputEmployeeOfPosition(int n) {
        int choose;
        System.out.println("Chon bo phan can nhap: ");
        System.out.println("1: HR");
        System.out.println("2: IT");
        choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose) {
            case 1: {
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhap thong tin nhan vien " + (i + 1));
                    HREmployee hrEmployee = new HREmployee();
                    hrEmployee.input(scanner);
                    hrEmployees.add(hrEmployee);
                }
                break;
            }
            case 2: {
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhap thong tin nhan vien " + (i + 1));
                    ITEmployee itEmployee = new ITEmployee();
                    itEmployee.input(scanner);
                    itEmployees.add(itEmployee);
                }
                break;
            }
        }
    }

    public void outputEmployeeOfPosition() {
        int choose;
        System.out.println("1: HR");
        System.out.println("2: IT");
        System.out.println("3: All Staff Of Company");
        choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose) {
            case 1: {
                System.out.println("Thong tin nhan vien cua bo phan HR la: ");
                for (int i = 0; i < hrEmployees.size(); i++) {
                    hrEmployees.get(i).output();
                    System.out.println("Tong tien luong la: " + hrEmployees.get(i).totalSalary());
                }
                break;
            }
            case 2: {
                System.out.println("Thong tin nhan vien cua bo phan IT la: ");
                for (int i = 0; i < itEmployees.size(); i++) {
                    itEmployees.get(i).output();
                    System.out.println("Tong tien luong la: " + itEmployees.get(i).totalSalary());
                }
                break;
            }
            case 3: {
                System.out.println("Thong nhan vien cua toan bo TMA la: ");
                for (int i = 0; i < hrEmployees.size(); i++) {
                    hrEmployees.get(i).output();
                    System.out.println("Tong tien luong la: " + hrEmployees.get(i).totalSalary());
                }
                for (int i = 0; i < itEmployees.size(); i++) {
                    itEmployees.get(i).output();
                    System.out.println("Tong tien luong la: " + itEmployees.get(i).totalSalary());
                }
                break;
            }
        }
    }

    public void deleteEmployeeOfPosition() {
        int choose;
        System.out.println("1: HR");
        System.out.println("2: IT");
        choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose) {
            case 1: {
                int id;
                System.out.println("Nhap id nhan vien HR can xoa: ");
                id = scanner.nextInt();
                scanner.nextLine();
                for (int k = 0; k < hrEmployees.size(); k++) {
                    if (hrEmployees.get(k).getId() == id) {
                        hrEmployees.remove(hrEmployees.get(k));
                    }
                }
                System.out.println("-------------------");
                System.out.println("Nhan vien da dươc xoa");
                System.out.println("-------------------");
                break;
            }
            case 2: {
                int id;
                System.out.println("Nhap id nhan vien IT can xoa: ");
                id = scanner.nextInt();
                scanner.nextLine();
                for (int k = 0; k < itEmployees.size(); k++) {
                    if (itEmployees.get(k).getId() == id) {
                        itEmployees.remove(itEmployees.get(k));
                    }
                }
                System.out.println("-------------------");
                System.out.println("Nhan vien da dươc xoa");
                System.out.println("-------------------");
                break;
            }
        }

    }

    public void sortEmployeeOfPosition() {
        int choose;
        System.out.println("1: HR");
        System.out.println("2: IT");
        choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose) {
            case 1: {
                hrEmployees.sort(new SortByID());
                System.out.println("-------------------");
                System.out.println("Danh sach da duoc sap xep");
                System.out.println("-------------------");
            }
            case 2: {
                itEmployees.sort(new SortByID());
                System.out.println("-------------------");
                System.out.println("Danh sach da duoc sap xep");
                System.out.println("-------------------");
            }
        }
    }

    public void searchEmployeeByHomeTown() {
        int choose;
        System.out.println("1: HR");
        System.out.println("2: IT");
        choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose) {
            case 1:
                String homeTownHR;
                System.out.println("Nhap que quan: ");
                homeTownHR = scanner.nextLine();
                for (int i = 0; i < hrEmployees.size(); i++) {
                    if (hrEmployees.get(i).getHomeTown().equals(homeTownHR)) {
                        hrEmployees.get(i).output();
                        System.out.println("Tong tien luong la: " + hrEmployees.get(i).totalSalary());
                    }
                }
            case 2:
                String homeTownIT;
                System.out.println("Nhap que quan: ");
                homeTownIT = scanner.nextLine();
                for (int i = 0; i < itEmployees.size(); i++) {
                    if (itEmployees.get(i).getHomeTown().equals(homeTownIT)) {
                        itEmployees.get(i).output();
                        System.out.println("Tong tien luong la: " + itEmployees.get(i).totalSalary());
                    }
                }
        }
    }

    public static class SortByID implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getId() - o2.getId();
        }
    }
}
