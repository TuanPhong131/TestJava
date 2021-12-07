import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien;
        ArrayList<NhanVien> nhanVienArrayList = new ArrayList<>();
        int n;
        do{
            System.out.println("Nhap so nhan vien: ");
            n=scanner.nextInt();
        }
        while (n<0);

        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin nhan vien "+(i+1));
            nhanVien = new NhanVien();
            nhanVien.Nhap();
            nhanVienArrayList.add(nhanVien);
        }

        for(int i=0;i<nhanVienArrayList.size();i++){
            System.out.println("------------------------");
            nhanVienArrayList.get(i).Xuat();
            System.out.println("Luong thuc te: "+ nhanVienArrayList.get(i).thanhTien(nhanVienArrayList.get(i).getSoNgayLam()));
        }
        System.out.println("Nhap ten cong ty: ");
        String tenCongTy;
        tenCongTy = "TMA";
        System.out.println("Danh sach nhan vien cua cong ty");
        for (int i=0;i<nhanVienArrayList.size();i++){
            if(nhanVienArrayList.get(i).getCompany().equals(tenCongTy)){
                nhanVienArrayList.get(i).Xuat();
            }
        }

        System.out.println("-----------------------------");
        String it;
        it = "IT";
        System.out.println("Danh sach nhan vien thuoc IT");
        for (int i=0;i<nhanVienArrayList.size();i++){
            if(nhanVienArrayList.get(i).getPosition().equals(it)){
                nhanVienArrayList.get(i).Xuat();
            }
        }

        System.out.println("-----------------------------");
        String keToan;
        keToan = "Ke Toan";
        System.out.println("Danh sach nhan vien thuoc Ke Toan");
        for (int i=0;i<nhanVienArrayList.size();i++){
            if(nhanVienArrayList.get(i).getPosition().equals(keToan)){
                nhanVienArrayList.get(i).Xuat();

            }
        }
    }
}
