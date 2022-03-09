package Lab4;

import java.util.Scanner;

public class SanPhamBai1 {
    String tenSP;
    double donGia;
    double giamGia;

    Scanner input = new Scanner(System.in);

    void nhap(){
        System.out.print("Ten san pham: ");
        tenSP = input.nextLine();
        System.out.print("Don gia: ");
        donGia = input.nextInt();
        System.out.print("Giam gia: ");
        giamGia = input.nextInt();
    }
    void xuat(){
        System.out.println("Ten san pham: "+tenSP);
        System.out.println("Don gia: "+donGia);
        System.out.println("Giam gia: "+giamGia);
    }
    double getThueThuNhap(double thueNhapKhau){
        return thueNhapKhau;
    }
}
