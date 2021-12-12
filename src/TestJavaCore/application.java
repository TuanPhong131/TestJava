package TestJavaCore;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        TichTong();
        ReverseString();
        CountChar();
        FindSecondMax();
        CountCouples();
    }

    public static void TichTong() {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int tich = 1;
        int tong = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] != 0) {
                tich *= a[i];
            } else {
                tong += a[i];
            }
        }
        System.out.println("Tong so le la: " + tong);
        System.out.println("Tich so chan la: " + tich);
    }

    public static void ReverseString() {
        StringBuilder a = new StringBuilder("Hello");
        StringBuilder b = a.reverse();
        System.out.println("Dao chuoi la: " + b);
    }

    public static void CountChar() {
        String a = "Hello World";
        char[] kiTu = a.toCharArray();
        HashMap<Character, Integer> countEachChar = new HashMap<>();
        for (char c : kiTu) {
            if (countEachChar.containsKey(c)) {
                countEachChar.put(c, countEachChar.get(c) + 1);
            } else {
                countEachChar.put(c, 1);
            }
        }
        System.out.println(countEachChar);

    }

    public static void FindSecondMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n:");
        int a[] = new int[100];
        int n = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(101);
//            a[i] = scanner.nextInt();
        }
        System.out.println("Mang la:");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i] + "\t");
        }
        int max = a[0];
        int max2 = a[1];
        for (int i = 1; i < n; i++) {
            if (max == max2) {
                i++;
                max2 = a[i];
            }
        }
        System.out.println("\n" + "So can tim la: " + max2);
    }

    public static void CountCouples() {
        int[] a = {1, 2, 1, 2, 3, 2, 2, 4, 5, 1, 3};
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i] + "\t");
        }
        HashMap<Integer, Integer> couples = new HashMap<>();
        for (int i : a) {
            if (couples.containsKey(i)) {
                couples.put(i, couples.get(i) + 1);
            } else {
                couples.put(i, 1);
            }
        }
        System.out.println();
        int count = 0;
        int chia = 0;
        for (int i = 1; i <= couples.size(); i++) {
            chia = couples.get(i) / 2;
            count += chia;
        }
        System.out.println("Cac cap couples la: " + count);
        System.out.println(couples.values());
        System.out.println(couples);
    }
}
