package EmployeeManage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        int n;
        int choose;
        do {
            System.out.println("-------------------");
            System.out.println("1: Nhap du lieu cho tung bo phan");
            System.out.println("2: Xuat du lieu cho tung bo phan");
            System.out.println("3: Xoa du lieu nhan vien");
            System.out.println("4: Sap xep danh sach theo ID");
            System.out.println("5: Tim kiem nhan vien theo que quan");
            System.out.println("Ban muon lam gi: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Nhap so luong nhan vien: ");
                    n = scanner.nextInt();
                    menu.inputEmployeeOfPosition(n);
                    break;
                case 2:
                    menu.outputEmployeeOfPosition();
                    break;
                case 3:
                    menu.deleteEmployeeOfPosition();
                    break;
                case 4:
                    menu.sortEmployeeOfPosition();
                    break;
                case 5:
                    menu.searchEmployeeByHomeTown();
                    break;
            }
        } while (choose != 0);
    }
}
