package TestJavaCore;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap n: ");
            n = scanner.nextInt();
        }
        while (n < 0);
        System.out.println("Day so fibonacci la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonaaci(i) + "\t");
        }
    }

    public static int fibonaaci(int n) {
        int f0 = 0;
        int f1 = 1;
        int f2 = 1;
        if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = f2;
                f2 = f0 + f1;
            }
        }
        return f2;
    }
}
