import java.util.Scanner;

public class NhanVien {
    String name;
    String position;
    float salary;
    int soNgayLam;
    String company;
    float thanhTien;

    public NhanVien(String name, String position, float salary, int soNgayLam, String company) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.soNgayLam = soNgayLam;
        this.company = company;
    }


    public int getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public NhanVien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap bo phan: ");
        position = scanner.nextLine();
        System.out.println("Nhap so tien luong: ");
        salary = scanner.nextInt();
        System.out.println("Nhap so ngay lam:");
        soNgayLam = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap cong ty: ");
        company = scanner.nextLine();
    }

    public void Xuat(){
        System.out.println("----------------------");
        System.out.println("Ten: "+name);
        System.out.println("Vi tri: "+position);
        System.out.println("Luong: "+salary);
        System.out.println("So ngay lam: "+soNgayLam);
        System.out.println("Cong ty: "+company);
    }

    public float thanhTien(int soNgayLam){
        thanhTien = salary / 30 * soNgayLam;
        return thanhTien;
    }
}
