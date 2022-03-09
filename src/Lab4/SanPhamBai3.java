package Lab4;

import java.util.Scanner;

public class SanPhamBai3 {
    String tenSP;
    double donGia;
    double giamGia;

    Scanner input = new Scanner(System.in);

    public SanPhamBai3(String tenSP,double donGia,double giamGia){
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public SanPhamBai3(String tenSP,double donGia){
        this(tenSP, donGia, 0);
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
