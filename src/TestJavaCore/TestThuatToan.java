package TestJavaCore;

import java.util.Scanner;
public class TestThuatToan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = scanner.nextInt();

        String s = String.valueOf(n);
        char []b = s.toCharArray();
        int sum=0;

        for(int i=0;i<b.length;i++){
            Double e = Double.parseDouble(String.valueOf(b[i]));
            e = Math.pow(e,b.length);
            System.out.println(e);
            sum+=e;
        }
        System.out.println(sum);
        if(sum == n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
